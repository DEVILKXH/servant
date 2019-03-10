package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@MapperScan(basePackages = {"com.ooops.servant"})
public class OoopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OoopsApplication.class, args);
	}

}
