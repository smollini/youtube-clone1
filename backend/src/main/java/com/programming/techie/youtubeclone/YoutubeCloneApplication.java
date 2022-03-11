package com.programming.techie.youtubeclone;

import com.programming.techie.youtubeclone.service.VideoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


@SpringBootApplication

public class YoutubeCloneApplication {



	public static void main(String[] args) {
		SpringApplication.run(YoutubeCloneApplication.class, args);
	}


}

