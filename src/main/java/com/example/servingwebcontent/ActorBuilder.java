package com.example.servingwebcontent;

public interface ActorBuilder {
    ActorBuilder setName(String name);
    ActorBuilder setHealth(int health);
    ActorBuilder setLevel(int level);
    ActorBuilder setWorkoutStyle(String workoutStyle);
    ActorBuilder setShots(int shots);
    ActorBuilder setArmor(String armor);
    Actor build();
}