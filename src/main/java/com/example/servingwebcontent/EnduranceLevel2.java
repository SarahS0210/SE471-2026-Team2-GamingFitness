package com.example.servingwebcontent;

public class EnduranceLevel2  extends WorkoutProgram {
    public EnduranceLevel2() {
        addExercise("2 Rile Run");
        addExercise("3 x 12 Bulgarian Split Squat (Each leg)");
        addExercise("3 x 15 Push Ups");
        addExercise("3 x 12 Inverted Row");
        addExercise("3 x 8 Nordic Hamstring Curls");
    }

    @Override
    protected void displayExercise(Exercise e) {
        System.out.println("Exercise Workout: " + e.getName());
        System.out.println("Press SPACE to continue to the next exercise");
    }

    @Override
    protected void setup() {
        System.out.println("=== Endurance Level 2 ===");
        System.out.println("GET READY!");
    }
}