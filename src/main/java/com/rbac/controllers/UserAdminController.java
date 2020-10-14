package com.rbac.controllers;

import com.rbac.models.User;
import com.rbac.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author kawasima
 * @author tada
 */
@Controller
@RequiredArgsConstructor
public class UserAdminController {

    private final UserService userService;

    @GetMapping("/users/")
    public String list(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "userAdmin/list";
    }

}
