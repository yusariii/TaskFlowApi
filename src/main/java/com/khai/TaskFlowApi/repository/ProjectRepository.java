package com.khai.TaskFlowApi.repository;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khai.TaskFlowApi.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
    Optional<Project> findByCode(String code);

    boolean existsByCode(String code);

    Page<Project> findByOwnerId(Long ownerId, Pageable pageable);

    Page<Project> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
