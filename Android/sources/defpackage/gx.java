package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import kotlin.sequences.SequencesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import one.me.messages.list.loader.MessageModel;

/* renamed from: gx  reason: default package */
public final class gx implements ek9, we3 {
    public static final /* synthetic */ KProperty[] F = {rae.s(gx.class, "historyBounds", "getHistoryBounds()Lru/ok/tamtam/loader/HistoryBounds;", 0)};
    public final xme A;
    public final etc B;
    public final xme C;
    public final u6h D;
    public final b8d E;
    public final long a;
    public final gaf b;
    public final kn5 c;
    public final cj9 d;
    public final Lazy e;
    public final Lazy f;
    public final s04 g;
    public final esa h;
    public final ez6 i;
    public final tu j;
    public final u0d k;
    public final xe3 l;
    public final int m;
    public final int n;
    public final String o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public final qm7 s;
    public final CoroutineContext t;
    public final jx3 u;
    public final jx3 v;
    public final fx w = new fx(0, LazyKt.lazy(new j6(8, this)), this);
    public final Lazy x;
    public final xme y;
    public final qv z;

    public gx(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, long j2, gaf gaf, kn5 kn5, cj9 cj9, Lazy lazy5, Lazy lazy6, s04 s04, esa esa, ez6 ez6, tu tuVar, u0d u0d, xe3 xe3, int i2, int i3) {
        long j3 = j2;
        gaf gaf2 = gaf;
        kn5 kn52 = kn5;
        cj9 cj92 = cj9;
        xe3 xe32 = xe3;
        this.a = j3;
        this.b = gaf2;
        this.c = kn52;
        this.d = cj92;
        this.e = lazy5;
        this.f = lazy6;
        this.g = s04;
        this.h = esa;
        this.i = ez6;
        this.j = tuVar;
        this.k = u0d;
        this.l = xe32;
        this.m = i2;
        this.n = i3;
        String str = gx.class.getName() + "#" + j3;
        this.o = str;
        this.p = lazy;
        this.q = lazy2;
        this.r = lazy3;
        qm7 b2 = kv0.b();
        this.s = b2;
        osa osa = (osa) gaf2;
        CoroutineContext plus = osa.a().plus(b2).plus(new ex(this));
        this.t = plus;
        jx3 a2 = e14.a(plus.plus(osa.a().s0(1, str)).plus(new qm7(b2)));
        this.u = a2;
        this.v = e14.a(plus.plus(osa.b()).plus(new qm7(b2)));
        Delegates delegates = Delegates.INSTANCE;
        this.x = lazy4;
        xme a3 = f6e.a(0L);
        this.y = a3;
        qv qvVar = new qv(this);
        this.z = qvVar;
        xme a4 = f6e.a(wj9.o);
        this.A = a4;
        this.B = new etc(a4);
        xme a5 = f6e.a(sv.a);
        this.C = a5;
        this.D = new u6h(3, this);
        this.E = new b8d((Object) this);
        bs0.K(new sbd(new cx(a5, (Continuation) null, this)), a2);
        bs0.K(new ps5(bs0.w(new i21(qvVar, a3, new sw(this, (Continuation) null), 4)), new tw(this, (Continuation) null), 5), e14.a(plus));
        dtc dtc = cj92.e;
        pc pcVar = new pc(dtc, 1);
        Duration.Companion companion = Duration.Companion;
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        bs0.K(new ps5(bs0.M(new sbd(new yw(new g12(new ls5(DurationKt.toDuration(15, durationUnit), pcVar, (Continuation) null), EmptyCoroutineContext.INSTANCE, -2, cu0.a, 0), (Continuation) null)), gt5.d(new pc(dtc, 2), DurationKt.toDuration(1000, durationUnit)), new pc(dtc, 3)), new zw(0, (Object) this), 5), a2);
        xe32.a(xe3.c | xe3.d, this);
        kn52.c("initialized @" + System.identityHashCode(this));
    }

