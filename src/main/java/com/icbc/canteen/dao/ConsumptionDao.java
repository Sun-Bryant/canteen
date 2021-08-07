package com.icbc.canteen.dao;

import com.icbc.canteen.entity.Consumption;
import com.icbc.canteen.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;


@Mapper
public interface ConsumptionDao {

    // 注意空格
    String TABLE_NAME = " consumption ";
    String INSERT_FIELDS = " user_id, food_img_url, food_name, food_num, food_price, score, create_time";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Select({"select * from " + TABLE_NAME + " order by create_time desc limit 6;"})
    ArrayList<Consumption> selectConsumption();

    @Update({"update " + TABLE_NAME + " set score=#{score} where id=#{id}"})
    int updateScore(@Param("id") int id, @Param("score") double score);
}
