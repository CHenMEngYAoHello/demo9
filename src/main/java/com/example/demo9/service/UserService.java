package com.example.demo9.service;
import com.example.demo9.domain.User;
import java.util.List;

public interface UserService {
    List<User> selectAll();
    int save(User user);
    int update(User user);
    int delete(Integer id);
}
