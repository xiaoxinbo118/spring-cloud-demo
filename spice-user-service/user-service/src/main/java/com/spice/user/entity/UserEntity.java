package com.spice.user.entity;

/**
 * Created by sfht on 21/2/2019.
 */
public class UserEntity {
    private long id;
    private long teamId;
    private String name;
    private String telephone;

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
