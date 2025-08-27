package ru.ok.android.externcalls.sdk.api;

public class ExternApiException extends RuntimeException {
    private final int errorCode;
    private final String extendedError;

    public ExternApiException(String str, Throwable th) {
        this(str, th, 0, (String) null);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getExtendedError() {
        return this.extendedError;
    }

    public String toString() {
        return tr1.k(new StringBuilder("ExternApiException{errorCode="), this.errorCode, '}');
    }

    public ExternApiException(String str, Throwable th, int i) {
        this(str, th, i, (String) null);
    }

    public ExternApiException(String str, Throwable th, int i, String str2) {
        super(str, th);
        this.errorCode = i;
        this.extendedError = str2;
    }
}
