package defpackage;

import java.io.Serializable;

/* renamed from: lp7  reason: default package */
public final class lp7 implements Serializable {
    public final long a;
    public final long b;
    public final int c;
    public final int o;
    public final transient Object v;

    public lp7(int i, int i2, long j, long j2, Object obj) {
        this.v = obj;
        this.a = j;
        this.b = j2;
        this.c = i;
        this.o = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof lp7)) {
            return false;
        }
        lp7 lp7 = (lp7) obj;
        Object obj2 = lp7.v;
        Object obj3 = this.v;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
        } else if (!obj3.equals(obj2)) {
            return false;
        }
        return this.c == lp7.c && this.o == lp7.o && this.b == lp7.b && this.a == lp7.a;
    }

    public final int hashCode() {
        Object obj = this.v;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this.c) + this.o) ^ ((int) this.b)) + ((int) this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 80
            r0.<init>(r1)
            java.lang.String r1 = "[Source: "
            r0.append(r1)
            r1 = 93
            java.lang.Object r2 = r9.v
            if (r2 != 0) goto L_0x0019
            java.lang.String r2 = "UNKNOWN"
            r0.append(r2)
            goto L_0x00cf
        L_0x0019:
            boolean r3 = r2 instanceof java.lang.Class
            if (r3 == 0) goto L_0x0021
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3
            goto L_0x0025
        L_0x0021:
            java.lang.Class r3 = r2.getClass()
        L_0x0025:
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "java."
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0036
            java.lang.String r4 = r3.getSimpleName()
            goto L_0x0043
        L_0x0036:
            boolean r3 = r2 instanceof byte[]
            if (r3 == 0) goto L_0x003d
            java.lang.String r4 = "byte[]"
            goto L_0x0043
        L_0x003d:
            boolean r3 = r2 instanceof char[]
            if (r3 == 0) goto L_0x0043
            java.lang.String r4 = "char[]"
        L_0x0043:
            r3 = 40
            r0.append(r3)
            r0.append(r4)
            r3 = 41
            r0.append(r3)
            boolean r3 = r2 instanceof java.lang.CharSequence
            r4 = 34
            r5 = 500(0x1f4, float:7.0E-43)
            r6 = 0
            java.lang.String r7 = " chars"
            if (r3 == 0) goto L_0x007d
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r3 = r2.length()
            int r5 = java.lang.Math.min(r3, r5)
            java.lang.CharSequence r2 = r2.subSequence(r6, r5)
            java.lang.String r2 = r2.toString()
            r0.append(r4)
            r0.append(r2)
            r0.append(r4)
            int r2 = r2.length()
        L_0x007a:
            int r6 = r3 - r2
            goto L_0x00bf
        L_0x007d:
            boolean r3 = r2 instanceof char[]
            if (r3 == 0) goto L_0x009b
            char[] r2 = (char[]) r2
            int r3 = r2.length
            java.lang.String r8 = new java.lang.String
            int r5 = java.lang.Math.min(r3, r5)
            r8.<init>(r2, r6, r5)
            r0.append(r4)
            r0.append(r8)
            r0.append(r4)
            int r2 = r8.length()
            goto L_0x007a
        L_0x009b:
            boolean r3 = r2 instanceof byte[]
            if (r3 == 0) goto L_0x00bf
            byte[] r2 = (byte[]) r2
            int r3 = r2.length
            int r3 = java.lang.Math.min(r3, r5)
            java.lang.String r5 = new java.lang.String
            java.lang.String r7 = "UTF-8"
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            r5.<init>(r2, r6, r3, r7)
            r0.append(r4)
            r0.append(r5)
            r0.append(r4)
            int r2 = r2.length
            int r6 = r2 - r3
            java.lang.String r7 = " bytes"
        L_0x00bf:
            if (r6 <= 0) goto L_0x00cf
            java.lang.String r2 = "[truncated "
            r0.append(r2)
            r0.append(r6)
            r0.append(r7)
            r0.append(r1)
        L_0x00cf:
            java.lang.String r2 = "; line: "
            r0.append(r2)
            int r2 = r9.c
            r0.append(r2)
            java.lang.String r2 = ", column: "
            r0.append(r2)
            int r9 = r9.o
            java.lang.String r9 = defpackage.tr1.k(r0, r9, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lp7.toString():java.lang.String");
    }
}
