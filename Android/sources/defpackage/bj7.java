package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Map;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: bj7  reason: default package */
public abstract class bj7 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final Object b = new Object();

    static {
        Charset.forName("ISO-8859-1");
    }

    public static int a(Map map, int i, int i2, int i3) {
        int m = j43.m(i);
        int i4 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int d = j43.d(2, i3, value) + j43.d(1, i2, key);
            i4 += j43.j(d) + m + d;
        }
        return i4;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Map b(defpackage.i43 r2, java.util.Map r3, defpackage.sd8 r4, int r5, int r6, defpackage.ad9 r7, int r8, int r9) {
        /*
            java.util.Map r3 = r4.d(r3)
            int r4 = r2.p()
            int r4 = r2.e(r4)
            r0 = 0
        L_0x000d:
            int r1 = r2.s()
            if (r1 != 0) goto L_0x0014
            goto L_0x0033
        L_0x0014:
            if (r1 != r8) goto L_0x001b
            java.io.Serializable r0 = r2.k(r5)
            goto L_0x000d
        L_0x001b:
            if (r1 != r9) goto L_0x002d
            r1 = 11
            if (r6 != r1) goto L_0x0028
            r1 = r7
            ad9 r1 = (defpackage.ad9) r1
            r2.j(r1)
            goto L_0x000d
        L_0x0028:
            java.io.Serializable r7 = r2.k(r6)
            goto L_0x000d
        L_0x002d:
            boolean r1 = r2.u(r1)
            if (r1 != 0) goto L_0x000d
        L_0x0033:
            r8 = 0
            r2.a(r8)
            r2.d(r4)
            if (r0 != 0) goto L_0x0040
            java.io.Serializable r0 = c(r5)
        L_0x0040:
            if (r7 != 0) goto L_0x0046
            java.io.Serializable r7 = c(r6)
        L_0x0046:
            r3.put(r0, r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj7.b(i43, java.util.Map, sd8, int, int, ad9, int, int):java.util.Map");
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [byte[], java.io.Serializable] */
    public static Serializable c(int i) {
        switch (i) {
            case 1:
                return Double.valueOf(0.0d);
            case 2:
                return Float.valueOf(c44.DEFAULT_ASPECT_RATIO);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return 0L;
            case 5:
            case 7:
            case 13:
            case Protos.Attaches.Attach.LOCATION /*14*/:
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
            case LangUtils.HASH_SEED /*17*/:
                return 0;
            case 8:
                return Boolean.FALSE;
            case 9:
                return "";
            case 12:
                return ct.h;
            default:
                throw new IllegalArgumentException(a81.j(i, "Type: ", " is not a primitive type."));
        }
    }

    public static void d(j43 j43, Map map, int i, int i2, int i3) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int d = j43.d(1, i2, key);
            j43.F(i, 2);
            j43.C(j43.d(2, i3, value) + d);
            j43.u(1, i2, key);
            j43.u(2, i3, value);
        }
    }
}
