package com.MyProject.com.MyProject.model;

import com.MyProject.model.Speaker;
import com.MyProject.repository.SpeakerRepository;
import com.MyProject.repository.StubSpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new StubSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

}
