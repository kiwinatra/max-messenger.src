package defpackage;

import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* renamed from: of  reason: default package */
public abstract class of extends hne {
    public final int j;
    public int k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public of(View view, yh7 yh7, int i, Function1 function1, int i2) {
        super(view, yh7, (i2 & 16) != 0 ? null : function1, 7);
        this.j = 8;
        this.k = -1;
        gag.l(view, new nf(i, this));
    }

    public static final iog f(of ofVar, iog iog) {
        if (ofVar.f == 0) {
            return iog;
        }
        wh7 f = iog.a.f(7);
        if (f.d > ofVar.f) {
            return iog;
        }
        xng yng = Build.VERSION.SDK_INT >= 30 ? new yng(iog) : new xng(iog);
        yng.c(7, wh7.b(f.a, f.b, f.c, ofVar.f));
        return yng.b();
    }

    public final void b(iog iog, nr0 nr0) {
        wh7 f = iog.a.f(this.d);
        fog fog = iog.a;
        int i = this.j;
        wh7 f2 = fog.f(i);
        if (fog.o(i)) {
            f = f2;
        }
        a(f, nr0);
    }

    public final void c(iog iog) {
        if (this.k != -1) {
            xng yng = Build.VERSION.SDK_INT >= 30 ? new yng(iog) : new xng(iog);
            yng.c(8, wh7.e);
            yng.h(8, false);
            iog = yng.b();
        }
        super.c(iog);
    }

    public final iog d(iog iog) {
        return iog;
    }

    public final void e() {
        this.g = false;
        View view = this.a;
        if (view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = gag.a;
            t9g.c(view);
            return;
        }
        view.addOnAttachStateChangeListener(new mf(view, 0));
    }

    public void g(iog iog, h0h h0h) {
    }

    public abstract iog h(iog iog);

    public abstract void i();

    public void j() {
    }
}
