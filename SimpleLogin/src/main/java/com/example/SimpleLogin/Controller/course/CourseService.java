package com.example.SimpleLogin.Controller.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	
	//All Search; //GET
	public List<Course> getAllCourses(String topicId)
	{
		
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
		
	}
	
	
	//Specific Id Search; //GET
	public Course getCourse(String id)
	{
		
		Course t =null;
		Optional<Course> options = courseRepository.findById(id);
		if(options.isPresent()) {
			t = options.get();
		}
		
		return t;
	}


	//Add Topic; //POST
	public void addCourse(Course course) {
		
		courseRepository.save(course);
		
	}


	//Update Topic; // PUT
	public void updateCourse(Course course) {
		 
		courseRepository.save(course);
		
	}

	

	//Delete Topic;
	public void deleteCourse(String id) {
		
		courseRepository.deleteById(id);
	}
	
	
	
}
