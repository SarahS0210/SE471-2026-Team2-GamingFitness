package com.example.servingwebcontent;
import java.util.ArrayList;
import java.util.List;

public class EnduranceLevel1 extends WorkoutProgram { 
    private static List<Exercise> workouts = new ArrayList<>();
    

    public EnduranceLevel1() {
       addExercise("5-10 Min Warm Up");
       addExercise("2 x 15 Squat (Bodyweight");
       
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
