package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.net.Uri;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: yr5  reason: default package */
public final class yr5 extends FrameLayout {
    public int a;
    public int b;
    public float c;
    public float o;
    public final WindowManager.LayoutParams v = new WindowManager.LayoutParams(-1, -1, 0, 0, 2038, 16779016, -3);
    public final SimpleDraweeView w;
    public xr5 x;
    public ValueAnimator y;

    public yr5(Context context) {
        super(context);
        if (getContext().getResources().getConfiguration().orientation == 1) {
            this.v.layoutInDisplayCutoutMode = 1;
        }
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.w = simpleDraweeView;
        addView(simpleDraweeView, new FrameLayout.LayoutParams(0, 0));
    }

    public final void a(int i, int i2, int i3, int i4) {
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
        this.y = ofFloat;
        ofFloat.setDuration(300);
        this.y.setInterpolator(((qra) ym.e()).d().a.n());
        this.y.setStartDelay((long) 0);
        this.y.addUpdateListener(new wr5(this, i3, i4, i, i2));
        this.y.addListener(new z6(6, (Object) this));
        this.y.start();
    }

    public final void b(Uri uri, int i, int i2, int i3, int i4) {
        knb a2 = ld9.p.get();
        a2.e = qa7.a(uri);
        a2.l = this.w.getController();
        this.w.setController(a2.a());
        float f = (float) i;
        this.c = f;
        float f2 = (float) i2;
        this.o = f2;
        this.a = i3;
        this.b = i4;
        this.w.setLayoutParams(new FrameLayout.LayoutParams(this.a, this.b));
        this.w.setTranslationX(f);
        this.w.setTranslationY(f2);
        invalidate();
    }

    public WindowManager.LayoutParams getWindowLayoutParams() {
        return this.v;
    }

    public void setListener(xr5 xr5) {
        this.x = xr5;
    }
}
