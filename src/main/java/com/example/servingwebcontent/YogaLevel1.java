package com.example.servingwebcontent;
import java.util.ArrayList;
import java.util.List;

public class YogaLevel1 implements WorkoutReadOnlyIF {
    private List<String> workoutList = new ArrayList<>();

    public YogaLevel1() {
        addWorkout("Child's Pose 1 Minute");
        addWorkout("Cat Cow 1 Minute");
        addWorkout("Downward Dog 1 Minute");
        addWorkout("Low lunge 30 Seconds Each Side");
        addWorkout("Seated Forward Fold 30 seconds");
    }
    

    public void addWorkout(String name) {
        workoutList.add(name);
    }

    public List<String> getWorkouts() {
        return workoutList;
    }
}