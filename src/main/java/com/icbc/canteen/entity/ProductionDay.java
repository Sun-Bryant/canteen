package com.icbc.canteen.entity;

import java.util.Date;

public class ProductionDay {

    private int id;
    private int userId;
    private Date productionDate;
    private double breakfastStandrad;
    private double launchStandrad;
    private double dinnerStandrad;
    private String comment;
    private Date createTime;

    @Override
    public String toString() {
        return "ProductionDay{" +
                "id=" + id +
                ", userId=" + userId +
                ", productionDate=" + productionDate +
                ", breakfastStandrad=" + breakfastStandrad +
                ", launchStandrad=" + launchStandrad +
                ", dinnerStandrad=" + dinnerStandrad +
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

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public double getBreakfastStandrad() {
        return breakfastStandrad;
    }

    public void setBreakfastStandrad(double breakfastStandrad) {
        this.breakfastStandrad = breakfastStandrad;
    }

    public double getLaunchStandrad() {
        return launchStandrad;
    }

    public void setLaunchStandrad(double launchStandrad) {
        this.launchStandrad = launchStandrad;
    }

    public double getDinnerStandrad() {
        return dinnerStandrad;
    }

    public void setDinnerStandrad(double dinnerStandrad) {
        this.dinnerStandrad = dinnerStandrad;
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
