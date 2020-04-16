package natomicsLab.narremeSpace.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibraryController {
    @GetMapping("library.html")
    public String library() {
        return "library";
    }


}
