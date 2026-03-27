package com.khai.TaskFlowApi.dto.task.request;

import com.khai.TaskFlowApi.enums.TaskStatus;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;

public class UpdateTaskStatusRequest {
    @Enumerated(EnumType.STRING)
    @NotBlank(message = "Status is required")
    private TaskStatus status;

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
