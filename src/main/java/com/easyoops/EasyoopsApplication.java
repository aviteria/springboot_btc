package com.easyoops;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@Slf4j
@SpringBootApplication
public class EasyoopsApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EasyoopsApplication.class, args);
	}

	@Override protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(EasyoopsApplication.class);
	}

	void function1 () {
		// 브렌치 테스트를 위하여 코스 수정
	}

	void function2 () {

	}
}
