package com.taller.taller1.Entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "Backlog")
public class Backlog {
    @Id
    Long id;
    @NonNull
    String projectIdentifier;
    @OneToOne
    Project project;
    @OneToMany(targetEntity = ProjectTask.class)
    List projectTask;
}
