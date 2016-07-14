package com.nfri13.myapp;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nfri13.myapp.domain.ProductVO;

@Controller
public class SampleController4 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController4.class);
	@RequestMapping("doE")
	public String doE(RedirectAttributes rttr){ //REdirectAttributes는 redirect를 하면서 값을 보내줌 
		logger.info("doE called... : " );
		//return "forward:/doF"; //서버측 요청. 주소는 그대로지만 doF로 이동됨
		//return "redirect:/doF?msg=abcde"; //다시 요청. 주소가바뀜
		//rttr.addAttribute("msg", "fghij");
		rttr.addFlashAttribute("msg", "klmno");
		//값을 숨겨서 전달. 딱 한번만 전달하기 때문에 새로고침시 에러
		return "redirect:/doF";
	}
	
	@RequestMapping("doF")
	public void doF(String msg){
		logger.info("doF called..." + msg);
	}
}