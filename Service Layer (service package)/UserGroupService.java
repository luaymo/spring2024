package com.coffeeplace.coffeeshopapp.service;

import com.coffeeplace.coffeeshopapp.domain.UserGroup;

import java.util.List;

public interface UserGroupService {
    UserGroup createGroup(String name, Long userId);
    UserGroup addUserToGroup(Long groupId, Long userId);
    List<UserGroup> getUserGroups(Long userId);
}
