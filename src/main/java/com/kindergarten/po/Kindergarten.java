package com.kindergarten.po;

import javax.persistence.Id;

public class Kindergarten {

    @Id
    private Integer id;
    private String name;
    private Integer xbNum;
    private Integer dbNum;
    private String status;
    private String bdTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getXbNum() {
        return xbNum;
    }

    public void setXbNum(Integer xbNum) {
        this.xbNum = xbNum;
    }

    public Integer getDbNum() {
        return dbNum;
    }

    public void setDbNum(Integer dbNum) {
        this.dbNum = dbNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBdTime() {
        return bdTime;
    }

    public void setBdTime(String bdTime) {
        this.bdTime = bdTime;
    }
}
