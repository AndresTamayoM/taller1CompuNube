package com.taller.taller1.Service;

import com.taller.taller1.Entity.Backlog;
import com.taller.taller1.Entity.Project;
import com.taller.taller1.Entity.ProjectTask;
import com.taller.taller1.Repository.BacklogRepository;
import com.taller.taller1.Repository.ProjectRepository;
import com.taller.taller1.Repository.TaskRepository;
import javafx.concurrent.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BacklogServiceImpl implements BacklogService {

    BacklogRepository backlogRepository;
    ProjectRepository projectRepository;
    TaskRepository taskRepository;

    public Backlog saveBacklog(Backlog backlog) {
        return backlogRepository.save(backlog);
    }

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    public ProjectTask saveTask(ProjectTask projectTask) {
        return taskRepository.save(projectTask);
    }

    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    public List<ProjectTask> getProjectTasks(String projectId) {
        return taskRepository.findByProjectId(projectId);
    }

    public Double getProjectHours(String projectId) {
        List<ProjectTask> lista = taskRepository.findByProjectId(projectId);
                lista.stream().reduce((projectTask, projectTask2) -> {
                    projectTask.hours = projectTask.hours + projectTask2.hours;
                    return projectTask;
                });
                return lista.get(0).hours;
    }

    public Double getProjectHoursByStatus(String projectId, String status) {
        List<ProjectTask> lista = taskRepository.findByProjectIdAndStatus(projectId, status);
        lista.stream().reduce((projectTask, projectTask2) -> {
            projectTask.hours = projectTask.hours + projectTask2.hours;
            return projectTask;
        });
        return lista.get(0).hours;
    }

    public Project logicalDeleteProject(String projectId) {
        return projectRepository.logicalDeleteProject(projectId);
    }
}
