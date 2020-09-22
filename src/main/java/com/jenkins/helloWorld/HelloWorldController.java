package com.jenkins.helloWorld;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloWorldController {
@RequestMapping("/")
@ResponseBody
public String sayHello() {
return "Hello Developer!!!";
}
@RequestMapping("/")
@ResponseBody
public String sayWelcome() {
return "Welcome Developer!!! Jenkins is running on tomcate";
}
}
