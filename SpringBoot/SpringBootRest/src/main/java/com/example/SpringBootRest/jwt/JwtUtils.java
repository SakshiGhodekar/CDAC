package com.example.SpringBootRest.jwt;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.function.Function;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

public class JwtUtils {
	
	private static final String SECRET = "gdjgjhgjdsjftsgcjmbcjsagjg";
	
	private final SecretKey KEY = Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));
	
	public String cretaeToken(UserDetails userDetails) {
		return Jwts.
				builder()
				.subject(userDetails.getUsername())
				.claim("Role", userDetails.getAuthorities())
				.issuedAt(new Date())
				.expiration(new Date(System.currentTimeMillis()+1000*60*60))
                .signWith(KEY)
                .compact();
	}
	
	   public String extractUsername(String token) {
	        return extractClaim(token, Claims::getSubject);
	    }

	    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
	    	System.out.println("in extractClaims");
	        
	    	Claims claims = Jwts.parser()
	                .verifyWith(KEY)
	                .build()
	                .parseSignedClaims(token)
	                .getPayload();
	        return claimsResolver.apply(claims);
	    }

	    public boolean validateToken(String token, UserDetails user) {
	        return extractUsername(token).equals(user.getUsername()) && !isTokenExpired(token);
	    }

	    private boolean isTokenExpired(String token) {
	        return extractClaim(token, Claims::getExpiration).before(new Date());
	    }

}
