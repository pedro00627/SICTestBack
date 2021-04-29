package com.sic.sicTestBack.config;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {

	static void addAuthentication(HttpServletResponse res, String username) {

		String token = Jwts.builder().setSubject(username).setExpiration(new Date(System.currentTimeMillis() + 50000))
				.signWith(SignatureAlgorithm.HS512, "Pedro00627").compact();
		res.addHeader("Authorization", "Bearer " + token);
	}

	static Authentication getAuthentication(HttpServletRequest request) {

		String token = request.getHeader("Authorization");

		if (token != null) {
			String user = Jwts.parser().setSigningKey("Pedro00627").parseClaimsJws(token.replace("Bearer", ""))
					.getBody().getSubject();

			return user != null ? new UsernamePasswordAuthenticationToken(user, null, new ArrayList<>()) : null;
		}
		return null;
	}
}
