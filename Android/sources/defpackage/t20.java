package defpackage;

import java.util.List;

/* renamed from: t20  reason: default package */
public final class t20 {
    public static final /* synthetic */ int d = 0;
    public final hs7 a;
    public final sv0 b;
    public final hs7 c;

    public t20(hs7 hs7, sv0 sv0, hs7 hs72) {
        this.a = hs7;
        this.b = sv0;
        this.c = hs72;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.w28 r8) {
        /*
            r0 = 1
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.Object r8 = r8.b
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x000c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0073
            java.lang.Object r1 = r8.next()
            l20 r1 = (defpackage.l20) r1
            g20 r2 = r1.a
            g20 r3 = defpackage.g20.c
            if (r2 != r3) goto L_0x002b
            x10 r2 = r1.b
            if (r2 == 0) goto L_0x002b
            java.lang.String r2 = r2.x
            boolean r2 = defpackage.cvg.A(r2)
            if (r2 == 0) goto L_0x002b
            goto L_0x0071
        L_0x002b:
            g20 r2 = defpackage.g20.o
            r3 = 0
            g20 r5 = r1.a
            if (r5 != r2) goto L_0x003e
            k20 r2 = r1.d
            if (r2 == 0) goto L_0x003e
            long r6 = r2.a
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x003e
            goto L_0x0071
        L_0x003e:
            g20 r2 = defpackage.g20.v
            if (r5 != r2) goto L_0x004d
            i10 r2 = r1.e
            if (r2 == 0) goto L_0x004d
            long r6 = r2.a
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x004d
            goto L_0x0071
        L_0x004d:
            g20 r2 = defpackage.g20.X
            if (r5 != r2) goto L_0x005c
            s10 r2 = r1.j
            if (r2 == 0) goto L_0x005c
            long r6 = r2.a
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x005c
            goto L_0x0071
        L_0x005c:
            g20 r2 = defpackage.g20.w
            if (r5 != r2) goto L_0x006b
            f20 r2 = r1.f
            if (r2 == 0) goto L_0x006b
            long r5 = r2.a
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            z10 r2 = defpackage.z10.b
            z10 r1 = r1.w
            if (r1 != r2) goto L_0x000c
        L_0x0071:
            r8 = 0
            return r8
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t20.a(w28):boolean");
    }

    public static boolean b(ha9 ha9) {
        if (!ha9.q() && ha9.o()) {
            return a(ha9.x0);
        }
        return true;
    }

    public final void c(ha9 ha9) {
        if (ha9.o()) {
            for (l20 l20 : (List) ha9.x0.b) {
                d(ha9.b, l20.q, z10.b);
            }
        }
    }

    public final void d(long j, String str, z10 z10) {
        ((fa9) this.a.get()).x(j, str, new d9d(9, z10));
    }
}
