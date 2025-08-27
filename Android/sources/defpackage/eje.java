package defpackage;

import java.util.Arrays;

/* renamed from: eje  reason: default package */
public final class eje extends qpc {
    public final int b;
    public final float c;

    public eje(int i) {
        y64.f("maxStars must be a positive integer", i > 0);
        this.b = i;
        this.c = -1.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (defpackage.eje) r4;
        r0 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.eje
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            eje r4 = (defpackage.eje) r4
            int r0 = r4.b
            int r2 = r3.b
            if (r2 != r0) goto L_0x0017
            float r3 = r3.c
            float r4 = r4.c
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0017
            r1 = 1
        L_0x0017:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eje.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Float.valueOf(this.c)});
    }

    public eje(int i, float f) {
        boolean z = false;
        y64.f("maxStars must be a positive integer", i > 0);
        if (f >= c44.DEFAULT_ASPECT_RATIO && f <= ((float) i)) {
            z = true;
        }
        y64.f("starRating is out of range [0, maxStars]", z);
        this.b = i;
        this.c = f;
    }
}
