class workoutList {
    constructor(exercises) {
        this.exercises =[]; //array of exercises
    }
}
//add exercise to workout list
addExercise(exercise) 
{
    if(typeof exercise == "string" && exercise.trim() !== "") 
         {
        this.exercises.push(exercise);
    return true;
} else{
    return false;
  }
}
