package defpackage;

import android.view.View;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.ranges.RangesKt;

/* renamed from: yqb  reason: default package */
public final class yqb {
    public final frb a;
    public int b;

    public yqb(frb frb) {
        this.a = frb;
    }

    public final void a(int i) {
        View d;
        frb frb = this.a;
        if (frb != null && (d = frb.d()) != null) {
            int coerceIn = RangesKt.coerceIn(i - frb.c(), 0, (int) IntCompanionObject.MAX_VALUE);
            this.b = coerceIn;
            d.offsetTopAndBottom(coerceIn - this.b);
        }
    }
}
