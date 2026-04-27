package com.example.servingwebcontent;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/actors")
public class ActorController {

    private final ActorDirector director =
        new ActorDirector(new ConcreteActorBuilder());

    // POST /actors/starter
    // JS calls: fetch('/actors/starter', { method: 'POST', body: JSON.stringify({name, workoutStyle}) })
    @PostMapping("/starter")
    public ResponseEntity<String> createStarterActor(@RequestBody java.util.Map<String, String> body) {
        String name = body.getOrDefault("name", "Player");
        String style = body.getOrDefault("workoutStyle", "cardio");
        Actor actor = director.buildStarterActor(name, style);
        return ResponseEntity.ok(actor.toJson());
    }

    // POST /actors/elite
    @PostMapping("/elite")
    public ResponseEntity<String> createEliteActor(@RequestBody java.util.Map<String, Object> body) {
        String name = (String) body.getOrDefault("name", "ElitePlayer");
        String style = (String) body.getOrDefault("workoutStyle", "weights");
        int shots = (int) body.getOrDefault("shots", 9999);
        Actor actor = director.buildEliteActor(name, style, shots);
        return ResponseEntity.ok(actor.toJson());
    }

    // GET /actors/test — handy for testing in the browser
    @GetMapping("/test")
    public ResponseEntity<String> testActor() {
        Actor actor = director.buildStarterActor("TestHero", "yoga");
        return ResponseEntity.ok(actor.toJson());
    }
}