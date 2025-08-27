package defpackage;

import android.os.Bundle;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: lf1  reason: default package */
public final class lf1 {
    public final eng a;
    public final Lazy b = LazyKt.lazy(new v11(17));
    public final Lazy c = fdb.a.c();
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public vje h;
    public boolean i;
    public boolean j;
    public boolean k;
    public Function0 l;
    public final Lazy m;
    public final Lazy n;

    public lf1(Lazy lazy, eng eng) {
        this.a = eng;
        lq1 lq1 = lq1.a;
        this.d = lq1.getAccessor().h(rh3.class);
        this.e = lq1.getAccessor().h(tq1.class);
        this.f = lq1.getAccessor().h(uj5.class);
        this.g = lazy;
        this.m = LazyKt.lazy(new kf1(this, 0));
        this.n = LazyKt.lazy(new kf1(this, 1));
    }

    public final void a(vje vje, Function0 function0) {
        boolean e2 = ((rh3) this.d.getValue()).e();
        if (function0 == null) {
            c();
            return;
        }
        e9d e9d = null;
        Lazy lazy = this.g;
        if (e2 || vje == null || ((mp1) d()).e(vje)) {
            eng eng = this.a;
            if (!e2) {
                eng.b();
            } else if (vje == null) {
                ((mp1) d()).u((nw6) null);
                f(function0);
            } else if ((vje instanceof sje) && !this.k && ((mp1) d()).e(vje)) {
                ta4 W0 = mf1.b.W0();
                W0.b(":call-join-preview?link=" + ((sje) vje).a, (Bundle) null);
            } else if (((mp1) d()).j().j instanceof ie5) {
                f(function0);
            } else if (!((mp1) d()).e(vje)) {
                if (((mp1) d()).j().g) {
                    ((mp1) d()).d();
                }
                if (!eq1.a((e9d) lazy.getValue())) {
                    mf1.b.W0().b(":call-active", (Bundle) null);
                    Unit unit = Unit.INSTANCE;
                }
                c();
            } else {
                this.l = function0;
                boolean z = this.i;
                eng.getClass();
                int i2 = z ? nqa.d : nqa.c;
                KProperty[] kPropertyArr = BottomSheetWidget.v0;
                ng3 a2 = b0h.a(new igf(nqa.f), (Bundle) null, 4);
                a2.f(new igf(nqa.e));
                a2.d(mqa.b, new igf(i2));
                a2.c(mqa.a, new igf(nqa.b));
                ConfirmationBottomSheet e3 = a2.e();
                Widget widget = eng.b;
                e3.setTargetController(widget);
                zx3 zx3 = widget;
                while (zx3.getParentController() != null) {
                    zx3 = zx3.getParentController();
                }
                l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
                if (l9d != null) {
                    e9d = l9d.K();
                }
                e3.p0(widget);
                if (e9d != null) {
                    i9d i9d = new i9d(e3, (String) null, (ey3) null, (ey3) null, false, -1);
                    a81.t(false, i9d, true, "BottomSheetWidget");
                    e9d.G(i9d);
                }
            }
        } else {
            if (!eq1.a((e9d) lazy.getValue())) {
                mf1.b.W0().b(":call-active", (Bundle) null);
                Unit unit2 = Unit.INSTANCE;
            }
            c();
        }
    }

    public final boolean b(int i2, String[] strArr, int[] iArr) {
        if (i2 != 178) {
            return false;
        }
        boolean b2 = e().b(strArr);
        eng eng = this.a;
        if (!b2) {
            int length = iArr.length;
            int i3 = 0;
            while (i3 < length) {
                if (iArr[i3] == -1) {
                    c();
                    eng.g(xkc.permission_detail_dialog_title, xkc.permission_detail_dialog_subtitile);
                } else {
                    i3++;
                }
            }
            c();
            return false;
        } else if (this.j) {
            Function0 function0 = this.l;
            boolean e2 = ((rh3) this.d.getValue()).e();
            if (function0 == null) {
                c();
            } else if (!e2) {
                eng.b();
            } else {
                function0.invoke();
            }
        } else {
            a(this.h, this.l);
        }
        return true;
    }

    public final void c() {
        this.l = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.k = false;
    }

    public final dp1 d() {
        return (dp1) this.b.getValue();
    }

    public final edb e() {
        return (edb) this.c.getValue();
    }

    public final void f(Function0 function0) {
        if (!eq1.a((e9d) this.g.getValue()) && function0 != null) {
            function0.invoke();
        }
        c();
    }

    public final boolean g(int i2) {
        if (i2 == jgc.call_permission_dialog_check_continue) {
            ((mp1) m21.a.c()).u((nw6) null);
            f(this.l);
            return true;
        } else if (i2 != jgc.call_permission_dialog_check_cancel) {
            return false;
        } else {
            c();
            return true;
        }
    }

    public final void h(boolean z) {
        String str = ((mp1) d()).j().c;
        boolean z2 = ((mp1) d()).j().h;
        Lazy lazy = this.e;
        if (z && !e().b(edb.l)) {
            tq1 tq1 = (tq1) lazy.getValue();
            tq1.getClass();
            tq1.a(tq1, "REQUEST_PERMISSION_CAM", str, "OUT_OF_CALL", (Integer) null, (String) null, (String) null, z2, 56);
        }
        if (!e().b(edb.h)) {
            tq1 tq12 = (tq1) lazy.getValue();
            tq12.getClass();
            tq1.a(tq12, "REQUEST_PERMISSION_MIC", str, "AFTER_INITIATION", (Integer) null, (String) null, (String) null, z2, 56);
        }
    }

    public final void i(String str, boolean z, boolean z2, boolean z3, Function0 function0) {
        c();
        this.k = z3;
        boolean booleanValue = ((Boolean) this.n.getValue()).booleanValue();
        eng eng = this.a;
        if (!booleanValue || StringsKt.isBlank(str)) {
            eng.a();
            return;
        }
        sje sje = new sje(str, z);
        if (e().a(z2, eng)) {
            a(sje, function0);
            return;
        }
        h(z2);
        this.h = sje;
        this.l = function0;
        this.i = z2;
    }

    public final void j(long j2, boolean z, Function0 function0) {
        c();
        tje tje = new tje(new fl1(j2, z));
        if (e().a(z, this.a)) {
            a(tje, function0);
            return;
        }
        h(z);
        this.h = tje;
        this.l = function0;
        this.i = z;
    }
}
