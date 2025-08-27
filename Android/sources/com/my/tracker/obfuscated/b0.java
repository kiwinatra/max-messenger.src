package com.my.tracker.obfuscated;

import java.security.MessageDigest;
import java.util.Locale;

public abstract class b0 {
    public static String a(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("md5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte valueOf : digest) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(valueOf)}));
            }
            return sb.toString().toLowerCase(Locale.ROOT);
        } catch (Throwable unused) {
            return null;
        }
    }
}
