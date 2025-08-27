package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.math.MathKt;

/* renamed from: ohd  reason: default package */
public final class ohd extends FrameLayout implements phf {
    public final AppCompatImageView a;
    public final wsa b;

    public ohd(Context context) {
        super(context);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 44;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        layoutParams.gravity = 83;
        appCompatImageView.setLayoutParams(layoutParams);
        int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        appCompatImageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        appCompatImageView.setOutlineProvider(new n04(vo4.c().getDisplayMetrics().density * 48.0f));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        appCompatImageView.setBackground(gradientDrawable);
        this.a = appCompatImageView;
        wsa wsa = new wsa(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 53;
        wsa.setVisibility(8);
        wsa.setLayoutParams(layoutParams2);
        this.b = wsa;
        float f2 = (float) 46;
        setLayoutParams(new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density)));
        addView(appCompatImageView);
        addView(wsa);
        onThemeChanged(fu4.k.e(getContext()).f());
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onThemeChanged(defpackage.k2b r6) {
        /*
            r5 = this;
            androidx.appcompat.widget.AppCompatImageView r0 = r5.a
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r2 = r1 instanceof android.graphics.drawable.GradientDrawable
            r3 = 0
            if (r2 == 0) goto L_0x000e
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            goto L_0x000f
        L_0x000e:
            r1 = r3
        L_0x000f:
            if (r1 == 0) goto L_0x001b
            fye r2 = r6.h()
            int r2 = r2.k
            r4 = 2
            r1.setStroke(r4, r2)
        L_0x001b:
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r2 = r1 instanceof android.graphics.drawable.GradientDrawable
            if (r2 == 0) goto L_0x0026
            r3 = r1
            android.graphics.drawable.GradientDrawable r3 = (android.graphics.drawable.GradientDrawable) r3
        L_0x0026:
            if (r3 == 0) goto L_0x0045
            js9 r1 = defpackage.fu4.k
            android.content.Context r2 = r5.getContext()
            fu4 r1 = r1.e(r2)
            k2b r1 = r1.f()
            hq2 r1 = r1.a()
            a93 r1 = r1.l()
            n63 r1 = r1.a
            int r1 = r1.h
            r3.setColor(r1)
        L_0x0045:
            u67 r1 = r6.getIcon()
            int r1 = r1.f
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setImageTintList(r1)
            wsa r5 = r5.b
            r5.f(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohd.onThemeChanged(k2b):void");
    }

    public final void setCounter(int i) {
        int i2 = i > 0 ? 0 : 8;
        wsa wsa = this.b;
        wsa.setVisibility(i2);
        wsa.g(i, true);
    }

    public final void setImageDrawable(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }
}
