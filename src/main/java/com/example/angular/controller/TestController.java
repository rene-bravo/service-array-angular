package com.example.angular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.angular.dto.TestDTO;
import com.example.angular.service.impl.TestServiceImpl;

@RestController
@RequestMapping("/api")
public class TestController {
	
	@Autowired
	private TestServiceImpl testServiceImpl;

	@PostMapping("/testArray")
	public List<String> getArrayCountRepeat(@RequestBody TestDTO testDTO){
		return testServiceImpl.countRepeatedNumberInArray(testDTO.getArrayOne(), testDTO.getArrayTwo());
		
	}
}
