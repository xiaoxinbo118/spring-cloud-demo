package com.spice.user.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by sfht on 4/3/2019.
 */
// TODO 工具生成
@Table(name = "`spice-user`.`user`")
public class UserDomain {
    private static final String COLUMN_FIELD_ID = "id";
    private static final String COLUMN_FIELD_NAME = "name";
    private static final String COLUMN_FIELD_TEAM_ID = "team_id";
    private static final String COLUMN_FIELD_TELEPHONE = "telephone";
    private static final String COLUMN_FIELD_PASSWORD = "password";
    private static final String COLUMN_FIELD_CREATE_DATE = "create_date";
    private static final String COLUMN_FIELD_UPDATE_DATE = "update_date";
    private static final String COLUMN_FIELD_IS_DELETE = "is_delete";

    public static final String COLUMN_CONDITION_ID = "id";
    public static final String COLUMN_CONDITION_NAME = "name";
    public static final String COLUMN_CONDITION_TEAM_ID = "teamId";
    public static final String COLUMN_CONDITION_TELEPHONE = "telephone";
    public static final String COLUMN_CONDITION_PASSWORD = "password";
    public static final String COLUMN_CONDITION_CREATE_DATE = "createDate";
    public static final String COLUMN_CONDITION_UPDATE_DATE = "updateDate";
    public static final String COLUMN_CONDITION_IS_DELETE = "isDelete";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = UserDomain.COLUMN_FIELD_NAME)
    private String name;

    @Column(name = UserDomain.COLUMN_FIELD_TEAM_ID)
    private Integer teamId;

    @Column(name = UserDomain.COLUMN_FIELD_TELEPHONE)
    private String telephone;

    @Column(name = COLUMN_FIELD_PASSWORD)
    private String password;

    @Column(name = COLUMN_FIELD_CREATE_DATE)
    private Date createDate;

    @Column(name = COLUMN_FIELD_UPDATE_DATE)
    private Date updateDate;

    @Column(name = COLUMN_FIELD_IS_DELETE)
    private Integer isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
