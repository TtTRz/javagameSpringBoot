package com.rom.javagame;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
public class JavagameApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavagameApplication.class, args);
	}
}
