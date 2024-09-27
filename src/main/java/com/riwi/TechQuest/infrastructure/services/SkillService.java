package com.riwi.TechQuest.infrastructure.services;

import com.riwi.TechQuest.domain.persistence.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {

    @Autowired
    private SkillRepository skillRepository;
}
