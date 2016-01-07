package com.albertocolella.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.albertocolella.demo.model.Demo;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class DemoController {

	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/demo")
    public List<Demo> demoing(@RequestParam(value="name", defaultValue="World") String name) {
        List<Demo> demoList = new ArrayList<Demo>();
        demoList.add(new Demo(counter.incrementAndGet(), "TEST1"));
        demoList.add(new Demo(counter.incrementAndGet(), "TEST2"));
        demoList.add(new Demo(counter.incrementAndGet(), "TEST3"));
		return demoList;
    }

}
