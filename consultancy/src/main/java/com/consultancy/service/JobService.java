package com.consultancy.service;

import com.consultancy.entity.Job;
import com.consultancy.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    private final JobRepository repo;

    public JobService(JobRepository repo) {
        this.repo = repo;
    }

    public List<Job> findAll() {
        return repo.findAll();
    }

    public Job save(Job job) {
        return repo.save(job);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Job findById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
