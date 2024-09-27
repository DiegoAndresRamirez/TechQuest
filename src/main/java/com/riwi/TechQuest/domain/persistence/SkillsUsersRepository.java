package com.riwi.TechQuest.domain.persistence;

import com.riwi.TechQuest.domain.model.SkillsUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsUsersRepository extends JpaRepository<SkillsUsers, Integer> {
}
