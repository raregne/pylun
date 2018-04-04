package com.pylun.sample;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Slf4j
public class SampleController
{
    static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/")
    public String home()
    {
        return "Hello World!/t" + new Date();
    }

}
