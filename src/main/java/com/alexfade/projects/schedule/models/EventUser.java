package com.alexfade.projects.schedule.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Alexander Kovalevsky on 24.05.2016.
 */
@Entity
@Table(name = "event_user")
public class EventUser {

    private Integer id;
    private Integer userId;
    private Integer eventId;

}
