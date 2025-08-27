package defpackage;

import android.graphics.Typeface;

/* renamed from: tef  reason: default package */
public final class tef extends vzg {
    public final /* synthetic */ ryg g;
    public final /* synthetic */ vef h;

    public tef(vef vef, ryg ryg) {
        this.h = vef;
        this.g = ryg;
    }

    public final void A(Typeface typeface) {
        vef vef = this.h;
        vef.n = Typeface.create(typeface, vef.c);
        vef.m = true;
        this.g.N(vef.n, false);
    }

    public final void z(int i) {
        this.h.m = true;
        this.g.M(i);
    }
}
