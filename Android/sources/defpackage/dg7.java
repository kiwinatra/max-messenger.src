package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: dg7  reason: default package */
public final class dg7 extends FrameLayout implements jw0 {
    public final float a = (vo4.c().getDisplayMetrics().density * 16.0f);
    public final float b = (vo4.c().getDisplayMetrics().density * 6.0f);
    public long c;
    public zf7 o;
    public final lw0 v;
    public cg7 w;
    public final a94 x;

    public dg7(Context context) {
        super(context, (AttributeSet) null);
        lw0 lw0 = new lw0(getContext());
        this.v = lw0;
        this.x = new a94();
        lw0.setClickListener(this);
        lw0.setId(cwa.L);
        addView(lw0, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void setClickListener(cg7 cg7) {
        this.w = cg7;
    }
}
