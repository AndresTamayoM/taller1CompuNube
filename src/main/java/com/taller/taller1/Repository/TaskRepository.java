package com.taller.taller1.Repository;

import com.taller.taller1.Entity.ProjectTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<ProjectTask, Long> {

    List<ProjectTask> findByprojectIdentifier(Long projectId);

    List<ProjectTask> findByprojectIdentifierAndStatus(Long projectId, String status);

}
