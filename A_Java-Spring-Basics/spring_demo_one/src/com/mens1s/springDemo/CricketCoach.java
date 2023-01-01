package com.mens1s.springDemo;

public class CricketCoach implements Coach  {
	
	private FortuneService fortuneService;
	
	// add new fields for email, team
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("no-arg constructor!");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("settter fortune service");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return "today is fucking lucky day ahaha";
	}

	public String getemailAddress() {
		return emailAddress;
	}

	public void setemailAddress(String emailAddressString) {
		this.emailAddress = emailAddressString;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	
	
}
