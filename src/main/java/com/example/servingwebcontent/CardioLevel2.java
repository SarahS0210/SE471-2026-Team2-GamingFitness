package com.example.servingwebcontent;

public class CardioLevel2 extends WorkoutProgram {
    public CardioLevel2() {
        addExercise("Warm up: 2 x 20 Burpees");
        addExercise("7 Minute Medicine Ball Slams");
        addExercise("5 Minute Jump Rope");
        addExercise("20 Minutes Slow Incline Treadmill");
        addExercise("100 Jumping Jacks");
    }

    @Override
    protected void displayExercise(Exercise e) {
        System.out.println("Current Exercise: " + e.getName());
        System.out.println("Press SPACE to continue to the next exercise.");
    }

    @Override
    protected void setup() {
        System.out.println("=== CARDIO LEVEL 2 ===");
        System.out.println("GET READY!");
    }
}
