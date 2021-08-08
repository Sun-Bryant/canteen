package com.icbc.canteen.dao;

import com.icbc.canteen.entity.Feedback;
import com.icbc.canteen.entity.Lost;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface FeedbackDao {

    // 注意空格
    String TABLE_NAME = " feedback ";
    String INSERT_FIELDS = " user_id, food_type, food_taste, sanitation, service_attitude, comment, create_time";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{userId}, #{foodType}, #{foodTaste}, #{sanitation}, #{serviceAttitude}, #{comment}, #{createTime})"})
    int insertFeedback(Feedback feedback);

}
