package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PreDestroy;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @PreDestroy
    public void shutdown() {
        System.out.println("HelloController shutdown");
    }
    
}
