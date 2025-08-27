package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pd2  reason: default package */
public final class pd2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ wd2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String o;
    public final /* synthetic */ sr4 v;
    public final /* synthetic */ long w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pd2(wd2 wd2, long j, String str, sr4 sr4, long j2, Continuation continuation) {
        super(2, continuation);
        this.b = wd2;
        this.c = j;
        this.o = str;
        this.v = sr4;
        this.w = j2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new pd2(this.b, this.c, this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pd2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        r0 = r8.x0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r1 = r20
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r1.a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            wd2 r7 = r1.b
            if (r0 == 0) goto L_0x0031
            if (r0 == r6) goto L_0x002b
            if (r0 == r5) goto L_0x0026
            if (r0 == r4) goto L_0x0021
            if (r0 != r3) goto L_0x0019
            goto L_0x0021
        L_0x0019:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0021:
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x0183
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r21)
            goto L_0x00e5
        L_0x002b:
            kotlin.ResultKt.throwOnFailure(r21)
            r0 = r21
            goto L_0x0047
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r21)
            kotlin.Lazy r0 = r7.v
            java.lang.Object r0 = r0.getValue()
            to9 r0 = (defpackage.to9) r0
            r1.a = r6
            long r8 = r1.c
            java.lang.Object r0 = r0.a(r8, r1)
            if (r0 != r2) goto L_0x0047
            return r2
        L_0x0047:
            r8 = r0
            ha9 r8 = (defpackage.ha9) r8
            java.lang.String r9 = r1.o
            r10 = 0
            if (r8 == 0) goto L_0x0059
            w28 r0 = r8.x0
            if (r0 == 0) goto L_0x0059
            l20 r0 = r0.H(r9)
            r11 = r0
            goto L_0x005a
        L_0x0059:
            r11 = r10
        L_0x005a:
            if (r11 == 0) goto L_0x00e8
            boolean r0 = r11.c()
            if (r0 != r6) goto L_0x00e8
            r1.a = r5
            r7.getClass()
            s10 r0 = r11.j
            if (r0 != 0) goto L_0x006f
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x00e2
        L_0x006f:
            sr4 r3 = r1.v
            java.lang.String r4 = r11.r
            if (r4 == 0) goto L_0x00c9
            int r5 = r4.length()
            if (r5 != 0) goto L_0x007c
            goto L_0x00c9
        L_0x007c:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r1 = r0.exists()
            n6e r4 = r7.X
            if (r1 == 0) goto L_0x00b9
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            java.lang.String r1 = r0.toString()
            int r5 = defpackage.o5a.f
            java.lang.String r5 = "content://"
            boolean r1 = r1.startsWith(r5)
            if (r1 == 0) goto L_0x009c
            goto L_0x00b0
        L_0x009c:
            kotlin.Lazy r1 = r7.y
            java.lang.Object r1 = r1.getValue()
            ln5 r1 = (defpackage.ln5) r1
            java.io.File r0 = defpackage.n79.V(r0)
            po5 r1 = (defpackage.po5) r1
            android.content.Context r5 = r7.b
            android.net.Uri r0 = r1.f(r5, r0)
        L_0x00b0:
            xr4 r1 = new xr4
            r1.<init>(r0, r3)
            r4.d(r1)
            goto L_0x00c6
        L_0x00b9:
            r0 = 0
            int r0 = defpackage.wd2.n(r3, r0)
            wr4 r1 = new wr4
            r1.<init>(r0)
            r4.d(r1)
        L_0x00c6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x00e2
        L_0x00c9:
            java.util.concurrent.atomic.AtomicReference r4 = r7.x0
            kd2 r5 = new kd2
            r5.<init>(r8, r0, r11, r3)
            r4.updateAndGet(r5)
            java.lang.String r3 = r11.q
            java.lang.Object r0 = r7.l(r3, r0, r1)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x00e0
            goto L_0x00e2
        L_0x00e0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x00e2:
            if (r0 != r2) goto L_0x00e5
            return r2
        L_0x00e5:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00e8:
            java.util.concurrent.atomic.AtomicReference r0 = r7.x0
            od2 r5 = new od2
            java.lang.String r15 = r1.o
            sr4 r13 = r1.v
            r19 = r7
            long r6 = r1.c
            long r3 = r1.w
            r12 = r5
            r18 = r13
            r13 = r6
            r6 = r15
            r15 = r3
            r17 = r6
            r12.<init>(r13, r15, r17, r18)
            r0.updateAndGet(r5)
            java.io.File r0 = android.os.Environment.getDataDirectory()
            kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch:{ all -> 0x0129 }
            android.os.StatFs r3 = new android.os.StatFs     // Catch:{ all -> 0x0129 }
            java.lang.String r0 = r0.getPath()     // Catch:{ all -> 0x0129 }
            r3.<init>(r0)     // Catch:{ all -> 0x0129 }
            long r4 = r3.getBlockSizeLong()     // Catch:{ all -> 0x0129 }
            long r6 = r3.getAvailableBlocksLong()     // Catch:{ all -> 0x0129 }
            long r4 = r4 * r6
            r6 = 1048576(0x100000, double:5.180654E-318)
            long r4 = r4 / r6
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0129 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x0129 }
            goto L_0x0134
        L_0x0129:
            r0 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x0134:
            r3 = -1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            boolean r4 = kotlin.Result.m29isFailureimpl(r0)
            if (r4 == 0) goto L_0x0141
            r0 = r3
        L_0x0141:
            java.lang.Number r0 = (java.lang.Number) r0
            long r3 = r0.longValue()
            r5 = 1024(0x400, double:5.06E-321)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0186
            if (r11 == 0) goto L_0x0152
            x10 r0 = r11.b
            goto L_0x0153
        L_0x0152:
            r0 = r10
        L_0x0153:
            if (r11 == 0) goto L_0x0158
            k20 r3 = r11.d
            goto L_0x0159
        L_0x0158:
            r3 = r10
        L_0x0159:
            if (r0 == 0) goto L_0x0175
            r4 = 3
            r1.a = r4
            sd2 r3 = new sd2
            r4 = r19
            r3.<init>(r0, r4, r10)
            java.lang.Object r0 = defpackage.e14.d(r3, r1)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x0170
            goto L_0x0172
        L_0x0170:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0172:
            if (r0 != r2) goto L_0x0183
            return r2
        L_0x0175:
            r4 = r19
            if (r3 == 0) goto L_0x0183
            r5 = 4
            r1.a = r5
            java.lang.Object r0 = defpackage.wd2.j(r4, r9, r3, r8, r1)
            if (r0 != r2) goto L_0x0183
            return r2
        L_0x0183:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0186:
            r4 = r19
            r1 = 1
            r4.m(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
