package com.example.servingwebcontent;
import java.util.ArrayList;
import java.util.List;


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
