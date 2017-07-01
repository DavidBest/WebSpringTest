package com.example.demo.controller;

import entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by David on 26.06.2017.
 * Some shit
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public String home(@PathVariable("id") String val, Model model) {
            model.addAttribute("name", val);
        return "yourHome";
    }
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String home2(Model model) {
        model.addAttribute("user",new User());
        return "home";
    }

    @RequestMapping(value = "/your", method = RequestMethod.GET)
    public String yourHome(Model model) {
        model.addAttribute("here", "yes");
        return "yourHome";
    }

    @RequestMapping(value = "/your", method = RequestMethod.POST, name = "11")
    public String yourHomePostFirst(Model model) {
        return "redirect:/home/david";
    }

        @RequestMapping(value = "/postUser", method = RequestMethod.POST)
    public String homePostSecond(@Valid User user, Errors errors) {
        if (errors.hasErrors())
            return "home";
        return "redirect:/"+user.getName();
    }

//    @RequestMapping(value = "/your", method = RequestMethod.POST, name = "22")
//    public String yourHomePostFirst(Model model) {
//        return "redirect:/home/notDavid";
//    }



}
