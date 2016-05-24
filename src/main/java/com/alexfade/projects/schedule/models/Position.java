package com.alexfade.projects.schedule.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Alexander Kovalevsky on 24.05.2016.
 */
@Entity
@Table(name = "positions")
public class Position {

    private Integer id;
    private String position;
    private String role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
