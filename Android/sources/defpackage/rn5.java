package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: rn5  reason: default package */
public final class rn5 extends ibf {
    public List c;

    public rn5(pf9 pf9) {
        super(pf9);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [sn5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(defpackage.pf9 r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r2 = 1
            r19.getClass()
            java.lang.String r3 = "info"
            r4 = r19
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0015
            r18.A()
            goto L_0x0091
        L_0x0015:
            int r3 = defpackage.ryg.X(r18)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r0.c = r4
            r4 = 0
        L_0x0021:
            if (r4 >= r3) goto L_0x0091
            java.util.List r5 = r0.c
            int r6 = defpackage.ryg.e0(r18)
            r7 = 0
            if (r6 != 0) goto L_0x0030
            r1 = r18
            goto L_0x008c
        L_0x0030:
            r8 = 0
            r10 = r7
            r12 = r8
            r11 = 0
        L_0x0035:
            if (r11 >= r6) goto L_0x0084
            java.lang.String r14 = r18.A0()
            r14.getClass()
            r15 = -1
            int r16 = r14.hashCode()
            switch(r16) {
                case -1274507337: goto L_0x005d;
                case 116079: goto L_0x0052;
                case 110541305: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0067
        L_0x0047:
            java.lang.String r1 = "token"
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x0050
            goto L_0x0067
        L_0x0050:
            r15 = 2
            goto L_0x0067
        L_0x0052:
            java.lang.String r1 = "url"
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x005b
            goto L_0x0067
        L_0x005b:
            r15 = r2
            goto L_0x0067
        L_0x005d:
            java.lang.String r1 = "fileId"
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r15 = 0
        L_0x0067:
            switch(r15) {
                case 0: goto L_0x007c;
                case 1: goto L_0x0076;
                case 2: goto L_0x0070;
                default: goto L_0x006a;
            }
        L_0x006a:
            r18.A()
        L_0x006d:
            r1 = r18
            goto L_0x0082
        L_0x0070:
            java.lang.String r1 = defpackage.ryg.g0(r18)
            r7 = r1
            goto L_0x006d
        L_0x0076:
            java.lang.String r1 = defpackage.ryg.g0(r18)
            r10 = r1
            goto L_0x006d
        L_0x007c:
            r1 = r18
            long r12 = defpackage.ryg.d0(r1, r8)
        L_0x0082:
            int r11 = r11 + r2
            goto L_0x0035
        L_0x0084:
            r1 = r18
            sn5 r6 = new sn5
            r6.<init>(r12, r7, r10)
            r7 = r6
        L_0x008c:
            r5.add(r7)
            int r4 = r4 + r2
            goto L_0x0021
        L_0x0091:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn5.c(pf9, java.lang.String):void");
    }

    public final String toString() {
        List list = this.c;
        return "{info=" + list + "}";
    }
}
