package jp.sample.app.menu.controller;

import javax.validation.Valid;

import jp.sample.app.home.form.HomeForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample/menu")
public class MenuController {
    @RequestMapping
    public String index(@ModelAttribute @Valid HomeForm form, BindingResult result, Model model) {
        if(result.hasErrors()) {
            return "home";
        }
        model.addAttribute("name", form.getName());
        return "menu";
    }
}