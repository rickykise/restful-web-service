package com.example.restfulwebservice.profile;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserProfileMapper {

    @Select("select * from UserProfile where id=#{id}")
    UserProfile getUserProfile(@Param("id") String id);

    @Select("select * from UserProfile")
    List<UserProfile> getUserProfileList();

    @Insert("insert into UserProfile values(#{id}, #{name}, #{phone},#{adress})")
    int insertUserProfile(@Param("id") String id, @Param("name") String name, @Param("phone") String phone, @Param("adress") String adress);

    @Update("update UserProfile set name=#{name}, phone=#{phone}, adress=#{adress} where id=#{id}")
    int updateUserProfile(@Param("id") String id, @Param("name") String name, @Param("phone") String phone, @Param("adress") String adress);

    @Delete("delete form UserProfile where id=#{id}")
    int deleteUserProfile(@Param("id") String id);
}
