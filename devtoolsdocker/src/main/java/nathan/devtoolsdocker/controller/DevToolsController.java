package nathan.devtoolsdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevToolsController {

    @GetMapping
    private String helloWorld() {
        return "Hello Nathan";
    }
}
