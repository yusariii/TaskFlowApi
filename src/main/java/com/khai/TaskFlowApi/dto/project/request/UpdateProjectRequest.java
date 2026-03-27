package com.khai.TaskFlowApi.dto.project.request;

import com.khai.TaskFlowApi.enums.ProejctStatus;

import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;

public class UpdateProjectRequest {

    @Size(min = 3, max = 100, message = "Project name must be between 3 and 100 characters")
    @Pattern(regexp = "^(?!\\s*$).+", message = "Project name must not be blank")  
    private String name;

    @Size(max = 500, message = "Description must be at most 500 characters")
    private String description;

    private ProejctStatus status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProejctStatus getStatus() {
        return status;
    }

    public void setStatus(ProejctStatus status) {
        this.status = status;
    }
}
