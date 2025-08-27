package ru.ok.android.api.json;

import java.io.IOException;
import java.util.Locale;

public class JsonSyntaxException extends IOException {
    /* JADX WARNING: type inference failed for: r0v1, types: [ru.ok.android.api.json.JsonSyntaxException, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r0v2, types: [ru.ok.android.api.json.JsonSyntaxException, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r3v7, types: [ru.ok.android.api.json.JsonSyntaxException, java.io.IOException] */
    public static JsonSyntaxException a(int i, String str, long j) {
        if (i >= 0) {
            return i < 31 ? new IOException(String.format(Locale.US, "Unexpected char (U+%04x) at pos %d near `%s`", new Object[]{Integer.valueOf(i), Long.valueOf(j), str})) : new IOException(String.format(Locale.US, "Unexpected char '%s' (U+%04x) at pos %d near `%s`", new Object[]{Character.valueOf((char) i), Integer.valueOf(i), Long.valueOf(j), str}));
        }
        Locale locale = Locale.US;
        StringBuilder k = i2a.k("Unexpected EOF at pos ", j, " after `", str);
        k.append("`");
        return new IOException(k.toString());
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.android.api.json.JsonSyntaxException, java.io.IOException] */
    /* JADX WARNING: type inference failed for: r4v5, types: [ru.ok.android.api.json.JsonSyntaxException, java.io.IOException] */
    public static JsonSyntaxException b(int i, String str, long j) {
        if (i == 0) {
            Locale locale = Locale.US;
            StringBuilder k = i2a.k("Unexpected eof at pos ", j, " after `", str);
            k.append("`");
            return new IOException(k.toString());
        }
        String W = n79.W(i);
        Locale locale2 = Locale.US;
        StringBuilder sb = new StringBuilder("Unexpected ");
        sb.append(W);
        sb.append(" at pos ");
        sb.append(j);
        return new IOException(rae.q(sb, " near `", str, "`"));
    }
}
