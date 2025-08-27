package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: xq1  reason: default package */
public final class xq1 implements uq1 {
    public static final /* synthetic */ KProperty[] f = {rae.s(xq1.class, "tokenRefreshJob", "getTokenRefreshJob()Lkotlinx/coroutines/Job;", 0)};
    public final cp1 a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final wie e = o5a.U();

    public xq1(cp1 cp1, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = cp1;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(kotlin.coroutines.Continuation r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.vq1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            vq1 r0 = (defpackage.vq1) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            vq1 r0 = new vq1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            java.lang.String r3 = "app.calls.update_time"
            r4 = 1
            java.lang.String r5 = "CallsCredRepositoryTag"
            if (r2 == 0) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            xq1 r10 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00c6
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r11)
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            boolean r11 = r11.isCurrentThread()
            if (r11 == 0) goto L_0x005a
            kotlin.Lazy r11 = r10.d
            java.lang.Object r11 = r11.getValue()
            vpa r11 = (defpackage.vpa) r11
            r11.getClass()
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r2 = "Call token was called from the main thread."
            r11.<init>(r2)
            defpackage.z68.o(r5, r2, r11)
        L_0x005a:
            kotlin.Lazy r11 = r10.b
            java.lang.Object r2 = r11.getValue()
            x23 r2 = (defpackage.x23) r2
            qjd r2 = (defpackage.qjd) r2
            long r6 = r2.m()
            java.lang.Object r11 = r11.getValue()
            x23 r11 = (defpackage.x23) r11
            qjd r11 = (defpackage.qjd) r11
            ls7 r11 = r11.g
            r8 = 0
            long r8 = r11.getLong(r3, r8)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x00fe
            kotlin.Lazy r11 = r10.c
            java.lang.Object r11 = r11.getValue()
            oqa r11 = (defpackage.oqa) r11
            r0.a = r10
            r0.o = r4
            kotlin.Lazy r2 = r11.a
            java.lang.Object r2 = r2.getValue()
            ocf r2 = (defpackage.ocf) r2
            yt r4 = new yt
            kotlin.Lazy r6 = r11.c
            java.lang.Object r6 = r6.getValue()
            doa r6 = (defpackage.doa) r6
            java.lang.String r6 = r6.g()
            if (r6 == 0) goto L_0x00f2
            kotlin.Lazy r11 = r11.b
            java.lang.Object r11 = r11.getValue()
            x23 r11 = (defpackage.x23) r11
            qjd r11 = (defpackage.qjd) r11
            long r7 = r11.s()
            x3b r11 = defpackage.x3b.CALLS_TOKEN
            r9 = 11
            r4.<init>((defpackage.x3b) r11, (int) r9)
            java.lang.String r11 = "value"
            r4.t(r11, r6)
            java.lang.String r11 = "userId"
            r4.p(r7, r11)
            java.lang.Object r11 = r2.e(r4, r0)
            if (r11 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            ml1 r11 = (defpackage.ml1) r11
            kotlin.Lazy r0 = r10.b
            java.lang.Object r0 = r0.getValue()
            x23 r0 = (defpackage.x23) r0
            java.lang.String r1 = r11.c
            qjd r0 = (defpackage.qjd) r0
            java.lang.String r2 = "user.callsToken"
            r0.l(r2, r1)
            kotlin.Lazy r10 = r10.b
            java.lang.Object r10 = r10.getValue()
            x23 r10 = (defpackage.x23) r10
            qjd r10 = (defpackage.qjd) r10
            long r0 = r11.v
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            r10.k(r3, r11)
            java.lang.String r10 = "Calls token updated."
            defpackage.z68.c(r5, r10, new java.lang.Object[0])
            goto L_0x0114
        L_0x00f2:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Required value was null."
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x00fe:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Calls token will be expired in "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r11 = "."
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            defpackage.z68.c(r5, r10, new java.lang.Object[0])
        L_0x0114:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        KProperty[] kPropertyArr = f;
        KProperty kProperty = kPropertyArr[0];
        wie wie = this.e;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 == null || !pm7.isActive()) {
            wie.setValue(this, kPropertyArr[0], ev0.v(this.a, (CoroutineContext) null, (f14) null, new wq1(this, (Continuation) null), 3));
        }
    }
}
