package com.programming.techie.youtubeclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableWebMvc
@ComponentScan
public class YoutubeCloneApplication {



	public static void main(String[] args) {
		SpringApplication.run(YoutubeCloneApplication.class, args);
	}

}

