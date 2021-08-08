package com.icbc.canteen.dao;

import com.icbc.canteen.entity.RealTimeDiners;
import com.icbc.canteen.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface RealTimeDinersDao {

    // 注意空格
    String TABLE_NAME = " real_time_diners ";
    String INSERT_FIELDS = " queue_time, queue_img_url, queue_num, empty_seats, empty_seats_img_url, create_time";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Select({"select * from " + TABLE_NAME + " order by create_time desc limit 1"})
    RealTimeDiners selectRealTimeDiners();

}
