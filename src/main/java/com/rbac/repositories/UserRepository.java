package com.rbac.repositories;

import com.rbac.models.User;

import java.util.List;

/**
 * @author tada
 */
public interface UserRepository {

    public void register(User user, String roleName);

    public List<User> findAll();

}
