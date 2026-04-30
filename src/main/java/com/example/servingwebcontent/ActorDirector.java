package com.example.servingwebcontent;

public class ActorDirector {

    private ActorBuilder builder;

    public ActorDirector(ActorBuilder builder) {
        this.builder = builder;
    }

    public void setBuilder(ActorBuilder builder) {
        this.builder = builder;
    }

    public ActorBuilder getBuilder() {
        return builder;
    }

    // New player — basic starting actor
    public Actor buildStarterActor(String name, String workoutStyle) {
        return builder
            .setName(name)
            .setHealth(100)
            .setLevel(1)
            .setWorkoutStyle(workoutStyle)
            .setShots(0)
            .setArmor("light")
            .build();
    }

    // Advanced player — fully configured elite actor
    public Actor buildEliteActor(String name, String workoutStyle, int shots) {
        return builder
            .setName(name)
            .setHealth(250)
            .setLevel(50)
            .setWorkoutStyle(workoutStyle)
            .setShots(shots)
            .setArmor("heavy")
            .build();
    }
}