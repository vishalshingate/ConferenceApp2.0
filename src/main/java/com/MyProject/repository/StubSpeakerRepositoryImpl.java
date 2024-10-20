package com.MyProject.repository;

import com.MyProject.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository") //this name in the bracket is purely a personal preference you don't have to do this
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
