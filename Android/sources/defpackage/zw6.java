package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zw6  reason: default package */
public final class zw6 {
    public static final vw0 d = wc8.g(":");
    public static final vw0 e = wc8.g(":status");
    public static final vw0 f = wc8.g(":method");
    public static final vw0 g = wc8.g(":path");
    public static final vw0 h = wc8.g(":scheme");
    public static final vw0 i = wc8.g(":authority");
    public final int a;
    public final vw0 b;
    public final vw0 c;

    public zw6(vw0 vw0, vw0 vw02) {
        this.b = vw0;
        this.c = vw02;
        this.a = vw02.c() + vw0.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw6)) {
            return false;
        }
        zw6 zw6 = (zw6) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) zw6.b) && Intrinsics.areEqual((Object) this.c, (Object) zw6.c);
    }

    public final int hashCode() {
        int i2 = 0;
        vw0 vw0 = this.b;
        int hashCode = (vw0 != null ? vw0.hashCode() : 0) * 31;
        vw0 vw02 = this.c;
        if (vw02 != null) {
            i2 = vw02.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return this.b.j() + ": " + this.c.j();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zw6(defpackage.vw0 r3, java.lang.String r4) {
        /*
            r2 = this;
            vw0 r0 = new vw0
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            byte[] r1 = r4.getBytes(r1)
            r0.<init>(r1)
            r0.b = r4
            r2.<init>((defpackage.vw0) r3, (defpackage.vw0) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw6.<init>(vw0, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zw6(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            vw0 r0 = new vw0
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            byte[] r1 = r3.getBytes(r1)
            r0.<init>(r1)
            r0.b = r3
            vw0 r3 = new vw0
            java.nio.charset.Charset r1 = kotlin.text.Charsets.UTF_8
            byte[] r1 = r4.getBytes(r1)
            r3.<init>(r1)
            r3.b = r4
            r2.<init>((defpackage.vw0) r0, (defpackage.vw0) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw6.<init>(java.lang.String, java.lang.String):void");
    }
}
