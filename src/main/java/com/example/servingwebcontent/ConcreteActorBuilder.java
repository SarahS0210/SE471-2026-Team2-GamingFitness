package com.example.servingwebcontent;

public class ConcreteActorBuilder implements ActorBuilder {

    private Actor actor;

    public ConcreteActorBuilder() {
        this.reset();
    }

    private void reset() {
        this.actor = new Actor();
    }

    @Override
    public ActorBuilder setName(String name) {
        this.actor.setName(name);
        return this;
    }

    @Override
    public ActorBuilder setHealth(int health) {
        this.actor.setHealth(health);
        return this;
    }

    @Override
    public ActorBuilder setLevel(int level) {
        this.actor.setLevel(level);
        return this;
    }

    @Override
    public ActorBuilder setWorkoutStyle(String workoutStyle) {
        this.actor.setWorkoutStyle(workoutStyle);
        return this;
    }

    @Override
    public ActorBuilder setShots(int shots) {
        this.actor.setShots(shots);
        return this;
    }

    @Override
    public ActorBuilder setArmor(String armor) {
        this.actor.setArmor(armor);
        return this;
    }

    @Override
    public Actor build() {
        Actor result = this.actor;
        this.reset(); // ready to build next actor
        return result;
    }
}