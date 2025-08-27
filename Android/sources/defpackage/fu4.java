package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;

/* renamed from: fu4  reason: default package */
public final class fu4 {
    public static final js9 k = new Object();
    public static volatile fu4 l;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public Object j;

    public fu4(voc voc) {
        this.c = voc;
        this.d = new yl4(0);
        this.b = new yl4(0);
        this.a = new yl4(0);
        this.e = new yl4(0);
        this.f = new yl4(0);
        this.g = new HashMap();
        this.h = new yl4(0);
        this.i = new yl4(0);
        this.j = new xga();
    }

    public static long a(ArrayList arrayList, Function1 function1) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Long l2 = (Long) function1.invoke((lie) it.next());
            if (l2 != null) {
                arrayList2.add(l2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((Number) next).longValue() != -1) {
                arrayList3.add(next);
            }
        }
        return CollectionsKt___CollectionsKt.sumOfLong(arrayList3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.fu4 r6, long r7, defpackage.mta r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.du4
            if (r0 == 0) goto L_0x0013
            r0 = r10
            du4 r0 = (defpackage.du4) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            du4 r0 = new du4
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r10 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            long r7 = r0.c
            pt4 r9 = r0.b
            fu4 r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
        L_0x002e:
            r3 = r7
            r5 = r9
            goto L_0x004f
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r10)
            r0.a = r6
            r0.b = r9
            r0.c = r7
            r0.w = r3
            java.lang.Object r10 = r6.d
            a23 r10 = (defpackage.a23) r10
            java.lang.Object r10 = r10.a(r7, r0)
            if (r10 != r1) goto L_0x002e
            goto L_0x0079
        L_0x004f:
            java.lang.Object r6 = r6.h
            kotlin.Lazy r6 = (kotlin.Lazy) r6
            java.lang.Object r6 = r6.getValue()
            rl r6 = (defpackage.rl) r6
            jna r6 = (defpackage.jna) r6
            boolean r7 = r6.r(r3)
            if (r7 != 0) goto L_0x0062
            goto L_0x0077
        L_0x0062:
            vt4 r7 = new vt4
            jtb r8 = r6.D()
            ltb r8 = (defpackage.ltb) r8
            a33 r8 = r8.a
            long r1 = r8.n()
            r0 = r7
            r0.<init>(r1, r3, r5)
            defpackage.jna.A(r6, r7)
        L_0x0077:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0079:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu4.b(fu4, long, mta, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(defpackage.fu4 r5, defpackage.b89 r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof defpackage.mk2
            if (r0 == 0) goto L_0x0016
            r0 = r7
            mk2 r0 = (defpackage.mk2) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x001b
        L_0x0016:
            mk2 r0 = new mk2
            r0.<init>(r5, r7)
        L_0x001b:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0050
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r5.d
            gaf r7 = (defpackage.gaf) r7
            osa r7 = (defpackage.osa) r7
            q04 r7 = r7.b()
            nk2 r2 = new nk2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.c = r3
            java.lang.Object r7 = defpackage.ev0.I(r7, r2, r0)
            if (r7 != r1) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r1 = r7
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu4.c(fu4, b89, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void d(ViewGroup viewGroup, k2b k2b) {
        mag mag = new mag(0, viewGroup);
        h9 h9Var = new h9(0);
        i9 i9Var = new i9(k2b, 0);
        veg veg = veg.a;
        SequencesKt.count(SequencesKt.onEach(SequencesKt___SequencesKt.flatMap(mag, new ued(h9Var, i9Var)), new i9(k2b, 1)));
    }

    public static /* synthetic */ void e(fu4 fu4, ViewGroup viewGroup) {
        k2b f2 = fu4.f();
        fu4.getClass();
        d(viewGroup, f2);
    }

    public k2b f() {
        k2b m = ((l15) this.f).m(i());
        return m == null ? m2b.a : m;
    }

    public boolean g() {
        k9a o = ((l15) this.g).o();
        if (o instanceof e9a) {
            if (((int) ((Math.log10((double) RangesKt.coerceIn(((Number) ((xme) ((he) this.e).c).getValue()).floatValue(), (float) c44.DEFAULT_ASPECT_RATIO, 10000.0f)) / ((double) 4)) * ((double) 100))) > ((e9a) o).b) {
                return false;
            }
        } else if (o instanceof i9a) {
            return ((i9a) o).b();
        } else {
            if (Intrinsics.areEqual((Object) o, (Object) j9a.b)) {
                if (((p53) ((xme) ((ox0) this.d).c).getValue()) != p53.b) {
                    return false;
                }
            } else if (!Intrinsics.areEqual((Object) o, (Object) h9a.b)) {
                if (Intrinsics.areEqual((Object) o, (Object) g9a.b)) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public void h() {
        ((yl4) this.d).b = -1;
        ((yl4) this.b).b = -1;
        ((yl4) this.a).b = -1;
        ((yl4) this.e).b = -1;
        ((yl4) this.f).b = -1;
        ((HashMap) this.g).clear();
        ((yl4) this.h).b = -1;
        ((yl4) this.i).b = -1;
    }

    public String i() {
        boolean g2 = g();
        l15 l15 = (l15) this.g;
        if (g2) {
            SharedPreferences q = l15.q();
            l2b l2b = l2b.a;
            return q.getString("nighttheme", "one.me.sdk.design.OneMeThemeDark");
        }
        SharedPreferences q2 = l15.q();
        m2b m2b = m2b.a;
        return q2.getString("maintheme", "one.me.sdk.design.OneMeThemeLight");
    }

    public void j(k9a k9a) {
        l15 l15 = (l15) this.g;
        SharedPreferences.Editor edit = l15.q().edit();
        k9a.a.getClass();
        edit.putString("nightmode", f9a.a(k9a));
        edit.apply();
        Unit unit = Unit.INSTANCE;
        ((n6e) l15.b).d("nightmode");
    }

    public void k(int i2, int i3) {
        xme xme;
        Object value;
        boolean z;
        boolean z2;
        do {
            xme = (xme) this.g;
            value = xme.getValue();
            lld lld = (lld) value;
            gld gld = lld instanceof gld ? (gld) lld : gld.e;
            z = false;
            z2 = i3 != i2;
            if (1 != i2) {
                z = true;
            }
            gld.getClass();
        } while (!xme.b(value, new gld(i3, i2, z2, z)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r0 = (defpackage.l15) r4.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(java.lang.String r5) {
        /*
            r4 = this;
            k2b r0 = r4.f()
            java.lang.String r0 = r0.getName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r0 = r4.f
            l15 r0 = (defpackage.l15) r0
            k2b r5 = r0.m(r5)
            if (r5 == 0) goto L_0x0094
            java.lang.String r1 = r5.getName()
            java.lang.Object r2 = r0.c
            kotlin.Lazy r2 = (kotlin.Lazy) r2
            java.lang.Object r2 = r2.getValue()
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
            r2.put(r1, r5)
            java.lang.Object r2 = r0.a
            java.util.Set r2 = (java.util.Set) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0038
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x007f
        L_0x0038:
            java.util.Iterator r2 = r2.iterator()
        L_0x003c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x007f
            java.lang.Object r3 = r2.next()
            k2b r3 = (defpackage.k2b) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)
            if (r3 == 0) goto L_0x003c
            java.lang.String r0 = r5.getName()
            java.lang.Object r1 = r4.g
            l15 r1 = (defpackage.l15) r1
            android.content.SharedPreferences r2 = r1.q()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r3 = "maintheme"
            r2.putString(r3, r0)
            r2.apply()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r1.b
            n6e r0 = (defpackage.n6e) r0
            r0.d(r3)
            java.lang.Object r4 = r4.h
            xme r4 = (defpackage.xme) r4
            r4.getClass()
            r0 = 0
            r4.m(r0, r5)
            goto L_0x0094
        L_0x007f:
            java.lang.Object r4 = r0.b
            kotlin.Lazy r4 = (kotlin.Lazy) r4
            java.lang.Object r4 = r4.getValue()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            r4.edit()
            kotlin.NotImplementedError r4 = new kotlin.NotImplementedError
            java.lang.String r5 = "An operation is not implemented: Указать тут задачу с кастомными темами"
            r4.<init>(r5)
            throw r4
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu4.l(java.lang.String):void");
    }

    public void m(he9 he9) {
        ev0.v((jx3) this.b, (CoroutineContext) null, (f14) null, new ok2(this, he9.b, he9, (Continuation) null), 3);
    }

    public void n() {
        xme xme;
        Object value;
        xme xme2;
        Object value2;
        do {
            xme = (xme) this.i;
            value = xme.getValue();
            qy6 qy6 = (qy6) value;
        } while (!xme.b(value, (Object) null));
        do {
            xme2 = (xme) this.g;
            value2 = xme2.getValue();
            lld lld = (lld) value2;
            (lld instanceof gld ? (gld) lld : gld.e).getClass();
        } while (!xme2.b(value2, new gld(0, 0, false, false)));
    }

    public fu4(rk2 rk2, Lazy lazy, Lazy lazy2, Lazy lazy3, gaf gaf, n95 n95) {
        this.c = rk2;
        this.d = gaf;
        this.b = e14.a(((osa) gaf).c().t0().plus(n95));
        this.a = lazy;
        this.e = lazy2;
        this.f = lazy3;
        xme a2 = f6e.a(hld.a);
        this.g = a2;
        this.h = new etc(a2);
        xme a3 = f6e.a((Object) null);
        this.i = a3;
        this.j = new etc(a3);
    }

    public fu4(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, d23 d23, a23 a23) {
        this.c = d23;
        this.d = a23;
        this.b = fu4.class.getName();
        this.a = lazy;
        this.e = lazy2;
        this.f = lazy3;
        this.g = lazy4;
        this.h = lazy5;
        this.i = lazy6;
        this.j = lazy7;
    }

    public fu4() {
        this.d = ld8.q();
        this.c = ld8.q();
        this.e = ld8.q();
        this.f = ld8.q();
        this.b = ld8.q();
        this.a = ld8.q();
        this.g = ld8.q();
        this.h = ld8.q();
        this.i = ld8.q();
    }

    public fu4(Context context) {
        Lazy lazy = LazyKt.lazy(new v4(context, 27));
        this.a = lazy;
        this.c = new npg(context, 1);
        this.d = new ox0(context);
        this.e = new he(context);
        this.f = new l15(17, lazy);
        this.g = new l15(15, lazy);
        xme a2 = f6e.a(f());
        this.h = a2;
        this.i = f6e.a(0);
        this.j = new etc(a2);
        this.b = "Chroma";
    }
}
