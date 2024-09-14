package com.MyProject.repository;

import com.MyProject.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
