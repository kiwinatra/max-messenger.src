package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: lye  reason: default package */
public final class lye extends m69 implements SubMenu {
    public final m69 I0;
    public final u69 J0;

    public lye(Context context, m69 m69, u69 u69) {
        super(context);
        this.I0 = m69;
        this.J0 = u69;
    }

    public final boolean d(u69 u69) {
        return this.I0.d(u69);
    }

    public final boolean e(m69 m69, MenuItem menuItem) {
        return super.e(m69, menuItem) || this.I0.e(m69, menuItem);
    }

    public final boolean f(u69 u69) {
        return this.I0.f(u69);
    }

    public final MenuItem getItem() {
        return this.J0;
    }

    public final String j() {
        u69 u69 = this.J0;
        int i = u69 != null ? u69.a : 0;
        if (i == 0) {
            return null;
        }
        return wj6.h(i, "android:menu:actionviewstates:");
    }

    public final m69 k() {
        return this.I0.k();
    }

    public final boolean m() {
        return this.I0.m();
    }

    public final boolean n() {
        return this.I0.n();
    }

    public final boolean o() {
        return this.I0.o();
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.I0.setGroupDividerEnabled(z);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        u(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.J0.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z) {
        this.I0.setQwertyMode(z);
    }

    public final SubMenu setHeaderIcon(int i) {
        u(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        u(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.J0.setIcon(i);
        return this;
    }
}
