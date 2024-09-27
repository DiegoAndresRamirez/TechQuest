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

    @ManyToMany
    @JoinTable(
            name = "Skills_Missions",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private Set<User> users = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "Skills_Missions",
            joinColumns = @JoinColumn(name = "mission_id"),
            inverseJoinColumns = @JoinColumn(name = "skill_id")
    )
    private Set<Mission> missions = new HashSet<>();
}
