package defpackage;

import android.view.View;
import kotlin.math.MathKt;

/* renamed from: ore  reason: default package */
public final class ore {
    public final View a;
    public final boolean b = false;
    public int c;
    public int d;
    public final ft e;
    public gpe f;

    public ore(View view) {
        this.a = view;
        ft ftVar = new ft(9);
        ftVar.b = 0;
        ftVar.c = 0;
        this.e = ftVar;
    }

    public final ft a(int i, int i2) {
        int i3;
        ft ftVar = this.e;
        ftVar.b = i;
        ftVar.c = i2;
        gpe gpe = this.f;
        if (gpe == null) {
            return ftVar;
        }
        boolean z = this.b;
        int i4 = gpe.y;
        if (z) {
            i3 = this.d;
        } else {
            i3 = this.c;
            if (i4 >= i3 && i4 <= (i3 = this.d)) {
                i3 = i4;
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.a;
        if (mode == 1073741824) {
            i3 = (int) Math.min((double) i3, (double) ((View.MeasureSpec.getSize(i2) - view.getPaddingBottom()) - view.getPaddingTop()));
        }
        float f2 = ((float) gpe.x) / ((float) i4);
        ftVar.b = View.MeasureSpec.makeMeasureSpec(view.getPaddingRight() + view.getPaddingLeft() + ((int) (f2 * ((float) i3))), 1073741824);
        ftVar.c = View.MeasureSpec.makeMeasureSpec(view.getPaddingBottom() + view.getPaddingTop() + i3, 1073741824);
        return ftVar;
    }

    public final void b() {
        gpe gpe = this.f;
        if (gpe == null || !gpe.z) {
            this.c = MathKt.roundToInt(((float) 170) * vo4.c().getDisplayMetrics().density);
            this.d = MathKt.roundToInt(((float) 144) * vo4.c().getDisplayMetrics().density);
            return;
        }
        this.c = MathKt.roundToInt(((float) 158) * vo4.c().getDisplayMetrics().density);
        this.d = MathKt.roundToInt(((float) 194) * vo4.c().getDisplayMetrics().density);
    }
}
