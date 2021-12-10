package com.taller.taller1.Service;

import com.taller.taller1.Entity.Backlog;
import com.taller.taller1.Entity.Project;
import com.taller.taller1.Entity.ProjectTask;

import java.util.List;

public interface BacklogService {

    Backlog saveBacklog(Backlog backlog);

    Project saveProject(Project project);

    ProjectTask saveTask(ProjectTask projectTask);

    List<Project> getProjects();

    List<ProjectTask> getProjectTasks(Long projectId);

    Double getProjectHours(Long projectId);

    Double getProjectHoursByStatus(Long projectId, String status);

}
