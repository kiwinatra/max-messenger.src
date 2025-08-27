package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.math.MathKt;

/* renamed from: fm5  reason: default package */
public final class fm5 extends View {
    public int a;
    public final jm5 b;
    public final Lazy c;
    public short o = 0;
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;

    public fm5(Context context) {
        super(context, (AttributeSet) null);
        js9 js9 = fu4.k;
        this.a = js9.e(getContext()).f().a().a(true).c.f;
        jm5 jm5 = new jm5(context);
        jm5.setCallback(this);
        this.b = jm5;
        em5 em5 = new em5(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = LazyKt.lazy(lazyThreadSafetyMode, em5);
        this.v = LazyKt.lazy(lazyThreadSafetyMode, new em5(this, 1));
        this.w = LazyKt.lazy(lazyThreadSafetyMode, new em5(this, 2));
        this.x = LazyKt.lazy(lazyThreadSafetyMode, new j35(8, (Object) context, (Object) this));
        b(js9.e(getContext()).f().a().a(true));
    }

    public final void a(Canvas canvas) {
        int width = canvas.getWidth();
        jm5 jm5 = this.b;
        int save = canvas.save();
        canvas.translate(((float) (width - jm5.getBounds().width())) * 0.5f, ((float) (canvas.getHeight() - jm5.getBounds().height())) * 0.5f);
        try {
            jm5.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final void b(ws0 ws0) {
        this.a = ws0.c.f;
        Lazy lazy = this.c;
        if (lazy.isInitialized()) {
            ((Drawable) lazy.getValue()).setTint(this.a);
        }
        Lazy lazy2 = this.v;
        if (lazy2.isInitialized()) {
            ((Drawable) lazy2.getValue()).setTint(this.a);
        }
        Lazy lazy3 = this.x;
        boolean isInitialized = lazy3.isInitialized();
        js9 js9 = fu4.k;
        if (isInitialized) {
            ((km5) lazy3.getValue()).onThemeChanged(js9.e(getContext()).f());
        }
        Lazy lazy4 = this.w;
        if (lazy4.isInitialized()) {
            ((a10) lazy4.getValue()).b(this.a);
        }
        this.b.a(js9.e(getContext()).f().a().l().a.b.d, js9.e(getContext()).f().a().l().a.b.t, js9.e(getContext()).f().a().l().a.b.u);
    }

    public final void c(float f) {
        short s = this.o;
        this.o = 1;
        boolean z = !(s == 1);
        ((a10) this.w.getValue()).setLevel((int) (f * ((float) 100)));
        if (z) {
            ((Drawable) this.v.getValue()).setTint(this.a);
            requestLayout();
            invalidate();
        }
    }

    public final void onDraw(Canvas canvas) {
        short s = this.o;
        if (s == 0) {
            a(canvas);
            int width = getWidth();
            Lazy lazy = this.c;
            int save = canvas.save();
            canvas.translate(((float) (width - ((Drawable) lazy.getValue()).getBounds().width())) * 0.5f, vo4.c().getDisplayMetrics().density * 12.0f);
            try {
                ((Drawable) lazy.getValue()).draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else if (s == 1) {
            a(canvas);
            int save2 = canvas.save();
            canvas.translate(vo4.c().getDisplayMetrics().density * 10.0f, vo4.c().getDisplayMetrics().density * 12.0f);
            try {
                ((a10) this.w.getValue()).draw(canvas);
            } finally {
                canvas.restoreToCount(save2);
            }
        } else if (s == 2) {
            ((km5) this.x.getValue()).draw(canvas);
        }
    }

    public final void onMeasure(int i, int i2) {
        int roundToInt = MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density);
        this.b.setBounds(0, 0, MathKt.roundToInt(((float) 28) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density));
        Lazy lazy = this.c;
        if (lazy.isInitialized()) {
            float f = (float) 20;
            ((Drawable) lazy.getValue()).setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        }
        Lazy lazy2 = this.v;
        if (lazy2.isInitialized()) {
            float f2 = (float) 12;
            ((Drawable) lazy2.getValue()).setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        }
        Lazy lazy3 = this.w;
        if (lazy3.isInitialized()) {
            float f3 = (float) 20;
            ((a10) lazy3.getValue()).setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3), MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density));
        }
        Lazy lazy4 = this.x;
        if (lazy4.isInitialized()) {
            ((km5) lazy4.getValue()).setBounds(0, 0, roundToInt, roundToInt);
        }
        setMeasuredDimension(roundToInt, roundToInt);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable((Drawable) null);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        boolean verifyDrawable = super.verifyDrawable(drawable);
        Lazy lazy = this.w;
        boolean z = true;
        if (lazy.isInitialized()) {
            verifyDrawable = verifyDrawable || drawable == lazy.getValue();
        }
        Lazy lazy2 = this.x;
        if (lazy2.isInitialized()) {
            verifyDrawable = verifyDrawable || drawable == lazy2.getValue();
        }
        Lazy lazy3 = this.c;
        if (lazy3.isInitialized()) {
            verifyDrawable = verifyDrawable || drawable == lazy3.getValue();
        }
        Lazy lazy4 = this.v;
        if (!lazy4.isInitialized()) {
            return verifyDrawable;
        }
        if (!verifyDrawable && drawable != lazy4.getValue()) {
            z = false;
        }
        return z;
    }
}
