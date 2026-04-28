package com.example.servingwebcontent;
import java.util.ArrayList;
import java.util.List;

"""
public class CardioLevel1 extends WorkoutProgram {
    private static List<Exercise> workouts = new ArrayList<>();

    public CardioLevel1() {
        addExercise("warmup: 2 X 10 jumping knee tucks");
        addExercise("5 Minutes Medicine ball slams");
        addExercise("3 Minutes Jump Rope");
        addExercise("15 minutes incline treadmill");
        addExercise("50 jumping jacks");
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

public class CardioLevel1 extends WorkoutProgram {
    public CardioLevel1() {
        addWorkouts("Warm up: 2 x 10 Burpees");
        addWorkouts("5 Minute Medicine Ball Slams");
        addWorkouts("3 Minute Jump Rope");
        addWorkouts("15 Minutes Slow Incline Treadmill");
        addWorkouts("50 Jumping Jacks");
    }

    @Override
    protected void displayExercise(Exercise e) {
        System.out.println("Current Exercise: " + e.getName());
        System.out.println("Press SPACE to continue to the next exercise");
    }

    @Override
    protected void setup() {
        System.out.println("=== CARDIO LEVEL 1 ===");
        System.out.println("GET READY!");
    }
}
