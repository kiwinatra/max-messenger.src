package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import java.util.WeakHashMap;

/* renamed from: po  reason: default package */
public final class po extends xe8 {
    public boolean X = false;
    public final SeekBar v;
    public Drawable w;
    public ColorStateList x = null;
    public PorterDuff.Mode y = null;
    public boolean z = false;

    public po(SeekBar seekBar) {
        super((ProgressBar) seekBar);
        this.v = seekBar;
    }

    public final void D() {
        Drawable drawable = this.w;
        if (drawable == null) {
            return;
        }
        if (this.z || this.X) {
            Drawable mutate = drawable.mutate();
            this.w = mutate;
            if (this.z) {
                ru4.h(mutate, this.x);
            }
            if (this.X) {
                ru4.i(this.w, this.y);
            }
            if (this.w.isStateful()) {
                this.w.setState(this.v.getDrawableState());
            }
        }
    }

    public final void E(Canvas canvas) {
        if (this.w != null) {
            SeekBar seekBar = this.v;
            int max = seekBar.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.w.getIntrinsicWidth();
                int intrinsicHeight = this.w.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.w.setBounds(-i2, -i, i2, i);
                float width = ((float) ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) seekBar.getPaddingLeft(), (float) (seekBar.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.w.draw(canvas);
                    canvas.translate(width, c44.DEFAULT_ASPECT_RATIO);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public final void u(AttributeSet attributeSet, int i) {
        super.u(attributeSet, i);
        SeekBar seekBar = this.v;
        g6d w2 = g6d.w(seekBar.getContext(), attributeSet, koc.AppCompatSeekBar, i, 0);
        SeekBar seekBar2 = this.v;
        Context context = seekBar2.getContext();
        int[] iArr = koc.AppCompatSeekBar;
        WeakHashMap weakHashMap = gag.a;
        bag.d(seekBar2, context, iArr, attributeSet, (TypedArray) w2.c, i, 0);
        Drawable r = w2.r(koc.AppCompatSeekBar_android_thumb);
        if (r != null) {
            seekBar.setThumb(r);
        }
        Drawable q = w2.q(koc.AppCompatSeekBar_tickMark);
        Drawable drawable = this.w;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.w = q;
        if (q != null) {
            q.setCallback(seekBar);
            su4.b(q, seekBar.getLayoutDirection());
            if (q.isStateful()) {
                q.setState(seekBar.getDrawableState());
            }
            D();
        }
        seekBar.invalidate();
        int i2 = koc.AppCompatSeekBar_tickMarkTintMode;
        TypedArray typedArray = (TypedArray) w2.c;
        if (typedArray.hasValue(i2)) {
            this.y = yu4.c(typedArray.getInt(koc.AppCompatSeekBar_tickMarkTintMode, -1), this.y);
            this.X = true;
        }
        if (typedArray.hasValue(koc.AppCompatSeekBar_tickMarkTint)) {
            this.x = w2.o(koc.AppCompatSeekBar_tickMarkTint);
            this.z = true;
        }
        w2.x();
        D();
    }
}
