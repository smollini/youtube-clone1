package com.programming.techie.youtubeclone.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import java.util.List;
import java.util.Set;


@Document(value= "Video")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Video {
    @Id
    private String id;
    private String title;
    private String description;
    private String userId;
    private Integer likes;
    private Integer disLikes;
    private Set<String> tags;
    private  VideoStatus videoStatus;
    private Integer viewCount;
    private String thumbnailUrl;
    private List<Comment> commentList;
    private String videoUrl;
}
