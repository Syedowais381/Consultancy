package com.consultancy.service;

import com.consultancy.entity.ServiceEntity;
import com.consultancy.repository.ServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {
    private final ServiceRepository repo;

    public ServiceService(ServiceRepository repo) {
        this.repo = repo;
    }

    public List<ServiceEntity> findAll() {
        return repo.findAll();
    }

    public ServiceEntity save(ServiceEntity service) {
        return repo.save(service);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public ServiceEntity findById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
