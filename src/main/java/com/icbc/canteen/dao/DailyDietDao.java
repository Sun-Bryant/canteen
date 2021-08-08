package com.icbc.canteen.dao;

import com.icbc.canteen.entity.DailyDiet;
import com.icbc.canteen.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;


@Mapper
public interface DailyDietDao {

    // 注意空格
    String TABLE_NAME = " daily_diet ";
    String INSERT_FIELDS = " food_name, food_energy, food_price, food_stock, flag, food_img_url, create_time";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Select({"select * from " + TABLE_NAME + "where DATE(create_time) = curdate()"})
    ArrayList<DailyDiet> selectDailyDiet();

    @Select({"select * from " + TABLE_NAME + "where food_name = #{foodName}"})
    DailyDiet selectByName(@Param("foodName")String foodName);

    @Update({"update " + TABLE_NAME + " set food_stock=food_stock - #{foodNum} where food_name=#{foodName}"})
    int updateStock(@Param("foodName")String foodName, @Param("foodNum")int foodNum);

}
