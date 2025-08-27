package defpackage;

/* renamed from: mq6  reason: default package */
public final class mq6 {
    public static final /* synthetic */ int f = 0;
    public final rl a;
    public final sv0 b;
    public final r62 c;
    public final sa3 d = kne.b();
    public final lq6 e = new lq6(this);

    public mq6(rl rlVar, sv0 sv0, r62 r62) {
        this.a = rlVar;
        this.b = sv0;
        this.c = r62;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r9, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.kq6
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kq6 r0 = (defpackage.kq6) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            kq6 r0 = new kq6
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 0
            r4 = 1
            java.lang.String r5 = "mq6"
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            long r9 = r0.b
            mq6 r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ all -> 0x0031 }
            goto L_0x00ad
        L_0x0031:
            r9 = move-exception
            goto L_0x00cf
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r12)
            r6 = 0
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x005e
            java.lang.Class<mq6> r8 = defpackage.mq6.class
            java.lang.String r8 = r8.getName()
            a67 r9 = defpackage.z68.b
            if (r9 != 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x005d
            w78 r10 = defpackage.w78.w
            java.lang.String r11 = "invalid server chat id #0!"
            r9.d(r10, r8, r11, r3)
        L_0x005d:
            return r3
        L_0x005e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r2 = "execute: "
            r12.<init>(r2)
            r12.append(r9)
            java.lang.String r2 = ", force: "
            r12.append(r2)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            defpackage.z68.c(r5, r12, new java.lang.Object[0])
            r62 r12 = r8.c
            a32 r12 = r12.D(r9)
            if (r12 == 0) goto L_0x0087
            if (r11 != 0) goto L_0x0087
            java.lang.String r8 = "execute: chat contains!"
            defpackage.z68.c(r5, r8, new java.lang.Object[0])
            return r12
        L_0x0087:
            lq6 r11 = r8.e
            r11.a = r9
            sv0 r11 = r8.b
            lq6 r12 = r8.e
            r11.d(r12)
            lq6 r11 = r8.e
            rl r12 = r8.a
            jna r12 = (defpackage.jna) r12
            long r6 = r12.l(r9)
            r11.b = r6
            sa3 r11 = r8.d     // Catch:{ all -> 0x0031 }
            r0.a = r8     // Catch:{ all -> 0x0031 }
            r0.b = r9     // Catch:{ all -> 0x0031 }
            r0.v = r4     // Catch:{ all -> 0x0031 }
            java.lang.Object r12 = r11.a(r0)     // Catch:{ all -> 0x0031 }
            if (r12 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            a32 r12 = (defpackage.a32) r12     // Catch:{ all -> 0x0031 }
            sv0 r11 = r8.b
            lq6 r8 = r8.e
            r11.f(r8)
            java.lang.String r8 = "get chat info"
            defpackage.z68.c(r5, r8, new java.lang.Object[0])
            if (r12 != 0) goto L_0x00ce
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r9)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r4)
            java.lang.String r9 = "chat info is null %d"
            defpackage.z68.n(r5, r3, r9, r8)
        L_0x00ce:
            return r12
        L_0x00cf:
            sv0 r10 = r8.b
            lq6 r8 = r8.e
            r10.f(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq6.a(long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
