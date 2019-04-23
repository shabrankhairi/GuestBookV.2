package com.example12345.demo123.controller;

import com.example12345.demo123.repository.GuestRepository;
import com.example12345.demo123.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example12345.demo123.model.Guest;
import com.example12345.demo123.model.User;

@Controller
public class WebController {
    @Autowired
    private GuestRepository repo;

    @RequestMapping("/home")
    public String createHome(Model model) {
        model.addAttribute("guest", repo.findAll());
        return "homeAdmin";
    }
    @RequestMapping("/")
    public String createHome2(Model model){
        model.addAttribute("user", repo.findAll());
        return "home2";
    }
    @RequestMapping(value="/login1", method=RequestMethod.GET)
    public String createLogin(Model model){
        model.addAttribute("user", repo.findAll());
        return "login";
    }
    @RequestMapping(value="/create", method=RequestMethod.GET)
    public String create1(Model model) {
        model.addAttribute("guest", new Guest());
        return "FormGuest";
    }

    @RequestMapping(value="/create", method=RequestMethod.POST)
    public String create2(Model model, Guest guest) {
        model.addAttribute("guest", repo.save(guest));
        return "redirect:/home";
    }

    @RequestMapping(value="/edit/{id}", method=RequestMethod.GET)
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("guest", repo.getOne(id));
        return "FormGuest";
    }

    @RequestMapping(value="/remove/{id}", method=RequestMethod.GET)
    public String remove(@PathVariable Integer id) {
        repo.deleteById(id);
        return "redirect:/";
    }
    @RequestMapping(value="/403")
    public String Error403(){
        return "403";
    }
}
