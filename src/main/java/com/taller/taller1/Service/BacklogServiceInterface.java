package com.taller.taller1.Service;

import com.taller.taller1.Entity.Backlog;
import com.taller.taller1.Entity.Project;
import com.taller.taller1.Entity.ProjectTask;

public interface BacklogServiceInterface {

    Backlog guardarBacklo(Backlog backlog);
    Project guardarProyect(Project project);
    ProjectTask guardarProyectTask(ProjectTask projectTask);


}
