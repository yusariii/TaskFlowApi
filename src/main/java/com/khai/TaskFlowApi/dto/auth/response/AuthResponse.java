package com.khai.TaskFlowApi.dto.auth.response;

public class AuthResponse {
    private String accessToken;

    private String tokenType = "Bearer";

    private Long expiresId;

    private CurrentUserResponse currentUser;

    public AuthResponse() {
    }

    public AuthResponse(String accessToken, Long expiresId, CurrentUserResponse currentUser) {
        this.accessToken = accessToken;
        this.expiresId = expiresId;
        this.currentUser = currentUser;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Long getExpiresId() {
        return expiresId;
    }

    public void setExpiresId(Long expiresId) {
        this.expiresId = expiresId;
    }

    public CurrentUserResponse getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(CurrentUserResponse currentUser) {
        this.currentUser = currentUser;
    }
}
