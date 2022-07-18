package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {


    //In addition to the fields inherited from AbstractEntity, Employer should have a string field for location.
    //    Add the field for location with validation that ensures it is not empty and has a reasonable length.

    @NotBlank (message= "Location is required")
    @Size(min=2, max=50, message="Location must be between 2 and 50 characters")
    private String location;

    //In addition, add public accessor methods to Employer.
    //    For the purposes of this application, an employer can only have one location

    public Employer(){

    }
    public Employer(String location){
        super();
        this.location=location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
