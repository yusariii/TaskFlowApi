package com.khai.TaskFlowApi.dto.auth.response;

import com.khai.TaskFlowApi.enums.UserRole;
import com.khai.TaskFlowApi.enums.UserStatus;

public class CurrentUserResponse {
    private Long id;

    private String email;

    private String fullName;

    private UserRole role;

    private UserStatus status;

    public CurrentUserResponse() {
    }

    public CurrentUserResponse(Long id, String email, String fullName, UserRole role, UserStatus status) {
        this.id = id;
        this.email = email;
        this.fullName = fullName;
        this.role = role;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }
}
