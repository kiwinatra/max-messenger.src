package defpackage;

/* renamed from: qa8  reason: default package */
public abstract class qa8 {
    public long[] a;
    public int b;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r8 = (defpackage.qa8) r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.qa8
            r1 = 0
            if (r0 == 0) goto L_0x0030
            qa8 r8 = (defpackage.qa8) r8
            int r0 = r8.b
            int r2 = r7.b
            if (r0 == r2) goto L_0x000e
            goto L_0x0030
        L_0x000e:
            long[] r7 = r7.a
            long[] r8 = r8.a
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until((int) r1, (int) r2)
            int r2 = r0.getFirst()
            int r0 = r0.getLast()
            if (r2 > r0) goto L_0x002e
        L_0x0020:
            r3 = r7[r2]
            r5 = r8[r2]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0029
            return r1
        L_0x0029:
            if (r2 == r0) goto L_0x002e
            int r2 = r2 + 1
            goto L_0x0020
        L_0x002e:
            r7 = 1
            return r7
        L_0x0030:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa8.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append("]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append("...");
                break;
            }
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }
}
