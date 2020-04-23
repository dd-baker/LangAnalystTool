package natomicsLab.narremeSpace.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rest/home")
@RestController
public class HomeResource {

    @GetMapping("/all")
    public String home() {
        return "Home Filler";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/all")
    public String securedHome() {
        return "Secured Home Filler";
    }

    @GetMapping("/secured/alternate")
    public String alternate(){
        return "alternate";
    }
}
