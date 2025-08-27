package defpackage;

import java.util.List;

/* renamed from: ire  reason: default package */
public final /* synthetic */ class ire implements zi6, qk3 {
    public final /* synthetic */ mre a;
    public final /* synthetic */ kre b;

    public /* synthetic */ ire(mre mre, kre kre) {
        this.a = mre;
        this.b = kre;
    }

    public void accept(Object obj) {
        List list = (List) obj;
        mre mre = this.a;
        mre.getClass();
        z68.c("mre", "onStickersSetsLoaded: sets count=%d", Integer.valueOf(list.size()));
        mre.i.set(new fbf(12, list, (String) this.b.c));
        for (a2a a2a : mre.b) {
            a2a.getClass();
            a2a.V(new y1a(a2a, list, 0));
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [nqe, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.concurrent.CountDownLatch, tp0, cla] */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r8v20, types: [android.text.SpannableString, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r9) {
        /*
            r8 = this;
            bqe r9 = (defpackage.bqe) r9
            mre r0 = r8.a
            r0.getClass()
            nqe r1 = new nqe
            r1.<init>()
            long r2 = r9.a
            r1.a = r2
            java.util.List r2 = r9.h
            r1.f = r2
            kre r8 = r8.b
            java.lang.Object r8 = r8.c
            java.lang.String r8 = (java.lang.String) r8
            obf r2 = r0.g
            r2.getClass()
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            r4 = 1
            java.lang.String r5 = r9.b
            if (r3 != 0) goto L_0x004e
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L_0x002f
            goto L_0x004e
        L_0x002f:
            cpa r3 = r2.b
            int r3 = r3.a(r4)
            nbf r6 = new nbf
            r6.<init>(r5, r8)
            java.util.HashMap r2 = r2.a
            java.lang.Object r7 = r2.get(r6)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 != 0) goto L_0x004d
            android.text.SpannableString r8 = defpackage.i8b.C(r3, r5, r8)
            r2.put(r6, r8)
            r5 = r8
            goto L_0x004e
        L_0x004d:
            r5 = r7
        L_0x004e:
            r1.c = r5
            long r2 = r9.d
            r5 = 0
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x0089
            ir3 r8 = r0.d
            km3 r5 = r8.a
            r5.getClass()
            rj0 r6 = new rj0
            r6.<init>(r5, r2)
            mka r5 = new mka
            r7 = 1
            r5.<init>(r7, r6)
            lfd r6 = defpackage.xfd.b()
            fce r5 = r5.n(r6)
            dr1 r6 = new dr1
            r7 = 3
            r6.<init>((java.lang.Object) r8, (long) r2, (int) r7)
            wbe r8 = new wbe
            r2 = 2
            r8.<init>(r5, r6, r2)
            java.lang.Object r8 = r8.f()
            vk3 r8 = (defpackage.vk3) r8
            java.lang.String r8 = r8.f()
            goto L_0x008a
        L_0x0089:
            r8 = 0
        L_0x008a:
            r1.e = r8
            ai5 r8 = r0.c
            long r2 = r9.a
            yia r8 = r8.d(r2)
            tp0 r0 = new tp0
            r0.<init>(r4)
            r8.a(r0)
            java.lang.Object r8 = r0.a()
            if (r8 == 0) goto L_0x00b4
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r1.b = r8
            java.lang.String r8 = r9.c
            r1.d = r8
            oqe r8 = new oqe
            r8.<init>(r1)
            return r8
        L_0x00b4:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ire.apply(java.lang.Object):java.lang.Object");
    }
}
