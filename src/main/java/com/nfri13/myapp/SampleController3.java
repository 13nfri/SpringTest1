package com.nfri13.myapp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nfri13.myapp.domain.ProductVO;

@Controller
public class SampleController3 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController3.class);
	@RequestMapping("doD")
	public String doD(Model model){ //model은 view에 값을 전달하기 위한 객체. 
		logger.info("doD called... : " );
		ProductVO product = new ProductVO("UHD 50인치 TV", 1000000);
		model.addAttribute("product",product);
		return "productDetail";
	}
}