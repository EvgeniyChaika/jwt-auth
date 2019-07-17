package jwt.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by echaika on 17.07.2019
 */
@RestController
@RequestMapping("/rest/test")
public class TestResource {

    @GetMapping
    public String test() {
        return "Test";
    }
}
