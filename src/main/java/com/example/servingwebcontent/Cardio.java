package com.example.servingwebcontent;
import javax.sound.sampled.*;
import java.util.ArrayList;
import java.util.List;


public class Cardio extends WorkoutProgram {
    private List<Exercise> workouts = new ArrayList<>();

    public Cardio() {}

    public void addExercise(String name) {
        Exercise e = new Exercise(name);
        workouts.add(e);
    }

    public void runWorkoutSequence() {
        firstWorkout();
        secondWorkout();
        thirdWorkout();
        fourthWorkout();
        fifthWorkout();
    }

    public void firstWorkout() {
       
    }

    public void secondWorkout() {
        
    }

    public void thirdWorkout() {
       

    }

    public void fourthWorkout() {
        
    }

    public void fifthWorkout() {
        
    }

}
