package com.example.servingwebcontent;
import java.util.ArrayList;
import java.util.List;

public class YogaLevel2 implements WorkoutReadOnlyIF {
   private List<String> workoutList = new ArrayList<>();

    public YogaLevel2() {
        addWorkout("Child's Pose 1 Minute");
        addWorkout("Cat Cow 1 Minute");
        addWorkout("Warrior II 30 Seconds Each Side");
        addWorkout("Downward Dog 1 Minute");
        addWorkout("Low lunge 30 Seconds Each Side");
    }
    

    public void addWorkout(String name) {
        workoutList.add(name);
    }

    public List<String> getWorkouts() {
        return workoutList;
    }
}