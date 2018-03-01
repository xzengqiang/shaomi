package org.luodou.common.web.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController{

	private String path_login = "/index.jsp";

	@RequestMapping(value = "/")
	public String index( HttpServletResponse response) {
		try{
			response.sendRedirect(path_login);
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
}
