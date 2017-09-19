package com.tuyano.springboot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		
		ArrayList<String[]> data = new ArrayList<String[]>();
		data.add(new String[] {"park", "park@yama", "090-111-2222"});
		data.add(new String[] {"kim", "kim@dddd", "010-123-1234"});
		data.add(new String[] {"lee", "lee@yama", "090-312-4321"});
		
		mav.addObject("data", data);
		return mav;
	}
}
