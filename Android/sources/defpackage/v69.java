package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: v69  reason: default package */
public final class v69 extends c8 implements ActionProvider.VisibilityListener {
    public b8d b;
    public final ActionProvider c;
    public final /* synthetic */ y69 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v69(y69 y69, Context context, ActionProvider actionProvider) {
        super(context);
        this.d = y69;
        this.c = actionProvider;
    }

    public final boolean a() {
        return this.c.hasSubMenu();
    }

    public final boolean b() {
        return this.c.isVisible();
    }

    public final View c() {
        return this.c.onCreateActionView();
    }

    public final View d(MenuItem menuItem) {
        return this.c.onCreateActionView(menuItem);
    }

    public final boolean e() {
        return this.c.onPerformDefaultAction();
    }

    public final void f(SubMenu subMenu) {
        this.d.getClass();
        this.c.onPrepareSubMenu(subMenu);
    }

    public final boolean g() {
        return this.c.overridesItemVisibility();
    }

    public final void h(b8d b8d) {
        this.b = b8d;
        this.c.setVisibilityListener(this);
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        b8d b8d = this.b;
        if (b8d != null) {
            m69 m69 = ((u69) b8d.a).w0;
            m69.y = true;
            m69.p(true);
        }
    }
}
