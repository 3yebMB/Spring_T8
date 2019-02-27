package io.spring.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class WelcomeController {
    String param = "";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", "Android");
        return "welcome";
    }

    @RequestMapping("/info")
    public String info(Map<String, Object> model) {
        model.put("message", "The Chelyabinsk meteor entered Earth's atmosphere over Russia on 15 February 2013 at about 09:20 YEKT (03:20 UTC)");
        return "info";
    }

    @RequestMapping("/about")
    public String about(Map<String, Object> model) {
        model.put("test_param", param);
        return "about";
    }

    @RequestMapping("/blank")
    public String blank(Map<String, Object> model) {
        model.put("test_param", param);
        return "blank";
    }

    @RequestMapping(value = "/printme/{data}", method = RequestMethod.GET)
    public String printme(Map<String, Object> model, @PathVariable("data") String data) {
        model.put("data", data);
        return "printme";
    }

    @RequestMapping(value = "/about/test_param", method = RequestMethod.POST)
    @ResponseBody
    public void addNewCustomer(@RequestParam("name_param") String nameParam) {
        param = nameParam;
        System.out.println(nameParam);
    }

    @RequestMapping(value = "/blank/test_param", method = RequestMethod.POST)
    @ResponseBody
    public void addNewBlank(@RequestParam("name_param") String nameParam) {
        param = nameParam;
        System.out.println(nameParam);
    }

    @RequestMapping(value = "/printme")
    public void printmePut(Map<String, Object> model, String data) {
        model.put("test_param", data);
    }

}
