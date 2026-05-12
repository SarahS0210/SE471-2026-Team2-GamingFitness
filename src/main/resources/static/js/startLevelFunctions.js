async function startLevelEndurance(level) {
    yogaSong = new Audio('/songs/yoga.mp3');
    $('#levelEndurance-select').hide();
    $('#main').hide();

    drawables[BACKGROUND].push(new Background('beach', 7));
    get_titanic_player("Juggernaut");
    SummonHorde2("SlimeOrc");

    yogaSong.muted = false;
    yogaSong.play();
    yogaSong.loop = true;

    window.workout.exercises = [];
    window.workout.currentExerciseIndex = -1;
    window.workout.completed = false;
    window.workout.currentText = "";
    window.workout.displayedText = "";

    await workout.loadFromBackend("Endurance", level);
    workout.nextExercise();
}

async function startLevelStrength(level) {
    yogaSong = new Audio('/songs/yoga.mp3');
    $('#levelStrength-select').hide();
    $('#main').hide();

    drawables[BACKGROUND].push(new Background('beach', 7));
    get_titanic_player("Juggernaut");
    SummonHorde2("SlimeOrc");

    yogaSong.muted = false;
    yogaSong.play();
    yogaSong.loop = true;

    window.workout.exercises = [];
    window.workout.currentExerciseIndex = -1;
    window.workout.completed = false;
    window.workout.currentText = "";
    window.workout.displayedText = "";


    await workout.loadFromBackend("Strength", level);
    workout.nextExercise();
}

async function startLevelYoga(level) {
    yogaSong = new Audio('/songs/yoga.mp3');
    $('#levelYoga-select').hide();
    $('#main').hide();

    drawables[BACKGROUND].push(new Background('beach', 7));
    get_player("PowerGolem");
    SummonHorde1("MightGolem");
    
    yogaSong.muted = false;
    yogaSong.play();
    yogaSong.loop = true;

    window.workout.exercises = [];
    window.workout.currentExerciseIndex = -1;
    window.workout.completed = false;
    window.workout.currentText = "";
    window.workout.displayedText = "";

    await workout.loadFromBackend("Yoga", level);
    workout.nextExercise();
}

async function startLevelCardio(level) {
    yogaSong = new Audio('/songs/yoga.mp3');
    $('#levelCardio-select').hide();
    $('#main').hide();

    drawables[BACKGROUND].push(new Background('castle', 7));
    get_player("VampiricOverlord");
    SummonHorde3("SpiderCultist");

    yogaSong.muted = false;
    yogaSong.play();
    yogaSong.loop = true;

    window.workout.exercises = [];
    window.workout.currentExerciseIndex = -1;
    window.workout.completed = false;
    window.workout.currentText = "";
    window.workout.displayedText = "";


    await workout.loadFromBackend("Cardio", level);
    workout.nextExercise();
}