package com.jb.spring_basic.auth;


import com.jb.spring_basic.beans.UserDetails;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.catalina.User;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//https://jwt.io
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

    public String createToken(Map<String,Object> clamis, String email){
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
    public String generateToken (UserDetails userDetails){
        Map<String,Object> clamis = new HashMap<>();
        clamis.put("userPass",userDetails.getUserPass());
        clamis.put("userRole",userDetails.getRole());
        return createToken(clamis,userDetails.getUserName());
    }

    public static void main(String[] args) {
        JWT jwt = new JWT();
        UserDetails user = new UserDetails("mindalizeev@gmail.com","123456","King of the world!!!");
        System.out.println("We just now created a new shiny token for you:\n===============================\n");
        System.out.println(jwt.generateToken(user));
    }

}
