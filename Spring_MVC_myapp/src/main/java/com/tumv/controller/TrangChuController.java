package com.tumv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TrangChuController {
	
	// Use to respone content as text to view.
	/*@RequestMapping("/")
	@ResponseBody
	public String ViewTrangChu() {
		return "Hello you!";
	}*/
	
	// Return to page jsp as trangchu.jsp.
	/*@RequestMapping("/")	
	public String ViewTrangChu() {
		return "views/trangchu.jsp";
	}
	
	@RequestMapping("/login")	
	public String login() {
		return "views/login.jsp";
	}*/
	
	//
	@RequestMapping("/")	
	public String ViewTrangChu() {
		return "trangchu";
	}
	
	@RequestMapping("/login")	
	public String login() {
		return "login";
	}
}
