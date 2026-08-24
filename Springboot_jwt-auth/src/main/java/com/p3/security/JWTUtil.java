package com.p3.security;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class JWTUtil {
	
	public String sECRET_KEY = "secret";
	
	public String extractUSername(String token) {
		return extractClaim(token ,Claims::getSubject);
	}
	
	public  Date extractExpiration(String token) {
		return extractClaim(token,Claims::getExpiration);
	}
	public <T> T extractClaim(String token,Function<Claims,T> claimsResolver) {
		final Claims claims = extractAllClaims(token);
		return claimsResolver.apply(claims);
	}
	
	private Claims extractAllClaims(String token) {
	    SecretKey key = Keys.hmacShaKeyFor(sECRET_KEY.getBytes(StandardCharsets.UTF_8));

	    return Jwts.parser()
	            .verifyWith(key)
	            .build()
	            .parseSignedClaims(token)
	            .getPayload();
	}
	 
	public Boolean isTokenExpired(String token) {
		return extractExpiration(token).before(new Date());
	}
	
	public String generateToken(UserDetails userDetails) {
		Map<String, Object> claims = new HashMap<>();
		return createToken(claims ,userDetails.getUsername());
	}
	private String createToken(Map<String, Object> claims,String subject) {
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(subject)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 1000 *60*60*1))
				.signWith(SignatureAlgorithm.HS256,sECRET_KEY)
				.compact();
	}
		public Boolean validateToken(String token ,UserDetails userDetails) {
			final String username = extractUSername(token);
			return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
		}
	
	
	
}
