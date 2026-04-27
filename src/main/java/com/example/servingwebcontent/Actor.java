package com.example.servingwebcontent;

public class Actor {

    private String name;
    private int health;
    private int level;
    private String workoutStyle; // "cardio", "weights", "yoga"
    private int shots;           // in-game points/currency
    private String armor;        // gear tier: "light", "medium", "heavy"

    public Actor() {}

    // Getters
    public String getName()        { return name; }
    public int getHealth()         { return health; }
    public int getLevel()          { return level; }
    public String getWorkoutStyle(){ return workoutStyle; }
    public int getShots()          { return shots; }
    public String getArmor()       { return armor; }

    // Setters
    public void setName(String name)              { this.name = name; }
    public void setHealth(int health)             { this.health = health; }
    public void setLevel(int level)               { this.level = level; }
    public void setWorkoutStyle(String style)     { this.workoutStyle = style; }
    public void setShots(int shots)               { this.shots = shots; }
    public void setArmor(String armor)            { this.armor = armor; }

    // Useful for returning actor data to JS frontend
    public String toJson() {
        return String.format(
            "{\"name\":\"%s\",\"health\":%d,\"level\":%d," +
            "\"workoutStyle\":\"%s\",\"shots\":%d,\"armor\":\"%s\"}",
            name, health, level, workoutStyle, shots, armor
        );
    }

    @Override
    public String toString() {
        return toJson();
    }
}