package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

/* renamed from: xoe  reason: default package */
public final class xoe {
    public final int a;
    public final int b;
    public final Drawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final ColorStateList i;
    public final Drawable j;
    public final Drawable k;
    public final Drawable l;
    public final Drawable m;
    public final Drawable n;
    public final Drawable o;
    public final Drawable p;
    public final Drawable q;
    public final Drawable r;
    public final Drawable s;
    public final Drawable t;
    public final Drawable u;

    public xoe(woe woe) {
        this.a = woe.a;
        this.b = woe.b;
        this.c = woe.c;
        this.d = woe.d;
        this.e = woe.e;
        this.f = woe.f;
        this.g = woe.g;
        this.h = woe.h;
        this.i = woe.i;
        this.j = woe.j;
        this.k = woe.k;
        this.l = woe.l;
        this.m = woe.m;
        this.n = woe.n;
        this.o = woe.o;
        this.p = woe.p;
        this.q = woe.q;
        this.r = woe.s;
        this.s = woe.t;
        this.t = woe.u;
        this.u = woe.v;
    }

    public static Drawable a(Drawable drawable) {
        Drawable.ConstantState constantState;
        if (drawable == null || (constantState = drawable.getConstantState()) == null) {
            return null;
        }
        return constantState.newDrawable().mutate();
    }
}
