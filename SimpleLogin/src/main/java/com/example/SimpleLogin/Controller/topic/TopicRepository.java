package com.example.SimpleLogin.Controller.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {
	
	//getAllTopics;
	//getTopic(String Id);
	//updateTopic(Topic t);
	//deleteTopic(String Id);
	
	
}
