package com.icbc.canteen.entity;

import java.util.Date;

public class Consumption {

    private int id;

    private int userId;

    private String foodImgUrl;

    private String foodName;

    private int foodNum;

    private double foodPrice;

    private double score;

    private Date createTime;

    @Override
    public String toString() {
        return "Consumption{" +
                "id=" + id +
                ", userId=" + userId +
                ", foodImgUrl='" + foodImgUrl + '\'' +
                ", foodName='" + foodName + '\'' +
                ", foodNum=" + foodNum +
                ", foodPrice=" + foodPrice +
                ", score=" + score +
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

    public String getFoodImgUrl() {
        return foodImgUrl;
    }

    public void setFoodImgUrl(String foodImgUrl) {
        this.foodImgUrl = foodImgUrl;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodNum() {
        return foodNum;
    }

    public void setFoodNum(int foodNum) {
        this.foodNum = foodNum;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
