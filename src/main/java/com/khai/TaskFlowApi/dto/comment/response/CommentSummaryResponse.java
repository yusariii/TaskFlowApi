package com.khai.TaskFlowApi.dto.comment.response;

import java.time.LocalDateTime;

public class CommentSummaryResponse {
    private Long id;
    private String content;
    private Long authorId;
    private String authorName;
    private LocalDateTime createdAt;

    public CommentSummaryResponse() {
        
    }

    public CommentSummaryResponse(Long id, String content, Long authorId, String authorName, LocalDateTime createdAt) {
        this.id = id;
        this.content = content;
        this.authorId = authorId;
        this.authorName = authorName;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
