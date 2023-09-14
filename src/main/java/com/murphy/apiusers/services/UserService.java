package com.murphy.apiusers.services;

import com.murphy.apiusers.entities.Role;
import com.murphy.apiusers.entities.User;

public interface UserService {
    User saveUser (User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
}
