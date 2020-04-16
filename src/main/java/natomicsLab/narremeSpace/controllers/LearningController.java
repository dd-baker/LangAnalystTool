package natomicsLab.narremeSpace.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LearningController {
    @GetMapping("learning.html")
    public String learning() {
        return "learning";
    }
}
