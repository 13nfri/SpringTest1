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
	public String doE(RedirectAttributes rttr){ //REdirectAttributes�� redirect�� �ϸ鼭 ���� ������ 
		logger.info("doE called... : " );
		//return "forward:/doF"; //������ ��û. �ּҴ� �״������ doF�� �̵���
		//return "redirect:/doF?msg=abcde"; //�ٽ� ��û. �ּҰ��ٲ�
		//rttr.addAttribute("msg", "fghij");
		rttr.addFlashAttribute("msg", "klmno");
		//���� ���ܼ� ����. �� �ѹ��� �����ϱ� ������ ���ΰ�ħ�� ����
		return "redirect:/doF";
	}
	
	@RequestMapping("doF")
	public void doF(String msg){
		logger.info("doF called..." + msg);
	}
}