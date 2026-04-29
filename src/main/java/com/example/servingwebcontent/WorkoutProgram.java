package  com.example.servingwebcontent;
import javax.sound.sampled.*;
import java.util.ArrayList;
import java.util.List;

public abstract class WorkoutProgram {

    private final List<Exercise> workouts = new ArrayList<>();

    public final void runWorkoutSequence() {
        setup();
        for (Exercise e : workouts) {
            displayExercise(e);
        }
        cooldown();
    }

    protected void setup() {
        System.out.println("Starting Workout");
    }

    protected abstract void displayExercise(Exercise e);

    protected void cooldown() {
        System.out.println("Workout Complete! Take a quick rest.");
    }

    protected void addExercise(String name) {
        workouts.add(new Exercise(name));
    }

    protected List<Exercise> getWorkouts() {
        return workouts;
    }
}