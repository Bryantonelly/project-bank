package com.nttdata.escuela.java.projectbank.service;

import com.nttdata.escuela.java.projectbank.entity.Headline;

import java.util.List;

public interface HeadlineService {
    List<Headline> getAllHeadlines();
    Headline getHeadlineById(Long id);
    Headline createHeadline(Headline headline);
    Headline updateHeadline(Long id, Headline headline);
    void deleteHeadline(Long id);
}
