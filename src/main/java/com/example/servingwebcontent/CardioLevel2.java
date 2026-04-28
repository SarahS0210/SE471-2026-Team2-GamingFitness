package com.example.servingwebcontent;
import java.util.ArrayList;
import java.util.List;
"""
public class CardioLevel2 extends WorkoutProgram {
     private static List<Exercise> workouts = new ArrayList<>();

    public CardioLevel2() {
        addExercise("warmup: 2 x 10 jumping knee tucks");
        addExercise("5 Minutes Meidcine ball slams");
        addExercise("3 Minutes Jump Rope");
        addExercise("20 minutes incline treadmill");
        addExercise("100 jumping jacks");
        
    }

    public static void addExercise(String name) {
        Exercise e = new Exercise(name);
        workouts.add(e);
    }

    @Override
    public void runWorkoutSequence() {
        firstWorkout();
        secondWorkout();
        thirdWorkout();
        fourthWorkout();
        fifthWorkout();
    }

   @Override
    public void firstWorkout() {
        //Display the name of the workout
        //User presses space bar to exit
    }

    @Override
    public void secondWorkout() {
        //Display the name of the workout
        //User presses space bar to exit
    }

    @Override
    public void thirdWorkout() {
        //Display the name of the workout
        //User presses space bar to exit
    }

    @Override
    public void fourthWorkout() {
        //Display the name of the workout
        //User presses space bar to exit
    }

    @Override
    public void fifthWorkout() {
        //Display the name of the workout
        //User presses space bar to exit
    }

}
"""

public class CardioLevel2 extends WorkoutProgram {
    public CardioLevel2() {
        addWorkouts("Warm up: 2 x 20 Burpees");
        addWorkouts("7 Minute Medicine Ball Slams");
        addWorkouts("5 Minute Jump Rope");
        addWorkouts("20 Minutes Slow Incline Treadmill");
        addWorkouts("100 Jumping Jacks");
    }

    @Override
    protected void displayExercise(Exercise e) {
        System.out.println("Current Exercise: " + e.getName());
        System.out.println("Press SPACE to continue to the next exercise");
    }

    @Override
    protected void setup() {
        System.out.println("=== CARDIO LEVEL 2 ===");
        System.out.println("GET READY!");
    }
}
