package com.riwi.TechQuest.domain.model;

import com.riwi.TechQuest.utils.enums.Difficulty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private Difficulty difficulty;

    @OneToMany(mappedBy = "mission")
    private Set<MissionsSkills> skills;

    @OneToMany(mappedBy = "mission")
    private Set<MissionsUsers> users = new HashSet<>();
}
