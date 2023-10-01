package com.nttdata.escuela.java.projectbank.service.impl;

import com.nttdata.escuela.java.projectbank.entity.Headline;
import com.nttdata.escuela.java.projectbank.repository.HeadlineRepository;
import com.nttdata.escuela.java.projectbank.service.HeadlineService;
import com.nttdata.escuela.java.projectbank.util.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeadlineServiceImpl implements HeadlineService {

    @Autowired
    private HeadlineRepository headlineRepository;
    @Override
    public List<Headline> getAllHeadlines() {
        return headlineRepository.findAll();
    }

    @Override
    public Headline getHeadlineById(Long id) {
        return headlineRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Titular no encontrado con id: " + id));
    }

    @Override
    public Headline createHeadline(Headline headline) {
        return headlineRepository.save(headline);
    }

    @Override
    public Headline updateHeadline(Long id, Headline headline) {
        Headline headlineExists = headlineRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Titular no encontrado con id: " + id));
        headlineExists.setNameHeadline(headline.getNameHeadline());
        headlineExists.setNumberDocument(headline.getNumberDocument());
        headlineExists.setTypeDocumentHeadline(headline.getTypeDocumentHeadline());
        return headlineRepository.save(headlineExists);
    }

    @Override
    public void deleteHeadline(Long id) {
        headlineRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Titular no encontrado con id: " + id));
        headlineRepository.deleteById(id);
    }
}
