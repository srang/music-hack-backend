package com.github.srang.music.hack.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@SpringBootApplication
@EnableAutoConfiguration
public class BackendApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
