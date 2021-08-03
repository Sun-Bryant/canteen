package com.icbc.canteen.dao;

import com.icbc.canteen.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface TestDao {

    @Select({"select * from test"})
    ArrayList<Test> getData();

}
