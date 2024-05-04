package com.manager.identityservice.exception;

public enum SuccessCode {
    DELETED_SUCCESS(1000, "User has been deleted");
    private int code;
    private String message;

    SuccessCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
