package defpackage;

import java.util.List;

/* renamed from: coe  reason: default package */
public final class coe {
    public final long a;
    public final int b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final List i;
    public final int j;
    public final long k;
    public final String l;
    public final boolean m;
    public final int n;

    public coe(e20 e20) {
        this.a = e20.a;
        this.b = e20.b;
        this.c = e20.c;
        this.d = e20.d;
        this.e = e20.e;
        this.f = e20.f;
        this.g = e20.g;
        this.h = e20.h;
        this.i = e20.i;
        this.j = e20.j;
        this.k = e20.k;
        this.l = e20.l;
        this.m = e20.m;
        this.n = e20.n;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [e20, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.coe a(defpackage.pf9 r15) {
        /*
            r0 = 4
            r1 = -1
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            int r6 = defpackage.ryg.e0(r15)
            if (r6 != 0) goto L_0x000e
            r15 = 0
            return r15
        L_0x000e:
            e20 r7 = new e20
            r7.<init>()
            r8 = r4
        L_0x0014:
            if (r8 >= r6) goto L_0x01b5
            java.lang.String r9 = r15.A0()
            r9.getClass()
            r10 = 0
            int r12 = r9.hashCode()
            switch(r12) {
                case -1501337755: goto L_0x00d5;
                case -1221029593: goto L_0x00c9;
                case -1069321026: goto L_0x00bd;
                case -549897057: goto L_0x00b1;
                case -295931082: goto L_0x00a5;
                case -41651065: goto L_0x009a;
                case 3355: goto L_0x008f;
                case 116079: goto L_0x0084;
                case 3552281: goto L_0x0077;
                case 3575610: goto L_0x006a;
                case 93166550: goto L_0x005d;
                case 109327645: goto L_0x0050;
                case 110541305: goto L_0x0043;
                case 113126854: goto L_0x0036;
                case 1539122512: goto L_0x0029;
                default: goto L_0x0026;
            }
        L_0x0026:
            r9 = r1
            goto L_0x00e0
        L_0x0029:
            java.lang.String r12 = "lottieUrl"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x0032
            goto L_0x0026
        L_0x0032:
            r9 = 14
            goto L_0x00e0
        L_0x0036:
            java.lang.String r12 = "width"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x003f
            goto L_0x0026
        L_0x003f:
            r9 = 13
            goto L_0x00e0
        L_0x0043:
            java.lang.String r12 = "token"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x004c
            goto L_0x0026
        L_0x004c:
            r9 = 12
            goto L_0x00e0
        L_0x0050:
            java.lang.String r12 = "setId"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x0059
            goto L_0x0026
        L_0x0059:
            r9 = 11
            goto L_0x00e0
        L_0x005d:
            java.lang.String r12 = "audio"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x0066
            goto L_0x0026
        L_0x0066:
            r9 = 10
            goto L_0x00e0
        L_0x006a:
            java.lang.String r12 = "type"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x0073
            goto L_0x0026
        L_0x0073:
            r9 = 9
            goto L_0x00e0
        L_0x0077:
            java.lang.String r12 = "tags"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x0080
            goto L_0x0026
        L_0x0080:
            r9 = 8
            goto L_0x00e0
        L_0x0084:
            java.lang.String r12 = "url"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x008d
            goto L_0x0026
        L_0x008d:
            r9 = 7
            goto L_0x00e0
        L_0x008f:
            java.lang.String r12 = "id"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x0098
            goto L_0x0026
        L_0x0098:
            r9 = 6
            goto L_0x00e0
        L_0x009a:
            java.lang.String r12 = "previewUrl"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x00a3
            goto L_0x0026
        L_0x00a3:
            r9 = 5
            goto L_0x00e0
        L_0x00a5:
            java.lang.String r12 = "updateTime"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x00af
            goto L_0x0026
        L_0x00af:
            r9 = r0
            goto L_0x00e0
        L_0x00b1:
            java.lang.String r12 = "firstUrl"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x00bb
            goto L_0x0026
        L_0x00bb:
            r9 = r2
            goto L_0x00e0
        L_0x00bd:
            java.lang.String r12 = "mp4Url"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x00c7
            goto L_0x0026
        L_0x00c7:
            r9 = r3
            goto L_0x00e0
        L_0x00c9:
            java.lang.String r12 = "height"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x00d3
            goto L_0x0026
        L_0x00d3:
            r9 = r5
            goto L_0x00e0
        L_0x00d5:
            java.lang.String r12 = "authorType"
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x00df
            goto L_0x0026
        L_0x00df:
            r9 = r4
        L_0x00e0:
            switch(r9) {
                case 0: goto L_0x0194;
                case 1: goto L_0x018d;
                case 2: goto L_0x0186;
                case 3: goto L_0x017f;
                case 4: goto L_0x0178;
                case 5: goto L_0x0171;
                case 6: goto L_0x016a;
                case 7: goto L_0x0163;
                case 8: goto L_0x014b;
                case 9: goto L_0x010d;
                case 10: goto L_0x0105;
                case 11: goto L_0x00fd;
                case 12: goto L_0x00f8;
                case 13: goto L_0x00f0;
                case 14: goto L_0x00e8;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            r15.A()
            goto L_0x01b2
        L_0x00e8:
            java.lang.String r9 = defpackage.ryg.g0(r15)
            r7.l = r9
            goto L_0x01b2
        L_0x00f0:
            int r9 = r15.w0()
            r7.b = r9
            goto L_0x01b2
        L_0x00f8:
            defpackage.ryg.g0(r15)
            goto L_0x01b2
        L_0x00fd:
            long r9 = defpackage.ryg.d0(r15, r10)
            r7.k = r9
            goto L_0x01b2
        L_0x0105:
            boolean r9 = defpackage.ryg.Y(r15)
            r7.m = r9
            goto L_0x01b2
        L_0x010d:
            java.lang.String r9 = defpackage.ryg.g0(r15)
            r9.getClass()
            int r10 = r9.hashCode()
            switch(r10) {
                case -2043608161: goto L_0x0133;
                case -1839152530: goto L_0x0128;
                case 2337004: goto L_0x011d;
                default: goto L_0x011b;
            }
        L_0x011b:
            r9 = r1
            goto L_0x013d
        L_0x011d:
            java.lang.String r10 = "LIVE"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0126
            goto L_0x011b
        L_0x0126:
            r9 = r3
            goto L_0x013d
        L_0x0128:
            java.lang.String r10 = "STATIC"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0131
            goto L_0x011b
        L_0x0131:
            r9 = r5
            goto L_0x013d
        L_0x0133:
            java.lang.String r10 = "LOTTIE"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x013c
            goto L_0x011b
        L_0x013c:
            r9 = r4
        L_0x013d:
            switch(r9) {
                case 0: goto L_0x0146;
                case 1: goto L_0x0144;
                case 2: goto L_0x0142;
                default: goto L_0x0140;
            }
        L_0x0140:
            r9 = r5
            goto L_0x0147
        L_0x0142:
            r9 = r2
            goto L_0x0147
        L_0x0144:
            r9 = r3
            goto L_0x0147
        L_0x0146:
            r9 = r0
        L_0x0147:
            r7.j = r9
            goto L_0x01b2
        L_0x014b:
            int r9 = defpackage.ryg.X(r15)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r9)
            r11 = r4
        L_0x0155:
            if (r11 >= r9) goto L_0x0160
            java.lang.String r12 = r15.A0()
            r10.add(r12)
            int r11 = r11 + r5
            goto L_0x0155
        L_0x0160:
            r7.i = r10
            goto L_0x01b2
        L_0x0163:
            java.lang.String r9 = r15.A0()
            r7.d = r9
            goto L_0x01b2
        L_0x016a:
            long r9 = r15.x0()
            r7.a = r9
            goto L_0x01b2
        L_0x0171:
            java.lang.String r9 = defpackage.ryg.g0(r15)
            r7.h = r9
            goto L_0x01b2
        L_0x0178:
            long r9 = defpackage.ryg.d0(r15, r10)
            r7.e = r9
            goto L_0x01b2
        L_0x017f:
            java.lang.String r9 = defpackage.ryg.g0(r15)
            r7.g = r9
            goto L_0x01b2
        L_0x0186:
            java.lang.String r9 = defpackage.ryg.g0(r15)
            r7.f = r9
            goto L_0x01b2
        L_0x018d:
            int r9 = r15.w0()
            r7.c = r9
            goto L_0x01b2
        L_0x0194:
            java.lang.String r9 = defpackage.ryg.g0(r15)
            int[] r10 = defpackage.tr1.A(r2)
            int r11 = r10.length
            r12 = r4
        L_0x019e:
            if (r12 >= r11) goto L_0x01af
            r13 = r10[r12]
            java.lang.String r14 = defpackage.rae.g(r13)
            boolean r14 = r14.equals(r9)
            if (r14 == 0) goto L_0x01ad
            goto L_0x01b0
        L_0x01ad:
            int r12 = r12 + r5
            goto L_0x019e
        L_0x01af:
            r13 = r5
        L_0x01b0:
            r7.n = r13
        L_0x01b2:
            int r8 = r8 + r5
            goto L_0x0014
        L_0x01b5:
            java.util.List r15 = r7.i
            if (r15 != 0) goto L_0x01bf
            java.util.List r15 = java.util.Collections.emptyList()
            r7.i = r15
        L_0x01bf:
            int r15 = r7.j
            if (r15 != 0) goto L_0x01c5
            r7.j = r5
        L_0x01c5:
            int r15 = r7.n
            if (r15 != 0) goto L_0x01cb
            r7.n = r5
        L_0x01cb:
            coe r15 = new coe
            r15.<init>(r7)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coe.a(pf9):coe");
    }
}
