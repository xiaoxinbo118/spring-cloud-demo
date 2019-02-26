package com.spice.pim.controller;

/**
 * Created by sfht on 21/2/2019.
 */
public class UserEntity {
    private long id;
    private long teamId;
    private String name;

    public long getId() {
        return id;
    }

    public long getTeamId() {
        return teamId;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public void setName(String name) {
        this.name = name;
    }
}
