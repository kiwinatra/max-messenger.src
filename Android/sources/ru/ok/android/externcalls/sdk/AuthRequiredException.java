package ru.ok.android.externcalls.sdk;

public class AuthRequiredException extends Exception {
    public String getMessage() {
        return "Authorization required";
    }
}
