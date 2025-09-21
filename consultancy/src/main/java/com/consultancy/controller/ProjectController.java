package com.consultancy.controller;

import com.consultancy.entity.Project;
import com.consultancy.service.ProjectService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "http://localhost:5173")
public class ProjectController {
    private final ProjectService service;

    public ProjectController(ProjectService service) { this.service = service; }

    @GetMapping
    public List<Project> getAll() { return service.findAll(); }

    @GetMapping("{id}")
    public ResponseEntity<Project> getById(@PathVariable Long id) {
        Project p = service.findById(id);
        if (p == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(p);
    }

    @PostMapping
    public Project create(@RequestBody Project project) {
        return service.save(project);
    }

    @PutMapping("{id}")
    public ResponseEntity<Project> update(@PathVariable Long id, @RequestBody Project project) {
        Project existing = service.findById(id);
        if (existing == null) return ResponseEntity.notFound().build();
        project.setId(id);
        return ResponseEntity.ok(service.save(project));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
