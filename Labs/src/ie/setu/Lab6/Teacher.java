package ie.setu.Lab6;

import java.util.Arrays;

public class Teacher extends Person {
	//attributes
	int numCourses;
	String[] courses;
	
	//constructors
	public Teacher(String name, String address) {
		super(name, address);
		numCourses = 0;
		courses = new String[20];
	}

	//to string method
	public String toString() {
		return "Teacher [Name=" + name + ", Address=" + address + "]";
	}
	
	//methods
	public boolean addCourse(String course) {
		int i = 0;
		while (i < numCourses) {
			if (courses[i] == course) {
				return false;
			}
			i++;
		}
		
		courses[numCourses] = course;
		numCourses++;
		
		return true;
	}
	
	public boolean removeCourse(String course) {
		int i = 0;
		while (i < numCourses) {
			if (courses[i] == course) {
				courses[i] = null;
				return true;
			}
			i++;
		}
		
		return false;
	}
}
