package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gr6  reason: default package */
public final class gr6 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hr6 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gr6(hr6 hr6, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.b = hr6;
        this.c = j;
        this.o = j2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new gr6(this.b, this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gr6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r6 = r21
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r6.a
            r8 = 0
            r9 = 4
            r10 = 3
            r11 = 2
            r12 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r12) goto L_0x0033
            if (r0 == r11) goto L_0x002d
            if (r0 == r10) goto L_0x0026
            if (r0 != r9) goto L_0x001e
            kotlin.ResultKt.throwOnFailure(r22)
            r0 = r22
            goto L_0x00e9
        L_0x001e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r22)
            r0 = r22
            goto L_0x00b0
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r22)
            r0 = r22
            goto L_0x0095
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r22)
            r0 = r22
            goto L_0x0059
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r22)
            hr6 r0 = r6.b
            java.lang.Object r0 = r0.v
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            to9 r0 = (defpackage.to9) r0
            long r1 = r6.c
            long r3 = r6.o
            r6.a = r12
            z6d r0 = r0.a
            r5 = r21
            java.lang.Object r0 = r0.j(r1, r3, r5)
            if (r0 != r7) goto L_0x0059
            return r7
        L_0x0059:
            ha9 r0 = (defpackage.ha9) r0
            if (r0 == 0) goto L_0x007e
            hr6 r1 = r6.b
            java.lang.Object r1 = r1.b
            java.lang.String r1 = (java.lang.String) r1
            long r2 = r6.o
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x006a
            goto L_0x007d
        L_0x006a:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x007d
            w78 r5 = defpackage.w78.o
            java.lang.String r6 = "Found message="
            java.lang.String r7 = " in cache, return it"
            java.lang.String r2 = defpackage.wj6.j(r2, r6, r7)
            r4.d(r5, r1, r2, r8)
        L_0x007d:
            return r0
        L_0x007e:
            hr6 r0 = r6.b
            java.lang.Object r0 = r0.o
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            qx2 r0 = (defpackage.qx2) r0
            long r1 = r6.c
            r6.a = r11
            java.lang.Object r0 = r0.d(r1, r6)
            if (r0 != r7) goto L_0x0095
            return r7
        L_0x0095:
            a32 r0 = (defpackage.a32) r0
            m72 r0 = r0.b
            long r0 = r0.a
            hr6 r2 = r6.b
            long r3 = r6.o
            java.lang.Long r3 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            java.util.List r3 = kotlin.collections.CollectionsKt.listOf(r3)
            r6.a = r10
            java.lang.Object r0 = defpackage.hr6.a(r2, r0, r3, r6)
            if (r0 != r7) goto L_0x00b0
            return r7
        L_0x00b0:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.firstOrNull(r0)
            r17 = r0
            b89 r17 = (defpackage.b89) r17
            if (r17 != 0) goto L_0x00bd
            return r8
        L_0x00bd:
            hr6 r0 = r6.b
            java.lang.Object r0 = r0.v
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            to9 r0 = (defpackage.to9) r0
            long r1 = r6.c
            r6.a = r9
            r0.getClass()
            ro9 r3 = new ro9
            r18 = 0
            r13 = r3
            r14 = r0
            r15 = r1
            r13.<init>(r14, r15, r17, r18)
            z6d r0 = r0.a
            j6d r0 = r0.a
            i6d r0 = r0.m()
            java.lang.Object r0 = defpackage.n6d.a(r0, r3, r6)
            if (r0 != r7) goto L_0x00e9
            return r7
        L_0x00e9:
            ha9 r0 = (defpackage.ha9) r0
            if (r0 == 0) goto L_0x0140
            hr6 r1 = r6.b
            long r14 = r6.c
            long r2 = r6.o
            java.lang.Object r4 = r1.b
            java.lang.String r4 = (java.lang.String) r4
            a67 r5 = defpackage.z68.b
            if (r5 != 0) goto L_0x00fc
            goto L_0x010f
        L_0x00fc:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x010f
            w78 r6 = defpackage.w78.o
            java.lang.String r7 = "Fetched message="
            java.lang.String r9 = " from server"
            java.lang.String r2 = defpackage.wj6.j(r2, r7, r9)
            r5.d(r6, r4, r2, r8)
        L_0x010f:
            java.lang.Object r1 = r1.o
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r1 = r1.getValue()
            qx2 r1 = (defpackage.qx2) r1
            my2 r1 = (defpackage.my2) r1
            r62 r13 = r1.n()
            long r2 = r0.w
            kotlin.Lazy r1 = r1.c
            java.lang.Object r1 = r1.getValue()
            cjd r1 = (defpackage.cjd) r1
            long r4 = r1.a()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0134
        L_0x0131:
            r16 = r12
            goto L_0x0136
        L_0x0134:
            r12 = 0
            goto L_0x0131
        L_0x0136:
            r18 = 0
            r19 = 0
            r17 = r0
            r13.b0(r14, r16, r17, r18, r19)
            r8 = r0
        L_0x0140:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gr6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
