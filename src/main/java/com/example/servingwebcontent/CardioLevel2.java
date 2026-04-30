package com.example.servingwebcontent;
import java.util.List;
import java.util.ArrayList;

public class CardioLevel2 implements WorkoutReadOnlyIF {
     private List<String> workoutList = new ArrayList<>();

    public CardioLevel2() {
        addWorkout("warmup: 2 X 10 jumping knee tucks");
        addWorkout("5 Minutes Medicine ball slams");
        addWorkout("3 Minutes Jump Rope");
        addWorkout("20 minutes incline treadmill");
        addWorkout("100 jumping jacks");
    }
    

    public void addWorkout(String name) {
        workoutList.add(name);
    }

    public List<String> getWorkouts() {
        return workoutList;
    }
}
