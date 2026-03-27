package com.khai.TaskFlowApi.dto.project.response;

import com.khai.TaskFlowApi.enums.ProejctStatus;

public class ProjectSummaryRequest {
    private Long id;
    private String code;
    private String name;
    private ProejctStatus status;

    public ProjectSummaryRequest() {
    }

    public ProjectSummaryRequest(Long id, String code, String name, ProejctStatus status) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProejctStatus getStatus() {
        return status;
    }

    public void setStatus(ProejctStatus status) {
        this.status = status;
    }
}
