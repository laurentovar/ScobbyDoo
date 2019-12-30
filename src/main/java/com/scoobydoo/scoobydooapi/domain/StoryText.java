package com.scoobydoo.scoobydooapi.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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


}
