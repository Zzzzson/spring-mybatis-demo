package com.mybatis.db;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.mybatis.domain.User;

@Repository
public interface UserMapper {
    @Select("SELECT * FROM users WHERE name = #{name} and password = #{password}")
    User getUser(@Param("name") String name,@Param("password") String password);
    
    @Select("SELECT * FROM users")
    List<User> getAllUser();
    
    @Delete("DELETE FROM users where id = #{userId}")
    void deleteUser(@Param("userId") int userId);
    
    @Insert("INSERT INTO users(NAME,PASSWORD) VALUE(#{name},#{password})")
    void insertUser(@Param("name") String name,@Param("password") String password);
    
    @Update("UPDATE users SET PASSWORD = #{password} WHERE ID = #{id}")
    void updateUser(@Param("password") String password,@Param("id") int id);
}
