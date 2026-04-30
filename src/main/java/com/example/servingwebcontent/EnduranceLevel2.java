package com.example.servingwebcontent;
import java.util.List;
import java.util.ArrayList;

public class EnduranceLevel2 implements WorkoutReadOnlyIF {
     private List<String> workoutList = new ArrayList<>();

    public EnduranceLevel2() {
        addWorkout("5-10 Min Warm Up");
        addWorkout("3 x 12 Bulgarian Split Squat (Each leg");
        addWorkout("3 x 15 Push Ups");
        addWorkout("3 x 12 Inverted Row");
        addWorkout("3 x 8 Nordic Hamstring Curls");
    }
    

    public void addWorkout(String name) {
        workoutList.add(name);
    }

    public List<String> getWorkouts() {
        return workoutList;
    }
}