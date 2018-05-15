package com.taster.simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Map;

@Controller
public class MenuController {

    @RequestMapping("/")
    public String menu(Map<String, Object> model) {

        ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

        menu.add(new MenuItem("Pizza", 12));
        menu.add(new MenuItem("Cornish Pasty", 5));

        model.put("menuItems", menu);

        return "menu";
    }

}
