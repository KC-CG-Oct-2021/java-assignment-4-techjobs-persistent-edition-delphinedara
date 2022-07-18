package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    private String description;

    //constructors: no-arg constructor & ard-> location
    public Skill() {}
    public Skill(String description) {
        this.description = description;
    }

    //getters and setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}