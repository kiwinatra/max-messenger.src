package defpackage;

import kotlin.Lazy;

/* renamed from: zq6  reason: default package */
public final class zq6 {
    public final Lazy a;
    public final Lazy b;

    public zq6(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r17, long r19, java.lang.String r21, java.lang.Long r22, java.lang.Integer r23, kotlin.coroutines.Continuation r24) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            boolean r7 = r6 instanceof defpackage.yq6
            if (r7 == 0) goto L_0x001f
            r7 = r6
            yq6 r7 = (defpackage.yq6) r7
            int r8 = r7.o
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = r8 & r9
            if (r10 == 0) goto L_0x001f
            int r8 = r8 - r9
            r7.o = r8
            goto L_0x0024
        L_0x001f:
            yq6 r7 = new yq6
            r7.<init>(r0, r6)
        L_0x0024:
            java.lang.Object r6 = r7.b
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r9 = r7.o
            r10 = 0
            r12 = 0
            r13 = 1
            if (r9 == 0) goto L_0x0042
            if (r9 != r13) goto L_0x003a
            zq6 r0 = r7.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x008a
        L_0x003a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r6)
            np2 r6 = new np2
            r9 = 23
            r6.<init>((defpackage.x3b) r12, (int) r9)
            int r9 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0161
            java.lang.String r9 = "chatId"
            r14 = r17
            r6.p(r14, r9)
            java.lang.String r9 = "messageId"
            r6.p(r1, r9)
            if (r3 == 0) goto L_0x0063
            java.lang.String r1 = "reaction"
            r6.t(r1, r3)
        L_0x0063:
            java.lang.Object r1 = r6.b
            java.util.HashMap r1 = (java.util.HashMap) r1
            if (r4 == 0) goto L_0x006e
            java.lang.String r2 = "marker"
            r1.put(r2, r4)
        L_0x006e:
            if (r5 == 0) goto L_0x0075
            java.lang.String r2 = "count"
            r1.put(r2, r5)
        L_0x0075:
            kotlin.Lazy r1 = r0.a
            java.lang.Object r1 = r1.getValue()
            rl r1 = (defpackage.rl) r1
            r7.a = r0
            r7.o = r13
            jna r1 = (defpackage.jna) r1
            java.lang.Object r6 = r1.T(r6, r7)
            if (r6 != r8) goto L_0x008a
            return r8
        L_0x008a:
            rv9 r6 = (defpackage.rv9) r6
            r0.getClass()
            java.util.ArrayList r1 = r6.c
            kotlin.Lazy r0 = r0.b
            if (r1 == 0) goto L_0x00c7
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r1, 10)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x00a2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00cb
            java.lang.Object r3 = r1.next()
            rd9 r3 = (defpackage.rd9) r3
            sd9 r4 = new sd9
            long r7 = r3.a
            java.lang.Object r5 = r0.getValue()
            yd9 r5 = (defpackage.yd9) r5
            nd9 r3 = r3.b
            java.lang.String r3 = r3.b
            hqc r3 = r5.b(r3)
            r4.<init>(r7, r3)
            r2.add(r4)
            goto L_0x00a2
        L_0x00c7:
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00cb:
            ud9 r1 = r6.o
            if (r1 == 0) goto L_0x012f
            java.util.List r3 = r1.a
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r3, 10)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x00e0:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0103
            java.lang.Object r5 = r3.next()
            pd9 r5 = (defpackage.pd9) r5
            wd9 r7 = new wd9
            java.lang.Object r8 = r0.getValue()
            yd9 r8 = (defpackage.yd9) r8
            nd9 r9 = r5.a
            qqc r8 = r8.d(r9)
            int r5 = r5.b
            r7.<init>(r8, r5)
            r4.add(r7)
            goto L_0x00e0
        L_0x0103:
            nd9 r3 = r1.c
            if (r3 == 0) goto L_0x0126
            qqc r5 = new qqc
            bk3 r7 = defpackage.rqc.b
            vd9 r8 = r3.a
            int r8 = r8.a
            r7.getClass()
            rqc r7 = defpackage.bk3.m(r8)
            java.lang.Object r8 = r0.getValue()
            yd9 r8 = (defpackage.yd9) r8
            java.lang.String r3 = r3.b
            hqc r3 = r8.b(r3)
            r5.<init>(r7, r3)
            goto L_0x0127
        L_0x0126:
            r5 = r12
        L_0x0127:
            xd9 r3 = new xd9
            int r1 = r1.b
            r3.<init>(r4, r1, r5)
            goto L_0x0130
        L_0x012f:
            r3 = r12
        L_0x0130:
            rd9 r1 = r6.v
            if (r1 == 0) goto L_0x0149
            sd9 r12 = new sd9
            java.lang.Object r0 = r0.getValue()
            yd9 r0 = (defpackage.yd9) r0
            nd9 r4 = r1.b
            java.lang.String r4 = r4.b
            hqc r0 = r0.b(r4)
            long r4 = r1.a
            r12.<init>(r4, r0)
        L_0x0149:
            java.lang.Long r0 = r6.w
            if (r0 == 0) goto L_0x0151
            long r10 = r0.longValue()
        L_0x0151:
            zd9 r0 = new zd9
            r16 = r0
            r17 = r2
            r18 = r3
            r19 = r12
            r20 = r10
            r16.<init>(r17, r18, r19, r20)
            return r0
        L_0x0161:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "param messageIds can't be empty"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq6.a(long, long, java.lang.String, java.lang.Long, java.lang.Integer, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
