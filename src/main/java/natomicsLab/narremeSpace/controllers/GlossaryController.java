package natomicsLab.narremeSpace.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GlossaryController {
    @GetMapping("glossary.html")
    public String glossary() {
        return "glossary";
    }

}
