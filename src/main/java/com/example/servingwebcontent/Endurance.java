package com.example.servingwebcontent;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.*;

public class Endurance extends WorkoutProgram { 
    private List<Exercise> workouts = new ArrayList<>();

    public Endurance() {}

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
