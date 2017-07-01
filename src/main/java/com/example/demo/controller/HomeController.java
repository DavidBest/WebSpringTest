package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by David on 26.06.2017.
 * Some shit
 */
@Controller
@RequestMapping({"/","home"})
public class HomeController {

    @RequestMapping(value = {"/{id}"}, method = RequestMethod.GET)
    public String home(@PathVariable("id") String val, Model model) {
        if (val != null)
            model.addAttribute("name", val);
        else
            model.addAttribute("name", "David");
        return "home";
    }
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String home2(@RequestParam("id") String val, Model model) {
        if (val != null)
            model.addAttribute("name", val);
        else
            model.addAttribute("name", "David");
        return "home";
    }

    @RequestMapping(value = "/your", method = RequestMethod.GET)
    public String yourHome(Model model) {
        model.addAttribute("here", "yes");
        return "yourHome";
    }

    @RequestMapping(value = "/your", method = RequestMethod.POST, name = "11")
    public String yourHomePostSecond(Model model) {
        return "redirect:/home/david";
    }

//    @RequestMapping(value = "/your", method = RequestMethod.POST, name = "22")
//    public String yourHomePostFirst(Model model) {
//        return "redirect:/home/notDavid";
//    }



}
