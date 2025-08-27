package defpackage;

import java.io.Serializable;

/* renamed from: ob7  reason: default package */
public final class ob7 implements Serializable {
    public static final /* synthetic */ int c = 0;
    public final int[] a;
    public final int b;

    static {
        new ob7(new int[0]);
    }

    public ob7(int[] iArr) {
        int length = iArr.length;
        this.a = iArr;
        this.b = length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r7 = (defpackage.ob7) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof defpackage.ob7
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            ob7 r7 = (defpackage.ob7) r7
            int r1 = r7.b
            int r3 = r6.b
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            r1 = r2
        L_0x0014:
            if (r1 >= r3) goto L_0x002c
            defpackage.b0h.g(r1, r3)
            int[] r4 = r6.a
            r4 = r4[r1]
            int r5 = r7.b
            defpackage.b0h.g(r1, r5)
            int[] r5 = r7.a
            r5 = r5[r1]
            if (r4 == r5) goto L_0x0029
            return r2
        L_0x0029:
            int r1 = r1 + 1
            goto L_0x0014
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ob7.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
