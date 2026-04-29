package com.example.servingwebcontent;

public class StrengthLevel2 extends WorkoutProgram {
    public StrengthLevel2() {
        addExercise("Warm up with Arm circles 10 reps each side");
        addExercise("3 x 10 Dips Bodyweight");
        addExercise("4 x 10 Pullups");
        addExercise("3 x 12 Barbell Squat");
        addExercise("3 x 15 Lateral Raises");
    }

    @Override
    protected void displayExercise(Exercise e) {
        System.out.println("Current Exercise: " + e.getName());
        System.out.println("Press SPACE to continue to the next exercise");
    }

    @Override
    protected void setup() {
        System.out.println("=== Strength Level 2 ===");
        System.out.println("GET READY!");
    }
}