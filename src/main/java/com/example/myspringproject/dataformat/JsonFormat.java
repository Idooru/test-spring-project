package com.example.myspringproject.dataformat;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class JsonFormat<T> {
    private final int statusCode;
    private final String message;
    private final T resultData;

    public JsonFormat(int statusCode, String message, T resultData) {
        this.statusCode = statusCode;
        this.message = message;
        this.resultData = resultData;
    }

    @Override
    public String toString() {
        return "JsonFormat{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", resultData=" + resultData +
                '}';
    }
}
