package com.khai.TaskFlowApi.dto.common.request;

public class PagedRequest {
    private Integer page;
    private Integer size;
    private String sortBy;
    private String sortDir;

    public Integer getPage() {
        return page != null ? page : 0;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size != null ? size : 10;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getSortBy() {
        return sortBy != null ? sortBy : "id";
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getSortDir() {
        return sortDir != null ? sortDir : "asc";
    }

    public void setSortDir(String sortDir) {
        this.sortDir = sortDir;
    }
}
