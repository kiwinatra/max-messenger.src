package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.math.MathKt;

/* renamed from: hf7  reason: default package */
public final class hf7 extends ViewGroup implements wob {
    public final dtc A0;
    public final int a = MathKt.roundToInt(((float) 9) * vo4.c().getDisplayMetrics().density);
    public final int b = MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density);
    public final int c = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
    public final int o = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
    public final int v;
    public final Lazy v0;
    public final int w;
    public final ImageView w0;
    public final TextView x;
    public final Lazy x0;
    public final TextView y;
    public final Lazy y0;
    public final Lazy z;
    public final n6e z0;

    public hf7(Context context) {
        super(context);
        float f = (float) 8;
        this.v = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        this.w = MathKt.roundToInt(((float) 1) * vo4.c().getDisplayMetrics().density);
        TextView textView = new TextView(context);
        textView.setId(cra.a);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        textView.setGravity(1);
        textView.setLayoutParams(layoutParams);
        puf.p.b(textView, uy4.b);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        xef xef = l2b.i;
        textView.setTextColor(xef.e);
        this.x = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(cra.b);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
        textView2.setGravity(1);
        textView2.setLayoutParams(layoutParams2);
        puf.D.b(textView2, uy4.b);
        textView2.setTextColor(xef.e);
        this.y = textView2;
        ff7 ff7 = new ff7(context, this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.z = LazyKt.lazy(lazyThreadSafetyMode, ff7);
        this.v0 = LazyKt.lazy(lazyThreadSafetyMode, new ff7(context, this, 1));
        ImageView imageView = new ImageView(context);
        int i = lya.i;
        int i2 = l2b.f.f;
        Drawable b2 = ew3.b(imageView.getContext(), i);
        iq.a0(b2, i2);
        imageView.setImageDrawable(b2);
        imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(l2b.g.a.f), (Drawable) null, (Drawable) null));
        int roundToInt = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
        imageView.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        ct.G(imageView, 300, new gf7(this, 0));
        this.w0 = imageView;
        this.x0 = LazyKt.lazy(lazyThreadSafetyMode, new p35(context, 8));
        this.y0 = LazyKt.lazy(lazyThreadSafetyMode, new p35(context, 9));
        n6e b3 = m5a.b(0, IntCompanionObject.MAX_VALUE, (cu0) null, 5);
        this.z0 = b3;
        this.A0 = new dtc(b3);
        addView(textView);
        addView(textView2);
        addView(imageView);
    }

    public final void a(yh2 yh2) {
        Lazy lazy = this.z;
        y7e.c(this, (View) lazy.getValue(), -1);
        ((View) lazy.getValue()).setVisibility(0);
        Lazy lazy2 = this.v0;
        y7e.c(this, (View) lazy2.getValue(), -1);
        ((View) lazy2.getValue()).setVisibility(0);
        ((xob) lazy.getValue()).a(yh2.d);
    }

    public final void b(boolean z2) {
        Drawable drawable;
        Lazy lazy = this.v0;
        if (lazy.isInitialized()) {
            ImageView imageView = (ImageView) lazy.getValue();
            if (z2) {
                int i = cad.a2;
                int i2 = l2b.f.f;
                drawable = ew3.b(imageView.getContext(), i);
                iq.a0(drawable, i2);
            } else {
                int i3 = cad.b2;
                int i4 = l2b.f.f;
                drawable = ew3.b(imageView.getContext(), i3);
                iq.a0(drawable, i4);
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public final void c(long j, long j2, long j3) {
        xob xob = (xob) this.z.getValue();
        xob.o.setText(b0h.c(j3));
        xob.c.setText(b0h.c(j));
        vpb vpb = xob.v;
        vpb.setMax((int) j3);
        vpb.setSecondaryProgress((int) j2);
        vpb.setProgress((int) j);
    }

    public final k6e getEvents() {
        return this.A0;
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int paddingTop = getPaddingTop();
        Lazy lazy = this.x0;
        boolean L = y7e.L(lazy);
        int i5 = this.v;
        if (L) {
            ev0.x((View) lazy.getValue(), 0, paddingTop, 0, 12);
            int measuredHeight = ((TextView) lazy.getValue()).getMeasuredHeight() + i5 + paddingTop;
            Lazy lazy2 = this.y0;
            ev0.x((View) lazy2.getValue(), 0, ((TextView) lazy.getValue()).getBottom() + i5, 0, 12);
            paddingTop = ((View) lazy2.getValue()).getMeasuredHeight() + measuredHeight;
        }
        Lazy lazy3 = this.z;
        if (y7e.L(lazy3) && ((xob) lazy3.getValue()).getParent() != null) {
            if (!y7e.L(lazy)) {
                i5 = 0;
            }
            int i6 = paddingTop + i5;
            ev0.x((View) lazy3.getValue(), 0, i6, 0, 12);
            paddingTop = i6 + ((xob) lazy3.getValue()).getMeasuredHeight();
        }
        TextView textView = this.x;
        int measuredWidth = (getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int i7 = paddingTop + this.a;
        ev0.x(textView, measuredWidth, i7, 0, 12);
        TextView textView2 = this.y;
        ev0.x(textView2, (getMeasuredWidth() / 2) - (textView2.getMeasuredWidth() / 2), textView.getMeasuredHeight() + this.b + i7, 0, 12);
        Lazy lazy4 = this.v0;
        boolean L2 = y7e.L(lazy4);
        ImageView imageView = this.w0;
        int i8 = this.c;
        if (L2) {
            ev0.x((View) lazy4.getValue(), i8, ((textView2.getBottom() + textView.getTop()) / 2) - (imageView.getMeasuredHeight() / 2), 0, 12);
        }
        if (imageView.getVisibility() == 0) {
            ev0.x(imageView, (getMeasuredWidth() - i8) - imageView.getMeasuredWidth(), ((textView2.getBottom() + textView.getTop()) / 2) - (imageView.getMeasuredHeight() / 2), 0, 12);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, IntCompanionObject.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, IntCompanionObject.MIN_VALUE);
        Lazy lazy = this.x0;
        boolean L = y7e.L(lazy);
        int i5 = this.v;
        if (L) {
            ((TextView) lazy.getValue()).measure(makeMeasureSpec, makeMeasureSpec2);
            Lazy lazy2 = this.y0;
            ((View) lazy2.getValue()).measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.w, 1073741824));
            i3 = ((View) lazy2.getValue()).getMeasuredHeight() + ((TextView) lazy.getValue()).getMeasuredHeight() + i5;
        } else {
            i3 = 0;
        }
        Lazy lazy3 = this.z;
        if (y7e.L(lazy3) && ((xob) lazy3.getValue()).getParent() != null) {
            ((xob) lazy3.getValue()).measure(i, i2);
            int measuredHeight = ((xob) lazy3.getValue()).getMeasuredHeight();
            if (!y7e.L(lazy)) {
                i5 = 0;
            }
            i3 += measuredHeight + i5;
        }
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(this.o, 1073741824);
        Lazy lazy4 = this.v0;
        boolean L2 = y7e.L(lazy4);
        int i6 = this.c;
        if (L2) {
            ((ImageView) lazy4.getValue()).measure(makeMeasureSpec3, makeMeasureSpec3);
            i4 = size - (((ImageView) lazy4.getValue()).getMeasuredWidth() + i6);
        } else {
            i4 = size;
        }
        ImageView imageView = this.w0;
        if (imageView.getVisibility() == 0) {
            imageView.measure(makeMeasureSpec3, makeMeasureSpec3);
            i4 -= imageView.getMeasuredWidth() + i6;
        }
        TextView textView = this.x;
        textView.measure(View.MeasureSpec.makeMeasureSpec(i4, IntCompanionObject.MIN_VALUE), makeMeasureSpec2);
        TextView textView2 = this.y;
        textView2.measure(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + textView2.getMeasuredHeight() + this.b + textView.getMeasuredHeight() + this.a + i3);
    }
}
