package com.icbc.canteen.dao;

import com.icbc.canteen.entity.ProductionDay;
import org.apache.ibatis.annotations.*;


@Mapper
public interface ProductionDayDao {

    // 注意空格
    String TABLE_NAME = " production_day ";
    String INSERT_FIELDS = " user_id, production_date, breakfast_standrad, launch_standrad, dinner_standrad, comment, create_time";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{userId}, #{productionDate}, #{breakfastStandrad}, #{launchStandrad}, #{dinnerStandrad}, #{comment}, #{createTime})"})
    int insertProductionDay(ProductionDay productionDay);

}
