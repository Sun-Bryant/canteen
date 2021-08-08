package com.icbc.canteen.entity;

import java.util.Date;

public class RealTimeDiners {

    private int id;
    private int queueTime;
    private String queueImgUrl;
    private int queueNum;
    private int emptySeats;
    private String emptySeatsImgUrl;
    private Date createTime;

    @Override
    public String toString() {
        return "RealTimeDiners{" +
                "id=" + id +
                ", queueTime=" + queueTime +
                ", queueImgUrl='" + queueImgUrl + '\'' +
                ", queueNum=" + queueNum +
                ", emptySeats=" + emptySeats +
                ", emptySeatsImgUrl='" + emptySeatsImgUrl + '\'' +
                ", createTime=" + createTime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQueueTime() {
        return queueTime;
    }

    public void setQueueTime(int queueTime) {
        this.queueTime = queueTime;
    }

    public String getQueueImgUrl() {
        return queueImgUrl;
    }

    public void setQueueImgUrl(String queueImgUrl) {
        this.queueImgUrl = queueImgUrl;
    }

    public int getQueueNum() {
        return queueNum;
    }

    public void setQueueNum(int queueNum) {
        this.queueNum = queueNum;
    }

    public int getEmptySeats() {
        return emptySeats;
    }

    public void setEmptySeats(int emptySeats) {
        this.emptySeats = emptySeats;
    }

    public String getEmptySeatsImgUrl() {
        return emptySeatsImgUrl;
    }

    public void setEmptySeatsImgUrl(String emptySeatsImgUrl) {
        this.emptySeatsImgUrl = emptySeatsImgUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
