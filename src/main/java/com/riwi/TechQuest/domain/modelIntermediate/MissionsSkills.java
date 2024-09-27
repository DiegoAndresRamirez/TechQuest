package com.riwi.TechQuest.domain.modelIntermediate;

import com.riwi.TechQuest.domain.model.Mission;
import com.riwi.TechQuest.domain.model.Skill;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MissionsSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "missions_id")
    private Mission mission;

    @ManyToOne
    @JoinColumn(name = "skills_id")
    private Skill skill;
}
