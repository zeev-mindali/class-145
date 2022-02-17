package com.jb.spring_basic.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jb.spring_basic.beans.UserDetails;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

@RequiredArgsConstructor
public class JwtUsernameAndPasswordAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    private final AuthenticationManager authenticationManager;

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        try {
            //grab username and password sent by the client
            UserDetails userModel = new ObjectMapper().readValue(request.getInputStream(), UserDetails.class);
            Authentication authentication = new UsernamePasswordAuthenticationToken(
                    userModel.getUserName(),
                    userModel.getUserPass()
            );
            Authentication returnAuth = authenticationManager.authenticate(authentication);
            return returnAuth;
        } catch (IOException err){
            throw new RuntimeException(err);
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        String myKey = "Yuri_And_Friends";
        String token = Jwts.builder()
                .setSubject(authResult.getName())
                .claim("authorities",authResult.getAuthorities())
                .setIssuedAt(java.sql.Date.valueOf(LocalDate.now()))
                .setExpiration(java.sql.Date.valueOf(LocalDate.now().plusWeeks(2)))
                .signWith(Keys.hmacShaKeyFor(myKey.getBytes()))
                .compact();
        response.addHeader("Authorization","Bearer "+token);
    }


}


/*
    {
         user:"12345",
         pass:"54321",
         role is god
    }

 */