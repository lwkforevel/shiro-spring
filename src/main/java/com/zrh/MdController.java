package com.zrh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MdController {

	
	@ResponseBody
	@RequestMapping("/role")
	public String role() {
		
		return "You will success";
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public String login() {
		
		return "You must success";
	}
	
}
