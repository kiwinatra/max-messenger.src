package defpackage;

import java.security.MessageDigest;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.UByte;
import kotlin.text.Charsets;

/* renamed from: m65  reason: default package */
public abstract class m65 {
    public static final Lazy a = LazyKt.lazy(new qr3(21));

    public static String a(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        MessageDigest messageDigest = (MessageDigest) a.getValue();
        if (messageDigest == null) {
            return str;
        }
        messageDigest.update(str.getBytes(Charsets.UTF_8), 0, str.length());
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            String hexString = Integer.toHexString(b & UByte.MAX_VALUE);
            if (hexString.length() == 1) {
                sb.append('0');
                sb.append(hexString);
            } else {
                sb.append(hexString);
            }
        }
        return sb.toString().toLowerCase(Locale.ROOT);
    }
}
