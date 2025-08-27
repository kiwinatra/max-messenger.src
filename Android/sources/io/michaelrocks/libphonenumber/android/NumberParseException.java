package io.michaelrocks.libphonenumber.android;

public class NumberParseException extends Exception {
    public final int a;
    public final String b;

    public NumberParseException(int i, String str) {
        super(str);
        this.b = str;
        this.a = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error type: ");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TOO_LONG" : "TOO_SHORT_NSN" : "TOO_SHORT_AFTER_IDD" : "NOT_A_NUMBER" : "INVALID_COUNTRY_CODE");
        sb.append(". ");
        sb.append(this.b);
        return sb.toString();
    }
}
