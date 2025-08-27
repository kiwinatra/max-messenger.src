package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: q14  reason: default package */
public final class q14 extends AppCompatTextView implements phf {
    public long x;
    public final ValueAnimator y = ValueAnimator.ofFloat(new float[]{360.0f, c44.DEFAULT_ASPECT_RATIO});
    public final f13 z;

    public q14(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f13 f13 = new f13();
        js9 js9 = fu4.k;
        f13.a.setColor(js9.e(getContext()).f().h().a);
        this.z = f13;
        setBackground(f13);
        puf.n.b(this, uy4.b);
        setTextAlignment(4);
        js9.e(getContext()).f().getText().getClass();
        setTextColor(-1);
        setGravity(17);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j = this.x;
        ValueAnimator valueAnimator = this.y;
        valueAnimator.setDuration(j);
        valueAnimator.addUpdateListener(new z00(7, (Object) this));
        valueAnimator.start();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y.cancel();
    }

    public final void onThemeChanged(k2b k2b) {
        this.z.a.setColor(k2b.h().a);
        k2b.getText().getClass();
        setTextColor(-1);
    }

    public final void setMaxValue(long j) {
        this.x = j;
    }
}
