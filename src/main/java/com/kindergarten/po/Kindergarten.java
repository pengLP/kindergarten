package com.kindergarten.po;

import javax.persistence.Id;

public class Kindergarten {

    @Id
    private Integer id;
    private String name;
    private Integer xbNum;
    private Integer dbNum;
    private Integer tbNum;
    private String status;
    private String bdTime;
    private Integer allNum;
    private String startTime;

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

    public Integer getTbNum() {
        return tbNum;
    }

    public void setTbNum(Integer tbNum) {
        this.tbNum = tbNum;
    }

    public Integer getAllNum() {
        return allNum;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Kindergarten{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", xbNum=" + xbNum +
                ", dbNum=" + dbNum +
                ", status='" + status + '\'' +
                ", bdTime='" + bdTime + '\'' +
                '}';
    }
}
