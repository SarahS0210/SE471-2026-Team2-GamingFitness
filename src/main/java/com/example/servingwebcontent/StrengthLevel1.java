package com.example.servingwebcontent;
import java.util.ArrayList;
import java.util.List;

public class StrengthLevel1 implements WorkoutReadOnlyIF {
    private List<String> workoutList = new ArrayList<>();

    public StrengthLevel1 () {
        addWorkout("Warm up with Arm circles 10 reps each side");
        addWorkout("3 x 12 Pushups");
        addWorkout("3 x 10 Pullups");
        addWorkout("3 x 12 Squats");
        addWorkout("3 x 15 Lateral Raises");
    }
    

    public void addWorkout(String name) {
        workoutList.add(name);
    }

    public List<String> getWorkouts() {
        return workoutList;
    }
}