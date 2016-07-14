package com.nfri13.myapp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController2 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String message){
		// ModelAttribute는 값을 다시 뷰에게 전달해줌
		logger.info("doC called... : "  + message);
		return "result";
	}
}