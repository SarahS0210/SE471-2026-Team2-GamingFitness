package com.example.servingwebcontent;

import java.util.List;


public class WorkoutProgramController {

    public static List<String> getWorkouts(String style, int level) {
        WorkoutReadOnlyIF program = getProgram(style, level);
        if (program == null) {
            return List.of(new String("No workout found for: " + style + " level " + level));
        }
        return program.getWorkouts();
    }

    private static WorkoutReadOnlyIF getProgram(String style, int level) {
        return switch (style.toLowerCase()) {
            case "cardio" -> level == 1 ? new CardioLevel1() : new CardioLevel2();
            case "endurance" -> level == 1 ? new EnduranceLevel1() : new EnduranceLevel2();
            case "strength" -> level == 1 ? new StrengthLevel1() : new StrengthLevel2();
            case "yoga" -> level == 1 ? new YogaLevel1() : new YogaLevel2();
            default -> null;
        };
    }
}
