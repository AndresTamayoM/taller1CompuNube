package com.taller.taller1.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NonNull;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "Backlog")
@Entity
public class Backlog {
    @Id
    Integer id;
    @NonNull
    Integer projectIdentifier;
    @OneToOne
    Project project;
    @OneToMany(targetEntity = ProjectTask.class)
    @JoinColumn(name="backlog")
    Set<ProjectTask> projectTask = new HashSet<>();
}
