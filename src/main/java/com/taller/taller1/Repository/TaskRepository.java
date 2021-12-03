package com.taller.taller1.Repository;

import com.taller.taller1.Entity.ProjectTask;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<ProjectTask, Long> {

    List<ProjectTask> findByProjectId(String projectId);

    List<ProjectTask> findByProjectIdAndStatus(String projectId, String status);

}
