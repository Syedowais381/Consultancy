package com.consultancy;

import com.consultancy.entity.*;
import com.consultancy.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupDataLoader implements CommandLineRunner {

    private final ProjectRepository projectRepo;
    private final ServiceRepository serviceRepo;
    private final JobRepository jobRepo;
    private final NewsRepository newsRepo;

    public StartupDataLoader(ProjectRepository projectRepo, ServiceRepository serviceRepo,
                             JobRepository jobRepo, NewsRepository newsRepo) {
        this.projectRepo = projectRepo;
        this.serviceRepo = serviceRepo;
        this.jobRepo = jobRepo;
        this.newsRepo = newsRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        if (serviceRepo.count() == 0) {
            ServiceEntity s1 = new ServiceEntity();
            s1.setName("Project & Programme Management");
            s1.setDescription("End-to-end project delivery, site supervision and QA/QC.");
            serviceRepo.save(s1);

            ServiceEntity s2 = new ServiceEntity();
            s2.setName("Design & Engineering");
            s2.setDescription("Feasibility studies, design appraisal, CAD production.");
            serviceRepo.save(s2);
        }

        if (projectRepo.count() == 0) {
            Project p = new Project();
            p.setTitle("Offshore Pipeline Upgrade");
            p.setClientName("ABC Energy");
            p.setDescription("Comprehensive pipeline upgrade project including routeing and FEA.");
            p.setCompletionDate("2024-11-15");
            projectRepo.save(p);
        }

        if (jobRepo.count() == 0) {
            Job j = new Job();
            j.setTitle("Junior Design Engineer");
            j.setDescription("Assist senior engineers in pipeline routeing and CAD work.");
            j.setLocation("UK - Remote");
            j.setType("Full-time");
            j.setPostedDate("2025-09-01");
            jobRepo.save(j);
        }

        if (newsRepo.count() == 0) {
            News n = new News();
            n.setTitle("Company Launches New Consultancy Arm");
            n.setContent("We are excited to announce the launch of our consultancy services...");
            n.setPublishedDate("2025-09-20");
            newsRepo.save(n);
        }
    }
}
