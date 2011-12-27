package com.jsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Made by aurbrsz / 12/27/11 - 20:05
 */
@Controller
@RequestMapping("/welcome")
public class HelloController {

  @RequestMapping(method = RequestMethod.GET)
  public String printWelcome(ModelMap model) {
    model.addAttribute("message", "Spring 3 MVC Hello World");
    return "hello";
  }

}
