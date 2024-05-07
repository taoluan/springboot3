package com.manager.identityservice.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    INVALID_KEY(1000, "Invalid message key"),
    USER_EXISTED(10001, "User existed."),
    USERNAME_INVALID(1002, "Username must be at least 3 character."),
    USERNAME_NOTFOUND(1003, "User not found."),
    PASSWORD_INVALID(1004, "Password must be at least 8 character"),
    USERNAME_NOT_EXISTED(1005, "User not found."),
    UNAUTHENTICATED(1006, "Unauthenticated"),
    ;
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
