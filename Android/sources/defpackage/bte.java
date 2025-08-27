package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;

/* renamed from: bte  reason: default package */
public final class bte {
    public final Lazy a;
    public final Lazy b;

    public bte(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    public static /* synthetic */ Object d(bte bte, String str, long j, Continuation continuation, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            j = 0;
        }
        return bte.c(str2, j, 50, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.yse
            if (r0 == 0) goto L_0x0013
            r0 = r7
            yse r0 = (defpackage.yse) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            yse r0 = new yse
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x005d
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.Lazy r4 = r4.a
            java.lang.Object r7 = r4.getValue()
            moe r7 = (defpackage.moe) r7
            boe r7 = r7.c(r5)
            if (r7 != 0) goto L_0x0066
            java.lang.Object r4 = r4.getValue()
            moe r4 = (defpackage.moe) r4
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            java.util.List r5 = kotlin.collections.CollectionsKt.listOf(r5)
            wbe r4 = r4.e(r5)
            r0.c = r3
            java.lang.Object r7 = defpackage.bs0.f(r4, r0)
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r4 = kotlin.collections.CollectionsKt.firstOrNull(r7)
            r7 = r4
            boe r7 = (defpackage.boe) r7
        L_0x0066:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bte.a(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r16, long r17, int r19, kotlin.coroutines.Continuation r20) {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r1 instanceof defpackage.zse
            if (r2 == 0) goto L_0x0016
            r2 = r1
            zse r2 = (defpackage.zse) r2
            int r3 = r2.o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.o = r3
            goto L_0x001b
        L_0x0016:
            zse r2 = new zse
            r2.<init>(r15, r1)
        L_0x001b:
            java.lang.Object r1 = r2.b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.o
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0043
            if (r4 == r6) goto L_0x003b
            if (r4 != r5) goto L_0x0033
            java.lang.Object r0 = r2.a
            fu r0 = (defpackage.fu) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0087
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            java.lang.Object r0 = r2.a
            bte r0 = (defpackage.bte) r0
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0069
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.Lazy r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            rl r1 = (defpackage.rl) r1
            yt r4 = new yt
            r8 = 2
            r9 = 0
            r7 = r4
            r10 = r17
            r12 = r19
            r13 = r16
            r7.<init>((int) r8, (java.lang.String) r9, (long) r10, (int) r12, (java.lang.String) r13)
            r2.a = r0
            r2.o = r6
            jna r1 = (defpackage.jna) r1
            java.lang.Object r1 = r1.T(r4, r2)
            if (r1 != r3) goto L_0x0069
            return r3
        L_0x0069:
            fu r1 = (defpackage.fu) r1
            kotlin.Lazy r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            moe r0 = (defpackage.moe) r0
            java.util.List r4 = r1.c
            wbe r0 = r0.e(r4)
            r2.a = r1
            r2.o = r5
            java.lang.Object r0 = defpackage.bs0.f(r0, r2)
            if (r0 != r3) goto L_0x0084
            return r3
        L_0x0084:
            r14 = r1
            r1 = r0
            r0 = r14
        L_0x0087:
            java.util.List r1 = (java.util.List) r1
            wse r2 = new wse
            long r3 = r0.w
            r2.<init>(r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bte.b(java.lang.String, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r14, long r15, int r17, kotlin.coroutines.Continuation r18) {
        /*
            r13 = this;
            r0 = r13
            r1 = r18
            boolean r2 = r1 instanceof defpackage.ate
            if (r2 == 0) goto L_0x0016
            r2 = r1
            ate r2 = (defpackage.ate) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.c = r3
            goto L_0x001b
        L_0x0016:
            ate r2 = new ate
            r2.<init>(r13, r1)
        L_0x001b:
            java.lang.Object r1 = r2.a
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.c
            r5 = 1
            if (r4 == 0) goto L_0x0034
            if (r4 != r5) goto L_0x002c
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0056
        L_0x002c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.Lazy r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            rl r0 = (defpackage.rl) r0
            yt r1 = new yt
            r7 = 3
            r8 = 0
            r6 = r1
            r9 = r15
            r11 = r17
            r12 = r14
            r6.<init>((int) r7, (java.lang.String) r8, (long) r9, (int) r11, (java.lang.String) r12)
            r2.c = r5
            jna r0 = (defpackage.jna) r0
            java.lang.Object r1 = r0.T(r1, r2)
            if (r1 != r3) goto L_0x0056
            return r3
        L_0x0056:
            fu r1 = (defpackage.fu) r1
            xse r0 = new xse
            java.util.List r2 = r1.o
            long r3 = r1.w
            r0.<init>(r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bte.c(java.lang.String, long, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
