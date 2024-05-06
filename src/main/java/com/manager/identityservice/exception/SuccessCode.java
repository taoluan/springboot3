package com.manager.identityservice.exception;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum SuccessCode {
    DELETED_SUCCESS(1000, "User has been deleted");
    int code;
    String message;

    SuccessCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

}
