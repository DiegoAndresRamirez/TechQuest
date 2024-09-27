package com.riwi.TechQuest.domain.persistence;

import com.riwi.TechQuest.domain.modelIntermediate.MissionsUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MIssionsUsersRepository extends JpaRepository<MissionsUsers, Integer> {
}
