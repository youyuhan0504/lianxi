package com.bw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {
//aa
	@RequestMapping("list")
	@ResponseBody
	public Object list() {
		return true;
		
	}
}
