package com.manager.identityservice.exception;

public enum ErrorCode {
    INVALID_KEY(1004, "Invalid message key"),
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    USER_EXISTED(1002, "User existed."),
    USERNAME_INVALID(1003, "Username must be at least 3 character."),
    USERNAME_NOTFOUND(1003, "User not found."),
    PASSWORD_INVALID(1004, "Password must be at least 8 character");
    private int code;
    private String message;

    ErrorCode(int code, String message) {
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
