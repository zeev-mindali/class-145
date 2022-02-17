package com.jb.spring_basic.jwt;

import com.google.common.base.Strings;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class JwtTokenVerifier extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String authHeader = request.getHeader("Authorization");
        if (Strings.isNullOrEmpty(authHeader) || !authHeader.startsWith("Bearer ")) {
            filterChain.doFilter(request, response);
            return;
        }
        String token="בחור שרמנטי בשם ניר, מחפש אישה עם דופק";
        try {
             token = authHeader.replace("Bearer ", "");
            String myKey = "Yuri_And_Friends"; //todo: move the key and bearer to application.properties
            Jws<Claims> claimsJws = Jwts.parser()
                    .setSigningKey(Keys.hmacShaKeyFor(myKey.getBytes()))
                    .parseClaimsJws(token);
            Claims body = claimsJws.getBody();
            String userName = body.getSubject();
            var authorities = (List<Map<String, String>>) body.get("authorities");
            Set<GrantedAuthority> simpleGrantedAuth = authorities.stream()
                    .map(item -> new SimpleGrantedAuthority("authorities"))
                    .collect(Collectors.toSet());
            Authentication authentication = new UsernamePasswordAuthenticationToken(userName, null, simpleGrantedAuth);
            SecurityContextHolder.getContext().setAuthentication(authentication);
        } catch (JwtException err){
            System.out.println(err.getMessage());
            throw new IllegalStateException(String.format("Token %s can not be trusted:",token));
        } finally {
            filterChain.doFilter(request, response);
        }

    }
}
