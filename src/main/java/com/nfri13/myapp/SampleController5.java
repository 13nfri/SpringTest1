package com.nfri13.myapp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nfri13.myapp.domain.ProductVO;

@Controller
public class SampleController5 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController5.class);
	@RequestMapping("doJSON")
	public @ResponseBody ProductVO doJSON(){
		//@ResponseBody를 return타입 앞에 붙여주면 json표기법으로 전달됨
		logger.info("doJSON called... : " );
		ProductVO vo = new ProductVO("최신형 노트북", 2000000);
		return vo; //객체로 담지만 클라이언트에 전달시 객체가 아닌 json으로 전달됨
	}
	
}