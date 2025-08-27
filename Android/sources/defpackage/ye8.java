package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.math.MathKt;

/* renamed from: ye8  reason: default package */
public final class ye8 extends FrameLayout {
    public final GradientDrawable a;
    public final AppCompatImageView b;

    public ye8(Context context) {
        super(context, (AttributeSet) null);
        float f = vo4.c().getDisplayMetrics().density * 20.0f;
        GradientDrawable P = i8b.P((Integer) null, (Integer) null, (Integer) null, new float[]{f, f, f, f, f, f, f, f});
        this.a = P;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        appCompatImageView.setLayoutParams(layoutParams);
        this.b = appCompatImageView;
        setBackground(P);
        float f2 = (float) 24;
        setLayoutParams(new ViewGroup.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density)));
        appCompatImageView.setForegroundGravity(17);
    }

    public Drawable getBackground() {
        Drawable background = super.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        return gradientDrawable != null ? gradientDrawable : this.a;
    }

    public void setBackground(Drawable drawable) {
        if (drawable instanceof GradientDrawable) {
            super.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i) {
        this.a.setColor(ColorStateList.valueOf(i));
    }

    public final void setIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.b;
        appCompatImageView.setImageDrawable(drawable);
        addView(appCompatImageView);
    }

    public final void setIconColor(int i) {
        this.b.setImageTintList(ColorStateList.valueOf(i));
    }

    public final void setIcon(int i) {
        setIcon(ew3.b(getContext(), i));
    }
}
