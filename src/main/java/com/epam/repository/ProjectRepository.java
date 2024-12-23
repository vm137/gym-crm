package com.epam.repository;

import com.epam.model.manytomany.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    Project getProjectById(int id);
}
