package Vladislav.Gurbatov.TestTask.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public ModelAndView index(Model model) {
        ModelAndView modelAndView = new ModelAndView("/main/index");
        modelAndView.addObject(model);
        return modelAndView;
    }
}
