package defpackage;

import java.io.Serializable;

/* renamed from: teb  reason: default package */
public final class teb implements Serializable {
    public int X;
    public String Y;
    public int a;
    public long b;
    public boolean c;
    public String o;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public String z;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r5 = (defpackage.teb) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.teb
            if (r0 == 0) goto L_0x004c
            teb r5 = (defpackage.teb) r5
            if (r5 != 0) goto L_0x0009
            goto L_0x004c
        L_0x0009:
            if (r4 != r5) goto L_0x000c
            goto L_0x004a
        L_0x000c:
            int r0 = r4.a
            int r1 = r5.a
            if (r0 != r1) goto L_0x004c
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = r4.o
            java.lang.String r1 = r5.o
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r4.w
            boolean r1 = r5.w
            if (r0 != r1) goto L_0x004c
            int r0 = r4.y
            int r1 = r5.y
            if (r0 != r1) goto L_0x004c
            java.lang.String r0 = r4.z
            java.lang.String r1 = r5.z
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x004c
            int r0 = r4.X
            int r1 = r5.X
            if (r0 != r1) goto L_0x004c
            java.lang.String r4 = r4.Y
            java.lang.String r5 = r5.Y
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x004c
        L_0x004a:
            r4 = 1
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.teb.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return ((this.Y.hashCode() + ((tr1.y(this.X) + g63.d((((g63.d((Long.valueOf(this.b).hashCode() + ((2173 + this.a) * 53)) * 53, 53, this.o) + (this.w ? 1231 : 1237)) * 53) + this.y) * 53, 53, this.z)) * 53)) * 53) + 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Country Code: ");
        sb.append(this.a);
        sb.append(" National Number: ");
        sb.append(this.b);
        if (this.v && this.w) {
            sb.append(" Leading Zero(s): true");
        }
        if (this.x) {
            sb.append(" Number of leading zeros: ");
            sb.append(this.y);
        }
        if (this.c) {
            sb.append(" Extension: ");
            sb.append(this.o);
        }
        return sb.toString();
    }
}
