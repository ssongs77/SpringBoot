package com.tuyano.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	String[] names = { "kim", "lee", "park", "choi", "jo" };
	String[] mails = { "kim@tuuyano.com", "lee@flower.com", "park@yama", "choi@happy", "jo@baba" };

	@RequestMapping("/{id}")
	public DataObject index(@PathVariable int id) {
		
		return new DataObject(id, names[id], mails[id]);
	}
}
