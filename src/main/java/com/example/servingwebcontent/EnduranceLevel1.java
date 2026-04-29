package com.example.servingwebcontent;

public class EnduranceLevel1  extends WorkoutProgram {
    public EnduranceLevel1() {
        addExercise("1 Mile Run");
        addExercise("2 x 15 Squat (Bodyweight)");
    }

    @Override
    protected void displayExercise(Exercise e) {
        System.out.println("Exercise Workout: " + e.getName());
        System.out.println("Press SPACE to continue to the next exercise");
    }

    @Override
    protected void setup() {
        System.out.println("=== Endurance Level 1 ===");
        System.out.println("GET READY!");
    }
}