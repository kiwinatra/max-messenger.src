package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import kotlin.coroutines.Continuation;
import kotlin.math.MathKt;

/* renamed from: srb  reason: default package */
public final class srb extends LinearLayout {
    public final boolean a;

    public srb(Context context, boolean z) {
        super(context);
        this.a = z;
        setElevation(vo4.c().getDisplayMetrics().density * 12.0f);
        setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 12.0f));
        setOrientation(1);
        float f = (float) 4;
        setPadding(getPaddingLeft(), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), getPaddingRight(), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        b0h.H(this, new qrb((Object) context, (Continuation) null, 2));
    }

    /* access modifiers changed from: private */
    public final k2b getCurrentTheme() {
        return this.a ? l2b.a : fu4.k.e(getContext()).f();
    }
}
