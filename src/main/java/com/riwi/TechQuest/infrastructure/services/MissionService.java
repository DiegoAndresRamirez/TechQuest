package com.riwi.TechQuest.infrastructure.services;

import com.riwi.TechQuest.domain.persistence.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MissionService {

    @Autowired
    private MissionRepository missionRepository;


}
