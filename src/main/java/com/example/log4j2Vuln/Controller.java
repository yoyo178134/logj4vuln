package com.example.log4j2Vuln;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    private static final Logger LOGGER = LogManager.getLogger(Controller.class);

    @GetMapping("/")
    public String test(@RequestParam("input") String userInput){
        LOGGER.info("User input:" + userInput);
        return "Your input:"+userInput;
    }

}