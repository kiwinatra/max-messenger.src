package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* renamed from: r7  reason: default package */
public final class r7 extends ub6 {
    public final /* synthetic */ int X = 0;
    public final /* synthetic */ View Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r7(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.Y = actionMenuItemView;
    }

    public final s8e b() {
        t7 t7Var;
        switch (this.X) {
            case 0:
                s7 s7Var = ((ActionMenuItemView) this.Y).x0;
                if (s7Var == null || (t7Var = ((u7) s7Var).a.C0) == null) {
                    return null;
                }
                return t7Var.a();
            default:
                t7 t7Var2 = ((v7) this.Y).a.B0;
                if (t7Var2 == null) {
                    return null;
                }
                return t7Var2.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r3 = b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r3 = this;
            int r0 = r3.X
            switch(r0) {
                case 0: goto L_0x0010;
                default: goto L_0x0005;
            }
        L_0x0005:
            android.view.View r3 = r3.Y
            v7 r3 = (defpackage.v7) r3
            w7 r3 = r3.a
            r3.k()
            r3 = 1
            return r3
        L_0x0010:
            android.view.View r0 = r3.Y
            androidx.appcompat.view.menu.ActionMenuItemView r0 = (androidx.appcompat.view.menu.ActionMenuItemView) r0
            l69 r1 = r0.v0
            r2 = 0
            if (r1 == 0) goto L_0x002e
            u69 r0 = r0.x
            boolean r0 = r1.a(r0)
            if (r0 == 0) goto L_0x002e
            s8e r3 = r3.b()
            if (r3 == 0) goto L_0x002e
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x002e
            r2 = 1
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r7.c():boolean");
    }

    public boolean d() {
        switch (this.X) {
            case 1:
                w7 w7Var = ((v7) this.Y).a;
                if (w7Var.D0 != null) {
                    return false;
                }
                w7Var.b();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r7(v7 v7Var, View view) {
        super(view);
        this.Y = v7Var;
    }
}
