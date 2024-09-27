package com.riwi.TechQuest.domain.model;

import com.riwi.TechQuest.domain.modelIntermediate.MissionsUsers;
import com.riwi.TechQuest.domain.modelIntermediate.SkillsUsers;
import com.riwi.TechQuest.utils.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String password;

    private Role role;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<MissionsUsers> missions = new HashSet<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<SkillsUsers> skills = new HashSet<>();
}
