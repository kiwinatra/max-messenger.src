package defpackage;

import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.reflect.KProperty;

/* renamed from: t73  reason: default package */
public final class t73 {
    public static final /* synthetic */ KProperty[] m = {rae.s(t73.class, "loadMoreJob", "getLoadMoreJob()Lkotlinx/coroutines/Job;", 0)};
    public final long a;
    public final gaf b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final long[] g;
    public final xme h;
    public final etc i;
    public jz9 j = new jz9(10);
    public final jx3 k;
    public final wie l;

    public t73(long j2) {
        jxb jxb = jxb.a;
        gaf gaf = (gaf) jxb.f().getValue();
        Lazy c2 = jxb.c();
        Lazy h2 = jxb.getAccessor().h(k73.class);
        Lazy h3 = jxb.getAccessor().h(rl.class);
        Lazy h4 = jxb.getAccessor().h(yva.class);
        this.a = j2;
        this.b = gaf;
        this.c = h4;
        this.d = h3;
        this.e = h2;
        this.f = c2;
        this.g = new long[]{j2};
        xme a2 = f6e.a(x73.a);
        this.h = a2;
        this.i = new etc(a2);
        jx3 a3 = e14.a(((osa) gaf).a());
        this.k = a3;
        this.l = o5a.U();
        ev0.v(a3, (CoroutineContext) null, (f14) null, new l73(this, (Continuation) null), 3);
        bs0.K(new ps5(new dtc(((k73) h2.getValue()).c), new zw(13, (Object) this), 5), a3);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.t73 r13, defpackage.f73 r14, kotlin.coroutines.Continuation r15) {
        /*
            r13.getClass()
            boolean r0 = r15 instanceof defpackage.n73
            if (r0 == 0) goto L_0x0016
            r0 = r15
            n73 r0 = (defpackage.n73) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            n73 r0 = new n73
            r0.<init>(r13, r15)
        L_0x001b:
            java.lang.Object r15 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 6
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            f73 r14 = r0.b
            t73 r13 = r0.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x010f
        L_0x0036:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003e:
            f73 r14 = r0.b
            t73 r13 = r0.a
            kotlin.ResultKt.throwOnFailure(r15)
        L_0x0045:
            r12 = r15
            r15 = r13
            r13 = r12
            goto L_0x006b
        L_0x0049:
            kotlin.ResultKt.throwOnFailure(r15)
            boolean r15 = r14 instanceof defpackage.d73
            gaf r2 = r13.b
            if (r15 == 0) goto L_0x00e1
            osa r2 = (defpackage.osa) r2
            q04 r15 = r2.b()
            o73 r2 = new o73
            r2.<init>(r13, r14, r6)
            r0.a = r13
            r0.b = r14
            r0.v = r5
            java.lang.Object r15 = defpackage.ev0.I(r15, r2, r0)
            if (r15 != r1) goto L_0x0045
            goto L_0x018c
        L_0x006b:
            r5 = r13
            a32 r5 = (defpackage.a32) r5
            if (r5 != 0) goto L_0x0074
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x018c
        L_0x0074:
            m72 r13 = r5.b
            java.util.Map r13 = r13.e
            long r0 = r15.a
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            boolean r13 = r13.containsKey(r0)
            if (r13 != 0) goto L_0x0088
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x018c
        L_0x0088:
            jz9 r13 = r15.j
            d73 r14 = (defpackage.d73) r14
            long r0 = r14.a
            r13.e(r0)
            xme r7 = r15.h
        L_0x0093:
            java.lang.Object r13 = r7.getValue()
            r14 = r13
            j83 r14 = (defpackage.j83) r14
            f83 r0 = new f83
            r5.l0()
            java.lang.CharSequence r1 = r5.X
            kotlin.Lazy r2 = r15.c
            java.lang.Object r2 = r2.getValue()
            yva r2 = (defpackage.yva) r2
            m72 r4 = r5.b
            int r4 = r4.c()
            android.content.Context r2 = r2.a
            int r8 = defpackage.zjc.tt_chat_subtitle_count
            java.lang.String r2 = defpackage.ghf.s(r8, r4, r2)
            r0.<init>(r5, r1, r2)
            r14.getClass()
            boolean r1 = r14 instanceof defpackage.z73
            if (r1 == 0) goto L_0x00c5
            r1 = r14
            z73 r1 = (defpackage.z73) r1
            goto L_0x00c6
        L_0x00c5:
            r1 = r6
        L_0x00c6:
            if (r1 != 0) goto L_0x00c9
            goto L_0x00d9
        L_0x00c9:
            java.util.List r14 = r1.a
            java.util.Collection r14 = (java.util.Collection) r14
            java.util.List r14 = kotlin.collections.CollectionsKt.toMutableList(r14)
            r2 = 0
            r14.add(r2, r0)
            z73 r14 = defpackage.z73.a(r1, r14, r3)
        L_0x00d9:
            boolean r13 = r7.b(r13, r14)
            if (r13 == 0) goto L_0x0093
            goto L_0x018a
        L_0x00e1:
            boolean r15 = r14 instanceof defpackage.e73
            if (r15 == 0) goto L_0x018d
            jz9 r15 = r13.j
            r5 = r14
            e73 r5 = (defpackage.e73) r5
            long r7 = r5.a
            boolean r15 = r15.a(r7)
            if (r15 != 0) goto L_0x00f6
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x018c
        L_0x00f6:
            osa r2 = (defpackage.osa) r2
            q04 r15 = r2.b()
            p73 r2 = new p73
            r2.<init>(r13, r14, r6)
            r0.a = r13
            r0.b = r14
            r0.v = r4
            java.lang.Object r15 = defpackage.ev0.I(r15, r2, r0)
            if (r15 != r1) goto L_0x010f
            goto L_0x018c
        L_0x010f:
            a32 r15 = (defpackage.a32) r15
            if (r15 != 0) goto L_0x0117
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x018c
        L_0x0117:
            m72 r15 = r15.b
            java.util.Map r15 = r15.e
            long r0 = r13.a
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            boolean r15 = r15.containsKey(r0)
            if (r15 == 0) goto L_0x012a
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x018c
        L_0x012a:
            jz9 r15 = r13.j
            e73 r14 = (defpackage.e73) r14
            long r0 = r14.a
            r15.k(r0)
            xme r13 = r13.h
        L_0x0135:
            java.lang.Object r15 = r13.getValue()
            r0 = r15
            j83 r0 = (defpackage.j83) r0
            r0.getClass()
            boolean r1 = r0 instanceof defpackage.z73
            if (r1 == 0) goto L_0x0147
            r1 = r0
            z73 r1 = (defpackage.z73) r1
            goto L_0x0148
        L_0x0147:
            r1 = r6
        L_0x0148:
            if (r1 != 0) goto L_0x014b
            goto L_0x0184
        L_0x014b:
            java.util.List r2 = r1.a
            r4 = r2
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0159:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0175
            java.lang.Object r7 = r4.next()
            r8 = r7
            h83 r8 = (defpackage.h83) r8
            long r8 = r8.getId()
            long r10 = r14.a
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0171
            goto L_0x0159
        L_0x0171:
            r5.add(r7)
            goto L_0x0159
        L_0x0175:
            int r4 = r5.size()
            int r2 = r2.size()
            if (r4 != r2) goto L_0x0180
            goto L_0x0184
        L_0x0180:
            z73 r0 = defpackage.z73.a(r1, r5, r3)
        L_0x0184:
            boolean r15 = r13.b(r15, r0)
            if (r15 == 0) goto L_0x0135
        L_0x018a:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x018c:
            return r1
        L_0x018d:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t73.a(t73, f73, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087 A[LOOP:0: B:18:0x0087->B:29:0x00c5, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.t73 r9, kotlin.coroutines.Continuation r10) {
        /*
            r9.getClass()
            boolean r0 = r10 instanceof defpackage.q73
            if (r0 == 0) goto L_0x0016
            r0 = r10
            q73 r0 = (defpackage.q73) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            q73 r0 = new q73
            r0.<init>(r9, r10)
        L_0x001b:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            java.lang.Class<t73> r3 = defpackage.t73.class
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 == r5) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            op2 r9 = r0.b
            t73 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00f7
        L_0x0036:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003e:
            t73 r9 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x006a
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = r3.getName()
            java.lang.String r2 = "load"
            defpackage.z68.c(r10, r2, new java.lang.Object[0])
            r0.a = r9
            r0.v = r5
            gaf r10 = r9.b
            osa r10 = (defpackage.osa) r10
            q04 r10 = r10.b()
            m73 r2 = new m73
            r6 = 0
            r2.<init>(r9, r6)
            java.lang.Object r10 = defpackage.ev0.I(r10, r2, r0)
            if (r10 != r1) goto L_0x006a
            goto L_0x0158
        L_0x006a:
            op2 r10 = (defpackage.op2) r10
            java.lang.Class r2 = r9.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "response = "
            r6.<init>(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            defpackage.z68.c(r2, r6, new java.lang.Object[0])
            if (r10 != 0) goto L_0x00cb
        L_0x0087:
            xme r10 = r9.h
            java.lang.Object r0 = r10.getValue()
            r1 = r0
            j83 r1 = (defpackage.j83) r1
            boolean r2 = r1 instanceof defpackage.z73
            if (r2 == 0) goto L_0x00bf
            z73 r1 = (defpackage.z73) r1
            java.util.List r2 = r1.a
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00a3:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00b9
            java.lang.Object r4 = r2.next()
            r6 = r4
            h83 r6 = (defpackage.h83) r6
            boolean r6 = r6 instanceof defpackage.d83
            r6 = r6 ^ r5
            if (r6 == 0) goto L_0x00a3
            r3.add(r4)
            goto L_0x00a3
        L_0x00b9:
            r2 = 4
            z73 r1 = defpackage.z73.a(r1, r3, r2)
            goto L_0x00c1
        L_0x00bf:
            v73 r1 = defpackage.v73.a
        L_0x00c1:
            boolean r10 = r10.b(r0, r1)
            if (r10 == 0) goto L_0x0087
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x0158
        L_0x00cb:
            java.lang.String r2 = r3.getName()
            java.util.List r3 = r10.c
            int r5 = r3.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "response chats count = "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            defpackage.z68.c(r2, r5, new java.lang.Object[0])
            r0.a = r9
            r0.b = r10
            r0.v = r4
            java.lang.Object r0 = r9.c(r3, r0)
            if (r0 != r1) goto L_0x00f3
            goto L_0x0158
        L_0x00f3:
            r8 = r0
            r0 = r9
            r9 = r10
            r10 = r8
        L_0x00f7:
            java.util.LinkedHashSet r10 = (java.util.LinkedHashSet) r10
            boolean r1 = r9.o
            if (r1 == 0) goto L_0x0102
            d83 r1 = defpackage.d83.a
            r10.add(r1)
        L_0x0102:
            java.util.List r10 = kotlin.collections.CollectionsKt.toList(r10)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x0116:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x0135
            java.lang.Object r3 = r10.next()
            r4 = r3
            h83 r4 = (defpackage.h83) r4
            long r4 = r4.getId()
            java.lang.Long r4 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L_0x0116
            r2.add(r3)
            goto L_0x0116
        L_0x0135:
            xme r10 = r0.h
        L_0x0137:
            java.lang.Object r0 = r10.getValue()
            r1 = r0
            j83 r1 = (defpackage.j83) r1
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0147
            v73 r1 = defpackage.v73.a
            goto L_0x0150
        L_0x0147:
            z73 r1 = new z73
            boolean r3 = r9.o
            java.lang.Long r4 = r9.v
            r1.<init>(r4, r2, r3)
        L_0x0150:
            boolean r0 = r10.b(r0, r1)
            if (r0 == 0) goto L_0x0137
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0158:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t73.b(t73, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.util.List r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.s73
            if (r0 == 0) goto L_0x0013
            r0 = r14
            s73 r0 = (defpackage.s73) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            s73 r0 = new s73
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.util.Iterator r12 = r0.o
            java.util.LinkedHashSet r13 = r0.c
            jz9 r2 = r0.b
            t73 r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r14)
            r11 = r5
            r5 = r13
            r13 = r11
            goto L_0x00ae
        L_0x0036:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r14)
            jz9 r14 = new jz9
            jz9 r2 = r12.j
            int r2 = r2.d
            r14.<init>((int) r2)
            jz9 r2 = r12.j
            r14.f(r2)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            xme r5 = r12.h
            java.lang.Object r5 = r5.getValue()
            j83 r5 = (defpackage.j83) r5
            boolean r6 = r5 instanceof defpackage.z73
            if (r6 == 0) goto L_0x0060
            z73 r5 = (defpackage.z73) r5
            goto L_0x0061
        L_0x0060:
            r5 = r4
        L_0x0061:
            if (r5 == 0) goto L_0x006a
            java.util.List r5 = r5.a
            if (r5 == 0) goto L_0x006a
            java.util.Collection r5 = (java.util.Collection) r5
            goto L_0x0070
        L_0x006a:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r5 = (java.util.Collection) r5
        L_0x0070:
            r2.<init>(r5)
            d83 r5 = defpackage.d83.a
            r2.remove(r5)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
            r11 = r13
            r13 = r12
            r12 = r11
        L_0x0081:
            boolean r5 = r12.hasNext()
            if (r5 == 0) goto L_0x00ed
            java.lang.Object r5 = r12.next()
            b32 r5 = (defpackage.b32) r5
            kotlin.Lazy r6 = r13.f
            java.lang.Object r6 = r6.getValue()
            qx2 r6 = (defpackage.qx2) r6
            long r7 = r5.a
            r0.a = r13
            r0.b = r14
            r0.c = r2
            r0.o = r12
            r0.x = r3
            my2 r6 = (defpackage.my2) r6
            java.lang.Object r5 = r6.m(r7, r0)
            if (r5 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            r11 = r2
            r2 = r14
            r14 = r5
            r5 = r11
        L_0x00ae:
            a32 r14 = (defpackage.a32) r14
            if (r14 != 0) goto L_0x00b4
        L_0x00b2:
            r6 = r4
            goto L_0x00e5
        L_0x00b4:
            m72 r6 = r14.b
            int r6 = r6.c()
            if (r6 != 0) goto L_0x00bd
            goto L_0x00b2
        L_0x00bd:
            long r6 = r14.a
            r2.e(r6)
            r13.getClass()
            f83 r6 = new f83
            r14.l0()
            java.lang.CharSequence r7 = r14.X
            kotlin.Lazy r8 = r13.c
            java.lang.Object r8 = r8.getValue()
            yva r8 = (defpackage.yva) r8
            m72 r9 = r14.b
            int r9 = r9.c()
            android.content.Context r8 = r8.a
            int r10 = defpackage.zjc.tt_chat_subtitle_count
            java.lang.String r8 = defpackage.ghf.s(r10, r9, r8)
            r6.<init>(r14, r7, r8)
        L_0x00e5:
            if (r6 == 0) goto L_0x00ea
            r5.add(r6)
        L_0x00ea:
            r14 = r2
            r2 = r5
            goto L_0x0081
        L_0x00ed:
            r13.j = r14
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t73.c(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
