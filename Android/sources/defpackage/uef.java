package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: uef  reason: default package */
public final class uef extends ryg {
    public final /* synthetic */ Context j;
    public final /* synthetic */ TextPaint k;
    public final /* synthetic */ ryg l;
    public final /* synthetic */ vef m;

    public uef(vef vef, Context context, TextPaint textPaint, ryg ryg) {
        super(20);
        this.m = vef;
        this.j = context;
        this.k = textPaint;
        this.l = ryg;
    }

    public final void M(int i) {
        this.l.M(i);
    }

    public final void N(Typeface typeface, boolean z) {
        this.m.g(this.j, this.k, typeface);
        this.l.N(typeface, z);
    }
}
