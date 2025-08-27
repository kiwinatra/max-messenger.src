package ru.ok.android.api.json;

public final class JsonStateException extends IllegalStateException {
    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.IllegalStateException, ru.ok.android.api.json.JsonStateException] */
    public static JsonStateException a(int i) {
        return new IllegalStateException("Expected " + n79.W(93) + " was " + n79.W(i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.IllegalStateException, ru.ok.android.api.json.JsonStateException] */
    public static JsonStateException b(int i) {
        return new IllegalStateException("Expected " + n79.W(125) + " was " + n79.W(i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.IllegalStateException, ru.ok.android.api.json.JsonStateException] */
    public static JsonStateException c(int i) {
        return new IllegalStateException("Expected " + n79.W(39) + " was " + n79.W(i));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.IllegalStateException, ru.ok.android.api.json.JsonStateException] */
    public static JsonStateException d(int i) {
        return new IllegalStateException("Expected value was ".concat(n79.W(i)));
    }
}
