package com.example.servingwebcontent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController 
@SpringBootApplication
public class SBJavaMediator{
    private final ActorDirector director =
        new ActorDirector(new ConcreteActorBuilder());

    public static void main(String[] args) {
        SpringApplication.run(SBJavaMediator.class, args);
    }

    @RequestMapping("/api/workouts")
    @CrossOrigin(origins = "*")
    @GetMapping
    public List<String> sendWorkouts(@RequestParam String style, @RequestParam int level) {
    List<String> toSend = WorkoutProgramController.getWorkouts(style, level);
    if (toSend == null) {
        return List.of(new String("No workout found for: " + style + "level " + level));
        }
    return toSend;
    }

    @RequestMapping("/actors")
    @PostMapping("/starter")
    ResponseEntity<String> sendStarterActor(@RequestBody java.util.Map<String, String> body) {
    String name = body.getOrDefault("name", "Player");
    String style = body.getOrDefault("workoutStyle", "cardio"); 
    Actor toSend = director.buildStarterActor(name, style);
    return ResponseEntity.ok(toSend.toJson());
    }

    @PostMapping("/elite")
    public ResponseEntity<String> sendEliteActor(@RequestBody java.util.Map<String, Object> body){
    String name = (String) body.getOrDefault("name", "ElitePlayer");
    String style = (String) body.getOrDefault("workoutStyle", "weights");
    int shots = (int) body.getOrDefault("shots", 9999);
    Actor toSend = director.buildEliteActor(name, style, shots);
    return ResponseEntity.ok(toSend.toJson());
    }

    @RequestMapping("/test")
    public ResponseEntity<String> sendTestActor(){
    Actor toSend = director.buildStarterActor("TestHero", "yoga");
    return ResponseEntity.ok(toSend.toJson());
    }

    public void sendMusicpath(){
    //if workout type == x
    //(method to send path to js side)
    }
}

