package com.basic.project.controller;

import com.basic.project.model.User;
import com.basic.project.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/signup")
public class SignupController {
    private final UserService userService;

    public SignupController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping()
    public String signupView(){return "signup";}
    @PostMapping()
    public String signupUser(@ModelAttribute User user, Model model){
        String signupError = null;
        if(!userService.isUsernameAvailable(user.getUsername())){
            signupError = "This username is already taken";
        }
        if (signupError==null)
        {
            model.addAttribute("signupSuccessfull",true);
        }
        else{
            model.addAttribute("signupError",signupError);
        }
        return "signup";
    }


}
