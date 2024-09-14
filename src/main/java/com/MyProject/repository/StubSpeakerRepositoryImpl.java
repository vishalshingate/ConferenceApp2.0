package com.MyProject.repository;

import com.MyProject.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class StubSpeakerRepositoryImpl implements SpeakerRepository {
    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Vishal");
        speaker.setLastName("Shingate");
        speakers.add(speaker);

        return speakers;
    }
}
