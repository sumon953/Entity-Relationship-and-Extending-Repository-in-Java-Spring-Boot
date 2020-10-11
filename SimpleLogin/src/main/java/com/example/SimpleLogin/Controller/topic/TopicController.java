package com.example.SimpleLogin.Controller.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
public class TopicController {
	
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	@ResponseBody
	public List<Topic> getAllTopic()
	{
		return topicService.getAllTopic();
		
	}
	
	
	//Specific Id Search;
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return topicService.getTopic(id);
	}
	
	
	 //Add Topic;
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addtopic(@RequestBody Topic topic)
	{
			topicService.addTopic(topic);
			
	}
	
	 //Update Topic;
	 @RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	 public void addtopic(@RequestBody Topic topic, @PathVariable String id)
	{
		   topicService.updateTopic(id,topic);
				
	}
	 
	 
	//Delete Topic;
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}
	 


}
