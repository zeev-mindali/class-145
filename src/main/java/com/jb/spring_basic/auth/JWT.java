package com.jb.spring_basic.auth;


import com.jb.spring_basic.beans.UserDetails;
import io.jsonwebtoken.*;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//https://jwt.io
@Service
public class JWT {
    //type of encryption - סוג ההצפנה שאיתה נעבוד
    private String signatureAlgorithm = SignatureAlgorithm.HS256.getJcaName();
    //creating private key - מפתח הצפנה שקיים רק אצלנו
    //https://www.allkeysgenerator.com/Random/Security-Encryption-Key-Generator.aspx
    private String encodedSecretKey = "this+is+my+key+and+it+must+be+at+least+256+bit+long";
    //create our private key - יצירה של מפתח ההצפנה לשימוש ביצירה של הטוקנים שלנו
    private Key decodedSecretKey = new SecretKeySpec(Base64.getDecoder().decode(encodedSecretKey),
            this.signatureAlgorithm);

    //generate token

    private String createToken(Map<String, Object> clamis, String email) {
        Instant now = Instant.now(); //get current time
        return Jwts.builder()
                .setClaims(clamis)  //set our data (clamis-> email,password,role)
                .setSubject(email) //set our subject, the first item that we will check
                .setIssuedAt(Date.from(now)) //create issued at, which is current time
                //experation date, which after the date, we need to create a new one
                .setExpiration(Date.from(now.plus(15, ChronoUnit.MINUTES)))
                .signWith(decodedSecretKey) //sign the token with our secret key
                .compact(); //compact our token, that it will be smaller :)
    }

    //generate key
    //we need user email, password and role (תפקיד) for create a token
    //since the userDetail is an instance of class, we need to make it hashcode
    //the token need to get clamis, which is the information of the hashcode
    public String generateToken(UserDetails userDetails) {
        Map<String, Object> clamis = new HashMap<>();
        clamis.put("userPass", userDetails.getUserPass());
        clamis.put("userRole", userDetails.getRole());
        return createToken(clamis, userDetails.getUserName());
    }

    private Claims extractAllClamies(String token) throws ExpiredJwtException {
        JwtParser jwtParser = Jwts.parserBuilder()
                .setSigningKey(this.decodedSecretKey)
                .build();
        return jwtParser.parseClaimsJws(token).getBody();
    }

    private boolean isTokenExpired(String token) {
        try {
            extractAllClamies(token);
            return false;
        } catch (ExpiredJwtException err) {
            return true;
        }
    }

    private String extractUserEmail(String token) {
        return extractAllClamies(token).getSubject();
    }

    private Date extractExperationDate(String token) {
        return extractAllClamies(token).getExpiration();
    }

    public boolean validateToken(String token,UserDetails user){
        String userMail = extractUserEmail(token);
        return (userMail.equals(user.getUserName()) &&
                !isTokenExpired(token));
    }
    /*
    public static void main(String[] args) {
        JWT jwt = new JWT();
        UserDetails user = new UserDetails("mindalizeev@gmail.com", "123456", "King of the world!!!");
        System.out.println("We just now created a new shiny token for you:\n===============================\n");
        String token = jwt.generateToken(user);
        System.out.println(token);
        System.out.println();
        System.out.println("our token body is:\n");
        System.out.println(jwt.extractAllClamies(token));
        System.out.println("user name:"+jwt.extractUserEmail(token));
    }
*/
}
