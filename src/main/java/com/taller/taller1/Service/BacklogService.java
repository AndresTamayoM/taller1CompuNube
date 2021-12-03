package com.taller.taller1.Service;

import com.taller.taller1.Entity.Backlog;
import com.taller.taller1.Entity.Project;
import com.taller.taller1.Entity.ProjectTask;
import javafx.concurrent.Task;

import java.util.List;

public interface BacklogService {

    Backlog saveBacklog(Backlog backlog);

    Project saveProject(Project project);

    ProjectTask saveTask(ProjectTask projectTask);

    List<Project> getProjects();

    List<ProjectTask> getProjectTasks(String projectId);

    Double getProjectHours(String projectId);

    Double getProjectHoursByStatus(String projectId, String status);

    Project logicalDeleteProject(String projectId);

}
