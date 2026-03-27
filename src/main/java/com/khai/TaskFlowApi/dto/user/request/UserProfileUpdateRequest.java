package com.khai.TaskFlowApi.dto.user.request;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserProfileUpdateRequest {
    
    @Size(min = 2, max = 100)
    @Pattern(regexp = "^(?!\\s*$).+", message = "fullName must not be blank")
    private String fullName;

    @Size(max = 500)
    private String avatarUrl;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
}
