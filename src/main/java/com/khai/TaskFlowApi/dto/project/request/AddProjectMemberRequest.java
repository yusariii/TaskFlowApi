package com.khai.TaskFlowApi.dto.project.request;

import jakarta.validation.constraints.NotNull;

public class AddProjectMemberRequest {
    @NotNull
    private Long userId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
