package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* renamed from: my2  reason: default package */
public final class my2 implements qx2, fu2, q62, s98 {
    public static final /* synthetic */ int w = 0;
    public final gaf a;
    public final ay2 b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;

    public my2(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, gaf gaf) {
        this.a = gaf;
        this.b = new ay2(gaf, lazy, lazy3, lazy4);
        this.c = lazy4;
        this.o = lazy2;
        this.v = lazy3;
        ev0.v(e14.a(((osa) gaf).b()), (CoroutineContext) null, (f14) null, new dy2(lazy3, this, (Continuation) null), 3);
    }

    public static Sequence k(Sequence sequence, au2 au2) {
        if (au2 instanceof yt2) {
            return SequencesKt.filterNot(sequence, new gl1(24));
        }
        if (au2 instanceof zt2) {
            return sequence;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void a() {
        ay2 ay2 = this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ay2.x;
        for (tz9 value : concurrentHashMap.values()) {
            value.setValue((Object) null);
        }
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) ay2.y;
        for (tz9 value2 : concurrentHashMap2.values()) {
            value2.setValue((Object) null);
        }
        concurrentHashMap.clear();
        concurrentHashMap2.clear();
    }

    public final void b(List list) {
        this.b.b(list);
    }

    public final void c(List list) {
        this.b.c(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(long r8, java.util.List r10, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.ey2
            if (r0 == 0) goto L_0x0013
            r0 = r12
            ey2 r0 = (defpackage.ey2) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            ey2 r0 = new ey2
            r0.<init>(r7, r12)
        L_0x0018:
            java.lang.Object r12 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            boolean r11 = r0.o
            long r8 = r0.c
            java.util.List r7 = r0.b
            r10 = r7
            java.util.List r10 = (java.util.List) r10
            my2 r7 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
        L_0x0033:
            r1 = r8
            r5 = r10
            r6 = r11
            goto L_0x0056
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r12)
            r0.a = r7
            r12 = r10
            java.util.List r12 = (java.util.List) r12
            r0.b = r12
            r0.c = r8
            r0.o = r11
            r0.x = r3
            java.lang.Object r12 = r7.d(r8, r0)
            if (r12 != r1) goto L_0x0033
            return r1
        L_0x0056:
            a32 r12 = (defpackage.a32) r12
            r62 r0 = r7.n()
            m72 r7 = r12.b
            long r3 = r7.a
            r0.c(r1, r3, r5, r6)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my2.g(long, java.util.List, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final a32 h(long j, Function1 function1) {
        return n().i(j, false, new uq(2, function1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.fy2
            if (r0 == 0) goto L_0x0013
            r0 = r6
            fy2 r0 = (defpackage.fy2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            fy2 r0 = new fy2
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x0060
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r6)
            r62 r6 = r5.n()
            r6.getClass()
            b62 r2 = new b62
            r4 = 2
            r2.<init>(r6, r4)
            r4 = 0
            java.lang.Object r6 = r6.o0(r4, r2)
            a32 r6 = (defpackage.a32) r6
            if (r6 != 0) goto L_0x0062
            gaf r6 = r5.a
            osa r6 = (defpackage.osa) r6
            q04 r6 = r6.b()
            gy2 r2 = new gy2
            r2.<init>(r5, r4)
            r0.c = r3
            java.lang.Object r6 = defpackage.ev0.I(r6, r2, r0)
            if (r6 != r1) goto L_0x0060
            return r1
        L_0x0060:
            a32 r6 = (defpackage.a32) r6
        L_0x0062:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my2.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Sequence j(Sequence sequence, au2 au2) {
        if (au2 instanceof yt2) {
            return sequence;
        }
        if (au2 instanceof zt2) {
            zt2 zt2 = (zt2) au2;
            return SequencesKt.filter(sequence, new by2(this, zt2.a, zt2.b, zt2.e, zt2.c, zt2.d));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object l(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.hy2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            hy2 r0 = (defpackage.hy2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            hy2 r0 = new hy2
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            long r5 = r0.b
            my2 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0052
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r7)
            r62 r7 = r4.n()     // Catch:{ all -> 0x002d }
            lbe r7 = r7.C(r5)     // Catch:{ all -> 0x002d }
            r0.a = r4     // Catch:{ all -> 0x002d }
            r0.b = r5     // Catch:{ all -> 0x002d }
            r0.v = r3     // Catch:{ all -> 0x002d }
            java.lang.Object r7 = defpackage.bs0.f(r7, r0)     // Catch:{ all -> 0x002d }
            if (r7 != r1) goto L_0x004f
            return r1
        L_0x004f:
            a32 r7 = (defpackage.a32) r7     // Catch:{ all -> 0x002d }
            goto L_0x006c
        L_0x0052:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to fetch chat for #"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            defpackage.z68.f(r4, r5, r7)
            r7 = 0
        L_0x006c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my2.l(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.iy2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            iy2 r0 = (defpackage.iy2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            iy2 r0 = new iy2
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            long r5 = r0.b
            my2 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x004d
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r7)
            r62 r7 = r4.n()
            ma3 r7 = r7.g()
            r0.a = r4
            r0.b = r5
            r0.v = r3
            java.lang.Object r7 = defpackage.bs0.e(r7, r0)
            if (r7 != r1) goto L_0x004d
            return r1
        L_0x004d:
            r62 r4 = r4.n()
            a32 r4 = r4.D(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my2.m(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final r62 n() {
        return (r62) this.v.getValue();
    }

    public final etc o(long j) {
        ay2 ay2 = this.b;
        return new etc((tz9) ((ConcurrentHashMap) ay2.x).computeIfAbsent(Long.valueOf(j), new yi(5, new ux2(ay2, j, 0))));
    }

    public final etc p(long j) {
        ay2 ay2 = this.b;
        return new etc((tz9) ((ConcurrentHashMap) ay2.y).computeIfAbsent(Long.valueOf(j), new yi(6, new ux2(ay2, j, 1))));
    }

    public final a32 q(long j) {
        return n().K(j);
    }

    public final List r(au2 au2) {
        ArrayList arrayList;
        if (au2 instanceof yt2) {
            v00 v00 = r62.J;
            ArrayList arrayList2 = new ArrayList();
            for (Object next : n().I(v00)) {
                if (((a32) next).O()) {
                    arrayList2.add(next);
                }
            }
            arrayList = arrayList2;
        } else if (au2 instanceof zt2) {
            arrayList = CollectionsKt.emptyList();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return arrayList;
    }

    public final List s(au2 au2, long j, Long l, int i) {
        Sequence j2 = j(k(CollectionsKt.asSequence(n().I(au2.a())), au2), au2);
        Iterator it = j2.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it.next();
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            a32 a32 = (a32) next;
            if (j >= a32.p()) {
                if (l == null) {
                    break;
                }
                if (a32.a != l.longValue()) {
                    break;
                }
            }
            i2++;
        }
        if (i2 == -1) {
            return CollectionsKt.emptyList();
        }
        int i3 = IntCompanionObject.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            i3 = i + i2 + 1;
        }
        return SequencesKt.toList(j2).subList(i2, Math.min(i3, SequencesKt.count(j2)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(long r5, java.util.Set r7, kotlin.coroutines.Continuation r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.jy2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            jy2 r0 = (defpackage.jy2) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x0018
        L_0x0013:
            jy2 r0 = new jy2
            r0.<init>(r4, r8)
        L_0x0018:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.util.Set r7 = r0.b
            my2 r4 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r8)
            r0.a = r4
            r0.b = r7
            r0.v = r3
            java.lang.Object r8 = r4.d(r5, r0)
            if (r8 != r1) goto L_0x0045
            return r1
        L_0x0045:
            a32 r8 = (defpackage.a32) r8
            r62 r4 = r4.n()
            m72 r5 = r8.b
            r4.getClass()
            z62 r4 = defpackage.r62.N(r5, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my2.t(long, java.util.Set, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(long r6, kotlin.coroutines.Continuation r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ky2
            if (r0 == 0) goto L_0x0013
            r0 = r8
            ky2 r0 = (defpackage.ky2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            ky2 r0 = new ky2
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0051
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r8)
            gaf r8 = r5.a
            osa r8 = (defpackage.osa) r8
            q04 r8 = r8.b()
            cy2 r2 = new cy2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.c = r3
            jj7 r5 = new jj7
            r6 = 0
            r5.<init>(r2, r6)
            java.lang.Object r8 = defpackage.ev0.I(r8, r5, r0)
            if (r8 != r1) goto L_0x0051
            return r1
        L_0x0051:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my2.u(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(long r9, java.util.Set r11, int r12, kotlin.coroutines.Continuation r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof defpackage.ly2
            if (r0 == 0) goto L_0x0013
            r0 = r13
            ly2 r0 = (defpackage.ly2) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x0018
        L_0x0013:
            ly2 r0 = new ly2
            r0.<init>(r8, r13)
        L_0x0018:
            java.lang.Object r13 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            int r12 = r0.o
            long r9 = r0.c
            java.util.Set r11 = r0.b
            my2 r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r13)
        L_0x0030:
            r5 = r8
            r6 = r11
            r4 = r12
            goto L_0x0050
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r13)
            r0.a = r8
            r0.b = r11
            r0.c = r9
            r0.o = r12
            r0.x = r3
            java.lang.Object r13 = r8.t(r9, r11, r0)
            if (r13 != r1) goto L_0x0030
            return r1
        L_0x0050:
            r3 = r13
            z62 r3 = (defpackage.z62) r3
            r62 r8 = r5.n()
            vd0 r11 = new vd0
            r7 = 3
            r2 = r11
            r2.<init>((java.lang.Object) r3, (int) r4, (java.lang.Object) r5, (java.lang.Object) r6, (int) r7)
            r12 = 0
            r8.i(r9, r12, r11)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my2.v(long, java.util.Set, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
