package defpackage;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: v3d  reason: default package */
public final class v3d {
    public final int a;
    public final int b;
    public final float c;
    public final float d;

    public v3d(int i, float f, int i2) {
        this(f, i, i2, 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r4 = (defpackage.v3d) r4;
        r1 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 != r3) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r4 instanceof defpackage.v3d
            if (r1 == 0) goto L_0x0017
            v3d r4 = (defpackage.v3d) r4
            int r1 = r4.a
            int r2 = r3.a
            if (r2 != r1) goto L_0x0017
            int r3 = r3.b
            int r4 = r4.b
            if (r3 != r4) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v3d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format((Locale) null, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)}, 2));
    }

    public v3d(float f, int i, int i2, int i3) {
        f = (i3 & 4) != 0 ? 2048.0f : f;
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = 0.6666667f;
        if (i <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i2 <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }
}
