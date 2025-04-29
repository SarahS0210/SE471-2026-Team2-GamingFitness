package com.example.servingwebcontent;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Exercise {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private String style; //the training style of exercise, so cardio, weights, or yoga
  private String muscleGroup; //the type of muscle that a given exercise uses ex: biceps, chest, triceps etc.

  

  protected Exercise() {}

  public Exercise(String style) {
    this.style = style;
    
  }

  @Override
  public String toString() {
    return String.format(
        "User[style='%s',]",
        style);
  }
  public String getStyle() {
    return this.style;
  }
  public String getmuscleGroup() {
    return this.muscleGroup;
  }
}
