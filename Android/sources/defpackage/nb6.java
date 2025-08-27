package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: nb6  reason: default package */
public final class nb6 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public nb6(Lazy lazy, Lazy lazy2) {
        ia6 ia6 = ia6.a;
        Lazy h = ia6.getAccessor().h(eu3.class);
        Lazy lazy3 = LazyKt.lazy(new a46(9));
        Lazy h2 = ia6.getAccessor().h(qx2.class);
        this.a = lazy;
        this.b = lazy2;
        this.c = h;
        this.d = h2;
        this.e = lazy3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0130 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.ha9 r19, java.lang.Long r20, kotlin.coroutines.Continuation r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = r3 instanceof defpackage.mb6
            if (r4 == 0) goto L_0x001c
            r4 = r3
            mb6 r4 = (defpackage.mb6) r4
            int r5 = r4.w
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.w = r5
        L_0x001a:
            r10 = r4
            goto L_0x0022
        L_0x001c:
            mb6 r4 = new mb6
            r4.<init>(r0, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r10.o
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r10.w
            java.lang.String r6 = ""
            r7 = 2
            r8 = 1
            r12 = 0
            if (r5 == 0) goto L_0x0059
            if (r5 == r8) goto L_0x0047
            if (r5 != r7) goto L_0x003f
            java.lang.Object r0 = r10.a
            ngf r0 = (defpackage.ngf) r0
            kotlin.ResultKt.throwOnFailure(r3)
            r6 = r0
            goto L_0x0132
        L_0x003f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0047:
            java.lang.Long r0 = r10.c
            ha9 r1 = r10.b
            java.lang.Object r2 = r10.a
            nb6 r2 = (defpackage.nb6) r2
            kotlin.ResultKt.throwOnFailure(r3)
            r17 = r2
            r2 = r0
            r0 = r17
            goto L_0x00de
        L_0x0059:
            kotlin.ResultKt.throwOnFailure(r3)
            long r13 = r1.w
            kotlin.Lazy r3 = r0.a
            java.lang.Object r3 = r3.getValue()
            x23 r3 = (defpackage.x23) r3
            qjd r3 = (defpackage.qjd) r3
            long r15 = r3.s()
            int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r3 != 0) goto L_0x007c
            int r3 = defpackage.jra.U
            igf r5 = new igf
            r5.<init>(r3)
        L_0x0077:
            r6 = r1
            r8 = r2
            r1 = r5
            goto L_0x00fc
        L_0x007c:
            if (r2 == 0) goto L_0x0086
            int r3 = defpackage.jra.X
            igf r5 = new igf
            r5.<init>(r3)
            goto L_0x0077
        L_0x0086:
            r3 = 4
            int r5 = r1.T0
            if (r5 != r3) goto L_0x00c5
            kotlin.Lazy r3 = r0.d
            java.lang.Object r3 = r3.getValue()
            qx2 r3 = (defpackage.qx2) r3
            long r8 = r1.z
            my2 r3 = (defpackage.my2) r3
            etc r3 = r3.o(r8)
            ome r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            a32 r3 = (defpackage.a32) r3
            int r5 = defpackage.jra.V
            if (r3 == 0) goto L_0x00ac
            java.lang.String r3 = r3.r()
            goto L_0x00ad
        L_0x00ac:
            r3 = r12
        L_0x00ad:
            if (r3 != 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r6 = r3
        L_0x00b1:
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            kgf r6 = new kgf
            java.util.List r3 = kotlin.collections.ArraysKt.toList((T[]) r3)
            r6.<init>(r5, r3)
        L_0x00be:
            r8 = r2
            r17 = r6
            r6 = r1
            r1 = r17
            goto L_0x00fc
        L_0x00c5:
            kotlin.Lazy r3 = r0.c
            java.lang.Object r3 = r3.getValue()
            eu3 r3 = (defpackage.eu3) r3
            r10.a = r0
            r10.b = r1
            r10.c = r2
            r10.w = r8
            long r8 = r1.w
            java.lang.Object r3 = r3.b(r8, r10)
            if (r3 != r4) goto L_0x00de
            return r4
        L_0x00de:
            vk3 r3 = (defpackage.vk3) r3
            int r5 = defpackage.jra.V
            if (r3 == 0) goto L_0x00e9
            java.lang.String r3 = r3.f()
            goto L_0x00ea
        L_0x00e9:
            r3 = r12
        L_0x00ea:
            if (r3 != 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r6 = r3
        L_0x00ee:
            java.lang.Object[] r3 = new java.lang.Object[]{r6}
            kgf r6 = new kgf
            java.util.List r3 = kotlin.collections.ArraysKt.toList((T[]) r3)
            r6.<init>(r5, r3)
            goto L_0x00be
        L_0x00fc:
            kotlin.Lazy r0 = r0.e
            java.lang.Object r0 = r0.getValue()
            r5 = r0
            oz r5 = (defpackage.oz) r5
            ogf r0 = defpackage.puf.l
            r0.getClass()
            uy4 r2 = defpackage.uy4.b
            long r2 = r0.g(r2)
            float r0 = defpackage.so4.e(r2)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r9 = (int) r0
            r10.a = r1
            r10.b = r12
            r10.c = r12
            r10.w = r7
            r7 = 0
            r11 = 2
            java.lang.Object r3 = defpackage.oz.b(r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r4) goto L_0x0131
            return r4
        L_0x0131:
            r6 = r1
        L_0x0132:
            jz r3 = (defpackage.jz) r3
            java.lang.CharSequence r0 = r3.a
            if (r0 == 0) goto L_0x013d
            mgf r12 = new mgf
            r12.<init>(r0)
        L_0x013d:
            r7 = r12
            ua6 r0 = new ua6
            java.lang.Integer r9 = r3.d
            java.lang.Integer r10 = r3.c
            java.lang.String r8 = r3.b
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb6.a(ha9, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
