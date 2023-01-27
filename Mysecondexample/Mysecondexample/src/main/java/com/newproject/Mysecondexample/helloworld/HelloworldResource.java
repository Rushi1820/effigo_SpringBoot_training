package com.newproject.Mysecondexample.helloworld;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloworldResource {

	@RequestMapping("/hello-world")
	public String helloWorld() {
		return "hello World";
	}

	@RequestMapping("/hello-world-bean")
	public helloWorldBean HelloWorldBean() {
		return new helloWorldBean("hello rushi");
	}

	@RequestMapping("/hello-world-path-param/{name}")
	public helloWorldBean Helloworldpathparam(@PathVariable String name) {
		return new helloWorldBean("hello welcome, " + name);
	}

	@RequestMapping("/hello-world-path-param/{name}/message/{message}")
	public helloWorldBean HelloworldMultiplepathparam(@PathVariable String name, @PathVariable String message) {
		return new helloWorldBean("hello welcome, " + name + " ," + message);
	}
}
