package com.example.servingwebcontent;

public class CardioLevel1 extends WorkoutProgram {
    public CardioLevel1() {
        addExercise("Warm up: 2 x 10 Burpees");
        addExercise("5 Minute Medicine Ball Slams");
        addExercise("3 Minute Jump Rope");
        addExercise("15 Minutes Slow Incline Treadmill");
        addExercise("50 Jumping Jacks");
    }

    @Override
    protected void displayExercise(Exercise e) {
        System.out.println("Current Exercise: " + e.getName());
        System.out.println("Press SPACE to continue to the next exercise.");
    }

    @Override
    protected void setup() {
        System.out.println("=== CARDIO LEVEL 1 ===");
        System.out.println("GET READY!");
    }
}
