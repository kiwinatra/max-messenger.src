package defpackage;

import java.util.Arrays;

/* renamed from: fu6  reason: default package */
public final class fu6 {
    public final int a;
    public final int b;
    public final int[] c;
    public final int[] d;

    public fu6(int i, int i2, int[] iArr, int[] iArr2) {
        this.a = i;
        this.b = i2;
        this.c = iArr;
        this.d = iArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.fu6) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.fu6
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            fu6 r5 = (defpackage.fu6) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            int[] r1 = r4.c
            int[] r3 = r5.c
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r1 != 0) goto L_0x0025
            return r2
        L_0x0025:
            int[] r4 = r4.d
            int[] r5 = r5.d
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 != 0) goto L_0x0030
            return r2
        L_0x0030:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int h = rae.h(this.b, Integer.hashCode(this.a) * 31, 31);
        return Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + h) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.c);
        String arrays2 = Arrays.toString(this.d);
        StringBuilder sb = new StringBuilder("GradientsSkeletonColors(cellStaticBackground=");
        sb.append(this.a);
        sb.append(", gridStaticBackground=");
        sb.append(this.b);
        sb.append(", cellGradient=");
        sb.append(arrays);
        sb.append(", gridGradient=");
        return wj6.n(sb, arrays2, ")");
    }
}
