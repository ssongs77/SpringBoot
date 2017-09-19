package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/{month}")
	public ModelAndView index(@PathVariable int month, ModelAndView mav) {
		mav.setViewName("index");
		int m = Math.abs(month) % 12;
		m = m == 0 ? 12 : m;
		mav.addObject("month",m);
		mav.addObject("check", Math.floor(m/3));

		return mav;
	}
}
