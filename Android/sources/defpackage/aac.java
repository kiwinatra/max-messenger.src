package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: aac  reason: default package */
public final class aac extends ibf {
    public List c;
    public int o;
    public Long v;

    public aac(pf9 pf9) {
        super(pf9);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.pf9 r14, java.lang.String r15) {
        /*
            r13 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            r15.getClass()
            r3 = -1
            int r4 = r15.hashCode()
            switch(r4) {
                case -1081306054: goto L_0x0026;
                case -934426595: goto L_0x001b;
                case 110549828: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            r15 = r3
            goto L_0x0030
        L_0x0010:
            java.lang.String r4 = "total"
            boolean r15 = r15.equals(r4)
            if (r15 != 0) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            r15 = r0
            goto L_0x0030
        L_0x001b:
            java.lang.String r4 = "result"
            boolean r15 = r15.equals(r4)
            if (r15 != 0) goto L_0x0024
            goto L_0x000e
        L_0x0024:
            r15 = r2
            goto L_0x0030
        L_0x0026:
            java.lang.String r4 = "marker"
            boolean r15 = r15.equals(r4)
            if (r15 != 0) goto L_0x002f
            goto L_0x000e
        L_0x002f:
            r15 = r1
        L_0x0030:
            switch(r15) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x0040;
                case 2: goto L_0x0038;
                default: goto L_0x0033;
            }
        L_0x0033:
            r14.A()
            goto L_0x00b5
        L_0x0038:
            int r14 = r14.w0()
            r13.o = r14
            goto L_0x00b5
        L_0x0040:
            int r15 = defpackage.ryg.X(r14)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r15)
            r13.c = r4
            r4 = r1
        L_0x004c:
            if (r4 >= r15) goto L_0x00b5
            java.util.List r5 = r13.c
            int r6 = defpackage.ryg.e0(r14)
            r7 = 0
            r10 = r1
            r8 = r7
            r9 = r8
        L_0x0058:
            if (r10 >= r6) goto L_0x00a1
            java.lang.String r11 = r14.A0()
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case 3052376: goto L_0x0080;
                case 357304895: goto L_0x0075;
                case 951526432: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            r11 = r3
            goto L_0x008a
        L_0x006a:
            java.lang.String r12 = "contact"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0073
            goto L_0x0068
        L_0x0073:
            r11 = r0
            goto L_0x008a
        L_0x0075:
            java.lang.String r12 = "highlights"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x007e
            goto L_0x0068
        L_0x007e:
            r11 = r2
            goto L_0x008a
        L_0x0080:
            java.lang.String r12 = "chat"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L_0x0089
            goto L_0x0068
        L_0x0089:
            r11 = r1
        L_0x008a:
            switch(r11) {
                case 0: goto L_0x009b;
                case 1: goto L_0x0096;
                case 2: goto L_0x0091;
                default: goto L_0x008d;
            }
        L_0x008d:
            r14.A()
            goto L_0x009f
        L_0x0091:
            cs3 r9 = defpackage.cs3.a(r14)
            goto L_0x009f
        L_0x0096:
            a00 r8 = defpackage.a00.m(r14)
            goto L_0x009f
        L_0x009b:
            b32 r7 = defpackage.b32.a(r14)
        L_0x009f:
            int r10 = r10 + r2
            goto L_0x0058
        L_0x00a1:
            bac r6 = new bac
            r6.<init>(r7, r8, r9)
            r5.add(r6)
            int r4 = r4 + r2
            goto L_0x004c
        L_0x00ab:
            long r14 = r14.x0()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13.v = r14
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aac.c(pf9, java.lang.String):void");
    }

    public final String toString() {
        int o2 = kv0.o(this.c);
        int i = this.o;
        Long l = this.v;
        StringBuilder n = a81.n("{result=", o2, ", total=", i, ", marker=");
        n.append(l);
        n.append("}");
        return n.toString();
    }
}
