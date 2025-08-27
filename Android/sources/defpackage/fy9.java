package defpackage;

/* renamed from: fy9  reason: default package */
public final class fy9 extends fj0 {
    public final long c;
    public final String o;
    public final /* synthetic */ xy9 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fy9(xy9 xy9, long j, String str, String str2) {
        super(xy9, j, str2);
        this.v = xy9;
        this.c = j;
        this.o = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.ey9
            if (r0 == 0) goto L_0x0013
            r0 = r12
            ey9 r0 = (defpackage.ey9) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            ey9 r0 = new ey9
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0042
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            fy9 r11 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0098
        L_0x002f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0037:
            ha9 r11 = r0.b
            fy9 r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            r10 = r2
            r2 = r11
            r11 = r10
            goto L_0x006f
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r12)
            xy9 r12 = r11.v
            fa9 r2 = r12.e
            long r6 = r11.c
            ha9 r2 = r2.r(r6)
            if (r2 != 0) goto L_0x0052
            return r5
        L_0x0052:
            kotlin.Lazy r12 = r12.l
            java.lang.Object r12 = r12.getValue()
            qx2 r12 = (defpackage.qx2) r12
            long r6 = r2.z
            my2 r12 = (defpackage.my2) r12
            etc r12 = r12.o(r6)
            r0.a = r11
            r0.b = r2
            r0.v = r4
            java.lang.Object r12 = defpackage.bs0.z(r12, r0)
            if (r12 != r1) goto L_0x006f
            return r1
        L_0x006f:
            a32 r12 = (defpackage.a32) r12
            if (r12 == 0) goto L_0x00dd
            m72 r12 = r12.b
            long r6 = r12.a
            xy9 r12 = r11.v
            kotlin.Lazy r12 = r12.k
            java.lang.Object r12 = r12.getValue()
            awa r12 = (defpackage.awa) r12
            long r8 = r2.c
            java.lang.Long r2 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            r0.a = r11
            r0.b = r5
            r0.v = r3
            java.lang.Object r12 = r12.a(r6, r2, r0)
            if (r12 != r1) goto L_0x0098
            return r1
        L_0x0098:
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = kotlin.collections.CollectionsKt.firstOrNull(r12)
            b89 r12 = (defpackage.b89) r12
            if (r12 != 0) goto L_0x00a3
            return r5
        L_0x00a3:
            a00 r12 = r12.y
            java.util.Iterator r12 = r12.iterator()
        L_0x00a9:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r12.next()
            r1 = r0
            gz r1 = (defpackage.gz) r1
            boolean r1 = r1 instanceof defpackage.v20
            if (r1 == 0) goto L_0x00a9
            goto L_0x00bc
        L_0x00bb:
            r0 = r5
        L_0x00bc:
            boolean r12 = r0 instanceof defpackage.v20
            if (r12 == 0) goto L_0x00c3
            v20 r0 = (defpackage.v20) r0
            goto L_0x00c4
        L_0x00c3:
            r0 = r5
        L_0x00c4:
            if (r0 == 0) goto L_0x00dd
            java.lang.String r12 = r0.v
            if (r12 != 0) goto L_0x00cb
            goto L_0x00dd
        L_0x00cb:
            xy9 r0 = r11.v
            fa9 r0 = r0.e
            a62 r1 = new a62
            r2 = 5
            r1.<init>(r12, r2)
            long r2 = r11.c
            java.lang.String r11 = r11.o
            r0.x(r2, r11, r1)
            return r12
        L_0x00dd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy9.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
