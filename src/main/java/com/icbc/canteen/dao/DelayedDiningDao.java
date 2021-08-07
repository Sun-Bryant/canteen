package com.icbc.canteen.dao;

import com.icbc.canteen.entity.DelayedDining;
import com.icbc.canteen.entity.ProductionDay;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface DelayedDiningDao {

    // 注意空格
    String TABLE_NAME = " delayed_dining ";
    String INSERT_FIELDS = " user_id, delay_date, diner_num, diner_standard, comment, create_time";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{userId}, #{delayDate}, #{dinerNum}, #{dinerStandard}, #{comment}, #{createTime})"})
    int insertDelayedDining(DelayedDining delayedDining);

}
