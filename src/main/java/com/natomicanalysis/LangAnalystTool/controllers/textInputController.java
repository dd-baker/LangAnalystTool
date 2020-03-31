package com.natomicanalysis.LangAnalystTool.controllers;

import com.natomicanalysis.LangAnalystTool.models.textInput;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Scanner;

@Controller
public class textInputController {
    @GetMapping ("/textInput")
    public String textInputForm (Model model){
        model.addAttribute("textInput", new textInput());
        return "textInput";
    }

    @PostMapping ("/textInput")
    public String textInputSubmit (@ModelAttribute textInput textInput) {
        return "result";
    }
}
