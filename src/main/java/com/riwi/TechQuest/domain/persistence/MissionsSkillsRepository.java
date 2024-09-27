package com.riwi.TechQuest.domain.persistence;

import com.riwi.TechQuest.domain.modelIntermediate.MissionsSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionsSkillsRepository extends JpaRepository<MissionsSkills, Integer> {
}
