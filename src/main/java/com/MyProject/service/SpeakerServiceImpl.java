package com.MyProject.service;

import com.MyProject.model.Speaker;
import com.MyProject.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("speakerService") // this name in the bracket is purely a personal preference you don't have to do this
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
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
