package com.tuyano.springboot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/{num}")
	public ModelAndView index(@PathVariable int num, ModelAndView mav) {
		mav.setViewName("index");

		mav.addObject("num", num);

		if (num >= 0) {
			mav.addObject("check", "num >= data.size() ? 0 : num");
		} else {
			mav.addObject("check", "num <= data.size() * -1 ? 0 : num * -1");
		}
		ArrayList<DataObject> data = new ArrayList<DataObject>();
		data.add(new DataObject(0, "park", "park@yama"));
		data.add(new DataObject(1, "kim", "kim@yama"));
		data.add(new DataObject(2, "lee", "lee@yama"));
		mav.addObject("data", data);
		return mav;
	}
}
