package defpackage;

import java.util.Arrays;

/* renamed from: g80  reason: default package */
public final class g80 implements pl {
    public static final g80 o;
    public final String a;
    public final boolean b;
    public final String c;

    /* JADX WARNING: type inference failed for: r0v0, types: [jk3, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.b = Boolean.FALSE;
        o = new g80(obj);
    }

    public g80(jk3 jk3) {
        this.a = (String) jk3.a;
        this.b = ((Boolean) jk3.b).booleanValue();
        this.c = (String) jk3.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80 = (g80) obj;
        return kne.o(this.a, g80.a) && this.b == g80.b && kne.o(this.c, g80.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), this.c});
    }
}
