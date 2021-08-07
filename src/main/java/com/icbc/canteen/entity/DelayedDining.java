package com.icbc.canteen.entity;

import java.util.Date;

public class DelayedDining {

    private int id;
    private int userId;
    private Date delayDate;
    private String dinerNum;
    private double dinerStandard;
    private String comment;
    private Date createTime;

    @Override
    public String toString() {
        return "DelayedDining{" +
                "id=" + id +
                ", userId=" + userId +
                ", delayDate=" + delayDate +
                ", dinerNum='" + dinerNum + '\'' +
                ", dinerStandard=" + dinerStandard +
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

    public Date getDelayDate() {
        return delayDate;
    }

    public void setDelayDate(Date delayDate) {
        this.delayDate = delayDate;
    }

    public String getDinerNum() {
        return dinerNum;
    }

    public void setDinerNum(String dinerNum) {
        this.dinerNum = dinerNum;
    }

    public double getDinerStandard() {
        return dinerStandard;
    }

    public void setDinerStandard(double dinerStandard) {
        this.dinerStandard = dinerStandard;
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
