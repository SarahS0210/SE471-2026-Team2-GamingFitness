package  com.example.servingwebcontent;
import javax.sound.sampled.*;

abstract class WorkoutProgram {
    public abstract void firstWorkout();
    public abstract void secondWorkout();
    public abstract void thirdWorkout();
    public abstract void fourthWorkout();
    public abstract void fifthWorkout();
    public void runWorkoutSequence() {
        firstWorkout();
        secondWorkout();
        thirdWorkout();
        fourthWorkout();
        fifthWorkout();
    }

}
