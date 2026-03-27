package com.khai.TaskFlowApi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.khai.TaskFlowApi.document.AuditLogDocument;

@Repository
public interface AuditLogRepository extends MongoRepository<AuditLogDocument, String> {
    Page<AuditLogDocument> findByActionType(String actionType, Pageable pageable);

    Page<AuditLogDocument> findByEntityType(String entityType, Pageable pageable);

    Page<AuditLogDocument> findByPerformedByUserId(Long performedByUserId, Pageable pageable);
}
