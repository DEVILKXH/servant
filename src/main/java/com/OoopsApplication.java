package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@MapperScan(basePackages = {"com.ooops.servant.mapper"})
public class OoopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OoopsApplication.class, args);
	}

}
