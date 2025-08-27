package defpackage;

import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;

/* renamed from: x59  reason: default package */
public final class x59 extends xag {
    public static final /* synthetic */ KProperty[] I0;
    public final wie A0 = o5a.U();
    public final wie B0 = o5a.U();
    public final LongSparseArray C0 = new LongSparseArray();
    public final xme D0;
    public final etc E0;
    public final s85 F0;
    public final Lazy G0;
    public final String H0;
    public final Lazy X;
    public final Lazy Y;
    public final Lazy Z;
    public final long b;
    public final long c;
    public final long o;
    public final bud v;
    public final Lazy v0;
    public final x23 w;
    public final Lazy w0;
    public final gaf x;
    public final Lazy x0;
    public final Lazy y;
    public final g39 y0;
    public final Lazy z;
    public final wie z0 = o5a.U();

    static {
        Class<x59> cls = x59.class;
        I0 = new KProperty[]{rae.s(cls, "loadContentJob", "getLoadContentJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "loadMembersJob", "getLoadMembersJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "loadReactionsJob", "getLoadReactionsJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public x59(long j, long j2, long j3) {
        vi9 vi9 = vi9.a;
        gaf dispatchers = vi9.getDispatchers();
        Lazy h = vi9.getAccessor().h(qx2.class);
        Lazy h2 = vi9.getAccessor().h(to9.class);
        Lazy h3 = vi9.getAccessor().h(eu3.class);
        Lazy h4 = vi9.getAccessor().h(rtb.class);
        Lazy h5 = vi9.getAccessor().h(lr6.class);
        Lazy h6 = vi9.getAccessor().h(zq6.class);
        Lazy h7 = vi9.getAccessor().h(ptb.class);
        Lazy h8 = vi9.getAccessor().h(is9.class);
        this.b = j;
        this.c = j2;
        this.o = j3;
        this.v = (bud) vi9.getAccessor().g(bud.class);
        this.w = (x23) vi9.getAccessor().g(x23.class);
        this.x = dispatchers;
        this.y = h;
        this.z = h2;
        this.X = h3;
        this.Y = h4;
        this.Z = h5;
        this.v0 = h6;
        this.w0 = h7;
        this.x0 = h8;
        q4 q4Var = ((ak9) vi9.getAccessor().g(ak9.class)).a;
        this.y0 = new g39(j2, j, (sv0) q4Var.g(sv0.class), (gaf) q4Var.g(gaf.class));
        xme a = f6e.a(CollectionsKt.emptyList());
        this.D0 = a;
        this.E0 = new etc(a);
        this.F0 = new s85(0);
        this.G0 = LazyKt.lazy(new c28(5, this));
        this.H0 = x59.class.getName();
    }

    public static final void j(x59 x59) {
        Iterator it;
        LongSparseArray longSparseArray;
        y29 y29;
        x59 x592 = x59;
        LongSparseArray longSparseArray2 = x592.C0;
        if (longSparseArray2.size() != 0) {
            xme xme = x592.D0;
            Iterable iterable = (List) xme.getValue();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (true) {
                y29 y292 = null;
                if (it2.hasNext()) {
                    Object obj = (lz7) it2.next();
                    if (obj instanceof y29) {
                        y292 = obj;
                    }
                    if (y292 != null) {
                        long j = y292.a;
                        if (longSparseArray2.indexOfKey(j) >= 0) {
                            y29 y293 = (y29) obj;
                            long j2 = y293.a;
                            boolean z2 = y293.z;
                            boolean z3 = y293.X;
                            CharSequence charSequence = y293.b;
                            ngf ngf = y293.c;
                            String str = y293.o;
                            boolean z4 = y293.v;
                            longSparseArray = longSparseArray2;
                            it = it2;
                            boolean z5 = z3;
                            long j3 = y293.w;
                            boolean z6 = z2;
                            y29 = new y29(j2, charSequence, ngf, str, z4, j3, y293.x, (hqc) longSparseArray2.get(j), z6, z5);
                            arrayList.add(y29);
                            it2 = it;
                            longSparseArray2 = longSparseArray;
                        }
                    }
                    longSparseArray = longSparseArray2;
                    it = it2;
                    y29 = obj;
                    arrayList.add(y29);
                    it2 = it;
                    longSparseArray2 = longSparseArray;
                } else {
                    xme.m((Object) null, arrayList);
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object k(defpackage.x59 r8, defpackage.a32 r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.p59
            if (r0 == 0) goto L_0x0013
            r0 = r10
            p59 r0 = (defpackage.p59) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            p59 r0 = new p59
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r8 = r0.a
            tz9 r8 = (defpackage.tz9) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00a7
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            java.lang.Object r8 = r0.a
            tz9 r8 = (defpackage.tz9) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0095
        L_0x0044:
            a32 r9 = r0.b
            java.lang.Object r8 = r0.a
            x59 r8 = (defpackage.x59) r8
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0068
        L_0x004e:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Lazy r10 = r8.z
            java.lang.Object r10 = r10.getValue()
            to9 r10 = (defpackage.to9) r10
            r0.a = r8
            r0.b = r9
            r0.v = r5
            long r5 = r8.c
            java.lang.Object r10 = r10.a(r5, r0)
            if (r10 != r1) goto L_0x0068
            goto L_0x00b6
        L_0x0068:
            ha9 r10 = (defpackage.ha9) r10
            boolean r2 = r8.q()
            xme r5 = r8.D0
            if (r2 == 0) goto L_0x00ad
            if (r10 != 0) goto L_0x0075
            goto L_0x00ad
        L_0x0075:
            m72 r2 = r9.b
            int r2 = r2.c()
            m72 r6 = r9.b
            java.util.Map r6 = r6.e
            int r6 = r6.size()
            r7 = 0
            if (r2 > r6) goto L_0x0099
            r0.a = r5
            r0.b = r7
            r0.v = r4
            r2 = 0
            java.lang.Object r10 = r8.n(r9, r10, r2, r0)
            if (r10 != r1) goto L_0x0094
            goto L_0x00b6
        L_0x0094:
            r8 = r5
        L_0x0095:
            r8.setValue(r10)
            goto L_0x00aa
        L_0x0099:
            r0.a = r5
            r0.b = r7
            r0.v = r3
            java.lang.Object r10 = r8.o(r9, r10, r0)
            if (r10 != r1) goto L_0x00a6
            goto L_0x00b6
        L_0x00a6:
            r8 = r5
        L_0x00a7:
            r8.setValue(r10)
        L_0x00aa:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x00b6
        L_0x00ad:
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
            r5.setValue(r8)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00b6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x59.k(x59, a32, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089 A[LOOP:0: B:20:0x0083->B:22:0x0089, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object l(defpackage.x59 r5, defpackage.a32 r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.r59
            if (r0 == 0) goto L_0x0013
            r0 = r7
            r59 r0 = (defpackage.r59) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            r59 r0 = new r59
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            x59 r5 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0056
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.String r7 = r5.H0
            java.lang.String r2 = "load reactions"
            defpackage.z68.c(r7, r2, new java.lang.Object[0])
            gaf r7 = r5.x
            osa r7 = (defpackage.osa) r7
            q04 r7 = r7.b()
            s59 r2 = new s59
            r2.<init>(r5, r6, r3)
            r0.a = r5
            r0.o = r4
            java.lang.Object r7 = defpackage.ev0.I(r7, r2, r0)
            if (r7 != r1) goto L_0x0056
            goto L_0x009b
        L_0x0056:
            zd9 r7 = (defpackage.zd9) r7
            java.lang.String r6 = r5.H0
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x005f
            goto L_0x0076
        L_0x005f:
            boolean r1 = r0.c()
            if (r1 == 0) goto L_0x0076
            w78 r1 = defpackage.w78.o
            java.util.List r2 = r7.a
            int r2 = r2.size()
            java.lang.String r4 = "reactions count: "
            java.lang.String r2 = defpackage.wj6.h(r2, r4)
            r0.d(r1, r6, r2, r3)
        L_0x0076:
            android.util.LongSparseArray r6 = r5.C0
            r6.clear()
            java.util.List r6 = r7.a
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L_0x0083:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0099
            java.lang.Object r7 = r6.next()
            sd9 r7 = (defpackage.sd9) r7
            android.util.LongSparseArray r0 = r5.C0
            long r1 = r7.a
            hqc r7 = r7.b
            r0.put(r1, r7)
            goto L_0x0083
        L_0x0099:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x009b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x59.l(x59, a32, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void i() {
        this.C0.clear();
        g39 g39 = this.y0;
        g39.c.f(g39);
    }

    public final a32 m() {
        return (a32) ((my2) ((qx2) this.y.getValue())).o(this.b).a.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(defpackage.a32 r17, defpackage.ha9 r18, boolean r19, kotlin.coroutines.Continuation r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r20
            boolean r2 = r1 instanceof defpackage.m59
            if (r2 == 0) goto L_0x0017
            r2 = r1
            m59 r2 = (defpackage.m59) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.x = r3
            goto L_0x001c
        L_0x0017:
            m59 r2 = new m59
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.v
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.x
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0070
            if (r4 == r7) goto L_0x005d
            if (r4 == r6) goto L_0x0048
            if (r4 != r5) goto L_0x0040
            java.lang.Object r0 = r2.c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r2.b
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r2 = r2.a
            java.util.List r2 = (java.util.List) r2
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0255
        L_0x0040:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0048:
            java.lang.Object r0 = r2.c
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            java.lang.Object r4 = r2.b
            ha9 r4 = (defpackage.ha9) r4
            java.lang.Object r8 = r2.a
            a32 r8 = (defpackage.a32) r8
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r4
            r4 = r0
            r0 = r8
        L_0x005a:
            r8 = r2
            goto L_0x019c
        L_0x005d:
            int r0 = r2.o
            java.lang.Object r4 = r2.c
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            java.lang.Object r8 = r2.b
            ha9 r8 = (defpackage.ha9) r8
            java.lang.Object r9 = r2.a
            a32 r9 = (defpackage.a32) r9
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0122
        L_0x0070:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            r1.element = r0
            r0 = r17
            r4 = r1
            r8 = r2
            r1 = r18
            r2 = r19
        L_0x0082:
            T r9 = r4.element
            x59 r9 = (defpackage.x59) r9
            kotlin.Lazy r9 = r9.y
            java.lang.Object r9 = r9.getValue()
            qx2 r9 = (defpackage.qx2) r9
            r8.a = r0
            r8.b = r1
            r8.c = r4
            r8.o = r2
            r8.x = r7
            my2 r9 = (defpackage.my2) r9
            r62 r9 = r9.n()
            r9.getClass()
            oa9 r10 = r1.X
            oa9 r11 = defpackage.oa9.SENDING
            if (r10 == r11) goto L_0x00af
            oa9 r11 = defpackage.oa9.ERROR
            if (r10 == r11) goto L_0x00af
            oa9 r11 = defpackage.oa9.UNKNOWN
            if (r10 != r11) goto L_0x00b2
        L_0x00af:
            r16 = r8
            goto L_0x0115
        L_0x00b2:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            m72 r11 = r0.b
            java.util.Map r11 = r11.e
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x00c3:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0111
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getKey()
            java.lang.Long r13 = (java.lang.Long) r13
            long r13 = r13.longValue()
            r16 = r8
            long r7 = r1.w
            int r7 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x010d
            java.lang.Object r7 = r12.getValue()
            java.lang.Long r7 = (java.lang.Long) r7
            long r7 = r7.longValue()
            long r13 = r1.o
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 < 0) goto L_0x010d
            hs7 r7 = r9.r
            java.lang.Object r7 = r7.get()
            km3 r7 = (defpackage.km3) r7
            java.lang.Object r8 = r12.getKey()
            java.lang.Long r8 = (java.lang.Long) r8
            long r12 = r8.longValue()
            r8 = 0
            vk3 r7 = r7.p(r12, r8)
            if (r7 == 0) goto L_0x010d
            r10.add(r7)
        L_0x010d:
            r8 = r16
            r7 = 1
            goto L_0x00c3
        L_0x0111:
            r16 = r8
            r7 = r10
            goto L_0x0119
        L_0x0115:
            java.util.List r7 = java.util.Collections.emptyList()
        L_0x0119:
            if (r7 != r3) goto L_0x011c
            return r3
        L_0x011c:
            r9 = r0
            r8 = r1
            r0 = r2
            r1 = r7
            r2 = r16
        L_0x0122:
            java.util.List r1 = (java.util.List) r1
            r7 = 0
            if (r0 != 0) goto L_0x01a6
            jz9 r0 = new jz9
            r0.<init>((java.lang.Object) r7)
            r10 = r1
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x0133:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x014d
            java.lang.Object r11 = r10.next()
            vk3 r11 = (defpackage.vk3) r11
            boolean r12 = r11.B()
            if (r12 == 0) goto L_0x0133
            long r11 = r11.r()
            r0.e(r11)
            goto L_0x0133
        L_0x014d:
            java.util.ArrayList r10 = r9.k()
            java.util.Iterator r10 = r10.iterator()
        L_0x0155:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x016f
            java.lang.Object r11 = r10.next()
            vk3 r11 = (defpackage.vk3) r11
            boolean r12 = r11.B()
            if (r12 == 0) goto L_0x0155
            long r11 = r11.r()
            r0.e(r11)
            goto L_0x0155
        L_0x016f:
            boolean r10 = r0.c()
            if (r10 == 0) goto L_0x01a6
            T r1 = r4.element
            x59 r1 = (defpackage.x59) r1
            kotlin.Lazy r1 = r1.x0
            java.lang.Object r1 = r1.getValue()
            is9 r1 = (defpackage.is9) r1
            r2.a = r9
            r2.b = r8
            r2.c = r4
            r2.x = r6
            kotlin.time.Duration$Companion r7 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r7 = kotlin.time.DurationUnit.SECONDS
            long r10 = kotlin.time.DurationKt.toDuration((int) r6, (kotlin.time.DurationUnit) r7)
            java.lang.Object r0 = r1.v(r0, r10, r2)
            if (r0 != r3) goto L_0x0198
            return r3
        L_0x0198:
            r1 = r8
            r0 = r9
            goto L_0x005a
        L_0x019c:
            T r2 = r4.element
            x59 r2 = (defpackage.x59) r2
            r4.element = r2
            r2 = 1
            r7 = 1
            goto L_0x0082
        L_0x01a6:
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder()
            r6 = r1
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x01b6:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x0206
            java.lang.Object r11 = r6.next()
            vk3 r11 = (defpackage.vk3) r11
            boolean r12 = r11.B()
            if (r12 == 0) goto L_0x01cd
            r16 = r6
            r5 = r7
            r6 = r8
            goto L_0x01fb
        L_0x01cd:
            T r12 = r4.element
            x59 r12 = (defpackage.x59) r12
            bj2 r13 = new bj2
            fo3 r14 = defpackage.qe8.t(r11)
            T r15 = r4.element
            x59 r15 = (defpackage.x59) r15
            kotlin.Lazy r15 = r15.w0
            java.lang.Object r15 = r15.getValue()
            ptb r15 = (defpackage.ptb) r15
            r16 = r6
            long r5 = r11.r()
            mtb r5 = r15.b(r5)
            ntb r5 = defpackage.qe8.m(r5)
            r6 = r8
            r7 = 0
            r13.<init>(r14, r5, r7)
            y29 r5 = r12.t(r13)
        L_0x01fb:
            if (r5 == 0) goto L_0x0200
            r10.add(r5)
        L_0x0200:
            r8 = r6
            r5 = 3
            r7 = 0
            r6 = r16
            goto L_0x01b6
        L_0x0206:
            r6 = r8
            r0.addAll(r10)
            java.util.ArrayList r5 = r9.k()
            kotlin.sequences.Sequence r5 = kotlin.collections.CollectionsKt.asSequence(r5)
            ep1 r7 = new ep1
            r8 = 6
            r7.<init>(r1, r4, r6, r8)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.filter(r5, r7)
            vq7 r5 = new vq7
            r7 = 14
            r5.<init>((int) r7, (java.lang.Object) r4)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.map(r1, r5)
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r5, r1)
            long r5 = r6.w
            T r1 = r4.element
            x59 r1 = (defpackage.x59) r1
            x23 r1 = r1.w
            qjd r1 = (defpackage.qjd) r1
            long r7 = r1.s()
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x025a
            T r1 = r4.element
            x59 r1 = (defpackage.x59) r1
            r2.a = r0
            r2.b = r0
            r2.c = r0
            r4 = 3
            r2.x = r4
            java.lang.Object r1 = r1.r(r2)
            if (r1 != r3) goto L_0x0253
            return r3
        L_0x0253:
            r2 = r0
            r3 = r2
        L_0x0255:
            r0.add(r1)
            r0 = r3
            goto L_0x025b
        L_0x025a:
            r2 = r0
        L_0x025b:
            cx4 r1 = defpackage.cx4.w
            kotlin.collections.CollectionsKt.sortWith(r0, r1)
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x59.n(a32, ha9, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: ha9} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(defpackage.a32 r8, defpackage.ha9 r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.n59
            if (r0 == 0) goto L_0x0013
            r0 = r10
            n59 r0 = (defpackage.n59) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            n59 r0 = new n59
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004f
            if (r2 == r5) goto L_0x0044
            if (r2 != r4) goto L_0x003c
            java.util.List r7 = r0.o
            java.util.List r7 = (java.util.List) r7
            java.util.List r8 = r0.c
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.b
            java.util.List r9 = (java.util.List) r9
            x59 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00d3
        L_0x003c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0044:
            java.lang.Object r7 = r0.b
            r9 = r7
            ha9 r9 = (defpackage.ha9) r9
            x59 r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0073
        L_0x004f:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = r7.H0
            java.lang.String r2 = "load members from server"
            defpackage.z68.c(r10, r2, new java.lang.Object[0])
            gaf r10 = r7.x
            osa r10 = (defpackage.osa) r10
            q04 r10 = r10.b()
            o59 r2 = new o59
            r2.<init>(r7, r8, r3)
            r0.a = r7
            r0.b = r9
            r0.x = r5
            java.lang.Object r10 = defpackage.ev0.I(r10, r2, r0)
            if (r10 != r1) goto L_0x0073
            return r1
        L_0x0073:
            jj2 r10 = (defpackage.jj2) r10
            if (r10 == 0) goto L_0x0100
            java.util.ArrayList r8 = r10.c
            if (r8 != 0) goto L_0x007d
            goto L_0x0100
        L_0x007d:
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x0088
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            return r7
        L_0x0088:
            java.util.List r10 = kotlin.collections.CollectionsKt.createListBuilder()
            kotlin.sequences.Sequence r8 = kotlin.collections.CollectionsKt.asSequence(r8)
            wk r2 = new wk
            r5 = 22
            r2.<init>(r5, r7, r9)
            kotlin.sequences.Sequence r8 = kotlin.sequences.SequencesKt.filter(r8, r2)
            vq7 r2 = new vq7
            r5 = 15
            r2.<init>((int) r5, (java.lang.Object) r7)
            kotlin.sequences.Sequence r8 = kotlin.sequences.SequencesKt.map(r8, r2)
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r2, r8)
            long r8 = r9.w
            x23 r2 = r7.w
            qjd r2 = (defpackage.qjd) r2
            long r5 = r2.s()
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x00d9
            r0.a = r7
            r0.b = r10
            r8 = r10
            java.util.List r8 = (java.util.List) r8
            r0.c = r8
            r0.o = r8
            r0.x = r4
            java.lang.Object r8 = r7.r(r0)
            if (r8 != r1) goto L_0x00ce
            return r1
        L_0x00ce:
            r0 = r7
            r7 = r10
            r9 = r7
            r10 = r8
            r8 = r9
        L_0x00d3:
            r7.add(r10)
            r10 = r8
            r7 = r0
            goto L_0x00da
        L_0x00d9:
            r9 = r10
        L_0x00da:
            cx4 r8 = defpackage.cx4.w
            kotlin.collections.CollectionsKt.sortWith(r10, r8)
            java.util.List r8 = kotlin.collections.CollectionsKt.build(r9)
            java.lang.String r7 = r7.H0
            a67 r9 = defpackage.z68.b
            if (r9 != 0) goto L_0x00ea
            goto L_0x00ff
        L_0x00ea:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x00ff
            w78 r10 = defpackage.w78.o
            int r0 = r8.size()
            java.lang.String r1 = "members count from server: "
            java.lang.String r0 = defpackage.wj6.h(r0, r1)
            r9.d(r10, r7, r0, r3)
        L_0x00ff:
            return r8
        L_0x0100:
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x59.o(a32, ha9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean q() {
        a32 m = m();
        if (m == null || m.N() || m.K() || this.o == 0) {
            return false;
        }
        m72 m72 = m.b;
        return m72.c() <= ((Number) this.G0.getValue()).intValue() && m72.c() > 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.t59
            if (r0 == 0) goto L_0x0013
            r0 = r5
            t59 r0 = (defpackage.t59) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            t59 r0 = new t59
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            x59 r4 = r0.b
            x59 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x004e
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlin.Lazy r5 = r4.X
            java.lang.Object r5 = r5.getValue()
            eu3 r5 = (defpackage.eu3) r5
            r0.a = r4
            r0.b = r4
            r0.v = r3
            vk3 r5 = r5.d()
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r0 = r4
        L_0x004e:
            vk3 r5 = (defpackage.vk3) r5
            fo3 r5 = defpackage.qe8.t(r5)
            kotlin.Lazy r1 = r0.w0
            java.lang.Object r1 = r1.getValue()
            ptb r1 = (defpackage.ptb) r1
            x23 r0 = r0.w
            qjd r0 = (defpackage.qjd) r0
            long r2 = r0.s()
            mtb r0 = r1.b(r2)
            ntb r0 = defpackage.qe8.m(r0)
            bj2 r1 = new bj2
            r2 = 0
            r1.<init>(r5, r0, r2)
            y29 r4 = r4.t(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x59.r(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final y29 t(bj2 bj2) {
        bj2 bj22 = bj2;
        int i = ((ptb) this.w0.getValue()).b(bj22.a.a).a;
        boolean z2 = i == 10 || i == 20 || i == 40;
        fo3 fo3 = bj22.a;
        String b2 = fo3.b();
        ngf igf = (!fo3.c() || !fo3.d()) ? fo3.c() ? new igf(ewa.u) : new mgf(((rtb) this.Y.getValue()).b(bj22)) : new igf(ewa.s0);
        String a = fo3.a();
        String str = "";
        String str2 = a == null ? str : a;
        String str3 = b2 == null ? str : b2;
        LongSparseArray longSparseArray = this.C0;
        long j = fo3.a;
        hqc hqc = (hqc) longSparseArray.get(j);
        boolean z3 = j == ((qjd) this.w).s();
        Pattern pattern = vua.a;
        List list = fo3.v;
        String str4 = null;
        String str5 = list.isEmpty() ? null : ((er3) list.get(0)).a;
        if (str5 != null) {
            str = str5;
        }
        if (!list.isEmpty()) {
            str4 = ((er3) list.get(0)).c;
        }
        return new y29(fo3.a, str2, igf, str3, z2, bj22.c, vua.b(str, str4), hqc, true, z3);
    }
}
