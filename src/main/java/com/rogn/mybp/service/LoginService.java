package com.rogn.mybp.service;

import com.rogn.mybp.entity.User;
import org.springframework.stereotype.Service;


public interface LoginService {
    User getUserByName(String userName);
}
