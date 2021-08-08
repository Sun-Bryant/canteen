package com.icbc.canteen.entity;

import java.util.Date;

public class DailyDiet {

    private int id;
    private String foodName;
    private String foodEnergy;
    private double foodPrice;
    private int foodStock;
    private int flag;
    private String foodImgUrl;
    private Date create_time;

    @Override
    public String toString() {
        return "DailyDiet{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                ", foodEnergy='" + foodEnergy + '\'' +
                ", foodPrice=" + foodPrice +
                ", foodStock=" + foodStock +
                ", flag=" + flag +
                ", foodImgUrl='" + foodImgUrl + '\'' +
                ", create_time=" + create_time +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodEnergy() {
        return foodEnergy;
    }

    public void setFoodEnergy(String foodEnergy) {
        this.foodEnergy = foodEnergy;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getFoodStock() {
        return foodStock;
    }

    public void setFoodStock(int foodStock) {
        this.foodStock = foodStock;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getFoodImgUrl() {
        return foodImgUrl;
    }

    public void setFoodImgUrl(String foodImgUrl) {
        this.foodImgUrl = foodImgUrl;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
