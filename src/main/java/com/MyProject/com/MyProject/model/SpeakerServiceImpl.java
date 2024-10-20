package com.MyProject.com.MyProject.model;

import com.MyProject.model.Speaker;
import com.MyProject.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository ;

    public SpeakerServiceImpl() {
        System.out.println(" We are in SpeakerServiceImpl no org constructor.");
    }
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println(" We are in SpeakerServiceImpl Repository constructor.");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println(" We are in SpeakerServiceImpl In a Setter");
        this.repository = repository;
    }

}
