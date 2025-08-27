package defpackage;

import java.util.List;

/* renamed from: mr3  reason: default package */
public final class mr3 extends ibf {
    public List c;
    public List o;
    public int v;

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.pf9 r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 1
            r8.getClass()
            r1 = 0
            r2 = 0
            r3 = 7
            r4 = -1
            int r5 = r8.hashCode()
            switch(r5) {
                case 104120: goto L_0x0026;
                case 3598564: goto L_0x001b;
                case 110549828: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0030
        L_0x0010:
            java.lang.String r5 = "total"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x0019
            goto L_0x0030
        L_0x0019:
            r4 = 2
            goto L_0x0030
        L_0x001b:
            java.lang.String r5 = "urls"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x0024
            goto L_0x0030
        L_0x0024:
            r4 = r0
            goto L_0x0030
        L_0x0026:
            java.lang.String r5 = "ids"
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r4 = r2
        L_0x0030:
            switch(r4) {
                case 0: goto L_0x0069;
                case 1: goto L_0x003e;
                case 2: goto L_0x0037;
                default: goto L_0x0033;
            }
        L_0x0033:
            r7.A()
            goto L_0x0099
        L_0x0037:
            int r7 = r7.w0()
            r6.v = r7
            goto L_0x0099
        L_0x003e:
            hb9 r8 = r7.n()
            int r8 = r8.a()
            if (r8 != r3) goto L_0x005c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r8 = r7.t0()
        L_0x0051:
            if (r2 >= r8) goto L_0x005f
            java.lang.String r3 = defpackage.ryg.g0(r7)
            r1.add(r3)
            int r2 = r2 + r0
            goto L_0x0051
        L_0x005c:
            r7.A()
        L_0x005f:
            if (r1 == 0) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x0066:
            r6.c = r1
            goto L_0x0099
        L_0x0069:
            hb9 r8 = r7.n()
            int r8 = r8.a()
            if (r8 != r3) goto L_0x008d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r8 = r7.t0()
        L_0x007c:
            if (r2 >= r8) goto L_0x0090
            r3 = 0
            long r3 = defpackage.ryg.d0(r7, r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.add(r3)
            int r2 = r2 + r0
            goto L_0x007c
        L_0x008d:
            r7.A()
        L_0x0090:
            if (r1 == 0) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x0097:
            r6.o = r1
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr3.c(pf9, java.lang.String):void");
    }

    public final String toString() {
        int o2 = kv0.o(this.c);
        int o3 = kv0.o(this.o);
        return wj6.l(a81.n("{urls=", o2, ", ids=", o3, ", total="), this.v, "}");
    }
}
