package com.example.servingwebcontent;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/workouts")
@CrossOrigin(origins = "*")
public class WorkoutProgramController {

    @GetMapping
    public List<String> getWorkouts(@RequestParam String style, @RequestParam int level) {
        WorkoutReadOnlyIF program = getProgram(style, level);
        if (program == null) {
            return List.of(new String("No workout found for: " + style + " level " + level));
        }
        return program.getWorkouts();
    }

    private WorkoutReadOnlyIF getProgram(String style, int level) {
        return switch (style.toLowerCase()) {
            case "cardio" -> level == 1 ? new CardioLevel1() : new CardioLevel2();
            case "endurance" -> level == 1 ? new EnduranceLevel1() : new EnduranceLevel2();
            case "strength" -> level == 1 ? new StrengthLevel1() : new StrengthLevel2();
            case "yoga" -> level == 1 ? new YogaLevel1() : new YogaLevel2();
            default -> null;
        };
    }
}
