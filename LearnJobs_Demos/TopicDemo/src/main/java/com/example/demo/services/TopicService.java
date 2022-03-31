package com.example.demo.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.pojo.Topic;

@Service //says that the class provides services, and spring picks up this class and creates object of it. 
public class TopicService {
	
	
	private List<Topic> topicList=new ArrayList<>(Arrays.asList(
			new Topic("spring","spring framework","complete spring tutorial"),
			new Topic("java","java 9.0","Learn java 9.0 through code"),
			new Topic("hibernate","hiberate 3.5","learn hibernate")
			));

	//returns all the topics
	public List<Topic> getAllTopics(){
		return topicList;
	}
	
	//adds a Topic to the topicList and returns the added Topic
	public Topic addTopic(Topic topic) {
		topicList.add(topic);
		return topic;
	}
	
	//searches and returns the Topic from topicList according to id passed in argument
	public Topic getTopic(String id) {
		//write some business logic to search topic from topicList and return that
		return null;
	}
	
	//delete the Topic from topicList, according to id passed in an argument. 
	public int deleteTopic(String id) {
		//write business logic
		return 1;
	}
	
	//update the Topic matching with the id provided, with the Topic provided in the first arguemnt
	public void updateTopic(Topic topic, String id) {
		//write business logic
	}
	
}
