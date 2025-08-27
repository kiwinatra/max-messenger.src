package defpackage;

import android.content.Context;
import android.view.View;

/* renamed from: t7  reason: default package */
public final class t7 extends c79 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ w7 n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t7(w7 w7Var, Context context, m69 m69, View view) {
        super(hdc.actionOverflowMenuStyle, 0, m69, context, view, true);
        this.n = w7Var;
        this.g = 8388613;
        u6h u6h = w7Var.F0;
        this.i = u6h;
        a79 a79 = this.j;
        if (a79 != null) {
            a79.f(u6h);
        }
    }

    public final void c() {
        switch (this.m) {
            case 0:
                this.n.C0 = null;
                super.c();
                return;
            default:
                w7 w7Var = this.n;
                m69 m69 = w7Var.c;
                if (m69 != null) {
                    m69.c(true);
                }
                w7Var.B0 = null;
                super.c();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t7(w7 w7Var, Context context, lye lye, View view) {
        super(hdc.actionOverflowMenuStyle, 0, lye, context, view, false);
        this.n = w7Var;
        if (!lye.J0.f()) {
            View view2 = w7Var.z;
            this.f = view2 == null ? (View) w7Var.y : view2;
        }
        u6h u6h = w7Var.F0;
        this.i = u6h;
        a79 a79 = this.j;
        if (a79 != null) {
            a79.f(u6h);
        }
    }
}
