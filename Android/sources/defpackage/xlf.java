package defpackage;

import kotlin.Lazy;

/* renamed from: xlf  reason: default package */
public final class xlf {
    public final Lazy a;
    public final Lazy b;
    public final yqf c;
    public final String d = xlf.class.getName();
    public final mrd e;

    public xlf(Lazy lazy, Lazy lazy2, yqf yqf) {
        this.a = lazy;
        this.b = lazy2;
        this.c = yqf;
        int i = mh3.$EnumSwitchMapping$0[yqf.c().ordinal()];
        int i2 = (i == 1 || i == 2) ? 10 : 7;
        int i3 = nrd.a;
        this.e = new mrd(i2, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.xn5 r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.vlf
            if (r0 == 0) goto L_0x0013
            r0 = r13
            vlf r0 = (defpackage.vlf) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            vlf r0 = new vlf
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x005d
            if (r2 == r6) goto L_0x0050
            if (r2 == r5) goto L_0x003d
            if (r2 == r4) goto L_0x0034
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0034:
            java.lang.Object r11 = r0.a
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00e6
        L_0x003d:
            java.lang.Object r11 = r0.b
            ulf r11 = (defpackage.ulf) r11
            java.lang.Object r12 = r0.a
            xlf r12 = (defpackage.xlf) r12
            kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x004a }
            goto L_0x00ca
        L_0x004a:
            r13 = move-exception
            r10 = r13
            r13 = r11
        L_0x004d:
            r11 = r10
            goto L_0x00d2
        L_0x0050:
            java.lang.Object r11 = r0.b
            r12 = r11
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            java.lang.Object r11 = r0.a
            xlf r11 = (defpackage.xlf) r11
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0097
        L_0x005d:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.String r13 = r11.d
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x0067
            goto L_0x0088
        L_0x0067:
            boolean r7 = r2.c()
            if (r7 == 0) goto L_0x0088
            w78 r7 = defpackage.w78.o
            mrd r8 = r11.e
            r8.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = defpackage.mrd.g
            int r8 = r9.get(r8)
            r9 = 0
            int r8 = java.lang.Math.max(r8, r9)
            java.lang.String r9 = "execute: trying acquire connection, current permits="
            java.lang.String r8 = defpackage.wj6.h(r8, r9)
            r2.d(r7, r13, r8, r3)
        L_0x0088:
            mrd r13 = r11.e
            r0.a = r11
            r0.b = r12
            r0.v = r6
            java.lang.Object r13 = r13.a(r0)
            if (r13 != r1) goto L_0x0097
            return r1
        L_0x0097:
            ulf r13 = new ulf
            kotlin.Lazy r2 = r11.a
            kotlin.Lazy r7 = r11.b
            yqf r8 = r11.c
            mi3 r8 = r8.c()
            int[] r9 = defpackage.mh3.$EnumSwitchMapping$0
            int r8 = r8.ordinal()
            r8 = r9[r8]
            if (r8 == r6) goto L_0x00b7
            if (r8 == r5) goto L_0x00b7
            if (r8 == r4) goto L_0x00b4
            r6 = 4096(0x1000, float:5.74E-42)
            goto L_0x00ba
        L_0x00b4:
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00ba
        L_0x00b7:
            r6 = 32768(0x8000, float:4.5918E-41)
        L_0x00ba:
            r13.<init>(r2, r7, r6)
            r0.a = r11     // Catch:{ all -> 0x00cd }
            r0.b = r13     // Catch:{ all -> 0x00cd }
            r0.v = r5     // Catch:{ all -> 0x00cd }
            java.lang.Object r11 = r12.invoke(r13, r0)     // Catch:{ all -> 0x00cd }
            if (r11 != r1) goto L_0x00ca
            return r1
        L_0x00ca:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x00cd:
            r12 = move-exception
            r10 = r12
            r12 = r11
            goto L_0x004d
        L_0x00d2:
            java.lang.String r12 = r12.d
            java.lang.String r2 = "Got error during acquiring connection"
            defpackage.z68.f(r12, r2, r11)
            r0.a = r11
            r0.b = r3
            r0.v = r4
            java.lang.Object r12 = r13.a(r0)
            if (r12 != r1) goto L_0x00e6
            return r1
        L_0x00e6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xlf.a(xn5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.ulf r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wlf
            if (r0 == 0) goto L_0x0013
            r0 = r6
            wlf r0 = (defpackage.wlf) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            wlf r0 = new wlf
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            xlf r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0041
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.a = r4
            r0.o = r3
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            mrd r4 = r4.e
            r4.c()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xlf.b(ulf, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
