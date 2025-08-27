package com.fasterxml.jackson.core;

public class JsonProcessingException extends JacksonException {
    public final lp7 a;

    public JsonProcessingException(String str, lp7 lp7, NumberFormatException numberFormatException) {
        super(str, numberFormatException);
        this.a = lp7;
    }

    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        lp7 lp7 = this.a;
        if (lp7 == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (lp7 != null) {
            sb.append("\n at ");
            sb.append(lp7.toString());
        }
        return sb.toString();
    }

    public final String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
