package com.example.servingwebcontent;
import java.util.ArrayList;
import java.util.List;

public class StrengthLevel2 implements WorkoutReadOnlyIF {
    private List<String> workoutList = new ArrayList<>();

    public StrengthLevel2() {
        addWorkout("Warm up with Arm circles 10 reps each side");
        addWorkout("3 x 10 Dips Bodyweight");
        addWorkout("4 x 10 Pullups");
        addWorkout("3 x 12 Barbell Squat");
        addWorkout("3 x 15 lateral Raises");
    }
    

    public void addWorkout(String name) {
        workoutList.add(name);
    }

    public List<String> getWorkouts() {
        return workoutList;
    }
}