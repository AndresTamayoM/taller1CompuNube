package com.taller.taller1.Entity;

import jdk.jfr.MemoryAddress;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@Builder(toBuilder = true)
public class ProjectTask {
    @NonNull
    Long id;
    @NonNull
    String name;
    @NonNull
    String summary;
    String acceptanceCriteria;
    @Value("${values: Not Started, in progress, completed, deleted}")
    String status;
    @Value("${values:1,2,3,4,5}")
    Integer priority;
    @Value("${values:1,2,3,4,5,6,7,8}")
    Double hours;
    Date startDate;
    Date endDate;
    String projectIdentifier;
    @ManyToOne(targetEntity = Backlog.class)
    Backlog backlog;

}
