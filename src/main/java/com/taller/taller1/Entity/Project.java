package com.taller.taller1.Entity;

import lombok.*;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
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
    Backlog backlog;
}
