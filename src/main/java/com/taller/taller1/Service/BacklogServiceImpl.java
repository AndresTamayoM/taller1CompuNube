package com.taller.taller1.Service;

import com.taller.taller1.Entity.Backlog;
import com.taller.taller1.Entity.Project;
import com.taller.taller1.Entity.ProjectTask;
import com.taller.taller1.Repository.BacklogInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BacklogServiceImpl implements BacklogServiceInterface {


    private BacklogInterface backlogInterface;

    @Override
    public Backlog guardarBacklo(Backlog backlog) {
        return null;
    }

    @Override
    public Project guardarProyect(Project project) {
        return null;
    }

    @Override
    public ProjectTask guardarProyectTask(ProjectTask projectTask) {
        return null;
    }
}
