package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: py9  reason: default package */
public final class py9 extends SuspendLambda implements Function2 {
    public Bundle a;
    public int b;
    public final /* synthetic */ o5a c;
    public final /* synthetic */ xy9 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public py9(o5a o5a, xy9 xy9, Continuation continuation) {
        super(2, continuation);
        this.c = o5a;
        this.o = xy9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new py9(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((py9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.lang.Object} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0091, code lost:
        r0 = kotlin.text.StringsKt.toLongOrNull(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            r32 = this;
            r1 = r32
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r1.b
            r3 = 0
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 == r5) goto L_0x001e
            if (r0 != r4) goto L_0x0016
            kotlin.ResultKt.throwOnFailure(r33)
            goto L_0x02e9
        L_0x0016:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001e:
            android.os.Bundle r0 = r1.a
            kotlin.ResultKt.throwOnFailure(r33)
            r15 = r33
            r12 = r0
            goto L_0x00ff
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r33)
            o5a r0 = r1.c
            boolean r6 = r0 instanceof defpackage.zx9
            if (r6 == 0) goto L_0x02c3
            java.lang.String r6 = "MediaMetadata.Extra.CHAT_ID"
            zx9 r0 = (defpackage.zx9) r0
            long r7 = r0.j
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r6, r0)
            java.lang.String r6 = "MediaMetadata.Extra.MESSAGE_ID"
            o5a r7 = r1.c
            zx9 r7 = (defpackage.zx9) r7
            long r7 = r7.k
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r7)
            kotlin.Pair r6 = kotlin.TuplesKt.to(r6, r7)
            java.lang.String r7 = "MediaMetadata.Extra.ATTACH_ID"
            o5a r8 = r1.c
            zx9 r8 = (defpackage.zx9) r8
            java.lang.String r8 = r8.l
            kotlin.Pair r7 = kotlin.TuplesKt.to(r7, r8)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r0, r6, r7}
            android.os.Bundle r6 = defpackage.o54.f(r0)
            fy9 r13 = new fy9
            xy9 r14 = r1.o
            o5a r0 = r1.c
            zx9 r0 = (defpackage.zx9) r0
            long r9 = r0.k
            java.lang.String r11 = r0.l
            java.lang.String r15 = r0.m
            r7 = r13
            r8 = r14
            r12 = r15
            r7.<init>(r8, r9, r11, r12)
            r1.a = r6
            r1.b = r5
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x009c }
            android.net.Uri r0 = android.net.Uri.parse(r15)     // Catch:{ all -> 0x009c }
            java.lang.String r7 = "expires"
            java.lang.String r0 = r0.getQueryParameter(r7)     // Catch:{ all -> 0x009c }
            x23 r7 = r14.f     // Catch:{ all -> 0x009c }
            qjd r7 = (defpackage.qjd) r7     // Catch:{ all -> 0x009c }
            long r7 = r7.m()     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x009e
            java.lang.Long r0 = kotlin.text.StringsKt.toLongOrNull(r0)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x009e
            long r9 = r0.longValue()     // Catch:{ all -> 0x009c }
            goto L_0x00a3
        L_0x009c:
            r0 = move-exception
            goto L_0x00b3
        L_0x009e:
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00a3:
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x00a9
            r0 = r5
            goto L_0x00aa
        L_0x00a9:
            r0 = r3
        L_0x00aa:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)     // Catch:{ all -> 0x009c }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x009c }
            goto L_0x00bd
        L_0x00b3:
            kotlin.Result$Companion r7 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x00bd:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            boolean r8 = kotlin.Result.m29isFailureimpl(r0)
            if (r8 == 0) goto L_0x00c8
            r0 = r7
        L_0x00c8:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            lta r7 = r14.h
            long r8 = r13.b
            java.lang.String r8 = java.lang.String.valueOf(r8)
            et4 r7 = r7.a()
            uqg r7 = r7.b
            de4 r7 = (defpackage.de4) r7
            rr4 r7 = r7.d(r8)
            if (r7 == 0) goto L_0x00eb
            int r7 = r7.b
            r8 = 4
            if (r7 != r8) goto L_0x00eb
            r7 = r5
            goto L_0x00ec
        L_0x00eb:
            r7 = r3
        L_0x00ec:
            boolean r8 = kotlin.text.StringsKt.isBlank(r15)
            if (r8 != 0) goto L_0x00f6
            if (r0 != 0) goto L_0x00f6
            if (r7 == 0) goto L_0x00fb
        L_0x00f6:
            java.lang.Object r0 = r13.a(r1)
            r15 = r0
        L_0x00fb:
            if (r15 != r2) goto L_0x00fe
            return r2
        L_0x00fe:
            r12 = r6
        L_0x00ff:
            r20 = r15
            java.lang.String r20 = (java.lang.String) r20
            if (r20 == 0) goto L_0x02a5
            boolean r0 = kotlin.text.StringsKt.isBlank(r20)
            if (r0 == 0) goto L_0x010d
            goto L_0x02a5
        L_0x010d:
            xy9 r6 = r1.o
            o5a r0 = r1.c
            zx9 r0 = (defpackage.zx9) r0
            long r7 = r0.k
            java.lang.String r8 = java.lang.String.valueOf(r7)
            jr8 r0 = defpackage.jr8.c
            o5a r7 = r1.c
            zx9 r7 = (defpackage.zx9) r7
            java.lang.String r10 = r7.n
            java.lang.String r11 = r7.o
            int r7 = defpackage.xy9.N
            r7 = r20
            r9 = r0
            r6.t(r7, r8, r9, r10, r11, r12)
            xy9 r12 = r1.o
            o5a r6 = r1.c
            zx9 r6 = (defpackage.zx9) r6
            long r13 = r6.k
            java.lang.String r15 = r6.l
            long r10 = r6.j
            r9 = 0
            r1.a = r9
            r1.b = r4
            lta r4 = r12.h
            java.lang.String r6 = java.lang.String.valueOf(r13)
            et4 r7 = r4.a()
            uqg r7 = r7.b
            de4 r7 = (defpackage.de4) r7
            rr4 r6 = r7.d(r6)
            if (r6 == 0) goto L_0x01a9
            int r7 = r6.b
            r8 = 3
            if (r7 == r8) goto L_0x0156
            goto L_0x01a9
        L_0x0156:
            ht4 r6 = r6.a
            android.net.Uri r6 = r6.b
            android.net.Uri$Builder r6 = r6.buildUpon()
            pf6 r7 = defpackage.jr8.a
            r7.getClass()
            java.lang.String r7 = "MediaItemType"
            java.lang.String r8 = java.lang.String.valueOf(r5)
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r7, r8)
            android.net.Uri r6 = r6.build()
            java.lang.String r6 = r6.toString()
            kotlin.Lazy r7 = r4.d
            java.lang.Object r7 = r7.getValue()
            tae r7 = (defpackage.tae) r7
            od4 r7 = r7.i(r6)
            long r7 = defpackage.nv3.a(r7)
            kotlin.Lazy r4 = r4.d
            java.lang.Object r4 = r4.getValue()
            tae r4 = (defpackage.tae) r4
            monitor-enter(r4)
            d23 r3 = r4.c     // Catch:{ all -> 0x01a2 }
            fy0 r3 = r3.j(r6)     // Catch:{ all -> 0x01a2 }
            if (r3 == 0) goto L_0x01a4
            r5 = 0
            long r5 = r3.a(r5, r7)     // Catch:{ all -> 0x01a2 }
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x01a4
            r3 = 1
            goto L_0x01a5
        L_0x01a2:
            r0 = move-exception
            goto L_0x01a7
        L_0x01a4:
            r3 = 0
        L_0x01a5:
            monitor-exit(r4)
            goto L_0x01aa
        L_0x01a7:
            monitor-exit(r4)     // Catch:{ all -> 0x01a2 }
            throw r0
        L_0x01a9:
            r3 = 0
        L_0x01aa:
            if (r3 == 0) goto L_0x01ed
            fa9 r0 = r12.e
            ha9 r0 = r0.r(r13)
            if (r0 == 0) goto L_0x01dc
            w28 r1 = r0.x0
            if (r1 == 0) goto L_0x01dc
            java.lang.Object r1 = r1.b
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x01dc
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x01c4:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01da
            java.lang.Object r3 = r1.next()
            r4 = r3
            l20 r4 = (defpackage.l20) r4
            java.lang.String r4 = r4.q
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r15)
            if (r4 == 0) goto L_0x01c4
            r9 = r3
        L_0x01da:
            l20 r9 = (defpackage.l20) r9
        L_0x01dc:
            if (r9 == 0) goto L_0x01e9
            d20 r1 = r9.n
            d20 r3 = defpackage.d20.c
            if (r1 == r3) goto L_0x01e9
            fa9 r1 = r12.e
            r1.w(r0, r15, r3)
        L_0x01e9:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x02a2
        L_0x01ed:
            java.lang.String r3 = "MediaMetadata.Extra.CHAT_ID"
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r10)
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            java.lang.String r4 = "MediaMetadata.Extra.ATTACH_ID"
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r15)
            java.lang.String r5 = "MediaMetadata.Extra.MESSAGE_ID"
            java.lang.Long r6 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r13)
            kotlin.Pair r5 = kotlin.TuplesKt.to(r5, r6)
            kotlin.Pair[] r3 = new kotlin.Pair[]{r3, r4, r5}
            android.os.Bundle r3 = defpackage.o54.f(r3)
            lta r4 = r12.h
            java.lang.String r7 = java.lang.String.valueOf(r13)
            r5 = 0
            r16 = 0
            r6 = r20
            r8 = r0
            r0 = r9
            r9 = r5
            r22 = r10
            r10 = r16
            r11 = r3
            ir8 r3 = defpackage.xy9.j(r6, r7, r8, r9, r10, r11)
            r4.getClass()
            xq8 r5 = r3.b
            if (r5 == 0) goto L_0x026a
            android.net.Uri r5 = r5.a
            if (r5 == 0) goto L_0x026a
            android.net.Uri r6 = defpackage.vzg.G(r5, r3)
            java.lang.String r30 = r6.toString()
            ht4 r6 = new ht4
            lx5 r7 = defpackage.tb7.b
            k0d r28 = defpackage.k0d.v
            java.lang.String r7 = r3.a
            r29 = 0
            r31 = 0
            r27 = 0
            r24 = r6
            r25 = r7
            r26 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            kotlin.Lazy r5 = r4.c
            java.lang.Object r5 = r5.getValue()
            jc8 r5 = (defpackage.jc8) r5
            gc8 r5 = r5.a
            gc8 r5 = r5.t0()
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            sx8 r8 = new sx8
            r9 = 14
            r8.<init>(r9, r4, r6)
            r5.p0(r7, r8)
        L_0x026a:
            kta r5 = new kta
            java.lang.String r3 = r3.a
            r5.<init>(r4, r3, r0)
            co1 r0 = defpackage.bs0.k(r5)
            cu0 r3 = defpackage.cu0.b
            r4 = 1
            bs5 r0 = defpackage.bs0.i(r0, r4, r3)
            gaf r3 = r12.c
            osa r3 = (defpackage.osa) r3
            gc8 r3 = r3.c()
            bs5 r0 = defpackage.bs0.F(r0, r3)
            my9 r3 = new my9
            r16 = r3
            r17 = r13
            r19 = r15
            r21 = r12
            r16.<init>(r17, r19, r20, r21, r22)
            java.lang.Object r0 = r0.e(r3, r1)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x02a0
            goto L_0x02a2
        L_0x02a0:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x02a2:
            if (r0 != r2) goto L_0x02e9
            return r2
        L_0x02a5:
            int r0 = defpackage.xy9.N
            java.lang.String r0 = "xy9"
            o5a r1 = r1.c
            zx9 r1 = (defpackage.zx9) r1
            java.lang.String r1 = r1.m
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid audio url: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            defpackage.z68.p(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02c3:
            boolean r2 = r0 instanceof defpackage.ay9
            if (r2 == 0) goto L_0x02ec
            xy9 r3 = r1.o
            po5 r2 = r3.d
            ay9 r0 = (defpackage.ay9) r0
            long r4 = r0.j
            java.io.File r0 = r2.d(r4)
            java.lang.String r4 = r0.getAbsolutePath()
            o5a r0 = r1.c
            ay9 r0 = (defpackage.ay9) r0
            long r0 = r0.j
            java.lang.String r5 = java.lang.String.valueOf(r0)
            jr8 r6 = defpackage.jr8.v
            r9 = 0
            r7 = 0
            r8 = 0
            r3.t(r4, r5, r6, r7, r8, r9)
        L_0x02e9:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02ec:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
