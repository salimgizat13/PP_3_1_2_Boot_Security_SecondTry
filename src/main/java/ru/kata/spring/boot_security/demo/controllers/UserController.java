package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.demo.security.UserDetailsImpl;

//import ru.kata.spring.boot_security.demo.model.User;
//import ru.kata.spring.boot_security.demo.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/users")
//public class UserController {
//
//    private final UserService userService;
//
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping()
//    public String findAll(Model model) {
//        List<User> users = userService.getUsers();
//        model.addAttribute("user", users);
//        return "users";
//    }
//
//    @GetMapping("/add")
//    public String toAdd(Model model) {
//        model.addAttribute("user", new User());
//        return "/add";
//    }
//
//    @PostMapping()
//    public String addUser (@ModelAttribute("user") User user) {
//        userService.addUser(user);
//        return "redirect:/users";
//    }
//
//    @GetMapping("/{id}")
//    public String show(@PathVariable ("id") int id, Model model) {
//        model.addAttribute("user", userService.getUserById(id));
//        return "/user";
//    }
//
//
//
//    @DeleteMapping  ("/{id}")
//    public String deleteUser(@PathVariable("id") Long id) {
//        userService.deleteUser(id);
//        return "redirect:/users";
//    }
//
//
//
//    @GetMapping("/{id}/edit")
//    public String editUsers(@PathVariable("id") long id, Model model) {
//        model.addAttribute("user", userService.getUserById(id));
//        return "/edit";
//    }
//    @PostMapping("/{id}")
//    public String update (@ModelAttribute ("user") User user) {
//        userService.updateUser(user);
//        return "redirect:/users";
//    }
//
//
//}
@Controller
public class UserController {
    @GetMapping("showUserInfo")
    public String showUserInfo () {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        System.out.println(userDetails.getUser());

        return "hello";
    }

    @GetMapping("/hello")
    public String sayHello () {
        return "hello";
    }
}
