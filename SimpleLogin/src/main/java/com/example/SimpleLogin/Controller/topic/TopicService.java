package com.example.SimpleLogin.Controller.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;
	

	private List<Topic> topics = new ArrayList<> (Arrays.asList(
			
			new Topic("123","sumon1","cse"),
			new Topic("124","sumon2","eee"),
			new Topic("125","sumon3","swe"),
			new Topic("125","sumon4","nf")
			));
	
	
	//All Search; //GET
	public List<Topic> getAllTopic()
	{
		
		//return topics;
		
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
		
	}
	
	
	//Specific Id Search; //GET
	public Topic getTopic(String id)
	{
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		Topic t =null;
		Optional<Topic> options = topicRepository.findById(id);
		if(options.isPresent()) {
			t = options.get();
		}
		
		return t;
	}


	//Add Topic; //POST
	public void addTopic(Topic topic) {
		
		//topics.add(topic);
		topicRepository.save(topic);
		
	}


	//Update Topic; // PUT
	public void updateTopic(String id, Topic topic) {
		
		
		/*
		 * for(int i=0;i<topics.size();i++) { Topic t = topics.get(i);
		 * if(t.getId().equals(id)) { topics.set(i, topic); return; } }
		 */
		 
		topicRepository.save(topic);
		
	}

	

	//Delete Topic;
	public void deleteTopic(String id) {
		
	  //topics.removeIf(t -> t.getId().equals(id));
		topicRepository.deleteById(id);
	}
	
	
	
}
