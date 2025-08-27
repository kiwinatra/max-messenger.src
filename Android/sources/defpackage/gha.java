package defpackage;

/* renamed from: gha  reason: default package */
public abstract class gha {
    public Object[] a;
    public int b;

    public final Object a(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        StringBuilder o = wj6.o(i, "Index ", " must be in 0..");
        o.append(this.b - 1);
        throw new IndexOutOfBoundsException(o.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r6 = (defpackage.gha) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.gha
            r1 = 0
            if (r0 == 0) goto L_0x0032
            gha r6 = (defpackage.gha) r6
            int r0 = r6.b
            int r2 = r5.b
            if (r0 == r2) goto L_0x000e
            goto L_0x0032
        L_0x000e:
            java.lang.Object[] r5 = r5.a
            java.lang.Object[] r6 = r6.a
            kotlin.ranges.IntRange r0 = kotlin.ranges.RangesKt.until((int) r1, (int) r2)
            int r2 = r0.getFirst()
            int r0 = r0.getLast()
            if (r2 > r0) goto L_0x0030
        L_0x0020:
            r3 = r5[r2]
            r4 = r6[r2]
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r4)
            if (r3 != 0) goto L_0x002b
            return r1
        L_0x002b:
            if (r2 == r0) goto L_0x0030
            int r2 = r2 + 1
            goto L_0x0020
        L_0x0030:
            r5 = 1
            return r5
        L_0x0032:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gha.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            i2 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i2;
    }

    public final String toString() {
        bn7 bn7 = new bn7(1, this);
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append("]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append("...");
                break;
            }
            if (i2 != 0) {
                sb.append(", ");
            }
            sb.append((CharSequence) bn7.invoke(obj));
            i2++;
        }
        return sb.toString();
    }
}
