package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: o2h  reason: default package */
public abstract class o2h {
    public static final Class a;
    public static final c3h b;
    public static final c3h c = new Object();

    /* JADX WARNING: type inference failed for: r0v2, types: [c3h, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        c3h c3h = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                c3h = (c3h) cls2.getConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (Throwable unused3) {
            }
        }
        b = c3h;
    }

    public static void A(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += wzg.Z((long) ((Integer) list.get(i4)).intValue());
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    if (intValue >= 0) {
                        wzg.S(intValue);
                    } else {
                        wzg.U((long) intValue);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                wzg.S(i << 3);
                if (intValue2 >= 0) {
                    wzg.S(intValue2);
                } else {
                    wzg.U((long) intValue2);
                }
                i2++;
            }
        }
    }

    public static void B(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += wzg.Z(((Long) list.get(i4)).longValue());
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    wzg.U(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                wzg.T(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void C(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    i3 += 4;
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    wzg.N(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                wzg.M(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void a(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    i3 += 8;
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    wzg.P(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                wzg.O(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void b(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue = ((Integer) list.get(i4)).intValue();
                    i3 += wzg.Y((intValue >> 31) ^ (intValue + intValue));
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    int intValue2 = ((Integer) list.get(i2)).intValue();
                    wzg.S((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                wzg.S(i << 3);
                wzg.S((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
        }
    }

    public static void c(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += wzg.Z((longValue >> 63) ^ (longValue + longValue));
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    wzg.U((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                wzg.T(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
        }
    }

    public static void d(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += wzg.Y(((Integer) list.get(i4)).intValue());
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    wzg.S(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                wzg.S(i << 3);
                wzg.S(intValue);
                i2++;
            }
        }
    }

    public static void e(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += wzg.Z(((Long) list.get(i4)).longValue());
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    wzg.U(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                wzg.T(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null) {
            return obj.equals(obj2);
        }
        return false;
    }

    public static int g(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r0h) {
            r0h r0h = (r0h) list;
            i = 0;
            while (i2 < size) {
                r0h.f(i2);
                i += wzg.Z((long) r0h.b[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + wzg.Z((long) ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (wzg.Y(i << 3) + 4) * size;
    }

    public static int i(List list) {
        return list.size() * 4;
    }

    public static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (wzg.Y(i << 3) + 8) * size;
    }

    public static int k(List list) {
        return list.size() * 8;
    }

    public static int l(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r0h) {
            r0h r0h = (r0h) list;
            i = 0;
            while (i2 < size) {
                r0h.f(i2);
                i += wzg.Z((long) r0h.b[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + wzg.Z((long) ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof h1h) {
            h1h h1h = (h1h) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += wzg.Z(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int n(int i, Object obj, l2h l2h) {
        return wzg.W((azg) obj, l2h) + wzg.Y(i << 3);
    }

    public static int o(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r0h) {
            r0h r0h = (r0h) list;
            i = 0;
            while (i2 < size) {
                r0h.f(i2);
                int i3 = r0h.b[i2];
                i += wzg.Y((i3 >> 31) ^ (i3 + i3));
                i2++;
            }
        } else {
            int i4 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i4 = i + wzg.Y((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof h1h) {
            h1h h1h = (h1h) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += wzg.Z((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int q(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r0h) {
            r0h r0h = (r0h) list;
            i = 0;
            while (i2 < size) {
                r0h.f(i2);
                i += wzg.Y(r0h.b[i2]);
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + wzg.Y(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof h1h) {
            h1h h1h = (h1h) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += wzg.Z(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object s(java.lang.Object r2, int r3, int r4, java.lang.Object r5, defpackage.c3h r6) {
        /*
            if (r5 != 0) goto L_0x0013
            r6.getClass()
            p0h r2 = (defpackage.p0h) r2
            b3h r5 = r2.zzc
            b3h r0 = defpackage.b3h.f
            if (r5 != r0) goto L_0x0013
            b3h r5 = defpackage.b3h.b()
            r2.zzc = r5
        L_0x0013:
            long r0 = (long) r4
            r6.getClass()
            int r2 = r3 << 3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r4 = r5
            b3h r4 = (defpackage.b3h) r4
            r4.c(r2, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o2h.s(java.lang.Object, int, int, java.lang.Object, c3h):java.lang.Object");
    }

    public static void t(c3h c3h, Object obj, Object obj2) {
        c3h.getClass();
        p0h p0h = (p0h) obj;
        b3h b3h = p0h.zzc;
        b3h b3h2 = ((p0h) obj2).zzc;
        b3h b3h3 = b3h.f;
        if (!b3h3.equals(b3h2)) {
            if (b3h3.equals(b3h)) {
                int i = b3h.a + b3h2.a;
                int[] copyOf = Arrays.copyOf(b3h.b, i);
                System.arraycopy(b3h2.b, 0, copyOf, b3h.a, b3h2.a);
                Object[] copyOf2 = Arrays.copyOf(b3h.c, i);
                System.arraycopy(b3h2.c, 0, copyOf2, b3h.a, b3h2.a);
                b3h = new b3h(i, copyOf, copyOf2, true);
            } else {
                b3h.getClass();
                if (!b3h2.equals(b3h3)) {
                    if (b3h.e) {
                        int i2 = b3h.a + b3h2.a;
                        b3h.e(i2);
                        System.arraycopy(b3h2.b, 0, b3h.b, b3h.a, b3h2.a);
                        System.arraycopy(b3h2.c, 0, b3h.c, b3h.a, b3h2.a);
                        b3h.a = i2;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        p0h.zzc = b3h;
    }

    public static void u(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).getClass();
                    i3++;
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    wzg.J(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                wzg.S(i << 3);
                wzg.J(booleanValue ? (byte) 1 : 0);
                i2++;
            }
        }
    }

    public static void v(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    i3 += 8;
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    wzg.P(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                wzg.O(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
        }
    }

    public static void w(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += wzg.Z((long) ((Integer) list.get(i4)).intValue());
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    if (intValue >= 0) {
                        wzg.S(intValue);
                    } else {
                        wzg.U((long) intValue);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                wzg.S(i << 3);
                if (intValue2 >= 0) {
                    wzg.S(intValue2);
                } else {
                    wzg.U((long) intValue2);
                }
                i2++;
            }
        }
    }

    public static void x(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    i3 += 4;
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    wzg.N(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                wzg.M(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void y(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    i3 += 8;
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    wzg.P(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                wzg.O(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void z(int i, List list, p1e p1e, boolean z) {
        if (list != null && !list.isEmpty()) {
            wzg wzg = (wzg) p1e.a;
            int i2 = 0;
            if (z) {
                wzg.R(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    i3 += 4;
                }
                wzg.S(i3);
                while (i2 < list.size()) {
                    wzg.N(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                wzg.M(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
        }
    }
}
