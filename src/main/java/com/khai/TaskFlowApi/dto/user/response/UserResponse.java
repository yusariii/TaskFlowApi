package com.khai.TaskFlowApi.dto.user.response;

import java.time.LocalDateTime;

import com.khai.TaskFlowApi.enums.UserRole;
import com.khai.TaskFlowApi.enums.UserStatus;

public class UserResponse {
    
    private Long id;

    private String email;

    private String fullName;

    private UserRole role;

    private UserStatus status;

    private String avatarUrl;

    private LocalDateTime createdAt;

    public UserResponse() {
    }

    public UserResponse(Long id, String email, String fullName, UserRole role, UserStatus status, String avatarUrl, LocalDateTime createdAt) {
        this.id = id;
        this.email = email;
        this.fullName = fullName;
        this.role = role;
        this.status = status;
        this.avatarUrl = avatarUrl;
        this.createdAt = createdAt;
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

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
