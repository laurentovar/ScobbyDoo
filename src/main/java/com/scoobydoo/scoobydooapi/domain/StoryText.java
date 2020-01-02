package com.scoobydoo.scoobydooapi.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class StoryText {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;
    private Integer picUrl;
    private Integer option1;
    private Integer option2;
    private Integer option3;
    private Integer option4;
    private Integer nextStoryTextID;


}
