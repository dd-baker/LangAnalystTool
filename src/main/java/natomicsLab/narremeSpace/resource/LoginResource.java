package natomicsLab.narremeSpace.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/login")
@RestController
public class LoginResource {
    @GetMapping("/all")
    public String login() {
        return "Login Filler";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/all")
    public String securedLogin() {
        return "Secured Login Filler";
    }
}
