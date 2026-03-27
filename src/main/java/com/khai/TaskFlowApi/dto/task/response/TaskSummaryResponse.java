package com.khai.TaskFlowApi.dto.task.response;

import com.khai.TaskFlowApi.enums.TaskPriority;
import com.khai.TaskFlowApi.enums.TaskStatus;

public class TaskSummaryResponse {
    private Long id;
    private String title;
    private TaskStatus status;
    private TaskPriority priority;
    private Long assigneeUserId;

    public TaskSummaryResponse() {}

    public TaskSummaryResponse(Long id, String title, TaskStatus status, TaskPriority priority, Long assigneeUserId) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.priority = priority;
        this.assigneeUserId = assigneeUserId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public Long getAssigneeUserId() {
        return assigneeUserId;
    }

    public void setAssigneeUserId(Long assigneeUserId) {
        this.assigneeUserId = assigneeUserId;
    }

}
