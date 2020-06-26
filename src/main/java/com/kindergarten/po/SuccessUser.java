package com.kindergarten.po;

import javax.persistence.Id;

public class SuccessUser {
    @Id
    private Integer id;
    private Integer userId;
    private Integer kId;
    private String type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getkId() {
        return kId;
    }

    public void setkId(Integer kId) {
        this.kId = kId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SuccessUser{" +
                "id=" + id +
                ", userId=" + userId +
                ", kId=" + kId +
                ", type='" + type + '\'' +
                '}';
    }
}
