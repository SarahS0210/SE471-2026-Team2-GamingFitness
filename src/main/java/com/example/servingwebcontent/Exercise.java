package com.example.servingwebcontent;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Exercise {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  private String name; //The name of the workout
  

  public Exercise() {}

  public Exercise(String name) {
    this.name = name;
  }

  public Long getId() { return id; }
  
  public String getName() {
    return name;
  }
  
}
