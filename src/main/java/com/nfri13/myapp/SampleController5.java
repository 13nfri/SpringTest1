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
		//@ResponseBody�� returnŸ�� �տ� �ٿ��ָ� jsonǥ������� ���޵�
		logger.info("doJSON called... : " );
		ProductVO vo = new ProductVO("�ֽ��� ��Ʈ��", 2000000);
		return vo; //��ü�� ������ Ŭ���̾�Ʈ�� ���޽� ��ü�� �ƴ� json���� ���޵�
	}
	
}