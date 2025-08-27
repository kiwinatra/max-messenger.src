package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;

/* renamed from: xob  reason: default package */
public final class xob extends ViewGroup {
    public final int a;
    public final int b;
    public final TextView c;
    public final TextView o;
    public final vpb v;
    public final u11 w;
    public de6 x;
    public boolean y;
    public wob z;

    /* JADX WARNING: type inference failed for: r4v2, types: [android.widget.SeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View, vpb] */
    public xob(Context context) {
        super(context);
        float f = (float) 12;
        this.a = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        float f2 = (float) 4;
        this.b = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2);
        TextView textView = new TextView(context);
        xef xef = l2b.i;
        textView.setTextColor(xef.e);
        ogf ogf = puf.D;
        ogf.b(textView, uy4.b);
        this.c = textView;
        TextView textView2 = new TextView(context);
        int i = xef.e;
        textView2.setTextColor(i);
        ogf.b(textView2, uy4.b);
        this.o = textView2;
        ? seekBar = new SeekBar(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        u67 u67 = l2b.f;
        gradientDrawable.setColor(j4b.l0(0.8f, u67.f));
        gradientDrawable.setSize(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        gradientDrawable.setCornerRadius(vo4.c().getDisplayMetrics().density * 100.0f);
        seekBar.setThumb(gradientDrawable);
        float f3 = (float) 2;
        seekBar.setPaddingRelative(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), seekBar.getPaddingTop(), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), seekBar.getPaddingBottom());
        seekBar.setProgressBackgroundTintList(ColorStateList.valueOf(u67.i));
        seekBar.setProgressTintList(ColorStateList.valueOf(l2b.d.a.f));
        seekBar.setSecondaryProgressTintList(ColorStateList.valueOf(u67.h));
        this.v = seekBar;
        u11 u11 = new u11(context, 1);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        u11.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        u11.b = imageView;
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminate(true);
        float f4 = (float) 20;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f4), MathKt.roundToInt(f4 * vo4.c().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        u11.addView(progressBar, layoutParams);
        u11.o = progressBar;
        TextView textView3 = new TextView(context);
        textView3.setTextColor(i);
        puf.v.b(textView3, uy4.b);
        textView3.setGravity(17);
        float f5 = (float) 6;
        textView3.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f5), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f5 * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density);
        u11.addView(textView3, layoutParams2);
        u11.c = textView3;
        u11.setElevation(vo4.c().getDisplayMetrics().density * 4.0f);
        float f6 = vo4.c().getDisplayMetrics().density * 14.0f;
        View view = new View(u11.getContext());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setStroke(MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density), l2b.h.a);
        gradientDrawable2.setCornerRadius(f6);
        view.setBackground(gradientDrawable2);
        u11.addView(view, new FrameLayout.LayoutParams(-1, -1));
        u11.setOutlineProvider(new n04(f6));
        this.w = u11;
        setClipChildren(false);
        setClipToPadding(false);
        addView(textView);
        addView(textView2);
        addView(seekBar);
        addView(u11);
        seekBar.setOnSeekBarChangeListener(new cw8(1, this));
    }

    public final void a(xh2 xh2) {
        Bitmap bitmap;
        de6 de6 = xh2.a;
        int i = 8;
        u11 u11 = this.w;
        boolean z2 = xh2.c;
        boolean z3 = xh2.b;
        if ((de6 != null || z3) && z2) {
            this.x = de6;
            this.y = true;
            ProgressBar progressBar = (ProgressBar) u11.o;
            if (z3) {
                i = 0;
            }
            progressBar.setVisibility(i);
            de6 de62 = this.x;
            if (!(de62 == null || (bitmap = de62.a) == null || bitmap.isRecycled())) {
                de6 de63 = this.x;
                ((ImageView) u11.b).setImageBitmap(de63 != null ? de63.a : null);
            }
            u11.setVisibility(0);
            return;
        }
        u11.setVisibility(8);
        this.y = z2;
    }

    public final wob getListener() {
        return this.z;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        u11 u11 = this.w;
        int visibility = u11.getVisibility();
        int i5 = this.b;
        int i6 = this.a;
        if (visibility == 0) {
            ev0.x(u11, i6, i5 - u11.getMeasuredHeight(), i5, 4);
        }
        TextView textView = this.c;
        ev0.x(textView, i6, i5, 0, 12);
        TextView textView2 = this.o;
        ev0.x(textView2, (getMeasuredWidth() - i6) - textView2.getMeasuredWidth(), i5, 0, 12);
        int measuredHeight = textView.getMeasuredHeight();
        ev0.x(this.v, i6, measuredHeight + i5 + i5, 0, 12);
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        TextView textView = this.c;
        textView.measure(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, IntCompanionObject.MIN_VALUE));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, IntCompanionObject.MIN_VALUE));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - (this.a * 2), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, IntCompanionObject.MIN_VALUE);
        vpb vpb = this.v;
        vpb.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredHeight = vpb.getMeasuredHeight() + textView.getMeasuredHeight() + (this.b * 2);
        de6 de6 = this.x;
        int i3 = 0;
        int i4 = de6 != null ? de6.b : 0;
        if (de6 != null) {
            i3 = de6.c;
        }
        if (!(i4 == 0 || i3 == 0)) {
            u11 u11 = this.w;
            if (u11.getVisibility() == 0) {
                u11.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void setListener(wob wob) {
        this.z = wob;
    }
}
