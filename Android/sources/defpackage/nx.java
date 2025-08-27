package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* renamed from: nx  reason: default package */
public final class nx implements tu {
    public final long a;
    public final gaf b;
    public final bl4 c;
    public final a07 d;
    public final cjd e;
    public final String f = nx.class.getName();
    public final jx3 g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;

    public nx(long j2, gaf gaf, bl4 bl4, a07 a07, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, cjd cjd) {
        this.a = j2;
        this.b = gaf;
        this.c = bl4;
        this.d = a07;
        this.e = cjd;
        jx3 a2 = e14.a(((osa) gaf).b());
        this.g = a2;
        this.h = lazy3;
        this.i = lazy;
        this.j = lazy2;
        this.k = lazy4;
        this.l = lazy5;
        this.m = LazyKt.lazy(new j6(9, this));
        if (a07.j()) {
            ev0.v(a2, (CoroutineContext) null, (f14) null, new hx(lazy4, this, (Continuation) null), 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ca, code lost:
        if (r1.b.h(r0.e.a()) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0134 A[LOOP:1: B:39:0x012e->B:41:0x0134, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0154 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.a32 r18, java.util.List r19, kotlin.coroutines.Continuation r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof defpackage.lx
            if (r3 == 0) goto L_0x0019
            r3 = r2
            lx r3 = (defpackage.lx) r3
            int r4 = r3.w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.w = r4
            goto L_0x001e
        L_0x0019:
            lx r3 = new lx
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.o
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r3.w
            r6 = 0
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x004e
            if (r5 == r8) goto L_0x003c
            if (r5 != r7) goto L_0x0034
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0155
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003c:
            java.util.List r0 = r3.c
            java.util.List r0 = (java.util.List) r0
            a32 r1 = r3.b
            nx r5 = r3.a
            kotlin.ResultKt.throwOnFailure(r2)
            r16 = r5
            r5 = r0
            r0 = r16
            goto L_0x010d
        L_0x004e:
            kotlin.ResultKt.throwOnFailure(r2)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            int r5 = r19.size()
            r2.<init>(r5)
            a07 r5 = r0.d
            boolean r5 = r5.j()
            if (r5 == 0) goto L_0x0094
            kotlin.Lazy r5 = r0.m
            java.lang.Object r5 = r5.getValue()
            r9 = r5
            z0g r9 = (defpackage.z0g) r9
            h6 r14 = new h6
            r5 = 2
            r14.<init>(r5, r0)
            l r15 = new l
            r5 = 12
            r15.<init>(r5, r2)
            duc r11 = new duc
            r5 = 23
            r11.<init>(r5)
            duc r12 = new duc
            r5 = 24
            r12.<init>(r5)
            duc r13 = new duc
            r5 = 25
            r13.<init>(r5)
            r10 = r19
            java.util.List r5 = r9.a(r10, r11, r12, r13, r14, r15)
            goto L_0x00b4
        L_0x0094:
            r5 = r19
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r9 = r5.iterator()
        L_0x009c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00b2
            java.lang.Object r10 = r9.next()
            ha9 r10 = (defpackage.ha9) r10
            long r10 = r10.c
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r2.add(r10)
            goto L_0x009c
        L_0x00b2:
            java.util.List r5 = (java.util.List) r5
        L_0x00b4:
            m72 r9 = r1.b
            long r9 = r9.a
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x00cc
            cjd r9 = r0.e
            long r9 = r9.a()
            m72 r11 = r1.b
            boolean r9 = r11.h(r9)
            if (r9 == 0) goto L_0x00d7
        L_0x00cc:
            kotlin.Lazy r9 = r0.l
            java.lang.Object r9 = r9.getValue()
            br6 r9 = (defpackage.br6) r9
            r9.a(r1, r2)
        L_0x00d7:
            java.lang.String r2 = r0.f
            a67 r9 = defpackage.z68.b
            if (r9 != 0) goto L_0x00de
            goto L_0x00f3
        L_0x00de:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x00f3
            w78 r10 = defpackage.w78.o
            int r11 = r5.size()
            java.lang.String r12 = "getMessages: preprocessed messages of size="
            java.lang.String r11 = defpackage.wj6.h(r11, r12)
            r9.d(r10, r2, r11, r6)
        L_0x00f3:
            kotlin.Lazy r2 = r0.h
            java.lang.Object r2 = r2.getValue()
            msa r2 = (defpackage.msa) r2
            r3.a = r0
            r3.b = r1
            r9 = r5
            java.util.List r9 = (java.util.List) r9
            r3.c = r9
            r3.w = r8
            kotlin.Unit r2 = r2.f(r5)
            if (r2 != r4) goto L_0x010d
            return r4
        L_0x010d:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            gaf r2 = r0.b
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            if (r2 != 0) goto L_0x011d
            kotlin.coroutines.CoroutineContext r2 = r3.getContext()
        L_0x011d:
            jx3 r2 = defpackage.e14.a(r2)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r5, 10)
            r8.<init>(r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x012e:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0146
            java.lang.Object r9 = r5.next()
            kx r10 = new kx
            r10.<init>(r9, r6, r0, r1)
            r9 = 3
            nk4 r9 = defpackage.ev0.d(r2, r6, r10, r9)
            r8.add(r9)
            goto L_0x012e
        L_0x0146:
            r3.a = r6
            r3.b = r6
            r3.c = r6
            r3.w = r7
            java.lang.Object r2 = defpackage.j4b.g(r8, r3)
            if (r2 != r4) goto L_0x0155
            return r4
        L_0x0155:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r0 = kotlin.collections.CollectionsKt.filterNotNull(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.a(a32, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: a32} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(long r17, int r19, long r20, kotlin.coroutines.Continuation r22) {
        /*
            r16 = this;
            r0 = r16
            r9 = r19
            r1 = r22
            boolean r2 = r1 instanceof defpackage.ix
            if (r2 == 0) goto L_0x001a
            r2 = r1
            ix r2 = (defpackage.ix) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.v = r3
        L_0x0018:
            r12 = r2
            goto L_0x0020
        L_0x001a:
            ix r2 = new ix
            r2.<init>(r0, r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r1 = r12.c
            java.lang.Object r13 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r12.v
            r14 = 0
            r15 = 2
            r3 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r3) goto L_0x003e
            if (r2 != r15) goto L_0x0036
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0140
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            a32 r0 = r12.b
            nx r2 = r12.a
            kotlin.ResultKt.throwOnFailure(r1)
            r15 = r0
            r0 = r2
            goto L_0x0114
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.Lazy r1 = r0.i
            java.lang.Object r1 = r1.getValue()
            qx2 r1 = (defpackage.qx2) r1
            long r4 = r0.a
            my2 r1 = (defpackage.my2) r1
            etc r1 = r1.o(r4)
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            r11 = r1
            a32 r11 = (defpackage.a32) r11
            if (r11 != 0) goto L_0x0086
            java.lang.String r1 = r0.f
            long r2 = r0.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "No chat="
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r2 = " in cache for loaded messages!"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            defpackage.z68.p(r1, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        L_0x0086:
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r20)
            long r4 = r1.longValue()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r1 = r14
        L_0x0096:
            if (r1 == 0) goto L_0x009e
            long r1 = r1.longValue()
        L_0x009c:
            r4 = r1
            goto L_0x00a1
        L_0x009e:
            r1 = -9223372036854775808
            goto L_0x009c
        L_0x00a1:
            java.lang.String r1 = r0.f
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x00a8
            goto L_0x00ec
        L_0x00a8:
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x00ec
            w78 r6 = defpackage.w78.o
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r17)
            java.lang.String r7 = defpackage.iq.U(r7)
            bl4 r8 = r0.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r15 = "getMessages: "
            r10.<init>(r15)
            r10.append(r7)
            java.lang.String r7 = ", \n                |count: "
            r10.append(r7)
            r10.append(r9)
            java.lang.String r7 = ", \n                |backwardTimeFrom: "
            r10.append(r7)
            r10.append(r4)
            java.lang.String r7 = ", \n                |itemType: "
            r10.append(r7)
            r10.append(r8)
            java.lang.String r7 = "\n                |"
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            java.lang.String r7 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r7, (java.lang.String) null, 1, (java.lang.Object) null)
            r2.d(r6, r1, r7, r14)
        L_0x00ec:
            if (r9 <= 0) goto L_0x0143
            kotlin.Lazy r1 = r0.k
            java.lang.Object r1 = r1.getValue()
            to9 r1 = (defpackage.to9) r1
            long r6 = r0.a
            bl4 r2 = r0.c
            boolean r8 = r2.b()
            bl4 r10 = r0.c
            r12.a = r0
            r12.b = r11
            r12.v = r3
            r2 = r6
            r6 = r17
            r9 = r19
            r15 = r11
            r11 = r12
            java.lang.Object r1 = r1.c(r2, r4, r6, r8, r9, r10, r11)
            if (r1 != r13) goto L_0x0114
            return r13
        L_0x0114:
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = r0.f
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x011d
            goto L_0x0132
        L_0x011d:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0132
            w78 r4 = defpackage.w78.o
            int r5 = r1.size()
            java.lang.String r6 = "getForwardMessages: size="
            java.lang.String r5 = defpackage.wj6.h(r5, r6)
            r3.d(r4, r2, r5, r14)
        L_0x0132:
            r12.a = r14
            r12.b = r14
            r2 = 2
            r12.v = r2
            java.lang.Object r1 = r0.a(r15, r1, r12)
            if (r1 != r13) goto L_0x0140
            return r13
        L_0x0140:
            java.util.List r1 = (java.util.List) r1
            goto L_0x0147
        L_0x0143:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x0147:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.b(long, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: a32} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0142 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(long r17, int r19, long r20, kotlin.coroutines.Continuation r22) {
        /*
            r16 = this;
            r0 = r16
            r9 = r19
            r1 = r22
            boolean r2 = r1 instanceof defpackage.jx
            if (r2 == 0) goto L_0x001a
            r2 = r1
            jx r2 = (defpackage.jx) r2
            int r3 = r2.v
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.v = r3
        L_0x0018:
            r12 = r2
            goto L_0x0020
        L_0x001a:
            jx r2 = new jx
            r2.<init>(r0, r1)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r1 = r12.c
            java.lang.Object r13 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r12.v
            r14 = 0
            r15 = 2
            r3 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r3) goto L_0x003e
            if (r2 != r15) goto L_0x0036
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0143
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            a32 r0 = r12.b
            nx r2 = r12.a
            kotlin.ResultKt.throwOnFailure(r1)
            r15 = r0
            r0 = r2
            goto L_0x0117
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.Lazy r1 = r0.i
            java.lang.Object r1 = r1.getValue()
            qx2 r1 = (defpackage.qx2) r1
            long r4 = r0.a
            my2 r1 = (defpackage.my2) r1
            etc r1 = r1.o(r4)
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            r11 = r1
            a32 r11 = (defpackage.a32) r11
            if (r11 != 0) goto L_0x0086
            java.lang.String r1 = r0.f
            long r2 = r0.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "No chat="
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r2 = " in cache for loaded messages!"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            defpackage.z68.p(r1, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        L_0x0086:
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r20)
            long r4 = r1.longValue()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0095
            goto L_0x0096
        L_0x0095:
            r1 = r14
        L_0x0096:
            if (r1 == 0) goto L_0x009e
            long r1 = r1.longValue()
        L_0x009c:
            r6 = r1
            goto L_0x00a4
        L_0x009e:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x009c
        L_0x00a4:
            java.lang.String r1 = r0.f
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x00ab
            goto L_0x00ef
        L_0x00ab:
            boolean r4 = r2.c()
            if (r4 == 0) goto L_0x00ef
            w78 r4 = defpackage.w78.o
            java.lang.Long r5 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r17)
            java.lang.String r5 = defpackage.iq.U(r5)
            bl4 r8 = r0.c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r15 = "getMessagesForward: "
            r10.<init>(r15)
            r10.append(r5)
            java.lang.String r5 = ", \n                |count: "
            r10.append(r5)
            r10.append(r9)
            java.lang.String r5 = ", \n                |forwardTimeTo: "
            r10.append(r5)
            r10.append(r6)
            java.lang.String r5 = ", \n                |itemType: "
            r10.append(r5)
            r10.append(r8)
            java.lang.String r5 = "\n                |"
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            java.lang.String r5 = kotlin.text.StringsKt__IndentKt.trimMargin$default(r5, (java.lang.String) null, 1, (java.lang.Object) null)
            r2.d(r4, r1, r5, r14)
        L_0x00ef:
            if (r9 <= 0) goto L_0x0146
            kotlin.Lazy r1 = r0.k
            java.lang.Object r1 = r1.getValue()
            to9 r1 = (defpackage.to9) r1
            long r4 = r0.a
            bl4 r2 = r0.c
            boolean r8 = r2.a()
            bl4 r10 = r0.c
            r12.a = r0
            r12.b = r11
            r12.v = r3
            r2 = r4
            r4 = r17
            r9 = r19
            r15 = r11
            r11 = r12
            java.lang.Object r1 = r1.c(r2, r4, r6, r8, r9, r10, r11)
            if (r1 != r13) goto L_0x0117
            return r13
        L_0x0117:
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = r0.f
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x0120
            goto L_0x0135
        L_0x0120:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x0135
            w78 r4 = defpackage.w78.o
            int r5 = r1.size()
            java.lang.String r6 = "getForwardMessages: size="
            java.lang.String r5 = defpackage.wj6.h(r5, r6)
            r3.d(r4, r2, r5, r14)
        L_0x0135:
            r12.a = r14
            r12.b = r14
            r2 = 2
            r12.v = r2
            java.lang.Object r1 = r0.a(r15, r1, r12)
            if (r1 != r13) goto L_0x0143
            return r13
        L_0x0143:
            java.util.List r1 = (java.util.List) r1
            goto L_0x014a
        L_0x0146:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
        L_0x014a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.c(long, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
