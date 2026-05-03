package com.example.servingwebcontent;


public class ActorController {

    private final ActorDirector director =
        new ActorDirector(new ConcreteActorBuilder());

    public Actor createStarterActor(String name, String style) {
        Actor actor = director.buildStarterActor(name, style);
        return actor;
    }

    public Actor createEliteActor(String name, String style, int shots) {
        Actor actor = director.buildEliteActor(name, style, shots);
        return actor;
    }
}
