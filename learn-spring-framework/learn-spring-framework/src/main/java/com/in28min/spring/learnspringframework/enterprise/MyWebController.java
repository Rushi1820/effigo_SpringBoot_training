package com.in28min.spring.learnspringframework.enterprise;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
	@Autowired
	private BusinessService businessservice;

	public long returnValueFromBusinessService() {
		return businessservice.calsum();
	}
}

@Component
class BusinessService {
	@Autowired
	private Dataservice dataservice;

	public long calsum() {
		List<Integer> data = dataservice.getData();
		return data.stream().reduce(Integer::sum).get();
	}
}

@Component
class Dataservice {
	public List<Integer> getData() {
		return Arrays.asList(100, 200, 300, 400);
	}
}