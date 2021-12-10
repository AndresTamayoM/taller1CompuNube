package com.taller.taller1.Controller;

import com.taller.taller1.Entity.Backlog;
import com.taller.taller1.Service.BacklogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("backlogAPI")
public class Controller {

    @Autowired
    BacklogService backlogService;

    @PostMapping("/backlog")
    public Backlog save(@RequestBody Backlog backlog){
        return backlogService.saveBacklog(backlog);
    }

    @PostMapping("/project")
    public ResponseEntity aggregateProject(){
        return ResponseEntity.created(URI.create("/createProject")).body("");
    }

    @PostMapping("/task")
    public ResponseEntity aggregateTask(){
        return ResponseEntity.created(URI.create("/aggregateTask")).body("");
    }

    @GetMapping("/project")
    public ResponseEntity obtainProject(){
        return null;
    }

    @GetMapping("/task/project/{projectIdentifier}")
    public ResponseEntity obtainProjectTasks(@PathVariable String projectIdentifier){
        return ResponseEntity.ok().build();
    }

    @GetMapping("/task/hours/project/{projectIdentifier}")
    public ResponseEntity obtainProjectTotalHours(@PathVariable String projectIdentifier){
        return null;
    }

    @GetMapping("/task/hours/project/{projectIdentifier}/{status}")
    public ResponseEntity obtainProjectStatus(@PathVariable String projectIdentifier, @PathVariable String status){
        return null;
    }

    @DeleteMapping("/task/{idTask}/{projectIdentifier}")
    public ResponseEntity logicDelete(@PathVariable String projectIdentifier){
        return null;
    }
}
