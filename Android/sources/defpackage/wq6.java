package defpackage;

/* renamed from: wq6  reason: default package */
public final class wq6 {
    public final rl a;
    public final sv0 b;
    public final ic1 c;
    public final xme d = f6e.a((Object) null);
    public Long e;

    public wq6(rl rlVar, sv0 sv0, ic1 ic1) {
        this.a = rlVar;
        this.b = sv0;
        this.c = ic1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 2
            boolean r2 = r9 instanceof defpackage.vq6
            if (r2 == 0) goto L_0x0015
            r2 = r9
            vq6 r2 = (defpackage.vq6) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0015
            int r3 = r3 - r4
            r2.v = r3
            goto L_0x001a
        L_0x0015:
            vq6 r2 = new vq6
            r2.<init>(r7, r9)
        L_0x001a:
            java.lang.Object r9 = r2.c
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.v
            r5 = 0
            if (r4 == 0) goto L_0x0045
            if (r4 == r0) goto L_0x003b
            if (r4 != r1) goto L_0x0033
            wq6 r7 = r2.a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x0030 }
            goto L_0x00c5
        L_0x0030:
            r8 = move-exception
            goto L_0x00de
        L_0x0033:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003b:
            java.lang.String r8 = r2.b
            wq6 r7 = r2.a
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x0043 }
            goto L_0x0077
        L_0x0043:
            r9 = move-exception
            goto L_0x007e
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch:{ all -> 0x0043 }
            ic1 r9 = r7.c     // Catch:{ all -> 0x0043 }
            j6d r9 = r9.a     // Catch:{ all -> 0x0043 }
            mka r9 = r9.n()     // Catch:{ all -> 0x0043 }
            p9a r4 = defpackage.p9a.c     // Catch:{ all -> 0x0043 }
            wbe r9 = r9.i(r4)     // Catch:{ all -> 0x0043 }
            hc1 r4 = new hc1     // Catch:{ all -> 0x0043 }
            r6 = 0
            r4.<init>(r8, r6)     // Catch:{ all -> 0x0043 }
            wh8 r6 = new wh8     // Catch:{ all -> 0x0043 }
            r6.<init>(r1, r9, r4)     // Catch:{ all -> 0x0043 }
            s9a r9 = defpackage.s9a.c     // Catch:{ all -> 0x0043 }
            ai8 r4 = new ai8     // Catch:{ all -> 0x0043 }
            r4.<init>(r6, r9, r0)     // Catch:{ all -> 0x0043 }
            r2.a = r7     // Catch:{ all -> 0x0043 }
            r2.b = r8     // Catch:{ all -> 0x0043 }
            r2.v = r0     // Catch:{ all -> 0x0043 }
            java.lang.Object r9 = defpackage.bs0.h(r4, r2)     // Catch:{ all -> 0x0043 }
            if (r9 != r3) goto L_0x0077
            return r3
        L_0x0077:
            gb1 r9 = (defpackage.gb1) r9     // Catch:{ all -> 0x0043 }
            java.lang.Object r9 = kotlin.Result.m23constructorimpl(r9)     // Catch:{ all -> 0x0043 }
            goto L_0x0088
        L_0x007e:
            kotlin.Result$Companion r4 = kotlin.Result.Companion
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)
            java.lang.Object r9 = kotlin.Result.m23constructorimpl(r9)
        L_0x0088:
            boolean r4 = kotlin.Result.m29isFailureimpl(r9)
            if (r4 == 0) goto L_0x008f
            r9 = r5
        L_0x008f:
            gb1 r9 = (defpackage.gb1) r9
            if (r9 == 0) goto L_0x009c
            java.util.Locale r7 = java.util.Locale.ENGLISH
            long r8 = r9.c
            java.lang.String r7 = defpackage.j4b.w(r7, r8)
            return r7
        L_0x009c:
            sv0 r9 = r7.b
            r9.d(r7)
            rl r9 = r7.a
            jna r9 = (defpackage.jna) r9
            long r8 = r9.F(r8, r0)
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
            r7.e = r8
            xme r8 = r7.d     // Catch:{ all -> 0x0030 }
            on2 r9 = new on2     // Catch:{ all -> 0x0030 }
            r0 = 28
            r9.<init>(r8, r0)     // Catch:{ all -> 0x0030 }
            r2.a = r7     // Catch:{ all -> 0x0030 }
            r2.b = r5     // Catch:{ all -> 0x0030 }
            r2.v = r1     // Catch:{ all -> 0x0030 }
            java.lang.Object r9 = defpackage.bs0.z(r9, r2)     // Catch:{ all -> 0x0030 }
            if (r9 != r3) goto L_0x00c5
            return r3
        L_0x00c5:
            nw7 r9 = (defpackage.nw7) r9     // Catch:{ all -> 0x0030 }
            d4g r8 = r9.w     // Catch:{ all -> 0x0030 }
            long r8 = r8.w     // Catch:{ all -> 0x0030 }
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0030 }
            java.lang.String r8 = defpackage.j4b.w(r0, r8)     // Catch:{ all -> 0x0030 }
            sv0 r9 = r7.b
            r9.f(r7)
            xme r9 = r7.d
            r9.setValue(r5)
            r7.e = r5
            return r8
        L_0x00de:
            java.lang.String r9 = "wq6"
            java.lang.String r0 = "error while get link info"
            defpackage.z68.f(r9, r0, r8)     // Catch:{ all -> 0x00f2 }
            sv0 r8 = r7.b
            r8.f(r7)
            xme r8 = r7.d
            r8.setValue(r5)
            r7.e = r5
            return r5
        L_0x00f2:
            r8 = move-exception
            sv0 r9 = r7.b
            r9.f(r7)
            xme r9 = r7.d
            r9.setValue(r5)
            r7.e = r5
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wq6.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @oye
    public final void onEvent(nw7 nw7) {
        z68.c("wq6", "onEvent: " + nw7, new Object[0]);
        long j = nw7.a;
        Long l = this.e;
        if (l != null && j == l.longValue()) {
            xme xme = this.d;
            xme.getClass();
            xme.m((Object) null, nw7);
        }
    }
}
