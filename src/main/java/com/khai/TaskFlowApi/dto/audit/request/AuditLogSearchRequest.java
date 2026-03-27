package com.khai.TaskFlowApi.dto.audit.request;

import java.time.LocalDate;

import com.khai.TaskFlowApi.enums.AuditActionType;
import com.khai.TaskFlowApi.enums.AuditEntityType;

public class AuditLogSearchRequest {
    private AuditActionType actionType;
    private AuditEntityType entityType;
    private Long performedByUserId;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Integer page;
    private Integer size;
    private String sortBy;
    private String sortDir;

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

    public Long getPerformedByUserId() {
        return performedByUserId;
    }

    public void setPerformedByUserId(Long performedByUserId) {
        this.performedByUserId = performedByUserId;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public Integer getPage() {
        return page != null ? page : 0;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size != null ? size : 10;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getSortBy() {
        return sortBy != null ? sortBy : "timestamp";
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSortDir() {
        return sortDir != null ? sortDir : "desc";
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }
}
