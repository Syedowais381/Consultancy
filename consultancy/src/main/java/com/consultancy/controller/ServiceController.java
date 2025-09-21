package com.consultancy.controller;

import com.consultancy.entity.ServiceEntity;
import com.consultancy.service.ServiceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/services")
@CrossOrigin(origins = "http://localhost:5173")
public class ServiceController {
    private final ServiceService service;

    public ServiceController(ServiceService service) { this.service = service; }

    @GetMapping
    public List<ServiceEntity> all() { return service.findAll(); }

    @PostMapping
    public ServiceEntity create(@RequestBody ServiceEntity s) { return service.save(s); }

    @PutMapping("{id}")
    public ResponseEntity<ServiceEntity> update(@PathVariable Long id, @RequestBody ServiceEntity s) {
        ServiceEntity ex = service.findById(id);
        if (ex == null) return ResponseEntity.notFound().build();
        s.setId(id);
        return ResponseEntity.ok(service.save(s));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
