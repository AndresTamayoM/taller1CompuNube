package com.taller.taller1.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.NonNull;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@Table(name = "Project")
@Entity
public class Project {
    @Id
    Long id;
    @NonNull
    String projectName;
    @NonNull
    String projectIdentifier;
    @NonNull
    String description;
    Date startDate;
    Date endDate;
    @OneToMany(targetEntity = Backlog.class)
    @JoinColumn(name="id")
    Set<Long> backlog = new HashSet();
    Boolean active;
}
