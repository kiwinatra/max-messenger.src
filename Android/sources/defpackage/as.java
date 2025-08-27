package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* renamed from: as  reason: default package */
public final class as extends xag {
    public static final /* synthetic */ KProperty[] H0 = {rae.s(as.class, "updateSelectedTheme", "getUpdateSelectedTheme()Lkotlinx/coroutines/Job;", 0)};
    public final Lazy A0;
    public yq B0;
    public final xme C0;
    public final etc D0;
    public final s85 E0;
    public final xme F0;
    public final etc G0;
    public final Lazy X;
    public final fu4 Y;
    public volatile Map Z = MapsKt.emptyMap();
    public final Lazy b;
    public final hq c;
    public final Lazy o;
    public final Lazy v;
    public volatile Map v0 = MapsKt.emptyMap();
    public final Lazy w;
    public volatile kf0 w0;
    public final Lazy x;
    public volatile kf0 x0;
    public final Lazy y;
    public final wie y0 = o5a.U();
    public final Lazy z;
    public final Lazy z0;

    public as(Lazy lazy, ltb ltb, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8) {
        yq yqVar;
        this.b = lazy;
        this.c = ltb.c;
        this.o = lazy2;
        this.v = lazy3;
        this.w = lazy4;
        this.x = lazy5;
        this.y = lazy6;
        this.z = lazy7;
        this.X = lazy8;
        fu4 e = fu4.k.e(m());
        this.Y = e;
        ur urVar = new ur(0, lazy8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.z0 = LazyKt.lazy(lazyThreadSafetyMode, urVar);
        this.A0 = LazyKt.lazy(lazyThreadSafetyMode, new s2(2, (Object) lazy8, (Object) this));
        k9a o2 = ((l15) e.g).o();
        if ((o2 instanceof e9a) || (o2 instanceof i9a) || Intrinsics.areEqual((Object) o2, (Object) j9a.b)) {
            yqVar = yq.a;
        } else if (Intrinsics.areEqual((Object) o2, (Object) g9a.b)) {
            yqVar = yq.b;
        } else if (Intrinsics.areEqual((Object) o2, (Object) h9a.b)) {
            yqVar = yq.c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.B0 = yqVar;
        Iterable list = CollectionsKt.toList(yq.v);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            yq yqVar2 = (yq) it.next();
            if (yqVar2 == this.B0) {
                z2 = true;
            }
            arrayList.add(new ar(yqVar2, Boolean.valueOf(z2)));
        }
        xme a = f6e.a(arrayList);
        this.C0 = a;
        this.D0 = new etc(a);
        this.E0 = new s85(0);
        xme a2 = f6e.a(CollectionsKt.emptyList());
        this.F0 = a2;
        this.G0 = new etc(a2);
        if (o()) {
            l(true, true);
            l(false, false);
            return;
        }
        l(false, true);
        l(true, false);
    }

    public final a89 j(int i, String str) {
        long m = ((ltb) n()).a.m();
        long s = ((ltb) n()).a.s();
        oa9 oa9 = oa9.READ;
        qe9 qe9 = qe9.ACTIVE;
        long m2 = ((ltb) n()).a.m();
        ArrayList arrayList = r0;
        ArrayList arrayList2 = new ArrayList();
        ha9 ha9 = r0;
        ha9 ha92 = new ha9((long) i, 0, 0, 0, m, s, 0, str, oa9, qe9, m2, (String) null, (String) null, (w28) null, 0, 0, 0, (ha9) null, (String) null, (String) null, false, 0, 0, 2, 0, 0, (ha9) null, 0, 0, 0, 0, 0, arrayList, (xd9) null, (cl4) null);
        return gb9.a((gb9) this.x.getValue(), ha9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.wr
            if (r0 == 0) goto L_0x0013
            r0 = r12
            wr r0 = (defpackage.wr) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            wr r0 = new wr
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            as r11 = r0.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r12)
            r0.a = r11
            r0.o = r3
            kotlin.Lazy r12 = r11.X
            java.lang.Object r12 = r12.getValue()
            gaf r12 = (defpackage.gaf) r12
            osa r12 = (defpackage.osa) r12
            q04 r12 = r12.b()
            j6 r2 = new j6
            r4 = 7
            r2.<init>(r4, r11)
            jj7 r4 = new jj7
            r5 = 0
            r4.<init>(r2, r5)
            java.lang.Object r12 = defpackage.ev0.I(r12, r4, r0)
            if (r12 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r5 = r12
            a32 r5 = (defpackage.a32) r5
            android.content.Context r12 = r11.m()
            int r0 = defpackage.nna.g
            java.lang.String r12 = defpackage.q8.p(r0, r12)
            r0 = -2
            a89 r7 = r11.j(r0, r12)
            android.content.Context r12 = r11.m()
            int r0 = defpackage.nna.f
            java.lang.String r12 = defpackage.q8.p(r0, r12)
            r0 = -1
            a89 r6 = r11.j(r0, r12)
            ul2 r12 = new ul2
            hcg r8 = defpackage.hcg.Seen
            kotlin.Lazy r0 = r11.z
            java.lang.Object r0 = r0.getValue()
            r9 = r0
            vj9 r9 = (defpackage.vj9) r9
            fu4 r11 = r11.Y
            k2b r11 = r11.f()
            p53 r11 = r11.g()
            int r11 = r11.ordinal()
            if (r11 == 0) goto L_0x00a9
            if (r11 == r3) goto L_0x00a5
            r0 = 2
            if (r11 != r0) goto L_0x009f
            goto L_0x00a9
        L_0x009f:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x00a5:
            gga r11 = defpackage.gga.b
        L_0x00a7:
            r10 = r11
            goto L_0x00ac
        L_0x00a9:
            nfd r11 = defpackage.nfd.b
            goto L_0x00a7
        L_0x00ac:
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as.k(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void l(boolean z2, boolean z3) {
        xag.g(this, ((osa) ((gaf) this.X.getValue())).b(), (f14) null, new xr(this, z2, z3, (Continuation) null), 2);
    }

    public final Context m() {
        return (Context) this.o.getValue();
    }

    public final jtb n() {
        return (jtb) this.b.getValue();
    }

    public final boolean o() {
        return ((tcf) this.v.getValue()).g();
    }

    public final void q() {
        String str = hu6.f0.e;
        l15 l15 = (l15) this.Y.g;
        SharedPreferences.Editor edit = l15.q().edit();
        edit.putString("nighttheme", str);
        edit.apply();
        Unit unit = Unit.INSTANCE;
        ((n6e) l15.b).d("nighttheme");
        Lazy lazy = this.v;
        tcf tcf = (tcf) lazy.getValue();
        tcf.A0 = null;
        tcf.b.c.l("app.night.theme", str);
        l15 l152 = (l15) fu4.k.e(tcf.a).g;
        SharedPreferences.Editor edit2 = l152.q().edit();
        edit2.putString("nighttheme", str);
        edit2.apply();
        ((n6e) l152.b).d("nighttheme");
        ((tcf) lazy.getValue()).b(true);
    }

    public final void r() {
        String str = o84.f0.e;
        this.c.l("app.theme", str);
        this.Y.l(str);
        ((tcf) this.v.getValue()).a(str, true);
    }

    public final void t(boolean z2, kf0 kf0, y32 y32, Function0 function0) {
        if (!Intrinsics.areEqual((Object) kf0, (Object) y32.b)) {
            function0.invoke();
            u();
            xag.g(this, ((osa) ((gaf) this.X.getValue())).b(), (f14) null, new yr(y32, z2, this, (Continuation) null), 2);
        }
    }

    public final void u() {
        aje g = xag.g(this, ((osa) ((gaf) this.X.getValue())).b(), (f14) null, new zr(this, (Continuation) null), 2);
        this.y0.setValue(this, H0[0], g);
    }
}
