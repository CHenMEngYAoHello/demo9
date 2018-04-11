package com.example.demo9.repository;
import com.example.demo9.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Repository
//@Controller
@Mapper
public interface UserMapper {
    List<User> selectAll();
    int save(User user);
    int update(User user);
    int delete(Integer id);
}
