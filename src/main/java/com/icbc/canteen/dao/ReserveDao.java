package com.icbc.canteen.dao;

import com.icbc.canteen.entity.Reserve;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ReserveDao {

    // 注意空格
    String TABLE_NAME = " reserve ";
    String INSERT_FIELDS = " user_id, food_name, food_num, create_time";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{userId}, #{foodName}, #{foodNum}, #{createTime})"})
    int insertReserve(Reserve reserve);

}
