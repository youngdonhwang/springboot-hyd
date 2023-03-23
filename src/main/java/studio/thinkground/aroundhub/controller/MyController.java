package studio.thinkground.aroundhub.controller;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import studio.thinkground.aroundhub.config.env.DevConfiguration;
import studio.thinkground.aroundhub.threadtask.ThreadAsyncExam1;
import studio.thinkground.aroundhub.threadtask.ThreadExam1;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class MyController {

    private final Logger LOGGER = LoggerFactory.getLogger(MyController.class);
    @Autowired
    ThreadAsyncExam1 threadAsyncExam1;
    @RequestMapping("/hyd")
    public String hello() {

        threadAsyncExam1.doSomethingAsync();

        ThreadExam1 threadExam1 = new ThreadExam1();
        threadExam1.run();

        return "Hello ydhwang's World!";
    }

    @GetMapping("/monotest")

    public Mono<String> home() {
        return Mono.just("Hello, WebFlux!");
    }

}
