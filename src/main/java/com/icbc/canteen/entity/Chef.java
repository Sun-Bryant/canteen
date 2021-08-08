package com.icbc.canteen.entity;

import java.util.Date;

public class Chef {

    private int id;
    private int userId;
    private String headerImgUrl;
    private String name;
    private double temperature;
    private int vaccine;
    private Date createTime;

    @Override
    public String toString() {
        return "Chef{" +
                "id=" + id +
                ", userId=" + userId +
                ", headerImgUrl='" + headerImgUrl + '\'' +
                ", name='" + name + '\'' +
                ", temperature=" + temperature +
                ", vaccine=" + vaccine +
                ", createTime=" + createTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getHeaderImgUrl() {
        return headerImgUrl;
    }

    public void setHeaderImgUrl(String headerImgUrl) {
        this.headerImgUrl = headerImgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getVaccine() {
        return vaccine;
    }

    public void setVaccine(int vaccine) {
        this.vaccine = vaccine;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
