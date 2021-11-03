package springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @GetMapping("/")
    public String homepage() {
        return ("<h1>Homepage</h1>");
    }

    @GetMapping("/user")
    public String userLogin() {
        return ("<h1>Hello User</h1>");
    }

    @GetMapping("/admin")
    public String adminUser() {
        return ("<h1>Welcome Admin User</h1>");
    }
}
