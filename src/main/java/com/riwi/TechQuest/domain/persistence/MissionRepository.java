package com.riwi.TechQuest.domain.persistence;

import com.riwi.TechQuest.domain.model.Mission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long> {

}
