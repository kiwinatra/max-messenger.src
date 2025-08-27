package defpackage;

import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pp0  reason: default package */
public final class pp0 implements tu {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public Object g;

    public pp0(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, gaf gaf, long j, Set set) {
        Object obj;
        this.b = gaf;
        this.a = j;
        this.c = lazy;
        this.d = lazy4;
        this.e = lazy2;
        this.f = lazy3;
        if (Intrinsics.areEqual((Object) b10.A0, (Object) set)) {
            obj = e19.d;
        } else if (Intrinsics.areEqual((Object) b10.B0, (Object) set)) {
            obj = e19.e;
        } else if (Intrinsics.areEqual((Object) b10.C0, (Object) set)) {
            obj = e19.b;
        } else if (Intrinsics.areEqual((Object) b10.D0, (Object) set)) {
            obj = e19.c;
        } else if (Intrinsics.areEqual((Object) b10.E0, (Object) set)) {
            obj = e19.f;
        } else if (Intrinsics.areEqual((Object) b10.F0, (Object) set)) {
            obj = e19.g;
        } else {
            obj = e19.a;
        }
        this.g = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088 A[LOOP:0: B:21:0x0081->B:23:0x0088, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.util.ArrayList r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cf2
            if (r0 == 0) goto L_0x0013
            r0 = r10
            cf2 r0 = (defpackage.cf2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            cf2 r0 = new cf2
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00a7
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            java.util.List r8 = r0.b
            r9 = r8
            java.util.List r9 = (java.util.List) r9
            pp0 r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x005c
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r8.c
            kotlin.Lazy r10 = (kotlin.Lazy) r10
            java.lang.Object r10 = r10.getValue()
            qx2 r10 = (defpackage.qx2) r10
            r0.a = r8
            r0.b = r9
            r0.v = r4
            long r4 = r8.a
            java.lang.Object r10 = r10.d(r4, r0)
            if (r10 != r1) goto L_0x005c
            return r1
        L_0x005c:
            a32 r10 = (defpackage.a32) r10
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.lang.Object r2 = r8.b
            gaf r2 = (defpackage.gaf) r2
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            if (r2 != 0) goto L_0x0070
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
        L_0x0070:
            jx3 r2 = defpackage.e14.a(r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r9, 10)
            r4.<init>(r5)
            java.util.Iterator r9 = r9.iterator()
        L_0x0081:
            boolean r5 = r9.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x009a
            java.lang.Object r5 = r9.next()
            bf2 r7 = new bf2
            r7.<init>(r5, r6, r8, r10)
            r5 = 3
            nk4 r5 = defpackage.ev0.d(r2, r6, r7, r5)
            r4.add(r5)
            goto L_0x0081
        L_0x009a:
            r0.a = r6
            r0.b = r6
            r0.v = r3
            java.lang.Object r10 = defpackage.j4b.g(r4, r0)
            if (r10 != r1) goto L_0x00a7
            return r1
        L_0x00a7:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r8 = kotlin.collections.CollectionsKt.filterNotNull(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp0.a(java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(long r16, int r18, long r19, kotlin.coroutines.Continuation r21) {
        /*
            r15 = this;
            r0 = r15
            r1 = r21
            boolean r2 = r1 instanceof defpackage.ze2
            if (r2 == 0) goto L_0x0016
            r2 = r1
            ze2 r2 = (defpackage.ze2) r2
            int r3 = r2.o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.o = r3
            goto L_0x001b
        L_0x0016:
            ze2 r2 = new ze2
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.o
            r5 = 1
            if (r4 == 0) goto L_0x0036
            if (r4 != r5) goto L_0x002e
            java.util.ArrayList r0 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x006c
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r18 <= 0) goto L_0x007b
            java.lang.Object r4 = r0.d
            kotlin.Lazy r4 = (kotlin.Lazy) r4
            java.lang.Object r4 = r4.getValue()
            to9 r4 = (defpackage.to9) r4
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r18)
            z6d r6 = r4.a
            java.lang.Object r4 = r0.g
            r11 = r4
            java.util.Set r11 = (java.util.Set) r11
            r13 = 1
            long r7 = r0.a
            r9 = r16
            java.util.ArrayList r4 = r6.l(r7, r9, r11, r12, r13)
            r2.a = r1
            r2.o = r5
            java.lang.Object r0 = r15.a(r4, r2)
            if (r0 != r3) goto L_0x0069
            return r3
        L_0x0069:
            r14 = r1
            r1 = r0
            r0 = r14
        L_0x006c:
            java.util.List r1 = (java.util.List) r1
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r2 = r1.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x007a
            r0.addAll(r1)
        L_0x007a:
            r1 = r0
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp0.b(long, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object c(long r16, int r18, long r19, kotlin.coroutines.Continuation r21) {
        /*
            r15 = this;
            r0 = r15
            r1 = r21
            boolean r2 = r1 instanceof defpackage.af2
            if (r2 == 0) goto L_0x0016
            r2 = r1
            af2 r2 = (defpackage.af2) r2
            int r3 = r2.o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.o = r3
            goto L_0x001b
        L_0x0016:
            af2 r2 = new af2
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.o
            r5 = 1
            if (r4 == 0) goto L_0x0036
            if (r4 != r5) goto L_0x002e
            java.util.ArrayList r0 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x006c
        L_0x002e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r18 <= 0) goto L_0x007b
            java.lang.Object r4 = r0.d
            kotlin.Lazy r4 = (kotlin.Lazy) r4
            java.lang.Object r4 = r4.getValue()
            to9 r4 = (defpackage.to9) r4
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r18)
            z6d r6 = r4.a
            java.lang.Object r4 = r0.g
            r11 = r4
            java.util.Set r11 = (java.util.Set) r11
            r13 = 0
            long r7 = r0.a
            r9 = r16
            java.util.ArrayList r4 = r6.l(r7, r9, r11, r12, r13)
            r2.a = r1
            r2.o = r5
            java.lang.Object r0 = r15.a(r4, r2)
            if (r0 != r3) goto L_0x0069
            return r3
        L_0x0069:
            r14 = r1
            r1 = r0
            r0 = r14
        L_0x006c:
            java.util.List r1 = (java.util.List) r1
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r2 = r1.isEmpty()
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x007a
            r0.addAll(r1)
        L_0x007a:
            r1 = r0
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp0.c(long, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public pp0(x04 x04, Function2 function2, long j, jx3 jx3, ve veVar) {
        this.b = x04;
        this.c = function2;
        this.a = j;
        this.d = jx3;
        this.e = veVar;
    }
}
