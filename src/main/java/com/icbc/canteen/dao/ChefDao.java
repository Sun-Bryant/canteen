package com.icbc.canteen.dao;

import com.icbc.canteen.entity.Chef;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface ChefDao {

    // 注意空格
    String TABLE_NAME = " chef ";
    String INSERT_FIELDS = " user_id, header_img_url, name, temperature, vaccine, create_time";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Select({"select * from " + TABLE_NAME})
    ArrayList<Chef> selectChefs();

}
