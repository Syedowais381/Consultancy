package com.consultancy.service;

import com.consultancy.entity.News;
import com.consultancy.repository.NewsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {
    private final NewsRepository repo;

    public NewsService(NewsRepository repo) {
        this.repo = repo;
    }

    public List<News> findAll() {
        return repo.findAll();
    }

    public News save(News news) {
        return repo.save(news);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public News findById(Long id) {
        return repo.findById(id).orElse(null);
    }
}
