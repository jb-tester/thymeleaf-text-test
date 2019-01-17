package com.mytests.thymeleaf.thymeleaftexttest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView foo() {

        ModelAndView mav = new ModelAndView("home");
        mav.addObject("attr1", "hello!");
        mav.addObject("attr2", "IDEA user");
        List<String> mylist = new ArrayList<>();
        mylist.add("IDEA 2016.*");
        mylist.add("IDEA 2017.*");
        mylist.add("IDEA 2018.*");
        mav.addObject("attr3", mylist);
        return mav;
    }
}
