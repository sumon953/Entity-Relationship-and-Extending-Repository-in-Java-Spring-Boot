package com.example.SimpleLogin.Controller.course;

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

import com.example.SimpleLogin.Controller.topic.Topic;


@Controller
@RestController
public class CourseController {
	
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	@ResponseBody
	public List<Course> getAllCourse(@PathVariable String id)
	{
		return courseService.getAllCourses(id);
		
	}
	
	
	//Specific Id Search;
	@RequestMapping("/topics/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id)
	{
		return courseService.getCourse(id);
	}
	
	
	 //Add Topic;
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses")
	public void addcourse(@RequestBody Course course, @PathVariable String topicId)
	{
		     
		    course.setTopic(new Topic(topicId,"",""));
			courseService.addCourse(course);
			
	}
	
	 //Update Topic;
	 @RequestMapping(method=RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
	 public void updatecourse(@RequestBody Course course,@PathVariable String topicId,@PathVariable String id)
	{
		   course.setTopic(new Topic(topicId,"",""));
		   courseService.updateCourse(course);
				
	}
	 
	 
	//Delete Topic;
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id)
	{
		courseService.deleteCourse(id);
	}
	 


}
