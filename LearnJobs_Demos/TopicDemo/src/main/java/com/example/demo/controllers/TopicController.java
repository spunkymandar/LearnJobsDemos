package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping(value="/topics/{id}")
	public Topic getTopic(@PathVariable("id") String id)
	{
		Topic topic=topicService.getTopic(id);
		return topic;
	}
	
	@PostMapping("/topics")
	public Topic addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		return topic;
	}
	
	@DeleteMapping("/topics/{id}")
	public int deleteTopic(@PathVariable("id") String id)
	{
		topicService.deleteTopic(id);
		return 1;
	}
	
	
	
	
	
	
	
	
	
	
}
