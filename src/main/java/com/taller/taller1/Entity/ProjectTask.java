package com.taller.taller1.Entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@Table(name = "ProjectTask")
@Entity
public class ProjectTask {
    @NonNull
    @Id
    public Long id;
    @NonNull
    public String name;
    @NonNull
    public String summary;
    public String acceptanceCriteria;
    @Value("${values: Not Started, in progress, completed, deleted}")
    public String status;
    @Value("${values:1,2,3,4,5}")
    public Integer priority;
    @Value("${values:1,2,3,4,5,6,7,8}")
    public Double hours;
    public Date startDate;
    public Date endDate;
    public String projectIdentifier;
    @ManyToOne(targetEntity = Backlog.class)
    public Backlog backlog;

}
