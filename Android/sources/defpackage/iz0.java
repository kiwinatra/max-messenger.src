package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.math.MathKt;

/* renamed from: iz0  reason: default package */
public final class iz0 extends ConstraintLayout implements phf {
    public final AppCompatImageView E0;
    public final AppCompatTextView F0;

    public iz0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(getBackgroundDrawable());
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setImageTintList(getIconColor());
        int roundToInt = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        this.E0 = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(View.generateViewId());
        puf.i.b(appCompatTextView, uy4.b);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(getTextColor());
        this.F0 = appCompatTextView;
        float f = (float) 24;
        addView(appCompatImageView, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        addView(appCompatTextView, MathKt.roundToInt(((float) 0) * vo4.c().getDisplayMetrics().density), -2);
        pj3 h = ct.h(this);
        int id = appCompatImageView.getId();
        h.e(id, 3, appCompatTextView.getId(), 3);
        h.e(id, 6, 0, 6);
        h.e(id, 4, appCompatTextView.getId(), 4);
        int id2 = appCompatTextView.getId();
        h.e(id2, 3, 0, 3);
        h.e(id2, 6, appCompatImageView.getId(), 7);
        tr1.u((float) 16, vo4.c().getDisplayMetrics().density, new ila(h, 6, id2, 4));
        h.e(id2, 7, 0, 7);
        h.e(id2, 4, 0, 4);
        h.j(id2).d.l0 = true;
        h.a(this);
    }

    private final RippleDrawable getBackgroundDrawable() {
        int i = fu4.k.e(getContext()).f().b().a.f;
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1));
    }

    private final ColorStateList getIconColor() {
        fu4.k.e(getContext()).f().getIcon().getClass();
        return ColorStateList.valueOf(-16745729);
    }

    private final int getTextColor() {
        fu4.k.e(getContext()).f().getText().getClass();
        return -16745729;
    }

    public final void onThemeChanged(k2b k2b) {
        this.E0.setImageTintList(getIconColor());
        this.F0.setTextColor(getTextColor());
        setBackground(getBackgroundDrawable());
    }

    public final void setActionIcon(int i) {
        this.E0.setImageResource(i);
    }

    public final void setActionText(int i) {
        this.F0.setText(i);
    }
}
