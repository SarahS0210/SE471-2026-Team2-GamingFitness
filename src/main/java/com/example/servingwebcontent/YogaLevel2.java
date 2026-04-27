package com.example.servingwebcontent;
import java.util.ArrayList;
import java.util.List;


public class YogaLevel2 extends WorkoutProgram {
     private List<Exercise> workoutList = new ArrayList<>();

    public YogaLevel2() {
        
    }

    public void addExercise(String name) {
        Exercise e = new Exercise(name);
        workoutList.add(e);
    }

    @Override public void runWorkoutSequence() {
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




