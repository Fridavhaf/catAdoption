package spring.mars9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getName(String navn){
        return "Hei verden "+navn;
    }
}
