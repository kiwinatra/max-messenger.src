package defpackage;

import android.graphics.Typeface;

/* renamed from: iw1  reason: default package */
public final class iw1 extends ryg {
    public final Typeface j;
    public final hw1 k;
    public boolean l;

    public iw1(hw1 hw1, Typeface typeface) {
        super(20);
        this.j = typeface;
        this.k = hw1;
    }

    public final void M(int i) {
        if (!this.l) {
            this.k.j(this.j);
        }
    }

    public final void N(Typeface typeface, boolean z) {
        if (!this.l) {
            this.k.j(typeface);
        }
    }
}
