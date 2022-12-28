package com.mens1s.springDemo;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		Coach theCoach = new TrackCoach();
	
		// use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
