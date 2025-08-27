package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: hna  reason: default package */
public final class hna extends FrameLayout implements phf {
    public static final /* synthetic */ KProperty[] c = {rae.s(hna.class, "appearance", "getAppearance()Lone/me/pinbars/unknowncontact/OneMeActionButton$Appearance;", 0)};
    public final bl a = new bl(this);
    public final TextView b;

    public hna(Context context) {
        super(context, (AttributeSet) null);
        Delegates delegates = Delegates.INSTANCE;
        gna gna = gna.a;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        puf.B.b(textView, uy4.b);
        textView.setGravity(17);
        this.b = textView;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        float f = (float) 40;
        setMinimumHeight(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        setMinimumWidth(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        setClipToOutline(true);
        setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 12.0f));
        float f2 = (float) 16;
        float f3 = (float) 10;
        setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        addView(textView);
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    private final RippleDrawable getBackgroundDrawable() {
        int i = fu4.k.e(getContext()).f().b().a.f;
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1));
    }

    public final gna getAppearance() {
        return (gna) this.a.getValue(this, c[0]);
    }

    public final void onThemeChanged(k2b k2b) {
        int i;
        int ordinal = getAppearance().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = isEnabled() ? k2b.getText().b : k2b.b().c.f;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (isEnabled()) {
            k2b.getText().getClass();
            i = -16745729;
        } else {
            i = k2b.b().c.j;
        }
        this.b.setTextColor(i);
        setBackground(getBackgroundDrawable());
        invalidate();
    }

    public final void setAppearance(gna gna) {
        this.a.setValue(this, c[0], gna);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    public final void setText(int i) {
        this.b.setText(i);
    }
}
