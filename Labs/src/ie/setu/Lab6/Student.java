package ie.setu.Lab6;

import java.util.Arrays;

public class Student extends Person {
	//attributes
	private int numCourses;
	private String[] courses;
	private int[] grades;
	private static int nextIndex = 0;
	
	//constructors
	public Student(String name, String address) {
		super(name, address);
		courses = new String[20];
		grades = new int[20];
	}

	//to string method
	public String toString() {
		return "Student [numCourses=" + numCourses + ", cources=" + Arrays.toString(courses) + ", grades="
				+ Arrays.toString(grades) + "]";
	}
	
	//methods
	public void addCourseGrade(String course, int grade) {
		courses[nextIndex] = course;
		grades[nextIndex] = grade;
		nextIndex++;
	}
	
	public void printGrades() {
		for(int i = 0; i < nextIndex; i++) {
			System.out.println(courses[i] + ": " + grades[i]);
		}
	}
	
	public double getAverageGrade() {
		int sum = 0;
		double average;
		
		for(int i = 0; i < nextIndex; i++) {
			sum += grades[i];
		}
		
		average = sum / nextIndex;
		return average;
	}
}
