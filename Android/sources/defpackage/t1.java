package defpackage;

import org.apache.http.HttpStatus;

/* renamed from: t1  reason: default package */
public abstract class t1 extends u1 {
    public static long a(String str) {
        if (str.indexOf(46) >= 0 || str.indexOf(HttpStatus.SC_SWITCHING_PROTOCOLS) >= 0 || str.indexOf(69) >= 0) {
            return (long) Double.parseDouble(str);
        }
        int length = str.length();
        long j = 0;
        if (str.charAt(0) != '-') {
            if (length < 19) {
                return Long.parseLong(str);
            }
            if (length == 19 && str.compareTo("9223372036854775807") <= 0) {
                return Long.parseLong(str);
            }
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt < '0' || charAt > '9') {
                    throw new NumberFormatException("Cannot parse long from ".concat(str));
                }
                j = (j * 10) + ((long) (charAt - '0'));
            }
            return j;
        } else if (length < 20) {
            return Long.parseLong(str);
        } else {
            if (length == 20 && str.compareTo("-9223372036854775808") <= 0) {
                return Long.parseLong(str);
            }
            for (int i2 = 1; i2 < length; i2++) {
                char charAt2 = str.charAt(i2);
                if (charAt2 < '0' || charAt2 > '9') {
                    throw new NumberFormatException("Cannot parse long from ".concat(str));
                }
                j = (j * 10) + ((long) (charAt2 - '0'));
            }
            return -j;
        }
    }
}
