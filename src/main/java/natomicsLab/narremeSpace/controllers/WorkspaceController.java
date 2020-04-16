package natomicsLab.narremeSpace.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkspaceController {
    @GetMapping("workspace.html")
    public String workspace() {
        return "workspace";
    }
}
