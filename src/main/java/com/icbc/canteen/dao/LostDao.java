package com.icbc.canteen.dao;

import com.icbc.canteen.entity.Lost;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface LostDao {

    // 注意空格
    String TABLE_NAME = " lost ";
    String INSERT_FIELDS = " user_id, title, content, phone, img_url, type, status, create_time";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Select({"select * from " + TABLE_NAME + " where status = 0"})
    ArrayList<Lost> selectLosts();

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{userId}, #{title}, #{content}, #{phone}, #{imgUrl}, #{type}, #{status}, #{createTime})"})
    int insertLost(Lost lost);

}
