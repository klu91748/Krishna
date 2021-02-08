package com.example.security;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.example.service.UserService;

@SuppressWarnings("unchecked")
public class MySimpleUrlAuthenticationSuccessHandler
implements AuthenticationSuccessHandler {

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	@Autowired
	UserService userService;
    
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException {
		
		HttpSession session = request.getSession();
			
		List<GrantedAuthority> roles = (List<GrantedAuthority>) authentication.getAuthorities();
		String name = authentication.getName();
		String prevURL = (String) session.getAttribute("prevURL");
		
		if (prevURL == null || prevURL.contains("/login")) {
			prevURL = "http://localhost:8080/";
		}
		
		session.setAttribute("user", userService.findUser(name));
		session.setAttribute("name", name);
		session.setAttribute("role", roles.get(0).toString().substring(5));
		
	    redirectStrategy.sendRedirect(request, response, prevURL);
	}
}