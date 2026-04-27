package com.example.servingwebcontent;
import java.util.ArrayList;
import java.util.List;

public class EnduranceLevel2 extends WorkoutProgram {
    
private List<Exercise> workouts = new ArrayList<>();

    public EnduranceLevel2() {

    }

    public void addExercise(String name) {
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
