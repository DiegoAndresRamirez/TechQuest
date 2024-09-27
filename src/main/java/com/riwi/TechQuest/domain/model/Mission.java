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


    @ManyToMany
    @JoinTable(
            name = "Users_Missions",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "mission_id")
    )
    private Set<User> users = new HashSet<>();

    @ManyToMany(mappedBy = "missions")
    private Set<Skill> skills = new HashSet<>();
}
