package com.albertocolella.demo.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.albertocolella.demo.model.Demo;

@RestController
// @RequestMapping("/api/v1")
public class DemoController {

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/greeting")
    public Demo demoing(@RequestParam(value="name", defaultValue="World") String name) {
        return new Demo(counter.incrementAndGet(),
                            "TEST");
    }
}
