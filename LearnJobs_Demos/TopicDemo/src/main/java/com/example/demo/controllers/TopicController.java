package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pojo.Topic;
import com.example.demo.services.TopicService;

@RestController
public class TopicController {
	
	@Autowired //inject the object automatically
	TopicService topicService;
	
	//@RequestMapping(value = "/topics",method = RequestMethod.GET)
	@GetMapping(value="/topics")//REST endpoint
	public List<Topic> all_topics(){
		return topicService.getAllTopics();
		
	}
	
}
