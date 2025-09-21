package com.consultancy.service;

import com.consultancy.entity.Project;
import com.consultancy.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository repo;

    public ProjectService(ProjectRepository repo) { this.repo = repo; }

    public List<Project> findAll() { return repo.findAll(); }
    public Project save(Project p) { return repo.save(p); }
    public void delete(Long id) { repo.deleteById(id); }
    public Project findById(Long id) { return repo.findById(id).orElse(null); }
}
