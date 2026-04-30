class WorkoutList {
    constructor(name = "Workout") {
        this.name = name;
        this.exercises = [];
        this.currentExerciseIndex = -1;
        this.currentText = "";
        this.displayedText = "";
        this.textCharIndex = 0;
        this.textDisplayInterval = 10; // milliseconds per character
        this.lastTextUpdate = 0;
        this.completed = false;
    }

    async loadFromBackend(style, level) {
        try {
            const res = await fetch(`http://localhost:8080/api/workouts?style=${style}&level=${level}`);
            const data = await res.json();
            this.exercises = data.map(e => e.name);
            this.name = `${style} Level ${level}`;
            console.log(name);
            console.log(exercises);
        } catch (err) {
            console.error("Failed to load workout from backend:", err);
        }
    }

    setOnExerciseChange(callback) {
        this.onExerciseChange = callback;
    }

    addExercise(exercise) {
        if (typeof exercise == "string" && exercise.trim() !== "") {
            this.exercises.push(exercise);
            return true;
        } else {
            return false;
        }
    }

    nextExercise() {
        if (this.exercises.length === 0) return;
    
        this.currentExerciseIndex++;
    
        if (this.currentExerciseIndex >= this.exercises.length) {
            this.completed = true;
            this.currentText = "Workout Complete!";
        } else {
            this.currentText = this.exercises[this.currentExerciseIndex];
    
            // Trigger callback if exists
            if (this.onExerciseChange) {
                this.onExerciseChange(this.currentText);
            }
        }
    
        this.displayedText = "";
        this.textCharIndex = 0;
    }

    updateText() {
        if (Date.now() - this.lastTextUpdate > this.textDisplayInterval && this.textCharIndex < this.currentText.length) {
            this.displayedText += this.currentText.charAt(this.textCharIndex);
            this.textCharIndex++;
            this.lastTextUpdate = Date.now();
        }
    }

    draw(context, canvas) {
        // Draw background box
        context.fillStyle = "rgba(0, 0, 0, 0.7)";
        context.fillRect(0, canvas.height - 100, canvas.width, 100);

        // Workout name
        context.font = "20px 'Press Start 2P', monospace";
        context.fillStyle = "yellow";
        context.textAlign = "left";
        context.fillText(this.name, 20, canvas.height - 70);

        // Animated text
        context.font = "32px 'Press Start 2P', monospace";
        context.fillStyle = "white";
        context.textAlign = "center";
        context.fillText(this.displayedText, canvas.width / 2, canvas.height - 30);
    }
}
