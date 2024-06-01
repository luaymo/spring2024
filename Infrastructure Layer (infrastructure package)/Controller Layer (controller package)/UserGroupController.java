package com.coffeeplace.coffeeshopapp.infrastructure.controller;

import com.coffeeplace.coffeeshopapp.domain.UserGroup;
import com.coffeeplace.coffeeshopapp.infrastructure.model.UserGroupDTO;
import com.coffeeplace.coffeeshopapp.service.UserGroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/groups")
public class UserGroupController {

    private final UserGroupService userGroupService;

    public UserGroupController(UserGroupService userGroupService) {
        this.userGroupService = userGroupService;
    }

    @PostMapping("/create")
    public UserGroupDTO createGroup(@RequestBody UserGroupDTO userGroupDTO) {
        UserGroup group = userGroupService.createGroup(userGroupDTO.getName(), userGroupDTO.getUserId());
        return convertToDTO(group);
    }

    @PostMapping("/{groupId}/addUser/{userId}")
    public UserGroupDTO addUserToGroup(@PathVariable Long groupId, @PathVariable Long userId) {
        UserGroup group = userGroupService.addUserToGroup(groupId, userId);
        return convertToDTO(group);
    }

    @GetMapping("/user/{userId}")
    public List<UserGroupDTO> getUserGroups(@PathVariable Long userId) {
        return userGroupService.getUserGroups(userId).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private UserGroupDTO convertToDTO(UserGroup group) {
        UserGroupDTO userGroupDTO = new UserGroupDTO();
        userGroupDTO.setId(group.getId());
        userGroupDTO.setName(group.getName());
        userGroupDTO.setUserIds(group.getUsers().stream().map(User::getId).collect(Collectors.toSet()));
        return userGroupDTO;
    }
}
