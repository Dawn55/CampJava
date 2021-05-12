package oopIntro;

import java.util.ArrayList;
import java.util.List;

public class CourseManager{
	List<Course> courses =new ArrayList<Course>();
	void Add(Course course) {
		courses.add(course);
		System.out.println("eklendi");
		
	}
	void Delete(Course course) {
		courses.remove(course);
		System.out.println("silindi");
	}
	List<Course> GelAll(){
		for (Course course : courses) {
			System.out.println(course.title);
		}
		return courses;
	}
}
