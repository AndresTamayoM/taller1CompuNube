package com.taller.taller1.Repository;

import com.taller.taller1.Entity.Project;
import com.taller.taller1.Entity.ProjectTask;
import javafx.concurrent.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    Project logicalDeleteProject(String projectId);

}
