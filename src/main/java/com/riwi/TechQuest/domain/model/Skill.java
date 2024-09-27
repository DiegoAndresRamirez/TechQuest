package com.riwi.TechQuest.domain.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "skill")
    private Set<SkillsUsers> users = new HashSet<>();

    @OneToMany(mappedBy = "skill")
    private Set<MissionsSkills> missions = new HashSet<>();

}
