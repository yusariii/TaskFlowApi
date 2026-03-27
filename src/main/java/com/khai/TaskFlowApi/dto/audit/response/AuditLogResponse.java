package com.khai.TaskFlowApi.dto.audit.response;

import java.time.LocalDateTime;
import java.util.Map;

import com.khai.TaskFlowApi.enums.AuditActionType;
import com.khai.TaskFlowApi.enums.AuditEntityType;

public class AuditLogResponse {
    private String id;
    private AuditActionType actionType;
    private AuditEntityType entityType;
    private String entityId;
    private String entityName;
    private Long performedByUserId;
    private String performedByEmail;
    private String description;
    private String requestPath;
    private String requestMethod;
    private LocalDateTime timestamp;
    private Map<String, Object> metaData;

    public AuditLogResponse() {
    }

    public AuditLogResponse(String id, AuditActionType actionType, AuditEntityType entityType, String entityId,
            String entityName, Long performedByUserId, String performedByEmail, String description, String requestPath,
            String requestMethod, LocalDateTime timestamp, Map<String, Object> metaData) {
        this.id = id;
        this.actionType = actionType;
        this.entityType = entityType;
        this.entityId = entityId;
        this.entityName = entityName;
        this.performedByUserId = performedByUserId;
        this.performedByEmail = performedByEmail;
        this.description = description;
        this.requestPath = requestPath;
        this.requestMethod = requestMethod;
        this.timestamp = timestamp;
        this.metaData = metaData;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AuditActionType getActionType() {
        return actionType;
    }

    public void setActionType(AuditActionType actionType) {
        this.actionType = actionType;
    }

    public AuditEntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(AuditEntityType entityType) {
        this.entityType = entityType;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Long getPerformedByUserId() {
        return performedByUserId;
    }

    public void setPerformedByUserId(Long performedByUserId) {
        this.performedByUserId = performedByUserId;
    }

    public String getPerformedByEmail() {
        return performedByEmail;
    }

    public void setPerformedByEmail(String performedByEmail) {
        this.performedByEmail = performedByEmail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequestPath() {
        return requestPath;
    }

    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Map<String, Object> getMetaData() {
        return metaData;
    }

    public void setMetaData(Map<String, Object> metaData) {
        this.metaData = metaData;
    }
}
