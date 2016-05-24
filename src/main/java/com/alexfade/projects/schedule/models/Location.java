package com.alexfade.projects.schedule.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Alexander Kovalevsky on 24.05.2016.
 */
@Entity
@Table(name = "locations")
public class Location {

    private Integer id;
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
