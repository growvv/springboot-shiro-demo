package com.rogn.mybp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor   // 无参构造函数
@AllArgsConstructor  // 有参构造函数
public class User {
    private Integer id;

    private String username;
    private String password;

    /**
     * 用户对应的角色集合
     */
    private Set<Role> roles;
}