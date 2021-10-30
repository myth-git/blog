package com.sise.blog.service;

import com.sise.blog.pojo.User;

public interface UserService {
    User checkUser(String username, String password);
}
