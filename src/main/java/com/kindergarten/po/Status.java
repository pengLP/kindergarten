package com.kindergarten.po;

import javax.persistence.Id;

public class Status {

    @Id
    private Integer id;
    private Integer xbNum;
    private Integer dbNum;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
