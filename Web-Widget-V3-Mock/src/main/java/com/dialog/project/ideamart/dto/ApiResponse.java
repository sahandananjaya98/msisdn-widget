package com.dialog.project.ideamart.dto;

public class ApiResponse {
    private String URL;

    public ApiResponse(String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
