package main.java.com.cognizant.springlearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String showMessage() {
        return "<h1 style='color:green; text-align:center; margin-top:20%; font-size:3rem;'>🎉 Hands-On 1 Completed Successfully!</h1>";
    }
}
