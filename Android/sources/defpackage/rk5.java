package defpackage;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;

/* renamed from: rk5  reason: default package */
public final class rk5 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;

    public rk5(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
        this.g = lazy7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006d A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093 A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r13, long r15, java.lang.String r17, java.lang.String r18, java.lang.String r19, defpackage.cl5 r20, kotlin.coroutines.Continuation r21) {
        /*
            r12 = this;
            r1 = r12
            r5 = r15
            r0 = r17
            r2 = r19
            r3 = r21
            boolean r4 = r3 instanceof defpackage.pk5
            if (r4 == 0) goto L_0x001c
            r4 = r3
            pk5 r4 = (defpackage.pk5) r4
            int r7 = r4.o
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001c
            int r7 = r7 - r8
            r4.o = r7
        L_0x001a:
            r9 = r4
            goto L_0x0022
        L_0x001c:
            pk5 r4 = new pk5
            r4.<init>(r12, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r3 = r9.b
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r9.o
            e4b r11 = defpackage.e4b.a
            r7 = 1
            if (r4 == 0) goto L_0x0042
            if (r4 != r7) goto L_0x003a
            rk5 r1 = r9.a
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x0037 }
            goto L_0x0092
        L_0x0037:
            r0 = move-exception
            goto L_0x00dd
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r3)
            kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch:{ all -> 0x0037 }
            kotlin.Lazy r3 = r1.b
            if (r2 == 0) goto L_0x005b
            int r4 = r19.length()     // Catch:{ all -> 0x0037 }
            if (r4 != 0) goto L_0x0052
            goto L_0x005b
        L_0x0052:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0037 }
            r4.<init>(r2)     // Catch:{ all -> 0x0037 }
            r2 = r4
            r4 = r18
            goto L_0x0067
        L_0x005b:
            java.lang.Object r2 = r3.getValue()     // Catch:{ all -> 0x0037 }
            po5 r2 = (defpackage.po5) r2     // Catch:{ all -> 0x0037 }
            r4 = r18
            java.io.File r2 = r2.i(r4)     // Catch:{ all -> 0x0037 }
        L_0x0067:
            boolean r8 = r2.exists()     // Catch:{ all -> 0x0037 }
            if (r8 != 0) goto L_0x0093
            java.lang.Class<rk5> r2 = defpackage.rk5.class
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = "file attach not found"
            r4 = 0
            defpackage.z68.f(r2, r3, r4)     // Catch:{ all -> 0x0037 }
            kotlin.Lazy r2 = r1.d     // Catch:{ all -> 0x0037 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x0037 }
            swf r2 = (defpackage.swf) r2     // Catch:{ all -> 0x0037 }
            d20 r8 = defpackage.d20.a     // Catch:{ all -> 0x0037 }
            r9.a = r1     // Catch:{ all -> 0x0037 }
            r9.o = r7     // Catch:{ all -> 0x0037 }
            r3 = r13
            r5 = r15
            r7 = r17
            java.lang.Object r0 = r2.a(r3, r5, r7, r8, r9)     // Catch:{ all -> 0x0037 }
            if (r0 != r10) goto L_0x0092
            return r10
        L_0x0092:
            return r11
        L_0x0093:
            int r8 = r20.ordinal()     // Catch:{ all -> 0x0037 }
            if (r8 == 0) goto L_0x00d7
            if (r8 == r7) goto L_0x00d1
            r0 = 2
            if (r8 != r0) goto L_0x00cb
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x0037 }
            po5 r0 = (defpackage.po5) r0     // Catch:{ all -> 0x0037 }
            kotlin.Lazy r3 = r1.c     // Catch:{ all -> 0x0037 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0037 }
            android.content.Context r3 = (android.content.Context) r3     // Catch:{ all -> 0x0037 }
            android.net.Uri r0 = r0.f(r3, r2)     // Catch:{ all -> 0x0037 }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.<init>(r3)     // Catch:{ all -> 0x0037 }
            r2.setFlags(r7)     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = defpackage.o5a.r(r18)     // Catch:{ all -> 0x0037 }
            if (r3 != 0) goto L_0x00c2
            java.lang.String r3 = "*/*"
        L_0x00c2:
            r2.setDataAndType(r0, r3)     // Catch:{ all -> 0x0037 }
            f4b r3 = new f4b     // Catch:{ all -> 0x0037 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0037 }
            goto L_0x00dc
        L_0x00cb:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0037 }
            r0.<init>()     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x00d1:
            g4b r3 = new g4b     // Catch:{ all -> 0x0037 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0037 }
            goto L_0x00dc
        L_0x00d7:
            g4b r3 = new g4b     // Catch:{ all -> 0x0037 }
            r3.<init>(r5, r0)     // Catch:{ all -> 0x0037 }
        L_0x00dc:
            return r3
        L_0x00dd:
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
            java.lang.Throwable r0 = kotlin.Result.m26exceptionOrNullimpl(r0)
            if (r0 == 0) goto L_0x00fa
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "cant open file attach"
            defpackage.z68.f(r1, r2, r0)
        L_0x00fa:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk5.a(long, long, java.lang.String, java.lang.String, java.lang.String, cl5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object b(long j, long j2, long j3, String str, Continuation continuation) {
        if (j3 == 0) {
            na9 na9 = (na9) this.f.getValue();
            na9.getClass();
            Object a2 = na9.a(true, CollectionsKt.listOf(Boxing.boxLong(j2)), continuation);
            if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                a2 = Unit.INSTANCE;
            }
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Unit.INSTANCE;
        }
        Continuation continuation2 = continuation;
        Object a3 = ((swf) this.d.getValue()).a(j, j2, str, d20.b, continuation);
        return a3 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a3 : Unit.INSTANCE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r17, long r19, long r21, java.lang.String r23, java.lang.String r24, kotlin.coroutines.Continuation r25) {
        /*
            r16 = this;
            r0 = r16
            r1 = r25
            boolean r2 = r1 instanceof defpackage.qk5
            if (r2 == 0) goto L_0x0018
            r2 = r1
            qk5 r2 = (defpackage.qk5) r2
            int r3 = r2.y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.y = r3
        L_0x0016:
            r10 = r2
            goto L_0x001e
        L_0x0018:
            qk5 r2 = new qk5
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r1 = r10.w
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r10.y
            r4 = 1
            if (r3 == 0) goto L_0x0044
            if (r3 != r4) goto L_0x003c
            long r2 = r10.v
            long r4 = r10.o
            java.lang.String r0 = r10.c
            java.lang.String r6 = r10.b
            rk5 r7 = r10.a
            kotlin.ResultKt.throwOnFailure(r1)
            r11 = r0
            r14 = r2
            r12 = r4
            goto L_0x0075
        L_0x003c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.Lazy r1 = r0.d
            java.lang.Object r1 = r1.getValue()
            r3 = r1
            swf r3 = (defpackage.swf) r3
            d20 r9 = defpackage.d20.v
            r10.a = r0
            r1 = r23
            r10.b = r1
            r11 = r24
            r10.c = r11
            r12 = r19
            r10.o = r12
            r14 = r21
            r10.v = r14
            r10.y = r4
            r4 = r17
            r6 = r19
            r8 = r23
            java.lang.Object r3 = r3.a(r4, r6, r8, r9, r10)
            if (r3 != r2) goto L_0x0073
            return r2
        L_0x0073:
            r7 = r0
            r6 = r1
        L_0x0075:
            kotlin.Lazy r0 = r7.a
            java.lang.Object r0 = r0.getValue()
            rl r0 = (defpackage.rl) r0
            jna r0 = (defpackage.jna) r0
            r16 = r0
            r17 = r11
            r18 = r6
            r19 = r14
            r21 = r12
            r16.B(r17, r18, r19, r21)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk5.c(long, long, long, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
