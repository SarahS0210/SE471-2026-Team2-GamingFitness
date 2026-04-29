package com.example.servingwebcontent;

public class YogaLevel1 extends WorkoutProgram {
    public YogaLevel1() {
        addExercise("Downward Dog 1 Minute");
        addExercise("Low Lunge 30 Seconds Each Side");
        addExercise("Seated Forward Fold 30 Seconds");
    }

    @Override
    protected void displayExercise(Exercise e) {
        System.out.println("Current Exercise: " + e.getName());
        System.out.println("Press SPACE to continue to the next exercise");
    }

    @Override
    protected void setup() {
        System.out.println("=== Yoga Level 1 ===");
        System.out.println("GET READY!");
    }
}