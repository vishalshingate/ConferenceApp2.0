package com.MyProject.com.MyProject.model;

import com.MyProject.model.Speaker;
import com.MyProject.repository.SpeakerRepository;


import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository ;

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

}
