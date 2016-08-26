package com.credera.vinnylapenna;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @GetMapping("/")
  public String helloWorld() {
    String s = "Hello World!";
    return s;
  }
}
