package defpackage;

import java.util.List;

/* renamed from: ei3  reason: default package */
public final class ei3 {
    public int a;
    public boolean b;
    public boolean c;
    public final List d;

    public ei3(List list) {
        this.d = list;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.di3 a(javax.net.ssl.SSLSocket r12) {
        /*
            r11 = this;
            r0 = 1
            int r1 = r11.a
            java.util.List r2 = r11.d
            int r3 = r2.size()
        L_0x0009:
            if (r1 >= r3) goto L_0x001d
            java.lang.Object r4 = r2.get(r1)
            di3 r4 = (defpackage.di3) r4
            boolean r5 = r4.b(r12)
            if (r5 == 0) goto L_0x001b
            int r1 = r1 + r0
            r11.a = r1
            goto L_0x001e
        L_0x001b:
            int r1 = r1 + r0
            goto L_0x0009
        L_0x001d:
            r4 = 0
        L_0x001e:
            if (r4 == 0) goto L_0x00c9
            int r1 = r11.a
            int r3 = r2.size()
        L_0x0026:
            r5 = 0
            if (r1 >= r3) goto L_0x0039
            java.lang.Object r6 = r2.get(r1)
            di3 r6 = (defpackage.di3) r6
            boolean r6 = r6.b(r12)
            if (r6 == 0) goto L_0x0037
            r1 = r0
            goto L_0x003a
        L_0x0037:
            int r1 = r1 + r0
            goto L_0x0026
        L_0x0039:
            r1 = r5
        L_0x003a:
            r11.b = r1
            boolean r11 = r11.c
            java.lang.String[] r1 = r4.c
            if (r1 == 0) goto L_0x004d
            java.lang.String[] r2 = r12.getEnabledCipherSuites()
            cx4 r3 = defpackage.x03.b
            java.lang.String[] r1 = defpackage.u0g.o(r2, r1, r3)
            goto L_0x0051
        L_0x004d:
            java.lang.String[] r1 = r12.getEnabledCipherSuites()
        L_0x0051:
            java.lang.String[] r2 = r4.d
            if (r2 == 0) goto L_0x0062
            java.lang.String[] r3 = r12.getEnabledProtocols()
            java.util.Comparator r6 = kotlin.comparisons.ComparisonsKt.naturalOrder()
            java.lang.String[] r2 = defpackage.u0g.o(r3, r2, r6)
            goto L_0x0066
        L_0x0062:
            java.lang.String[] r2 = r12.getEnabledProtocols()
        L_0x0066:
            java.lang.String[] r3 = r12.getSupportedCipherSuites()
            cx4 r6 = defpackage.x03.b
            byte[] r7 = defpackage.u0g.a
            int r7 = r3.length
        L_0x006f:
            r8 = -1
            if (r5 >= r7) goto L_0x007f
            r9 = r3[r5]
            java.lang.String r10 = "TLS_FALLBACK_SCSV"
            int r9 = r6.compare(r9, r10)
            if (r9 != 0) goto L_0x007d
            goto L_0x0080
        L_0x007d:
            int r5 = r5 + r0
            goto L_0x006f
        L_0x007f:
            r5 = r8
        L_0x0080:
            if (r11 == 0) goto L_0x0095
            if (r5 == r8) goto L_0x0095
            r11 = r3[r5]
            int r3 = r1.length
            int r3 = r3 + r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)
            r1 = r0
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r0 = kotlin.collections.ArraysKt.getLastIndex((T[]) r1)
            r1[r0] = r11
        L_0x0095:
            ci3 r11 = new ci3
            r11.<init>((defpackage.di3) r4)
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r11.c(r0)
            int r0 = r2.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r11.f(r0)
            di3 r11 = r11.a()
            java.util.List r0 = r11.c()
            if (r0 == 0) goto L_0x00bd
            java.lang.String[] r0 = r11.d
            r12.setEnabledProtocols(r0)
        L_0x00bd:
            java.util.List r0 = r11.a()
            if (r0 == 0) goto L_0x00c8
            java.lang.String[] r11 = r11.c
            r12.setEnabledCipherSuites(r11)
        L_0x00c8:
            return r4
        L_0x00c9:
            java.net.UnknownServiceException r0 = new java.net.UnknownServiceException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to find acceptable protocols. isFallback="
            r1.<init>(r3)
            boolean r11 = r11.c
            r1.append(r11)
            java.lang.String r11 = ", modes="
            r1.append(r11)
            r1.append(r2)
            java.lang.String r11 = ", supported protocols="
            r1.append(r11)
            java.lang.String[] r11 = r12.getEnabledProtocols()
            java.lang.String r11 = java.util.Arrays.toString(r11)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei3.a(javax.net.ssl.SSLSocket):di3");
    }
}
