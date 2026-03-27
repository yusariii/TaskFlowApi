package com.khai.TaskFlowApi.dto.task.request;

import jakarta.validation.constraints.NotNull;

public class AssignTaskRequest {
    @NotNull(message = "Assignee user ID is required")
    private Long assigneeUserId;

    public Long getAssigneeUserId() {
        return assigneeUserId;
    }  

    public void setAssigneeUserId(Long assigneeUserId) {
        this.assigneeUserId = assigneeUserId;
    }
}
