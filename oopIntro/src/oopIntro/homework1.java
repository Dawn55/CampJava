package oopIntro;

public class homework1 {

	public static void main(String[] args) {
	
		Course course = new Course("java","react");
		CourseManager courseManager = new CourseManager();
		courseManager.Add(course);
		courseManager.GelAll();
	}

}


