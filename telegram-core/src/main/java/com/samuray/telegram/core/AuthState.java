package com.samuray.telegram.core;

public enum AuthState {
    UNKNOWN,
    WAITING_PHONE_NUMBER,
    WAITING_CODE,
    WAITING_PASSWORD,
    READY,
    LOGGED_OUT,
    ERROR
}
