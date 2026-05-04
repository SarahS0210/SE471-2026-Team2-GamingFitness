async function startLevelEndurance(level) {
    $('#levelEndurance-select').hide();
    $('#main').hide();

    drawables[BACKGROUND].push(new Background('desert', 7));
    get_titanic_player("Juggernaut");
    SummonHorde2("SlimeOrc");

    window.workout.exercises = [];
    window.workout.currentExerciseIndex = -1;
    window.workout.completed = false;
    window.workout.currentText = "";
    window.workout.displayedText = "";

    await workout.loadFromBackend("endurance", level);
    workout.nextExercise();
}

async function startLevelStrength(level) {
    $('#levelStrength-select').hide();
    $('#main').hide();

    drawables[BACKGROUND].push(new Background('desert', 7));
    get_titanic_player("Juggernaut");
    SummonHorde2("SlimeOrc");

    window.workout.exercises = [];
    window.workout.currentExerciseIndex = -1;
    window.workout.completed = false;
    window.workout.currentText = "";
    window.workout.displayedText = "";

    await workout.loadFromBackend("strength", level);
    workout.nextExercise();
}

async function startLevelYoga(level) {
    $('#levelYoga-select').hide();
    $('#main').hide();

    drawables[BACKGROUND].push(new Background('beach', 7));
    get_player("PowerGolem");
    SummonHorde1("MightGolem");

    window.workout.exercises = [];
    window.workout.currentExerciseIndex = -1;
    window.workout.completed = false;
    window.workout.currentText = "";
    window.workout.displayedText = "";

    await workout.loadFromBackend("yoga", level);
    workout.nextExercise();
}

async function startLevelCardio(level) {
    $('#levelCardio-select').hide();
    $('#main').hide();

    drawables[BACKGROUND].push(new Background('castle', 7));
    get_player("VampiricOverlord");
    SummonHorde3("SpiderCultist");

    window.workout.exercises = [];
    window.workout.currentExerciseIndex = -1;
    window.workout.completed = false;
    window.workout.currentText = "";
    window.workout.displayedText = "";

    await workout.loadFromBackend("cardio", level);
    workout.nextExercise();
}