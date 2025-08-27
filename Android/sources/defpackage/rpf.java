package defpackage;

import java.util.Arrays;

/* renamed from: rpf  reason: default package */
public final class rpf implements jv0 {
    public static final xff v = new xff(6);
    public final int a;
    public final String b;
    public final ca6[] c;
    public int o;

    public rpf(String str, ca6... ca6Arr) {
        int i = 1;
        y64.g(ca6Arr.length > 0);
        this.b = str;
        this.c = ca6Arr;
        this.a = ca6Arr.length;
        String str2 = ca6Arr[0].c;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i2 = ca6Arr[0].v | 16384;
        while (i < ca6Arr.length) {
            String str3 = ca6Arr[i].c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b("languages", i, ca6Arr[0].c, ca6Arr[i].c);
                return;
            } else if (i2 != (ca6Arr[i].v | 16384)) {
                b("role flags", i, Integer.toBinaryString(ca6Arr[0].v), Integer.toBinaryString(ca6Arr[i].v));
                return;
            } else {
                i++;
            }
        }
    }

    public static void b(String str, int i, String str2, String str3) {
        StringBuilder sb = new StringBuilder(g63.f(g63.f(str.length() + 78, str2), str3));
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        iq.a("", new IllegalStateException(sb.toString()));
    }

    public final int a(ca6 ca6) {
        int i = 0;
        while (true) {
            ca6[] ca6Arr = this.c;
            if (i >= ca6Arr.length) {
                return -1;
            }
            if (ca6 == ca6Arr[i]) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rpf.class != obj.getClass()) {
            return false;
        }
        rpf rpf = (rpf) obj;
        return this.a == rpf.a && this.b.equals(rpf.b) && Arrays.equals(this.c, rpf.c);
    }

    public final int hashCode() {
        if (this.o == 0) {
            this.o = g63.d(527, 31, this.b) + Arrays.hashCode(this.c);
        }
        return this.o;
    }
}