    public static void A(List list, gz6 gz6, gz6 gz62) {
        int i2;
        if (gz6 != null && gz62 != null) {
            Iterator it = list.iterator();
            int i3 = 0;
            while (true) {
                i2 = -1;
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                }
                gz6 gz63 = (gz6) it.next();
                if (!(gz63 instanceof fz6) && gz63.getId() == gz6.getId()) {
                    break;
                }
                i3++;
            }
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                gz6 gz64 = (gz6) listIterator.previous();
                if (!(gz64 instanceof fz6) && gz64.getId() == gz62.getId()) {
                    i2 = listIterator.nextIndex();
                    break;
                }
            }
            if (i3 >= 0 && i2 >= 0 && i3 <= i2) {
                while (true) {
                    if (list.get(i2) instanceof fz6) {
                        list.remove(i2);
                    }
                    if (i2 != i3) {
                        i2--;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.gx r11, defpackage.u0d r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            boolean r0 = r15 instanceof defpackage.hw
            if (r0 == 0) goto L_0x0014
            r0 = r15
            hw r0 = (defpackage.hw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.c = r1
        L_0x0012:
            r10 = r0
            goto L_0x001a
        L_0x0014:
            hw r0 = new hw
            r0.<init>(r11, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r15 = r10.a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.c
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00f9
        L_0x002c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r15)
            java.util.List r15 = r11.l(r13)
            kotlin.jvm.internal.Ref$IntRef r1 = new kotlin.jvm.internal.Ref$IntRef
            r1.<init>()
            kotlin.jvm.internal.Ref$LongRef r3 = new kotlin.jvm.internal.Ref$LongRef
            r3.<init>()
            kotlin.jvm.internal.Ref$LongRef r4 = new kotlin.jvm.internal.Ref$LongRef
            r4.<init>()
            r5 = -1
            r4.element = r5
            r7 = r15
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto L_0x005f
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x005f
            goto L_0x00ab
        L_0x005f:
            java.util.Iterator r7 = r7.iterator()
        L_0x0063:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00ab
            java.lang.Object r8 = r7.next()
            gz6 r8 = (defpackage.gz6) r8
            boolean r8 = r8 instanceof defpackage.fz6
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0063
            java.lang.Object r7 = kotlin.collections.CollectionsKt.first(r15)
            boolean r7 = r7 instanceof defpackage.fz6
            if (r7 == 0) goto L_0x00a5
            boolean r13 = r11.q(r13, r15, r2)
            if (r13 == 0) goto L_0x00a5
            int r13 = r11.m
            r1.element = r13
            java.lang.Object r13 = r15.get(r2)
            gz6 r13 = (defpackage.gz6) r13
            long r13 = r13.h()
            r3.element = r13
            dz6 r13 = r11.k()
            long r14 = r3.element
            l03 r13 = r13.f(r14)
            if (r13 == 0) goto L_0x00a2
            long r5 = r13.b()
        L_0x00a2:
            r4.element = r5
            goto L_0x00b1
        L_0x00a5:
            r11 = -1
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)
            goto L_0x0103
        L_0x00ab:
            int r15 = r11.n
            r1.element = r15
            r3.element = r13
        L_0x00b1:
            kn5 r11 = r11.c
            if (r11 == 0) goto L_0x00e4
            long r13 = r3.element
            java.lang.String r13 = defpackage.kn5.b(r13)
            int r14 = r1.element
            long r5 = r4.element
            java.lang.String r15 = defpackage.kn5.b(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "loadDataBackwardRemote time: "
            r5.<init>(r6)
            r5.append(r13)
            java.lang.String r13 = ", count: "
            r5.append(r13)
            r5.append(r14)
            java.lang.String r13 = ", limit: "
            r5.append(r13)
            r5.append(r15)
            java.lang.String r13 = r5.toString()
            r11.c(r13)
        L_0x00e4:
            long r13 = r3.element
            int r11 = r1.element
            long r6 = r4.element
            r10.c = r2
            r5 = 0
            r8 = -1
            r1 = r12
            r2 = r13
            r4 = r11
            java.lang.Object r15 = r1.a(r2, r4, r5, r6, r8, r10)
            if (r15 != r0) goto L_0x00f9
            goto L_0x0103
        L_0x00f9:
            java.lang.Number r15 = (java.lang.Number) r15
            int r11 = r15.intValue()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)
        L_0x0103:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.b(gx, u0d, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(defpackage.gx r11, defpackage.u0d r12, long r13, kotlin.coroutines.Continuation r15) {
        /*
            boolean r0 = r15 instanceof defpackage.jw
            if (r0 == 0) goto L_0x0014
            r0 = r15
            jw r0 = (defpackage.jw) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.o = r1
        L_0x0012:
            r10 = r0
            goto L_0x001a
        L_0x0014:
            jw r0 = new jw
            r0.<init>(r11, r15)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r15 = r10.b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.o
            r2 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 != r2) goto L_0x002e
            gx r11 = r10.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00fe
        L_0x002e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r15)
            java.util.List r15 = r11.l(r13)
            kotlin.jvm.internal.Ref$IntRef r1 = new kotlin.jvm.internal.Ref$IntRef
            r1.<init>()
            kotlin.jvm.internal.Ref$LongRef r3 = new kotlin.jvm.internal.Ref$LongRef
            r3.<init>()
            kotlin.jvm.internal.Ref$LongRef r4 = new kotlin.jvm.internal.Ref$LongRef
            r4.<init>()
            r5 = -1
            r4.element = r5
            r7 = r15
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r8 = r7 instanceof java.util.Collection
            if (r8 == 0) goto L_0x0061
            r8 = r7
            java.util.Collection r8 = (java.util.Collection) r8
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0061
            goto L_0x00af
        L_0x0061:
            java.util.Iterator r7 = r7.iterator()
        L_0x0065:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00af
            java.lang.Object r8 = r7.next()
            gz6 r8 = (defpackage.gz6) r8
            boolean r8 = r8 instanceof defpackage.fz6
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0065
            java.lang.Object r7 = kotlin.collections.CollectionsKt.last(r15)
            boolean r7 = r7 instanceof defpackage.fz6
            if (r7 == 0) goto L_0x00a9
            r7 = 0
            boolean r13 = r11.q(r13, r15, r7)
            if (r13 == 0) goto L_0x00a9
            int r13 = r11.m
            r1.element = r13
            r13 = 2
            java.lang.Object r13 = defpackage.a81.i(r13, r15)
            gz6 r13 = (defpackage.gz6) r13
            long r13 = r13.h()
            r3.element = r13
            dz6 r13 = r11.k()
            long r14 = r3.element
            l03 r13 = r13.d(r14)
            if (r13 == 0) goto L_0x00a6
            long r5 = r13.a()
        L_0x00a6:
            r4.element = r5
            goto L_0x00b5
        L_0x00a9:
            r11 = -1
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)
            goto L_0x0111
        L_0x00af:
            int r15 = r11.n
            r1.element = r15
            r3.element = r13
        L_0x00b5:
            kn5 r13 = r11.c
            if (r13 == 0) goto L_0x00e8
            long r14 = r3.element
            java.lang.String r14 = defpackage.kn5.b(r14)
            int r15 = r1.element
            long r5 = r4.element
            java.lang.String r5 = defpackage.kn5.b(r5)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "loadDataForwardRemote fTime: "
            r6.<init>(r7)
            r6.append(r14)
            java.lang.String r14 = ", fCount: "
            r6.append(r14)
            r6.append(r15)
            java.lang.String r14 = ", fLimit: "
            r6.append(r14)
            r6.append(r5)
            java.lang.String r14 = r6.toString()
            r13.c(r14)
        L_0x00e8:
            long r13 = r3.element
            int r5 = r1.element
            long r8 = r4.element
            r10.a = r11
            r10.o = r2
            r4 = 0
            r6 = -1
            r1 = r12
            r2 = r13
            java.lang.Object r15 = r1.a(r2, r4, r5, r6, r8, r10)
            if (r15 != r0) goto L_0x00fe
            goto L_0x0111
        L_0x00fe:
            java.lang.Number r15 = (java.lang.Number) r15
            int r12 = r15.intValue()
            kn5 r11 = r11.c
            if (r11 == 0) goto L_0x010d
            java.lang.String r13 = "forward remote fetched"
            r11.c(r13)
        L_0x010d:
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r12)
        L_0x0111:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.c(gx, u0d, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(defpackage.gx r9, long r10, kotlin.coroutines.Continuation r12) {
        /*
            r9.getClass()
            boolean r0 = r12 instanceof defpackage.qw
            if (r0 == 0) goto L_0x0017
            r0 = r12
            qw r0 = (defpackage.qw) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0017
            int r1 = r1 - r2
            r0.v = r1
        L_0x0015:
            r6 = r0
            goto L_0x001d
        L_0x0017:
            qw r0 = new qw
            r0.<init>(r9, r12)
            goto L_0x0015
        L_0x001d:
            java.lang.Object r12 = r6.c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.v
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0047
            if (r1 == r3) goto L_0x003c
            if (r1 != r2) goto L_0x0034
            gx r9 = r6.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00b0
        L_0x0034:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x003c:
            long r9 = r6.b
            gx r11 = r6.a
            kotlin.ResultKt.throwOnFailure(r12)
            r7 = r9
            r9 = r11
            r10 = r7
            goto L_0x0098
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r12)
            kn5 r12 = r9.c
            if (r12 == 0) goto L_0x0063
            java.lang.String r1 = defpackage.kn5.b(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "loadPrev: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r12.c(r1)
        L_0x0063:
            r9.B()
            dz6 r12 = r9.k()
            java.util.List r12 = r12.i()
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            r12 = r12 ^ r3
            if (r12 == 0) goto L_0x00a5
            java.util.List r12 = r9.l(r10)
            gz6 r12 = defpackage.kv0.r(r12)
            if (r12 == 0) goto L_0x0085
            long r10 = r12.h()
        L_0x0085:
            r6.a = r9
            r6.b = r10
            r6.v = r3
            tu r2 = r9.j
            u6h r5 = r9.D
            r1 = r9
            r3 = r10
            java.lang.Object r12 = r1.t(r2, r3, r5, r6)
            if (r12 != r0) goto L_0x0098
            goto L_0x00bf
        L_0x0098:
            jx3 r12 = r9.v
            rw r0 = new rw
            r1 = 0
            r0.<init>(r9, r10, r1)
            r10 = 3
            defpackage.ev0.v(r12, r1, r1, r0, r10)
            goto L_0x00b0
        L_0x00a5:
            r6.a = r9
            r6.v = r2
            java.lang.Object r10 = r9.v(r10, r6)
            if (r10 != r0) goto L_0x00b0
            goto L_0x00bf
        L_0x00b0:
            kn5 r10 = r9.c
            if (r10 == 0) goto L_0x00bd
            qv r9 = r9.z
            java.util.List r9 = r9.getValue()
            defpackage.n54.y(r10, r9)
        L_0x00bd:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x00bf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.d(gx, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void e(gx gxVar, List list) {
        gxVar.getClass();
        for (int lastIndex = CollectionsKt.getLastIndex(list); -1 < lastIndex; lastIndex--) {
            if (lastIndex > 0 && (list.get(lastIndex) instanceof fz6) && (list.get(lastIndex - 1) instanceof fz6)) {
                list.remove(lastIndex);
            }
        }
    }

    public static final void f(gx gxVar, List list) {
        boolean z2;
        long g2 = gxVar.k().g();
        gxVar.k().getClass();
        if (g2 != -1) {
            Iterable iterable = list;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    gz6 gz6 = (gz6) it.next();
                    if (!(gz6 instanceof fz6) && gz6.getId() == g2) {
                        z2 = true;
                        break;
                    }
                }
            }
        }
        z2 = false;
        gz6 gz62 = (gz6) CollectionsKt.first(list);
        kn5 kn5 = gxVar.c;
        if (kn5 != null) {
            kn5.c("UpdateFirstGap: firstItemId=" + g2 + ", isFirstGap=" + (gz62 instanceof fz6) + ", hasFirstBound=" + z2);
        }
        if (z2 && (gz62 instanceof fz6)) {
            list.remove(0);
        } else if (!z2 && !(gz62 instanceof fz6)) {
            list.add(0, new Object());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(defpackage.gx r7, java.util.List r8) {
        /*
            dz6 r0 = r7.k()
            long r0 = r0.h()
            dz6 r2 = r7.k()
            r2.getClass()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x003c
            int r2 = r8.size()
            java.util.ListIterator r2 = r8.listIterator(r2)
        L_0x001d:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L_0x0037
            java.lang.Object r3 = r2.previous()
            r4 = r3
            gz6 r4 = (defpackage.gz6) r4
            boolean r5 = r4 instanceof defpackage.fz6
            if (r5 != 0) goto L_0x001d
            long r4 = r4.getId()
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x001d
            goto L_0x0038
        L_0x0037:
            r3 = 0
        L_0x0038:
            if (r3 == 0) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            java.lang.Object r3 = kotlin.collections.CollectionsKt.last(r8)
            gz6 r3 = (defpackage.gz6) r3
            kn5 r7 = r7.c
            if (r7 == 0) goto L_0x006a
            boolean r4 = r3 instanceof defpackage.fz6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "UpdateLastGap: lastItemId="
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = ", isLastGap="
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = ", hasLastBound="
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = r5.toString()
            r7.c(r0)
        L_0x006a:
            if (r2 == 0) goto L_0x0074
            boolean r7 = r3 instanceof defpackage.fz6
            if (r7 == 0) goto L_0x0074
            r8.remove(r3)
            goto L_0x0086
        L_0x0074:
            if (r2 != 0) goto L_0x0086
            boolean r7 = r3 instanceof defpackage.fz6
            if (r7 != 0) goto L_0x0086
            int r7 = r8.size()
            fz6 r0 = new fz6
            r0.<init>()
            r8.add(r7, r0)
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.g(gx, java.util.List):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: gz6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: gz6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: gz6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: gz6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void z(long r5, long r7, java.util.List r9) {
        /*
            r0 = r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0007:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.next()
            r3 = r1
            gz6 r3 = (defpackage.gz6) r3
            boolean r4 = r3 instanceof defpackage.fz6
            if (r4 != 0) goto L_0x0007
            long r3 = r3.h()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x0007
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            gz6 r1 = (defpackage.gz6) r1
            int r5 = r9.size()
            java.util.ListIterator r5 = r9.listIterator(r5)
        L_0x002d:
            boolean r6 = r5.hasPrevious()
            if (r6 == 0) goto L_0x0047
            java.lang.Object r6 = r5.previous()
            r0 = r6
            gz6 r0 = (defpackage.gz6) r0
            boolean r3 = r0 instanceof defpackage.fz6
            if (r3 != 0) goto L_0x002d
            long r3 = r0.h()
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x002d
            r2 = r6
        L_0x0047:
            gz6 r2 = (defpackage.gz6) r2
            A(r9, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.z(long, long, java.util.List):void");
    }

    public final boolean B() {
        List h2;
        List mutableList;
        dz6 k2 = k();
        dz6 k3 = this.i.k();
        k3.getClass();
        dz6.a.getClass();
        this.w.setValue(this, F[0], new cz6(k3));
        qv qvVar = this.z;
        gx gxVar = qvVar.b;
        do {
            h2 = qvVar.getValue();
            mutableList = CollectionsKt.toMutableList(h2);
            e(gxVar, mutableList);
            Iterable iterable = mutableList;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(((gz6) it.next()) instanceof fz6)) {
                            f(gxVar, mutableList);
                            g(gxVar, mutableList);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        } while (!qvVar.a.b(h2, mutableList));
        boolean z2 = !ev0.l(k2, k());
        kn5 kn5 = this.c;
        if (kn5 != null && z2) {
            n54.z(kn5, k());
        }
        return z2;
    }

    public final void a() {
        ev0.v(this.u, (CoroutineContext) null, (f14) null, new dx(this, (Continuation) null), 3);
    }

    public final void h() {
        cj9 cj9 = this.d;
        cj9.a.f(cj9);
        this.s.b((CancellationException) null);
        Set set = (Set) this.l.a.get(Integer.valueOf(xe3.c));
        if (set != null) {
            set.remove(this);
        }
        kn5 kn5 = this.c;
        if (kn5 != null) {
            int identityHashCode = System.identityHashCode(this);
            kn5.c("cleared @" + identityHashCode);
        }
    }

    public final long i() {
        return ((Number) this.y.getValue()).longValue();
    }

    public final long j() {
        Long l2;
        Iterator it = ((wj9) this.A.getValue()).a.iterator();
        if (!it.hasNext()) {
            l2 = null;
        } else {
            Long valueOf = Long.valueOf(((MessageModel) it.next()).c);
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((MessageModel) it.next()).c);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l2 = valueOf;
        }
        return l2 != null ? l2.longValue() : LongCompanionObject.MAX_VALUE;
    }

    public final dz6 k() {
        return (dz6) this.w.getValue(this, F[0]);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x001e: MOVE  (r2v5 java.lang.Iterable) = (r1v1 java.util.List)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final java.util.List l(long r24) {
        /*
            r23 = this;
            r0 = r23
            qv r1 = r0.z
            java.util.List r1 = r1.getValue()
            dz6 r2 = r23.k()
            java.util.List r2 = r2.i()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0017
            return r1
        L_0x0017:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0218
            r2 = r1
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x002f
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x002f
            goto L_0x0218
        L_0x002f:
            java.util.Iterator r4 = r2.iterator()
        L_0x0033:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0218
            java.lang.Object r5 = r4.next()
            gz6 r5 = (defpackage.gz6) r5
            boolean r5 = r5 instanceof defpackage.fz6
            if (r5 == 0) goto L_0x0033
            if (r3 == 0) goto L_0x0050
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0050
            goto L_0x0218
        L_0x0050:
            java.util.Iterator r2 = r2.iterator()
        L_0x0054:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0218
            java.lang.Object r3 = r2.next()
            gz6 r3 = (defpackage.gz6) r3
            boolean r3 = r3 instanceof defpackage.fz6
            if (r3 != 0) goto L_0x0054
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            int r4 = r3.size()
            r6 = -1
            r8 = r6
            r7 = 0
        L_0x0073:
            r9 = 1
            if (r7 >= r4) goto L_0x00a0
            java.lang.Object r10 = r1.get(r7)
            gz6 r10 = (defpackage.gz6) r10
            boolean r10 = r10 instanceof defpackage.fz6
            if (r10 != 0) goto L_0x0087
            int r10 = r1.size()
            int r10 = r10 - r9
            if (r7 != r10) goto L_0x009d
        L_0x0087:
            if (r8 != r6) goto L_0x008d
            r8 = 0
            if (r7 != 0) goto L_0x008d
            goto L_0x009d
        L_0x008d:
            int r9 = r7 + 1
            java.util.List r8 = r1.subList(r8, r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = kotlin.collections.CollectionsKt.toList(r8)
            r2.add(r8)
            r8 = r7
        L_0x009d:
            int r7 = r7 + 1
            goto L_0x0073
        L_0x00a0:
            java.util.Iterator r2 = r2.iterator()
        L_0x00a4:
            boolean r4 = r2.hasNext()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = -9223372036854775808
            r8 = 0
            if (r4 == 0) goto L_0x017d
            java.lang.Object r4 = r2.next()
            r12 = r4
            java.util.List r12 = (java.util.List) r12
            r13 = r12
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x00c5:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x00db
            java.lang.Object r15 = r13.next()
            r5 = r15
            gz6 r5 = (defpackage.gz6) r5
            boolean r5 = r5 instanceof defpackage.fz6
            r5 = r5 ^ r9
            if (r5 == 0) goto L_0x00c5
            r14.add(r15)
            goto L_0x00c5
        L_0x00db:
            java.lang.Object r5 = kotlin.collections.CollectionsKt.firstOrNull(r12)
            boolean r5 = r5 instanceof defpackage.fz6
            r16 = -1
            if (r5 != 0) goto L_0x00e8
            r20 = r10
            goto L_0x012c
        L_0x00e8:
            java.util.Iterator r5 = r14.iterator()
            boolean r13 = r5.hasNext()
            if (r13 != 0) goto L_0x00f4
            r13 = r8
            goto L_0x011f
        L_0x00f4:
            java.lang.Object r13 = r5.next()
            boolean r15 = r5.hasNext()
            if (r15 != 0) goto L_0x00ff
            goto L_0x011f
        L_0x00ff:
            r15 = r13
            gz6 r15 = (defpackage.gz6) r15
            long r18 = r15.h()
        L_0x0106:
            java.lang.Object r15 = r5.next()
            r20 = r15
            gz6 r20 = (defpackage.gz6) r20
            long r20 = r20.h()
            int r22 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r22 <= 0) goto L_0x0119
            r13 = r15
            r18 = r20
        L_0x0119:
            boolean r15 = r5.hasNext()
            if (r15 != 0) goto L_0x0106
        L_0x011f:
            gz6 r13 = (defpackage.gz6) r13
            if (r13 == 0) goto L_0x012a
            long r18 = r13.h()
            r20 = r18
            goto L_0x012c
        L_0x012a:
            r20 = r16
        L_0x012c:
            java.lang.Object r5 = kotlin.collections.CollectionsKt.lastOrNull(r12)
            boolean r5 = r5 instanceof defpackage.fz6
            if (r5 != 0) goto L_0x0137
            r16 = r6
            goto L_0x0174
        L_0x0137:
            java.util.Iterator r15 = r14.iterator()
            boolean r5 = r15.hasNext()
            if (r5 != 0) goto L_0x0142
            goto L_0x016c
        L_0x0142:
            java.lang.Object r8 = r15.next()
            boolean r5 = r15.hasNext()
            if (r5 != 0) goto L_0x014d
            goto L_0x016c
        L_0x014d:
            r5 = r8
            gz6 r5 = (defpackage.gz6) r5
            long r12 = r5.h()
        L_0x0154:
            java.lang.Object r5 = r15.next()
            r14 = r5
            gz6 r14 = (defpackage.gz6) r14
            long r18 = r14.h()
            int r14 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r14 >= 0) goto L_0x0166
            r8 = r5
            r12 = r18
        L_0x0166:
            boolean r5 = r15.hasNext()
            if (r5 != 0) goto L_0x0154
        L_0x016c:
            gz6 r8 = (defpackage.gz6) r8
            if (r8 == 0) goto L_0x0174
            long r16 = r8.h()
        L_0x0174:
            int r5 = (r20 > r24 ? 1 : (r20 == r24 ? 0 : -1))
            if (r5 > 0) goto L_0x00a4
            int r5 = (r24 > r16 ? 1 : (r24 == r16 ? 0 : -1))
            if (r5 > 0) goto L_0x00a4
            r8 = r4
        L_0x017d:
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L_0x018a
            fz6 r2 = new fz6
            r2.<init>()
            java.util.List r8 = kotlin.collections.CollectionsKt.listOf(r2)
        L_0x018a:
            int r2 = r3.size()
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0191:
            if (r3 >= r2) goto L_0x01f4
            java.lang.Object r12 = r1.get(r3)
            gz6 r12 = (defpackage.gz6) r12
            boolean r13 = r12 instanceof defpackage.fz6
            if (r13 != 0) goto L_0x01b5
            int r13 = kotlin.collections.CollectionsKt.getLastIndex(r1)
            if (r3 != r13) goto L_0x01a4
            goto L_0x01b5
        L_0x01a4:
            long r12 = r12.h()
            int r12 = (r24 > r12 ? 1 : (r24 == r12 ? 0 : -1))
            if (r12 < 0) goto L_0x01ae
        L_0x01ac:
            r4 = r9
            goto L_0x01f1
        L_0x01ae:
            int r12 = (r24 > r10 ? 1 : (r24 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x01f1
            if (r3 != 0) goto L_0x01f1
            goto L_0x01ac
        L_0x01b5:
            if (r4 == 0) goto L_0x01cf
            long r13 = r12.h()
            int r13 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x01d7
            int r13 = r3 + -1
            java.lang.Object r13 = r1.get(r13)
            gz6 r13 = (defpackage.gz6) r13
            long r13 = r13.h()
            int r13 = (r24 > r13 ? 1 : (r24 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x01d7
        L_0x01cf:
            long r12 = r12.h()
            int r12 = (r24 > r12 ? 1 : (r24 == r12 ? 0 : -1))
            if (r12 != 0) goto L_0x01dd
        L_0x01d7:
            int r3 = r3 + r9
            java.util.List r1 = r1.subList(r5, r3)
            goto L_0x01fd
        L_0x01dd:
            if (r4 == 0) goto L_0x01ef
            int r4 = kotlin.collections.CollectionsKt.getLastIndex(r1)
            if (r3 != r4) goto L_0x01ef
            int r4 = (r24 > r6 ? 1 : (r24 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ef
            int r3 = r3 + r9
            java.util.List r1 = r1.subList(r5, r3)
            goto L_0x01fd
        L_0x01ef:
            r5 = r3
            r4 = 0
        L_0x01f1:
            int r3 = r3 + 1
            goto L_0x0191
        L_0x01f4:
            fz6 r1 = new fz6
            r1.<init>()
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
        L_0x01fd:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r8)
            if (r1 != 0) goto L_0x0217
            java.lang.Object r1 = kotlin.collections.CollectionsKt.firstOrNull(r8)
            boolean r1 = r1 instanceof defpackage.fz6
            if (r1 != 0) goto L_0x0217
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "The new chunk search algorithm has failed!"
            r1.<init>(r2)
            java.lang.String r0 = r0.o
            defpackage.z68.f(r0, r2, r1)
        L_0x0217:
            return r8
        L_0x0218:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.l(long):java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(defpackage.za9 r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.xv
            if (r0 == 0) goto L_0x0013
            r0 = r15
            xv r0 = (defpackage.xv) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            xv r0 = new xv
            r0.<init>(r13, r15)
        L_0x0018:
            java.lang.Object r15 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x003d
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0133
        L_0x0030:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0110
        L_0x003d:
            java.util.List r13 = r0.b
            java.util.List r13 = (java.util.List) r13
            gx r14 = r0.a
            kotlin.ResultKt.throwOnFailure(r15)
            r12 = r15
            r15 = r13
            r13 = r14
            r14 = r12
            goto L_0x0072
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r15)
            xme r15 = r13.A
            java.lang.Object r15 = r15.getValue()
            wj9 r15 = (defpackage.wj9) r15
            java.util.List r15 = r15.a
            kotlin.Lazy r2 = r13.q
            java.lang.Object r2 = r2.getValue()
            to9 r2 = (defpackage.to9) r2
            java.util.Collection r14 = r14.a
            r0.a = r13
            r6 = r15
            java.util.List r6 = (java.util.List) r6
            r0.b = r6
            r0.v = r5
            java.lang.Object r14 = r2.b(r14, r0)
            if (r14 != r1) goto L_0x0072
            return r1
        L_0x0072:
            java.util.List r14 = (java.util.List) r14
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
            boolean r2 = r14.hasNext()
            r5 = 0
            if (r2 != 0) goto L_0x0083
            r2 = r5
            goto L_0x00a8
        L_0x0083:
            java.lang.Object r2 = r14.next()
            boolean r6 = r14.hasNext()
            if (r6 != 0) goto L_0x008e
            goto L_0x00a8
        L_0x008e:
            r6 = r2
            ha9 r6 = (defpackage.ha9) r6
            long r6 = r6.o
        L_0x0093:
            java.lang.Object r8 = r14.next()
            r9 = r8
            ha9 r9 = (defpackage.ha9) r9
            long r9 = r9.o
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x00a2
            r2 = r8
            r6 = r9
        L_0x00a2:
            boolean r8 = r14.hasNext()
            if (r8 != 0) goto L_0x0093
        L_0x00a8:
            ha9 r2 = (defpackage.ha9) r2
            if (r2 == 0) goto L_0x00af
            long r6 = r2.o
            goto L_0x00b3
        L_0x00af:
            long r6 = r13.j()
        L_0x00b3:
            boolean r14 = r15.isEmpty()
            if (r14 == 0) goto L_0x00d4
            kn5 r14 = r13.c
            if (r14 == 0) goto L_0x00ce
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "handleMessageAdd: No messages in memory, enqueue load around ts="
            r15.<init>(r0)
            r15.append(r6)
            java.lang.String r15 = r15.toString()
            r14.c(r15)
        L_0x00ce:
            r13.r(r6)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        L_0x00d4:
            long r14 = r13.j()
            java.util.List r14 = r13.l(r14)
            java.lang.Object r14 = kotlin.collections.CollectionsKt.last(r14)
            gz6 r14 = (defpackage.gz6) r14
            boolean r15 = r14 instanceof defpackage.fz6
            kn5 r2 = r13.c
            if (r15 != 0) goto L_0x0113
            if (r2 == 0) goto L_0x00ff
            long r14 = r14.h()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "handleMessageAdd: lastHistoryItem not null and not gap, load after ts="
            r3.<init>(r6)
            r3.append(r14)
            java.lang.String r14 = r3.toString()
            r2.c(r14)
        L_0x00ff:
            long r14 = r13.j()
            r0.a = r5
            r0.b = r5
            r0.v = r4
            java.lang.Object r13 = r13.x(r14, r0)
            if (r13 != r1) goto L_0x0110
            return r1
        L_0x0110:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        L_0x0113:
            if (r2 == 0) goto L_0x0126
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "handleMessageAdd: lastHistory is null or gap, load around ts="
            r14.<init>(r15)
            r14.append(r6)
            java.lang.String r14 = r14.toString()
            r2.c(r14)
        L_0x0126:
            r0.a = r5
            r0.b = r5
            r0.v = r3
            java.lang.Object r13 = r13.s(r6, r0)
            if (r13 != r1) goto L_0x0133
            return r1
        L_0x0133:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.m(za9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r12v20, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01eb A[EDGE_INSN: B:95:0x01eb->B:81:0x01eb ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object n(defpackage.eb9 r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.yv
            if (r0 == 0) goto L_0x0013
            r0 = r14
            yv r0 = (defpackage.yv) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.z = r1
            goto L_0x0018
        L_0x0013:
            yv r0 = new yv
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.x
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.z
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 2
            if (r2 == 0) goto L_0x006c
            if (r2 == r3) goto L_0x005f
            if (r2 == r6) goto L_0x0054
            if (r2 == r5) goto L_0x0049
            if (r2 != r4) goto L_0x0041
            long r12 = r0.w
            iz9 r2 = r0.v
            java.util.Iterator r5 = r0.o
            iz9 r6 = r0.c
            java.lang.Object r7 = r0.b
            a32 r7 = (defpackage.a32) r7
            gx r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x017d
        L_0x0041:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0049:
            java.lang.Object r12 = r0.b
            java.util.List r12 = (java.util.List) r12
            gx r13 = r0.a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x013e
        L_0x0054:
            java.lang.Object r12 = r0.b
            java.util.List r12 = (java.util.List) r12
            gx r13 = r0.a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0127
        L_0x005f:
            java.lang.Object r12 = r0.b
            java.util.List r12 = (java.util.List) r12
            gx r13 = r0.a
            kotlin.ResultKt.throwOnFailure(r14)
            r2 = r12
            r12 = r13
            goto L_0x00eb
        L_0x006c:
            kotlin.ResultKt.throwOnFailure(r14)
            jz9 r14 = new jz9
            qv r2 = r12.z
            java.util.List r7 = r2.getValue()
            int r7 = r7.size()
            r14.<init>((int) r7)
            java.util.List r2 = r2.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0088:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x009c
            java.lang.Object r7 = r2.next()
            gz6 r7 = (defpackage.gz6) r7
            long r7 = r7.getId()
            r14.e(r7)
            goto L_0x0088
        L_0x009c:
            java.util.Collection r13 = r13.a
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x00a9:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x00c4
            java.lang.Object r7 = r13.next()
            r8 = r7
            java.lang.Number r8 = (java.lang.Number) r8
            long r8 = r8.longValue()
            boolean r8 = r14.a(r8)
            if (r8 == 0) goto L_0x00a9
            r2.add(r7)
            goto L_0x00a9
        L_0x00c4:
            boolean r13 = r2.isEmpty()
            if (r13 == 0) goto L_0x00d6
            kn5 r12 = r12.c
            if (r12 == 0) goto L_0x00d3
            java.lang.String r13 = "handleMessageUpdate: loaded messages does not intersects with updated ids"
            r12.c(r13)
        L_0x00d3:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x00d6:
            kotlin.Lazy r13 = r12.q
            java.lang.Object r13 = r13.getValue()
            to9 r13 = (defpackage.to9) r13
            r0.a = r12
            r0.b = r2
            r0.z = r3
            java.lang.Object r14 = r13.b(r2, r0)
            if (r14 != r1) goto L_0x00eb
            return r1
        L_0x00eb:
            java.util.List r14 = (java.util.List) r14
            boolean r13 = r14.isEmpty()
            if (r13 == 0) goto L_0x0110
            kn5 r12 = r12.c
            if (r12 == 0) goto L_0x010d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "handleMessageUpdate: not found messages "
            r13.<init>(r14)
            r13.append(r2)
            java.lang.String r14 = " in repository"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.c(r13)
        L_0x010d:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x0110:
            kotlin.Lazy r13 = r12.r
            java.lang.Object r13 = r13.getValue()
            msa r13 = (defpackage.msa) r13
            r0.a = r12
            r0.b = r14
            r0.z = r6
            kotlin.Unit r13 = r13.f(r14)
            if (r13 != r1) goto L_0x0125
            return r1
        L_0x0125:
            r13 = r12
            r12 = r14
        L_0x0127:
            kotlin.Lazy r14 = r13.p
            java.lang.Object r14 = r14.getValue()
            qx2 r14 = (defpackage.qx2) r14
            r0.a = r13
            r0.b = r12
            r0.z = r5
            long r5 = r13.a
            java.lang.Object r14 = r14.d(r5, r0)
            if (r14 != r1) goto L_0x013e
            return r1
        L_0x013e:
            a32 r14 = (defpackage.a32) r14
            iz9 r2 = new iz9
            r2.<init>()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
            r5 = r12
            r8 = r13
            r7 = r14
        L_0x014e:
            boolean r12 = r5.hasNext()
            if (r12 == 0) goto L_0x0182
            java.lang.Object r12 = r5.next()
            ha9 r12 = (defpackage.ha9) r12
            long r13 = r12.b
            kotlin.Lazy r6 = r8.r
            java.lang.Object r6 = r6.getValue()
            msa r6 = (defpackage.msa) r6
            r0.a = r8
            r0.b = r7
            r0.c = r2
            r0.o = r5
            r0.v = r2
            r0.w = r13
            r0.z = r4
            java.lang.Object r12 = r6.g(r7, r12, r0)
            if (r12 != r1) goto L_0x0179
            return r1
        L_0x0179:
            r6 = r2
            r10 = r13
            r14 = r12
            r12 = r10
        L_0x017d:
            r2.e(r12, r14)
            r2 = r6
            goto L_0x014e
        L_0x0182:
            qv r12 = r8.z
            gx r13 = r12.b
        L_0x0186:
            java.util.List r14 = r12.getValue()
            java.util.List r14 = (java.util.List) r14
            r0 = r14
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r4 = r1.iterator()
            r5 = 0
        L_0x019b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x01bf
            java.lang.Object r6 = r4.next()
            int r7 = r5 + 1
            if (r5 >= 0) goto L_0x01ac
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x01ac:
            gz6 r6 = (defpackage.gz6) r6
            long r8 = r6.getId()
            java.lang.Object r6 = r2.a(r8)
            one.me.messages.list.loader.MessageModel r6 = (one.me.messages.list.loader.MessageModel) r6
            if (r6 == 0) goto L_0x01bd
            r0.set(r5, r6)
        L_0x01bd:
            r5 = r7
            goto L_0x019b
        L_0x01bf:
            e(r13, r0)
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L_0x01d0
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x01d0
            goto L_0x01eb
        L_0x01d0:
            java.util.Iterator r1 = r1.iterator()
        L_0x01d4:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01eb
            java.lang.Object r4 = r1.next()
            gz6 r4 = (defpackage.gz6) r4
            boolean r4 = r4 instanceof defpackage.fz6
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x01d4
            f(r13, r0)
            g(r13, r0)
        L_0x01eb:
            java.util.List r0 = (java.util.List) r0
            xme r1 = r12.a
            boolean r14 = r1.b(r14, r0)
            if (r14 == 0) goto L_0x0186
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.n(eb9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void o(long j2, List list, boolean z2, boolean z3) {
        List h2;
        List mutableList;
        m72 m72;
        List h3;
        List mutableList2;
        long j3 = j2;
        List i2 = k().i();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (hashSet.add(Long.valueOf(((gz6) next).getId()))) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (m58.j(((gz6) next2).h(), i2)) {
                arrayList2.add(next2);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList2, k().c());
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = sortedWith.size();
        for (int i3 = 0; i3 < size; i3++) {
            gz6 gz6 = (gz6) sortedWith.get(i3);
            arrayList4.add(gz6);
            if (i3 == CollectionsKt.getLastIndex(sortedWith) || !Intrinsics.areEqual((Object) m58.m(gz6.h(), i2), (Object) m58.m(((gz6) sortedWith.get(i3 + 1)).h(), i2))) {
                arrayList3.add(arrayList4);
                arrayList4 = new ArrayList();
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next3 = it2.next();
            if (!((List) next3).isEmpty()) {
                arrayList5.add(next3);
            }
        }
        boolean isEmpty = arrayList5.isEmpty();
        qv qvVar = this.z;
        if (isEmpty) {
            Iterable<gz6> h4 = qvVar.getValue();
            if (!(h4 instanceof Collection) || !((Collection) h4).isEmpty()) {
                for (gz6 gz62 : h4) {
                    if (!(gz62 instanceof fz6)) {
                        return;
                    }
                }
            }
            a32 a32 = (a32) ((my2) ((qx2) this.p.getValue())).o(this.a).a.getValue();
            if (a32 != null && (m72 = a32.b) != null && m72.j == 0) {
                do {
                    h3 = qvVar.getValue();
                    mutableList2 = CollectionsKt.toMutableList(h3);
                    mutableList2.clear();
                    gx gxVar = qvVar.b;
                    e(gxVar, mutableList2);
                    Iterable iterable = mutableList2;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it3 = iterable.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (!(((gz6) it3.next()) instanceof fz6)) {
                                    f(gxVar, mutableList2);
                                    g(gxVar, mutableList2);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                } while (!qvVar.a.b(h3, mutableList2));
                return;
            }
            return;
        }
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            List list2 = (List) it4.next();
            list2.add(0, new Object());
            list2.add(list2.size(), new Object());
        }
        gx gxVar2 = qvVar.b;
        do {
            h2 = qvVar.getValue();
            mutableList = CollectionsKt.toMutableList(h2);
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                List list3 = (List) it5.next();
                p(mutableList, list3);
                A(mutableList, kv0.r(list3), kv0.P(list3));
            }
            List list4 = (List) CollectionsKt.first(arrayList5);
            if (z2 && (!mutableList.isEmpty())) {
                gz6 P = kv0.P(list4);
                long h5 = P != null ? P.h() : -1;
                if (h5 >= 0) {
                    l03 m2 = m58.m(h5, i2);
                    l03 m3 = m58.m(j3, i2);
                    if (m2 != null && Intrinsics.areEqual((Object) m2, (Object) m3)) {
                        z(j3, h5, mutableList);
                    }
                }
            }
            List list5 = (List) CollectionsKt.last(arrayList5);
            if (z3 && (!mutableList.isEmpty())) {
                gz6 r2 = kv0.r(list5);
                long h6 = r2 != null ? r2.h() : -1;
                if (h6 >= 0) {
                    l03 m4 = m58.m(h6, i2);
                    l03 m5 = m58.m(j3, i2);
                    if (m4 != null && Intrinsics.areEqual((Object) m4, (Object) m5)) {
                        z(h6, j3, mutableList);
                    }
                }
            }
            e(gxVar2, mutableList);
            Iterable iterable2 = mutableList;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it6 = iterable2.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        if (!(((gz6) it6.next()) instanceof fz6)) {
                            f(gxVar2, mutableList);
                            g(gxVar2, mutableList);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        } while (!qvVar.a.b(h2, mutableList));
    }

    public final void p(List list, List list2) {
        int indexOf;
        int indexOf2;
        boolean z2 = CollectionsKt.firstOrNull(list2) instanceof fz6;
        boolean z3 = CollectionsKt.lastOrNull(list2) instanceof fz6;
        jz9 a2 = xa8.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gz6 gz6 = (gz6) it.next();
            if (!(gz6 instanceof fz6)) {
                a2.e(gz6.getId());
            }
        }
        List list3 = SequencesKt.toList(SequencesKt.filterNot(SequencesKt.filterNot(CollectionsKt.asSequence(list2), new h9(11)), new pv(a2, 0)));
        if (!list3.isEmpty()) {
            if (list.isEmpty()) {
                list.addAll(list3);
            } else {
                Comparator e2 = k().e();
                int lastIndex = CollectionsKt.getLastIndex(list);
                for (gz6 gz62 : CollectionsKt.asReversed(list3)) {
                    while (lastIndex > 0) {
                        gz6 gz63 = (gz6) list.get(lastIndex);
                        boolean z4 = gz63 instanceof fz6;
                        boolean z5 = e2.compare(Long.valueOf(gz63.h()), Long.valueOf(gz62.h())) > 0;
                        if (!z4 && !z5) {
                            break;
                        }
                        lastIndex--;
                    }
                    if (lastIndex < CollectionsKt.getLastIndex(list)) {
                        int i2 = lastIndex + 1;
                        if (list.get(i2) instanceof fz6) {
                            lastIndex = i2;
                        }
                    }
                    list.add(lastIndex + 1, gz62);
                }
            }
            if (z2 && (indexOf2 = list.indexOf(CollectionsKt.first(list3))) > 0) {
                int i3 = indexOf2 - 1;
                if (!(list.get(i3) instanceof fz6)) {
                    list.add(i3, new Object());
                }
            }
            if (z3 && (indexOf = list.indexOf(CollectionsKt.last(list3))) > 0) {
                if (!(indexOf == CollectionsKt.getLastIndex(list) ? CollectionsKt.last(list) instanceof fz6 : list.get(indexOf + 1) instanceof fz6)) {
                    list.add(indexOf + 1, new Object());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q(long r6, java.util.List r8, boolean r9) {
        /*
            r5 = this;
            r0 = 0
            if (r9 == 0) goto L_0x004c
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L_0x0015
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0015
        L_0x0012:
            r9 = r0
            goto L_0x0093
        L_0x0015:
            java.util.Iterator r8 = r8.iterator()
            r9 = r0
        L_0x001a:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0093
            java.lang.Object r1 = r8.next()
            gz6 r1 = (defpackage.gz6) r1
            boolean r2 = r1 instanceof defpackage.fz6
            if (r2 != 0) goto L_0x001a
            dz6 r2 = r5.k()
            java.util.Comparator r2 = r2.e()
            long r3 = r1.h()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            int r1 = r2.compare(r1, r3)
            if (r1 > 0) goto L_0x001a
            int r9 = r9 + 1
            if (r9 >= 0) goto L_0x001a
            kotlin.collections.CollectionsKt.throwCountOverflow()
            goto L_0x001a
        L_0x004c:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L_0x005c
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x005c
            goto L_0x0012
        L_0x005c:
            java.util.Iterator r8 = r8.iterator()
            r9 = r0
        L_0x0061:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0093
            java.lang.Object r1 = r8.next()
            gz6 r1 = (defpackage.gz6) r1
            boolean r2 = r1 instanceof defpackage.fz6
            if (r2 != 0) goto L_0x0061
            dz6 r2 = r5.k()
            java.util.Comparator r2 = r2.e()
            long r3 = r1.h()
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            int r1 = r2.compare(r1, r3)
            if (r1 < 0) goto L_0x0061
            int r9 = r9 + 1
            if (r9 >= 0) goto L_0x0061
            kotlin.collections.CollectionsKt.throwCountOverflow()
            goto L_0x0061
        L_0x0093:
            int r6 = r5.m
            if (r9 >= r6) goto L_0x009c
            int r5 = r5.n
            if (r9 == r5) goto L_0x009c
            r0 = 1
        L_0x009c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.q(long, java.util.List, boolean):boolean");
    }

    public final void r(long j2) {
        if (j2 != i()) {
            kn5 kn5 = this.c;
            if (kn5 != null) {
                kn5.c("load around " + j2);
            }
            tv tvVar = new tv(j2);
            xme xme = this.C;
            xme.getClass();
            xme.m((Object) null, tvVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object s(long r20, kotlin.coroutines.Continuation r22) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r0 = r22
            boolean r1 = r0 instanceof defpackage.zv
            if (r1 == 0) goto L_0x001a
            r1 = r0
            zv r1 = (defpackage.zv) r1
            int r2 = r1.x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.x = r2
        L_0x0018:
            r10 = r1
            goto L_0x0020
        L_0x001a:
            zv r1 = new zv
            r1.<init>(r7, r0)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r10.v
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.x
            r12 = 3
            r13 = 0
            r2 = 4
            r14 = 2
            r15 = 1
            if (r1 == 0) goto L_0x0071
            if (r1 == r15) goto L_0x0062
            if (r1 == r14) goto L_0x0055
            if (r1 == r12) goto L_0x0046
            if (r1 != r2) goto L_0x003e
            gx r1 = r10.a
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x0163
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0046:
            long r1 = r10.o
            java.lang.Object r3 = r10.b
            java.util.Collection r3 = (java.util.Collection) r3
            gx r4 = r10.a
            kotlin.ResultKt.throwOnFailure(r0)
            r7 = r1
            r9 = r4
            goto L_0x0101
        L_0x0055:
            long r1 = r10.o
            java.lang.Object r3 = r10.b
            ra3 r3 = (defpackage.ra3) r3
            gx r4 = r10.a
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00e6
        L_0x0062:
            long r1 = r10.o
            sa3 r3 = r10.c
            java.lang.Object r4 = r10.b
            ra3 r4 = (defpackage.ra3) r4
            gx r5 = r10.a
            kotlin.ResultKt.throwOnFailure(r0)
            r14 = r4
            goto L_0x00d2
        L_0x0071:
            kotlin.ResultKt.throwOnFailure(r0)
            kn5 r0 = r7.c
            if (r0 == 0) goto L_0x008d
            java.lang.String r1 = defpackage.kn5.b(r20)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "load: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.c(r1)
        L_0x008d:
            r19.B()
            dz6 r0 = r19.k()
            java.util.List r0 = r0.i()
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r15
            if (r0 == 0) goto L_0x0157
            sa3 r6 = defpackage.kne.b()
            sa3 r5 = defpackage.kne.b()
            cw r4 = new cw
            r16 = 0
            r0 = r4
            r1 = r19
            r2 = r20
            r12 = r4
            r4 = r6
            r17 = r5
            r14 = r6
            r6 = r16
            r0.<init>(r1, r2, r4, r5, r6)
            r10.a = r7
            r10.b = r14
            r0 = r17
            r10.c = r0
            r10.o = r8
            r10.x = r15
            java.lang.Object r1 = defpackage.e14.d(r12, r10)
            if (r1 != r11) goto L_0x00cf
            return r11
        L_0x00cf:
            r3 = r0
            r5 = r7
            r1 = r8
        L_0x00d2:
            r10.a = r5
            r10.b = r14
            r10.c = r13
            r10.o = r1
            r0 = 2
            r10.x = r0
            java.lang.Object r0 = r3.a(r10)
            if (r0 != r11) goto L_0x00e4
            return r11
        L_0x00e4:
            r4 = r5
            r3 = r14
        L_0x00e6:
            java.util.Collection r0 = (java.util.Collection) r0
            r10.a = r4
            r10.b = r0
            r10.o = r1
            r5 = 3
            r10.x = r5
            sa3 r3 = (defpackage.sa3) r3
            java.lang.Object r3 = r3.a(r10)
            if (r3 != r11) goto L_0x00fa
            return r11
        L_0x00fa:
            r7 = r1
            r9 = r4
            r18 = r3
            r3 = r0
            r0 = r18
        L_0x0101:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r4 = kotlin.collections.CollectionsKt.plus(r3, r0)
            r9.B()
            kn5 r0 = r9.c
            if (r0 == 0) goto L_0x012b
            int r1 = r4.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "insert "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " items around "
            r2.append(r1)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            r0.c(r1)
        L_0x012b:
            r5 = 1
            r6 = 1
            r1 = r9
            r2 = r7
            r1.o(r2, r4, r5, r6)
            ew r0 = new ew
            r0.<init>(r9, r7, r13)
            jx3 r1 = r9.v
            r10 = 3
            nk4 r2 = defpackage.ev0.d(r1, r13, r0, r10)
            fw r0 = new fw
            r0.<init>(r9, r7, r13)
            nk4 r3 = defpackage.ev0.d(r1, r13, r0, r10)
            dw r0 = new dw
            r11 = 0
            r1 = r0
            r4 = r9
            r5 = r7
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r7)
            jx3 r1 = r9.u
            defpackage.ev0.v(r1, r13, r13, r0, r10)
            goto L_0x0164
        L_0x0157:
            r10.a = r7
            r10.x = r2
            java.lang.Object r0 = r7.v(r8, r10)
            if (r0 != r11) goto L_0x0162
            return r11
        L_0x0162:
            r1 = r7
        L_0x0163:
            r9 = r1
        L_0x0164:
            kn5 r0 = r9.c
            if (r0 == 0) goto L_0x0171
            qv r1 = r9.z
            java.util.List r1 = r1.getValue()
            defpackage.n54.y(r0, r1)
        L_0x0171:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.s(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(defpackage.tu r11, long r12, defpackage.rv r14, kotlin.coroutines.Continuation r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.gw
            if (r0 == 0) goto L_0x0013
            r0 = r15
            gw r0 = (defpackage.gw) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            gw r0 = new gw
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.c
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.v
            r9 = 3
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0045
            if (r1 == r3) goto L_0x0041
            if (r1 == r2) goto L_0x0038
            if (r1 != r9) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00fc
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            long r10 = r0.b
            rv r14 = r0.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00ee
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00a5
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r15)
            java.util.List r15 = r10.l(r12)
            r1 = r15
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r4 = r1 instanceof java.util.Collection
            r5 = -1
            if (r4 == 0) goto L_0x005f
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x005f
            goto L_0x00a8
        L_0x005f:
            java.util.Iterator r1 = r1.iterator()
        L_0x0063:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00a8
            java.lang.Object r4 = r1.next()
            gz6 r4 = (defpackage.gz6) r4
            boolean r4 = r4 instanceof defpackage.fz6
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x0063
            java.lang.Object r1 = kotlin.collections.CollectionsKt.first(r15)
            boolean r1 = r1 instanceof defpackage.fz6
            if (r1 == 0) goto L_0x0098
            java.lang.Object r12 = r15.get(r3)
            gz6 r12 = (defpackage.gz6) r12
            long r12 = r12.h()
            dz6 r15 = r10.k()
            l03 r15 = r15.f(r12)
            if (r15 == 0) goto L_0x0094
            long r5 = r15.b()
        L_0x0094:
            int r15 = r10.m
        L_0x0096:
            r4 = r15
            goto L_0x00ab
        L_0x0098:
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
            r0.v = r3
            kotlin.Unit r10 = r14.s(r12, r10)
            if (r10 != r8) goto L_0x00a5
            return r8
        L_0x00a5:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x00a8:
            int r15 = r10.n
            goto L_0x0096
        L_0x00ab:
            if (r4 != 0) goto L_0x00b0
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x00b0:
            kn5 r10 = r10.c
            if (r10 == 0) goto L_0x00dd
            java.lang.String r15 = defpackage.kn5.b(r12)
            java.lang.String r1 = defpackage.kn5.b(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "loadDataBackward time: "
            r3.<init>(r7)
            r3.append(r15)
            java.lang.String r15 = ", count: "
            r3.append(r15)
            r3.append(r4)
            java.lang.String r15 = ", limit: "
            r3.append(r15)
            r3.append(r1)
            java.lang.String r15 = r3.toString()
            r10.c(r15)
        L_0x00dd:
            r0.a = r14
            r0.b = r12
            r0.v = r2
            r1 = r11
            r2 = r12
            r7 = r0
            java.lang.Object r15 = r1.b(r2, r4, r5, r7)
            if (r15 != r8) goto L_0x00ed
            return r8
        L_0x00ed:
            r10 = r12
        L_0x00ee:
            java.util.List r15 = (java.util.List) r15
            r12 = 0
            r0.a = r12
            r0.v = r9
            kotlin.Unit r10 = r14.s(r10, r15)
            if (r10 != r8) goto L_0x00fc
            return r8
        L_0x00fc:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.t(tu, long, rv, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(defpackage.tu r11, long r12, defpackage.rv r14, kotlin.coroutines.Continuation r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.iw
            if (r0 == 0) goto L_0x0013
            r0 = r15
            iw r0 = (defpackage.iw) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            iw r0 = new iw
            r0.<init>(r10, r15)
        L_0x0018:
            java.lang.Object r15 = r0.c
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r0.v
            r9 = 3
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0045
            if (r1 == r3) goto L_0x0041
            if (r1 == r2) goto L_0x0038
            if (r1 != r9) goto L_0x0030
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00f7
        L_0x0030:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0038:
            long r10 = r0.b
            rv r14 = r0.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00e9
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00a5
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r15)
            java.util.List r15 = r10.l(r12)
            r1 = r15
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r4 = r1 instanceof java.util.Collection
            r5 = -1
            if (r4 == 0) goto L_0x005f
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x005f
            goto L_0x00a8
        L_0x005f:
            java.util.Iterator r1 = r1.iterator()
        L_0x0063:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00a8
            java.lang.Object r4 = r1.next()
            gz6 r4 = (defpackage.gz6) r4
            boolean r4 = r4 instanceof defpackage.fz6
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x0063
            java.lang.Object r1 = kotlin.collections.CollectionsKt.last(r15)
            boolean r1 = r1 instanceof defpackage.fz6
            if (r1 == 0) goto L_0x0098
            java.lang.Object r12 = defpackage.a81.i(r2, r15)
            gz6 r12 = (defpackage.gz6) r12
            long r12 = r12.h()
            dz6 r15 = r10.k()
            l03 r15 = r15.d(r12)
            if (r15 == 0) goto L_0x0094
            long r5 = r15.a()
        L_0x0094:
            int r15 = r10.m
        L_0x0096:
            r4 = r15
            goto L_0x00ab
        L_0x0098:
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
            r0.v = r3
            kotlin.Unit r10 = r14.s(r12, r10)
            if (r10 != r8) goto L_0x00a5
            return r8
        L_0x00a5:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L_0x00a8:
            int r15 = r10.n
            goto L_0x0096
        L_0x00ab:
            kn5 r10 = r10.c
            if (r10 == 0) goto L_0x00d8
            java.lang.String r15 = defpackage.kn5.b(r12)
            java.lang.String r1 = defpackage.kn5.b(r5)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "loadDataForward time: "
            r3.<init>(r7)
            r3.append(r15)
            java.lang.String r15 = ", count: "
            r3.append(r15)
            r3.append(r4)
            java.lang.String r15 = ", limit: "
            r3.append(r15)
            r3.append(r1)
            java.lang.String r15 = r3.toString()
            r10.c(r15)
        L_0x00d8:
            r0.a = r14
            r0.b = r12
            r0.v = r2
            r1 = r11
            r2 = r12
            r7 = r0
            java.lang.Object r15 = r1.c(r2, r4, r5, r7)
            if (r15 != r8) goto L_0x00e8
            return r8
        L_0x00e8:
            r10 = r12
        L_0x00e9:
            java.util.List r15 = (java.util.List) r15
            r12 = 0
            r0.a = r12
            r0.v = r9
            kotlin.Unit r10 = r14.s(r10, r15)
            if (r10 != r8) goto L_0x00f7
            return r8
        L_0x00f7:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.u(tu, long, rv, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0136 A[EDGE_INSN: B:51:0x0136->B:42:0x0136 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(long r13, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            r0 = 1
            r1 = 2
            boolean r2 = r15 instanceof defpackage.kw
            if (r2 == 0) goto L_0x0015
            r2 = r15
            kw r2 = (defpackage.kw) r2
            int r3 = r2.w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0015
            int r3 = r3 - r4
            r2.w = r3
            goto L_0x001a
        L_0x0015:
            kw r2 = new kw
            r2.<init>(r12, r15)
        L_0x001a:
            java.lang.Object r15 = r2.o
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r2.w
            if (r3 == 0) goto L_0x0044
            if (r3 == r0) goto L_0x003b
            if (r3 != r1) goto L_0x0033
            java.util.Collection r12 = r2.b
            java.util.Collection r12 = (java.util.Collection) r12
            gx r13 = r2.a
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00a1
        L_0x0033:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x003b:
            long r13 = r2.c
            gx r12 = r2.a
            kotlin.ResultKt.throwOnFailure(r15)
        L_0x0042:
            r4 = r13
            goto L_0x0084
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r15)
            lw r15 = new lw
            r3 = 0
            r15.<init>(r12, r13, r3)
            r4 = 3
            jx3 r5 = r12.v
            defpackage.ev0.v(r5, r3, r3, r15, r4)
            kn5 r15 = r12.c
            if (r15 == 0) goto L_0x006c
            java.lang.String r3 = defpackage.kn5.b(r13)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "!WARN! loadEmptyChunksData: "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r15.c(r3)
        L_0x006c:
            r2.a = r12
            r2.c = r13
            r2.w = r0
            int r6 = r12.m
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            tu r3 = r12.j
            r4 = r13
            r9 = r2
            java.lang.Object r15 = r3.c(r4, r6, r7, r9)
            if (r15 != r10) goto L_0x0042
            return r10
        L_0x0084:
            r13 = r15
            java.util.Collection r13 = (java.util.Collection) r13
            tu r3 = r12.j
            r2.a = r12
            r14 = r13
            java.util.Collection r14 = (java.util.Collection) r14
            r2.b = r14
            r2.w = r1
            int r6 = r12.m
            r7 = -9223372036854775808
            r9 = r2
            java.lang.Object r15 = r3.b(r4, r6, r7, r9)
            if (r15 != r10) goto L_0x009e
            return r10
        L_0x009e:
            r11 = r13
            r13 = r12
            r12 = r11
        L_0x00a1:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.List r12 = kotlin.collections.CollectionsKt.plus(r12, r15)
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x00b7:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x00d6
            java.lang.Object r2 = r12.next()
            r3 = r2
            gz6 r3 = (defpackage.gz6) r3
            long r3 = r3.getId()
            java.lang.Long r3 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
            boolean r3 = r14.add(r3)
            if (r3 == 0) goto L_0x00b7
            r15.add(r2)
            goto L_0x00b7
        L_0x00d6:
            kotlin.jvm.functions.Function1[] r12 = new kotlin.jvm.functions.Function1[r1]
            mw r14 = defpackage.mw.a
            r1 = 0
            r12[r1] = r14
            nw r14 = defpackage.nw.a
            r12[r0] = r14
            java.util.Comparator r12 = kotlin.comparisons.ComparisonsKt.compareBy((kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Comparable<?>>[]) r12)
            java.util.List r12 = kotlin.collections.CollectionsKt.sortedWith(r15, r12)
            qv r14 = r13.z
            gx r15 = r14.b
        L_0x00ed:
            java.util.List r1 = r14.getValue()
            java.util.List r1 = (java.util.List) r1
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r2 = kotlin.collections.CollectionsKt.toMutableList(r2)
            r13.p(r2, r12)
            h9 r3 = new h9
            r4 = 12
            r3.<init>(r4)
            kotlin.collections.CollectionsKt.removeAll(r2, r3)
            e(r15, r2)
            r3 = r2
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L_0x011b
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x011b
            goto L_0x0136
        L_0x011b:
            java.util.Iterator r3 = r3.iterator()
        L_0x011f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0136
            java.lang.Object r4 = r3.next()
            gz6 r4 = (defpackage.gz6) r4
            boolean r4 = r4 instanceof defpackage.fz6
            r4 = r4 ^ r0
            if (r4 == 0) goto L_0x011f
            f(r15, r2)
            g(r15, r2)
        L_0x0136:
            java.util.List r2 = (java.util.List) r2
            xme r3 = r14.a
            boolean r1 = r3.b(r1, r2)
            if (r1 == 0) goto L_0x00ed
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.v(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void w() {
        Object value;
        Object obj;
        Object uvVar = new uv(j(), false);
        xme xme = this.C;
        do {
            value = xme.getValue();
            Object obj2 = (wv) value;
            obj = obj2 instanceof tv ? (tv) obj2 : null;
            if (obj == null) {
                obj = uvVar;
            }
        } while (!xme.b(value, obj));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(long r10, kotlin.coroutines.Continuation r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.ow
            if (r0 == 0) goto L_0x0014
            r0 = r12
            ow r0 = (defpackage.ow) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.v = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            ow r0 = new ow
            r0.<init>(r9, r12)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r12 = r6.c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.v
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0044
            if (r1 == r3) goto L_0x0039
            if (r1 != r2) goto L_0x0031
            gx r9 = r6.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00b4
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0039:
            long r9 = r6.b
            gx r11 = r6.a
            kotlin.ResultKt.throwOnFailure(r12)
            r7 = r9
            r9 = r11
            r10 = r7
            goto L_0x009c
        L_0x0044:
            kotlin.ResultKt.throwOnFailure(r12)
            kn5 r12 = r9.c
            if (r12 == 0) goto L_0x0060
            java.lang.String r1 = defpackage.kn5.b(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "loadNext: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r12.c(r1)
        L_0x0060:
            r9.B()
            dz6 r1 = r9.k()
            java.util.List r1 = r1.i()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x00a9
            if (r12 == 0) goto L_0x007b
            java.lang.String r1 = "loadNext: Chunks not empty, started loading from datasources"
            r12.c(r1)
        L_0x007b:
            java.util.List r12 = r9.l(r10)
            gz6 r12 = defpackage.kv0.P(r12)
            if (r12 == 0) goto L_0x0089
            long r10 = r12.h()
        L_0x0089:
            r6.a = r9
            r6.b = r10
            r6.v = r3
            tu r2 = r9.j
            b8d r5 = r9.E
            r1 = r9
            r3 = r10
            java.lang.Object r12 = r1.u(r2, r3, r5, r6)
            if (r12 != r0) goto L_0x009c
            return r0
        L_0x009c:
            jx3 r12 = r9.v
            pw r0 = new pw
            r1 = 0
            r0.<init>(r9, r10, r1)
            r10 = 3
            defpackage.ev0.v(r12, r1, r1, r0, r10)
            goto L_0x00b4
        L_0x00a9:
            r6.a = r9
            r6.v = r2
            java.lang.Object r10 = r9.v(r10, r6)
            if (r10 != r0) goto L_0x00b4
            return r0
        L_0x00b4:
            kn5 r10 = r9.c
            if (r10 == 0) goto L_0x00c1
            qv r9 = r9.z
            java.util.List r9 = r9.getValue()
            defpackage.n54.y(r10, r9)
        L_0x00c1:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gx.x(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void y() {
        Long l2;
        Object value;
        Object obj;
        Iterator it = ((wj9) this.A.getValue()).a.iterator();
        if (!it.hasNext()) {
            l2 = null;
        } else {
            l2 = Long.valueOf(((MessageModel) it.next()).c);
            while (it.hasNext()) {
                Long valueOf = Long.valueOf(((MessageModel) it.next()).c);
                if (l2.compareTo(valueOf) > 0) {
                    l2 = valueOf;
                }
            }
        }
        Object vvVar = new vv(l2 != null ? l2.longValue() : LongCompanionObject.MAX_VALUE, false);
        xme xme = this.C;
        do {
            value = xme.getValue();
            Object obj2 = (wv) value;
            obj = obj2 instanceof tv ? (tv) obj2 : null;
            if (obj == null) {
                obj = vvVar;
            }
        } while (!xme.b(value, obj));
    }
}
