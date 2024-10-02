package com.riwi.TechQuest.application.dto.request;


import com.riwi.TechQuest.domain.model.Skill;
import com.riwi.TechQuest.utils.enums.Difficulty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MissionCreateRequestDTO {
    private String name;
    private String description;
    private Difficulty difficulty;
    private Set<Skill> skills;
}
