package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: dq2  reason: default package */
public final class dq2 {
    public static final /* synthetic */ int m = 0;
    public final long a;
    public final bud b;
    public final qx2 c;
    public final Function0 d;
    public final Lazy e;
    public pm7 f;
    public volatile k72 g;
    public volatile long h;
    public volatile long i = Duration.Companion.m1456getZEROUwyO8pc();
    public volatile boolean j;
    public final Lazy k = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new nm1(8, this));
    public final CoroutineContext l;

    public dq2(long j2, sbe sbe, Lazy lazy, bud bud, qx2 qx2, jsc jsc) {
        this.a = j2;
        this.b = bud;
        this.c = qx2;
        this.d = jsc;
        this.e = lazy;
        this.l = sbe.a.plus(new AbstractCoroutineContextElement(r04.a));
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "dq2", wj6.i(j2, "init #"), (Throwable) null);
        }
    }

    public final a32 a() {
        return (a32) ((my2) this.c).o(this.a).a.getValue();
    }

    public final boolean b() {
        if (a() != null) {
            a32 a2 = a();
            Long l2 = null;
            Long valueOf = a2 != null ? Long.valueOf(a2.a) : null;
            ay2 ay2 = ((my2) this.c).b;
            a32 a32 = (a32) ((ome) ((ConcurrentHashMap) ay2.y).computeIfAbsent(0L, new yi(4, new rx2(0, ay2)))).getValue();
            if (a32 != null) {
                l2 = Long.valueOf(a32.a);
            }
            if (Intrinsics.areEqual((Object) valueOf, (Object) l2)) {
                return true;
            }
        }
        return false;
    }

    public final Unit c(long j2, Continuation continuation) {
        if (!b() || j2 != 0) {
            Duration.Companion companion = Duration.Companion;
            long duration = DurationKt.toDuration(System.nanoTime(), DurationUnit.NANOSECONDS);
            long r5 = Duration.m1388minusLRDsOJo(duration, this.i);
            if (Duration.m1352compareToLRDsOJo(r5, ((Duration) this.k.getValue()).m1408unboximpl()) < 0) {
                z68.n("dq2", (IOException) null, "requestForChatSubscribeIfNeed #%d: request diff = %s", Arrays.copyOf(new Object[]{Boxing.boxLong(this.a), Duration.m1351boximpl(r5)}, 2));
                return Unit.INSTANCE;
            } else if (!((Boolean) this.d.invoke()).booleanValue()) {
                z68.p("dq2", "requestForChatSubscribeIfNeed: needSubscribeToPushes return false!");
                return Unit.INSTANCE;
            } else {
                this.i = duration;
                jna jna = (jna) ((rl) this.e.getValue());
                jna.z(jna, new vp2(((ltb) jna.D()).a.n(), j2, true));
                qx2 qx2 = this.c;
                ((my2) qx2).n().j0(this.a, true);
                Unit unit = Unit.INSTANCE;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                return unit;
            }
        } else {
            z68.n("dq2", (IOException) null, "requestForChatSubscribeIfNeed #%d: invalid serverId == 0L", Arrays.copyOf(new Object[]{Boxing.boxLong(this.a)}, 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        r4 = ((kotlin.time.Duration) r6.k.getValue()).m1408unboximpl();
        r0.a = r6;
        r0.o = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        if (defpackage.xk4.c(r4, r0) != r1) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c8, code lost:
        if (r6.j == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ca, code lost:
        r0.a = null;
        r0.o = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
        if (r6.e(r0) != r1) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d8, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d9, code lost:
        r0.a = null;
        r0.o = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e2, code lost:
        if (r6.d(r0) != r1) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e4, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e7, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.cq2
            if (r0 == 0) goto L_0x0013
            r0 = r7
            cq2 r0 = (defpackage.cq2) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            cq2 r0 = new cq2
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            switch(r2) {
                case 0: goto L_0x0047;
                case 1: goto L_0x0043;
                case 2: goto L_0x003d;
                case 3: goto L_0x003d;
                case 4: goto L_0x0036;
                case 5: goto L_0x0031;
                case 6: goto L_0x002c;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x00e5
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x00d6
        L_0x0036:
            dq2 r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x00c6
        L_0x003d:
            dq2 r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x00ae
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0069
        L_0x0047:
            kotlin.ResultKt.throwOnFailure(r7)
            long r4 = r6.a
            java.lang.Long r7 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r4)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r2 = "dq2"
            java.lang.String r4 = "subscribe() #%d"
            defpackage.z68.c(r2, r4, r7)
            boolean r7 = r6.j
            if (r7 == 0) goto L_0x006c
            r7 = 1
            r0.o = r7
            kotlin.Unit r6 = r6.e(r0)
            if (r6 != r1) goto L_0x0069
            return r1
        L_0x0069:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x006c:
            a32 r7 = r6.a()
            if (r7 == 0) goto L_0x0077
            a32 r7 = r6.f(r7)
            goto L_0x0078
        L_0x0077:
            r7 = r3
        L_0x0078:
            if (r7 != 0) goto L_0x0092
            qx2 r7 = r6.c
            long r4 = r6.a
            r0.a = r6
            r2 = 2
            r0.o = r2
            my2 r7 = (defpackage.my2) r7
            r62 r7 = r7.n()
            r2 = 0
            r7.j0(r4, r2)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            if (r7 != r1) goto L_0x00ae
            return r1
        L_0x0092:
            m72 r2 = r7.b
            k72 r2 = r2.c
            r6.g = r2
            m72 r2 = r7.b
            long r4 = r2.a
            r6.h = r4
            m72 r7 = r7.b
            long r4 = r7.a
            r0.a = r6
            r7 = 3
            r0.o = r7
            kotlin.Unit r7 = r6.c(r4, r0)
            if (r7 != r1) goto L_0x00ae
            return r1
        L_0x00ae:
            kotlin.Lazy r7 = r6.k
            java.lang.Object r7 = r7.getValue()
            kotlin.time.Duration r7 = (kotlin.time.Duration) r7
            long r4 = r7.m1408unboximpl()
            r0.a = r6
            r7 = 4
            r0.o = r7
            java.lang.Object r7 = defpackage.xk4.c(r4, r0)
            if (r7 != r1) goto L_0x00c6
            return r1
        L_0x00c6:
            boolean r7 = r6.j
            if (r7 == 0) goto L_0x00d9
            r0.a = r3
            r7 = 5
            r0.o = r7
            kotlin.Unit r6 = r6.e(r0)
            if (r6 != r1) goto L_0x00d6
            return r1
        L_0x00d6:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L_0x00d9:
            r0.a = r3
            r7 = 6
            r0.o = r7
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L_0x00e5
            return r1
        L_0x00e5:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq2.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Unit e(Continuation continuation) {
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, "dq2", wj6.i(this.a, "unsubscribe() #"), (Throwable) null);
        }
        this.i = Duration.Companion.m1456getZEROUwyO8pc();
        a32 f2 = f(a());
        if (f2 == null) {
            return Unit.INSTANCE;
        }
        ((jna) ((rl) this.e.getValue())).n(f2.b.a, false);
        qx2 qx2 = this.c;
        ((my2) qx2).n().j0(this.a, false);
        Unit unit = Unit.INSTANCE;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return unit;
    }

    public final a32 f(a32 a32) {
        a32 a2 = a();
        long j2 = this.a;
        if (a2 == null) {
            z68.n("dq2", (IOException) null, "validate #%d: chat is null", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
            return null;
        } else if (b()) {
            return a2;
        } else {
            m72 m72 = a2.b;
            if (m72.a == 0) {
                z68.n("dq2", (IOException) null, "validate #%d: chatServerId == 0L", Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
                return null;
            } else if (a2.E() || a2.S()) {
                z68.c("dq2", "validate #%d: chat is valid!", Long.valueOf(j2));
                return a32;
            } else {
                z68.n("dq2", (IOException) null, "validate #%d: invalid chat status %s", Arrays.copyOf(new Object[]{Long.valueOf(j2), m72.c}, 2));
                return null;
            }
        }
    }
}
