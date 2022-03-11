package com.programming.techie.youtubeclone.controller;


import com.programming.techie.youtubeclone.service.VideoService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RequestMapping("/api/video")
@RestController
@RequiredArgsConstructor
public class VideoController {
    private final VideoService videoService;
    @PostMapping
@ResponseStatus(HttpStatus.CREATED)
    public void uploadVideo(@RequestParam("file")MultipartFile file)
    {
    videoService.uploadVideo(file);
    }

}
