package com.luv2code.springdemo;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    public SwimCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swimming for 30 minutes";
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
