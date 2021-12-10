package com.taller.taller1.Service;

import com.taller.taller1.Entity.Backlog;
import com.taller.taller1.Entity.Project;
import com.taller.taller1.Entity.ProjectTask;
import com.taller.taller1.Repository.BacklogRepository;
import com.taller.taller1.Repository.ProjectRepository;
import com.taller.taller1.Repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BacklogServiceImpl implements BacklogService {

    @Autowired
    BacklogRepository backlogRepository;
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    TaskRepository taskRepository;

    @Override
    public Backlog saveBacklog(Backlog backlog) {
        return backlogRepository.save(backlog);
    }
    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public ProjectTask saveTask(ProjectTask projectTask) {
        return taskRepository.save(projectTask);
    }

    @Override
    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    @Override
    public List<ProjectTask> getProjectTasks(Long projectId) {
        return taskRepository.findByprojectIdentifier(projectId);
    }
    @Override
    public Double getProjectHours(Long projectId) {
        List<ProjectTask> lista = taskRepository.findByprojectIdentifier(projectId);
                lista.stream().reduce((projectTask, projectTask2) -> {
                    projectTask.hours = projectTask.hours + projectTask2.hours;
                    return projectTask;
                });
                return lista.get(0).hours;
    }

    @Override
    public Double getProjectHoursByStatus(Long projectId, String status) {
        List<ProjectTask> lista = taskRepository.findByprojectIdentifierAndStatus(projectId, status);
        lista.stream().reduce((projectTask, projectTask2) -> {
            projectTask.hours = projectTask.hours + projectTask2.hours;
            return projectTask;
        });
        return lista.get(0).hours;
    }

}
