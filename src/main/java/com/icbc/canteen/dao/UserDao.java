package com.icbc.canteen.dao;

import com.icbc.canteen.entity.User;
import org.apache.ibatis.annotations.*;


@Mapper
public interface UserDao {

    // 注意空格
    String TABLE_NAME = " user ";
    String INSERT_FIELDS = " username, password, salt, type, status, header_url, account, create_time";
    String SELECT_FIELDS = " id, " + INSERT_FIELDS;

    @Select({"select * from " + TABLE_NAME + " where id = #{id}"})
    User selectById(int id);

    @Insert({"insert into ", TABLE_NAME, "(", INSERT_FIELDS,
            ") values (#{username}, #{password}, #{salt}, #{type}, #{status}, #{headerUrl}, #{account}, #{createTime})"})
    int insertUser(User user);

    @Select({"select * from " + TABLE_NAME + " where username = #{username}"})
    User selectByName(String username);

    @Update({"update " + TABLE_NAME + " set status=#{status} where id=#{id}"})
    int updateStatus(@Param("id")int id, @Param("status")int status);

    @Update({"update " + TABLE_NAME + " set type=#{type} where id=#{id}"})
    int updateType(@Param("id")int id, @Param("type")int type);

    @Update({"update " + TABLE_NAME + " set account= account - #{price} where id=#{id}"})
    int updateAccount(@Param("id")int id, @Param("price")double price);
}
