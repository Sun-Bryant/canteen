package com.icbc.canteen.entity;

import java.util.Date;

public class Feedback {

    private int id;
    private int userId;
    private int foodType;
    private int foodTaste;
    private int sanitation;
    private int serviceAttitude;
    private String comment;
    private Date createTime;

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", userId=" + userId +
                ", foodType=" + foodType +
                ", foodTaste=" + foodTaste +
                ", sanitation=" + sanitation +
                ", serviceAttitude=" + serviceAttitude +
                ", comment='" + comment + '\'' +
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

    public int getFoodType() {
        return foodType;
    }

    public void setFoodType(int foodType) {
        this.foodType = foodType;
    }

    public int getFoodTaste() {
        return foodTaste;
    }

    public void setFoodTaste(int foodTaste) {
        this.foodTaste = foodTaste;
    }

    public int getSanitation() {
        return sanitation;
    }

    public void setSanitation(int sanitation) {
        this.sanitation = sanitation;
    }

    public int getServiceAttitude() {
        return serviceAttitude;
    }

    public void setServiceAttitude(int serviceAttitude) {
        this.serviceAttitude = serviceAttitude;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
