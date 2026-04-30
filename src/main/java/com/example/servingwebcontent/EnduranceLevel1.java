package com.example.servingwebcontent;
import java.util.List;
import java.util.ArrayList;

public class EnduranceLevel1 implements WorkoutReadOnlyIF {
    private List<String> workoutList = new ArrayList<>();

    public EnduranceLevel1() {
        addWorkout("5-10 Min Warm Up");
        addWorkout("2 x 15 Squat (Bodyweight");
        addWorkout("2 x 12 Kneeling Push Ups");
        addWorkout("3 x 10 Superman");
        addWorkout("3 x 12 Glute Bridge");
    }

    public void addWorkout(String name) {
        workoutList.add(name);
    }

    
    public List<String> getWorkouts() {
        return workoutList;
    }
}