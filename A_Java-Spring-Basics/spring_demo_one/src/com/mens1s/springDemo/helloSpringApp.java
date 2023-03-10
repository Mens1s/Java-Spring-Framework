package com.mens1s.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class helloSpringApp {
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// hw1
		theCoach = context.getBean("imparator", Coach.class);
		System.out.println(theCoach.getDailyWorkout());

		// let's call out new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
}
