package com.consultancy.service;

import com.consultancy.entity.ContactMessage;
import com.consultancy.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    private final ContactRepository repo;

    public ContactService(ContactRepository repo) { this.repo = repo; }

    public ContactMessage save(ContactMessage message) { return repo.save(message); }
    public List<ContactMessage> findAll() { return repo.findAll(); }
}
