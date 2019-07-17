package jwt.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by echaika on 17.07.2019
 */
@RestController
@RequestMapping("/rest/test")
public class TestResource {

    @GetMapping("/principal")
    public Principal principal(Principal principal) {
        return principal;
    }

    @GetMapping
    public String test() {
        return "Test";
    }
}
