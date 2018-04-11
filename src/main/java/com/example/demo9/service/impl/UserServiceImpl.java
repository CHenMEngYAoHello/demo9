package com.example.demo9.service.impl;

import com.example.demo9.domain.User;
import com.example.demo9.repository.UserMapper;
import com.example.demo9.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return null;
    }

    @Override
    public int save(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(Integer id) {
        return 0;
    }
}
