package ru.blogic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@Controller(value = "actions")
public class MyListController {

    @GetMapping(value = "/list")
    public ModelAndView showList() {
        var mav = new ModelAndView();
        String a[] = new String[]{"1", "2", "3", "4", "5", "6", "<script>alert(100500)</script>"};
        mav.addObject("currentList", Arrays.asList(a));
        mav.setViewName("list");
        return mav;
    }
}
