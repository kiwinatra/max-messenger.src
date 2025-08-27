package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.math.MathKt;

/* renamed from: vl2  reason: default package */
public final class vl2 extends LinearLayout {
    public final vff a;
    public final vff b;
    public final r89 c;
    public final r89 o;

    public vl2(Context context) {
        super(context, (AttributeSet) null);
        vff vff = new vff(context);
        this.a = vff;
        vff vff2 = new vff(context);
        this.b = vff2;
        js9 js9 = fu4.k;
        int[] iArr = js9.e(getContext()).f().a().e().a.l;
        int[] iArr2 = js9.e(getContext()).f().a().i().a.l;
        bt0 bt0 = bt0.a;
        this.c = new r89(iArr, iArr2, true, bt0, true, true, 384);
        this.o = new r89(js9.e(getContext()).f().a().e().a.l, js9.e(getContext()).f().a().i().a.l, false, bt0, true, true, 384);
        setOrientation(1);
        setGravity(16);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388611;
        float f = (float) 16;
        layoutParams.topMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        layoutParams.setMarginStart(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        Unit unit = Unit.INSTANCE;
        addView(vff, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        layoutParams2.setMarginEnd(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        layoutParams2.bottomMargin = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        layoutParams2.gravity = 8388613;
        addView(vff2, layoutParams2);
    }

    public final void setBackgroundPreview(Drawable drawable) {
        setBackground(drawable);
    }
}
