package org.delcom.todos.dto;

// Kelas ini mendefinisikan struktur response JSON kita agar konsisten
public class ApiResponse {
    private String status;
    private String message;
    private Object data;

    public ApiResponse(String status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    // Getters
    public String getStatus() { return status; }
    public String getMessage() { return message; }
    public Object getData() { return data; }
}