package com.example.Project.repositories;

import com.example.Project.project_model.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
