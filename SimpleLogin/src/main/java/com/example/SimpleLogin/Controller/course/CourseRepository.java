package com.example.SimpleLogin.Controller.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends CrudRepository<Course, String> {
	
	//getAllTopics;
	//getTopic(String Id);
	//updateTopic(Topic t);
	//deleteTopic(String Id);
	
	//public List<Course>findByTopicId(String topicId);
	public List<Course> findByTopicId(String topicId);
	
	
	
}
