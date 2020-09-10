package com.yejin.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.yejin.demo.test.settingTest;

@SpringBootApplication
public class DemoApplication {

	
	public static void main(String[] args) {
		new SpringApplicationBuilder(settingTest.class)
			.build()
			.run(args);
	}

}
