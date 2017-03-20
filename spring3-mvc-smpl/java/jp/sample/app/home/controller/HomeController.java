package jp.sample.app.home.controller;

import java.util.Date;

import jp.sample.app.home.form.HomeForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sample")
public class HomeController {

    @RequestMapping
    public String index(Model model) {
        return home(model);
    }

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute(new HomeForm());
        Date date = new Date();
        model.addAttribute("date", date);
        return "home";
    }
}