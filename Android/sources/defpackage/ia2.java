package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: ia2  reason: default package */
public final class ia2 implements u82, s98 {
    public static final String K0 = Reflection.getOrCreateKotlinClass(ia2.class).getSimpleName();
    public final Lazy A0;
    public final a0a B0;
    public volatile zx5 C0;
    public final AtomicBoolean D0;
    public final ConcurrentHashMap E0;
    public final Lazy F0;
    public final Lazy G0;
    public aje H0;
    public pm7 I0;
    public final AtomicBoolean J0;
    public ConcurrentHashMap X = new ConcurrentHashMap();
    public final HashMap Y = new HashMap();
    public final Lazy Z;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy v0;
    public final xme w;
    public final dac w0;
    public final CoroutineContext x;
    public pm7 x0;
    public final jx3 y;
    public aje y0;
    public final Lazy z;
    public or7 z0;

    public ia2(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, sv0 sv0, Lazy lazy7, Lazy lazy8, m95 m95, Lazy lazy9) {
        this.a = lazy7;
        this.b = lazy5;
        Lazy lazy10 = LazyKt.lazy(new ur(9, lazy3));
        this.c = lazy10;
        this.o = lazy2;
        this.v = lazy9;
        xme a2 = f6e.a((Object) null);
        this.w = a2;
        CoroutineContext plus = ((q04) lazy10.getValue()).plus(caa.a);
        this.x = plus;
        jx3 a3 = e14.a(plus.plus(new n95(m95)));
        this.y = a3;
        this.z = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new ur(10, lazy));
        this.Z = lazy4;
        this.v0 = lazy6;
        this.w0 = new dac();
        this.A0 = LazyKt.lazy(new v82(this, 0));
        this.B0 = cvg.a();
        this.D0 = new AtomicBoolean(false);
        this.E0 = new ConcurrentHashMap();
        this.F0 = LazyKt.lazy(new v82(this, 1));
        this.G0 = LazyKt.lazy(new v82(this, 2));
        this.J0 = new AtomicBoolean(false);
        l();
        k();
        sv0.d(new w82(this));
        bs0.K(new ps5(new on2(a2, 28), new x82(lazy8, (Continuation) null), 5), a3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.ia2 r8, java.util.ArrayList r9, boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            r8.getClass()
            boolean r0 = r11 instanceof defpackage.z92
            if (r0 == 0) goto L_0x0016
            r0 = r11
            z92 r0 = (defpackage.z92) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.x = r1
            goto L_0x001b
        L_0x0016:
            z92 r0 = new z92
            r0.<init>(r8, r11)
        L_0x001b:
            java.lang.Object r11 = r0.v
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.util.Iterator r8 = r0.o
            java.util.Collection r9 = r0.c
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.Comparator r10 = r0.b
            ia2 r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            r7 = r0
            r0 = r9
            r9 = r2
        L_0x0038:
            r2 = r7
            goto L_0x0095
        L_0x003a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r11)
            boolean r11 = r9.isEmpty()
            if (r11 == 0) goto L_0x0050
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x00a7
        L_0x0050:
            if (r10 == 0) goto L_0x0055
            v00 r10 = defpackage.r62.J
            goto L_0x0057
        L_0x0055:
            v00 r10 = defpackage.r62.I
        L_0x0057:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x0063:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L_0x009f
            java.lang.Object r2 = r8.next()
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            kotlin.Lazy r2 = r9.Z
            java.lang.Object r2 = r2.getValue()
            qx2 r2 = (defpackage.qx2) r2
            r0.a = r9
            r0.b = r10
            r6 = r11
            java.util.Collection r6 = (java.util.Collection) r6
            r0.c = r6
            r0.o = r8
            r0.x = r3
            my2 r2 = (defpackage.my2) r2
            java.lang.Object r2 = r2.m(r4, r0)
            if (r2 != r1) goto L_0x0091
            goto L_0x00a7
        L_0x0091:
            r7 = r0
            r0 = r11
            r11 = r2
            goto L_0x0038
        L_0x0095:
            a32 r11 = (defpackage.a32) r11
            if (r11 == 0) goto L_0x009c
            r0.add(r11)
        L_0x009c:
            r11 = r0
            r0 = r2
            goto L_0x0063
        L_0x009f:
            java.util.List r11 = (java.util.List) r11
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r1 = kotlin.collections.CollectionsKt.sortedWith(r11, r10)
        L_0x00a7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia2.b(ia2, java.util.ArrayList, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Object n(ia2 ia2, List list, boolean z2, Continuation continuation) {
        ia2.getClass();
        Object d = e14.d(new aa2(ia2, list, z2, (Function0) null, (Continuation) null), continuation);
        return d == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? d : Unit.INSTANCE;
    }

    public final void a() {
        z68.c(K0, "onLogout", new Object[0]);
        this.w.setValue(CollectionsKt.emptyList());
        aje aje = this.H0;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        pm7 pm7 = this.x0;
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        aje aje2 = this.y0;
        if (aje2 != null) {
            aje2.b((CancellationException) null);
        }
        or7 or7 = this.z0;
        if (or7 != null) {
            qq4.a(or7);
        }
        this.X.clear();
        this.Y.clear();
        Object unused = ev0.C(EmptyCoroutineContext.INSTANCE, new q92(this, (Continuation) null));
    }

    public final Object c(String str, Continuation continuation) {
        Object I = ev0.I(this.x, new c92(this, str, (Continuation) null), continuation);
        return I == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? I : Unit.INSTANCE;
    }

    public final Object d(String str, Continuation continuation) {
        boolean areEqual = Intrinsics.areEqual((Object) str, (Object) "all.chat.folder");
        CoroutineContext coroutineContext = this.x;
        return areEqual ? ev0.I(coroutineContext, new g92(this, (Continuation) null), continuation) : ev0.I(coroutineContext, new i92(this, str, (Continuation) null), continuation);
    }

    public final c6d g() {
        return (c6d) this.z.getValue();
    }

    public final jua h() {
        return (jua) this.o.getValue();
    }

    public final void i(List list, Set set) {
        pm7 pm7 = this.I0;
        if (pm7 == null || (pm7.e0() && !this.J0.get())) {
            this.y0 = ev0.v(this.y, (CoroutineContext) null, (f14) null, new n92(this, list, set, (Continuation) null), 3);
        }
    }

    public final on2 j() {
        return new on2(new etc(this.w), 28);
    }

    public final void k() {
        or7 or7 = this.z0;
        if (or7 != null) {
            qq4.a(or7);
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        dac dac = this.w0;
        dac.getClass();
        lfd a2 = xfd.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        ika ika = new ika(dac, 1, timeUnit, a2, true);
        or7 or72 = new or7(new e4(9, (Object) this), m58.g, m58.e);
        ika.a(or72);
        this.z0 = or72;
    }

    public final void l() {
        pm7 pm7 = this.x0;
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        c6d g = g();
        g.getClass();
        b6d b6d = new b6d(g, d7d.a(0, "SELECT * FROM chat_folder"), 0);
        this.x0 = bs0.K(new ps5(new pc(bs0.F(new sbd(new m14(g.a, new String[]{"chat_folder"}, b6d, (Continuation) null)), (q04) this.c.getValue()), 25), new y92(this, (Continuation) null), 5), this.y);
    }

    public final zx5 m(j5d j5d) {
        j5d j5d2 = j5d;
        ArrayList f = g().f(j5d2.a);
        wa9 wa9 = wa9.a;
        String str = j5d2.b;
        List list = j5d2.h;
        CharSequence b2 = ((xva) this.v.getValue()).a(str, list, wa9.b, false, 0, true);
        List emptyList = CollectionsKt.emptyList();
        ws wsVar = new ws((Collection) f);
        Set emptySet = SetsKt.emptySet();
        Set emptySet2 = SetsKt.emptySet();
        List emptyList2 = list == null ? CollectionsKt.emptyList() : list;
        Map map = j5d2.j;
        if (map == null) {
            map = MapsKt.emptyMap();
        }
        Map map2 = map;
        List list2 = j5d2.k;
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        List list3 = list2;
        Set set = j5d2.l;
        if (set == null) {
            set = SetsKt.emptySet();
        }
        return new zx5(j5d2.a, b2, j5d2.c, j5d2.d, emptyList, j5d2.e, true, j5d2.f, f, j5d2.g, wsVar, emptySet, emptySet2, emptyList2, j5d2.i, map2, list3, set);
    }

    public final void o(long j, a32 a32) {
        aje aje = this.H0;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        da2 da2 = new da2(this, j, a32, (Continuation) null);
        this.H0 = ev0.v(this.y, this.x, (f14) null, da2, 2);
    }
}
