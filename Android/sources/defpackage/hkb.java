package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: hkb  reason: default package */
public final class hkb {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public hkb() {
        cs2 cs2 = cs2.a;
        Lazy h = cs2.getAccessor().h(x23.class);
        Lazy h2 = cs2.getAccessor().h(eu3.class);
        Lazy h3 = cs2.getAccessor().h(gaf.class);
        Lazy h4 = cs2.getAccessor().h(ou8.class);
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new lgb(11));
        this.a = h2;
        this.b = h3;
        this.c = h4;
        this.d = h;
        this.e = lazy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.ha9 r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.gkb
            if (r0 == 0) goto L_0x0014
            r0 = r13
            gkb r0 = (defpackage.gkb) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.v = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            gkb r0 = new gkb
            r0.<init>(r11, r13)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r13 = r6.c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.v
            r2 = 2
            r3 = 1
            r8 = 0
            if (r1 == 0) goto L_0x0047
            if (r1 == r3) goto L_0x003d
            if (r1 != r2) goto L_0x0035
            java.lang.Object r11 = r6.a
            ngf r11 = (defpackage.ngf) r11
            kotlin.ResultKt.throwOnFailure(r13)
        L_0x0032:
            r2 = r11
            goto L_0x00bc
        L_0x0035:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x003d:
            ha9 r12 = r6.b
            java.lang.Object r11 = r6.a
            hkb r11 = (defpackage.hkb) r11
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0080
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r13)
            long r4 = r12.w
            kotlin.Lazy r13 = r11.d
            java.lang.Object r13 = r13.getValue()
            x23 r13 = (defpackage.x23) r13
            qjd r13 = (defpackage.qjd) r13
            long r9 = r13.s()
            int r13 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x0069
            int r13 = defpackage.jra.U
            igf r1 = new igf
            r1.<init>(r13)
            r13 = r12
            r12 = r11
            r11 = r1
            goto L_0x00a0
        L_0x0069:
            kotlin.Lazy r13 = r11.a
            java.lang.Object r13 = r13.getValue()
            eu3 r13 = (defpackage.eu3) r13
            r6.a = r11
            r6.b = r12
            r6.v = r3
            long r3 = r12.w
            java.lang.Object r13 = r13.b(r3, r6)
            if (r13 != r0) goto L_0x0080
            return r0
        L_0x0080:
            vk3 r13 = (defpackage.vk3) r13
            int r1 = defpackage.jra.V
            if (r13 == 0) goto L_0x008b
            java.lang.String r13 = r13.f()
            goto L_0x008c
        L_0x008b:
            r13 = r8
        L_0x008c:
            if (r13 != 0) goto L_0x0090
            java.lang.String r13 = ""
        L_0x0090:
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            kgf r3 = new kgf
            java.util.List r13 = kotlin.collections.ArraysKt.toList((T[]) r13)
            r3.<init>(r1, r13)
            r13 = r12
            r12 = r11
            r11 = r3
        L_0x00a0:
            kotlin.Lazy r12 = r12.e
            java.lang.Object r12 = r12.getValue()
            r1 = r12
            oz r1 = (defpackage.oz) r1
            r6.a = r11
            r6.b = r8
            r6.v = r2
            r5 = 0
            r7 = 14
            r3 = 0
            r4 = 0
            r2 = r13
            java.lang.Object r13 = defpackage.oz.b(r1, r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L_0x0032
            return r0
        L_0x00bc:
            jz r13 = (defpackage.jz) r13
            java.lang.CharSequence r11 = r13.a
            if (r11 == 0) goto L_0x00c7
            mgf r8 = new mgf
            r8.<init>(r11)
        L_0x00c7:
            r3 = r8
            rhb r11 = new rhb
            java.lang.Integer r5 = r13.d
            java.lang.Integer r6 = r13.c
            java.lang.String r4 = r13.b
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkb.a(ha9, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
