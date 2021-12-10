package com.taller.taller1.Repository;

import com.taller.taller1.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    //Project logicalDeleteProject(String projectId);

}
