package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* renamed from: av4  reason: default package */
public abstract class av4 extends Drawable implements Animatable {
    public static final dz1 Y = new dz1(Float.class, "growFraction", 7);
    public int X;
    public final Context a;
    public final nk0 b;
    public vh c;
    public ValueAnimator o;
    public ValueAnimator v;
    public ArrayList w;
    public boolean x;
    public float y;
    public final Paint z = new Paint();

    /* JADX WARNING: type inference failed for: r2v1, types: [vh, java.lang.Object] */
    public av4(Context context, nk0 nk0) {
        this.a = context;
        this.b = nk0;
        this.c = new Object();
        setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final float b() {
        nk0 nk0 = this.b;
        if (nk0.e == 0 && nk0.f == 0) {
            return 1.0f;
        }
        return this.y;
    }

    public final void c(ye yeVar) {
        if (this.w == null) {
            this.w = new ArrayList();
        }
        if (!this.w.contains(yeVar)) {
            this.w.add(yeVar);
        }
    }

    public final boolean d(boolean z2, boolean z3, boolean z4) {
        vh vhVar = this.c;
        ContentResolver contentResolver = this.a.getContentResolver();
        vhVar.getClass();
        return e(z2, z3, z4 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > c44.DEFAULT_ASPECT_RATIO);
    }

    public boolean e(boolean z2, boolean z3, boolean z4) {
        ValueAnimator valueAnimator = this.o;
        dz1 dz1 = Y;
        if (valueAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, dz1, new float[]{c44.DEFAULT_ASPECT_RATIO, 1.0f});
            this.o = ofFloat;
            ofFloat.setDuration(500);
            this.o.setInterpolator(xg.b);
            ValueAnimator valueAnimator2 = this.o;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                this.o = valueAnimator2;
                valueAnimator2.addListener(new zu4(this, 0));
            } else {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
        }
        if (this.v == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, dz1, new float[]{1.0f, c44.DEFAULT_ASPECT_RATIO});
            this.v = ofFloat2;
            ofFloat2.setDuration(500);
            this.v.setInterpolator(xg.b);
            ValueAnimator valueAnimator3 = this.v;
            if (valueAnimator3 == null || !valueAnimator3.isRunning()) {
                this.v = valueAnimator3;
                valueAnimator3.addListener(new zu4(this, 1));
            } else {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
        }
        if (!isVisible() && !z2) {
            return false;
        }
        ValueAnimator valueAnimator4 = z2 ? this.o : this.v;
        ValueAnimator valueAnimator5 = z2 ? this.v : this.o;
        if (!z4) {
            if (valueAnimator5.isRunning()) {
                boolean z5 = this.x;
                this.x = true;
                new ValueAnimator[]{valueAnimator5}[0].cancel();
                this.x = z5;
            }
            if (valueAnimator4.isRunning()) {
                valueAnimator4.end();
            } else {
                boolean z6 = this.x;
                this.x = true;
                new ValueAnimator[]{valueAnimator4}[0].end();
                this.x = z6;
            }
            return super.setVisible(z2, false);
        } else if (valueAnimator4.isRunning()) {
            return false;
        } else {
            boolean z7 = !z2 || super.setVisible(z2, false);
            nk0 nk0 = this.b;
            if (!z2 ? nk0.f == 0 : nk0.e == 0) {
                boolean z8 = this.x;
                this.x = true;
                new ValueAnimator[]{valueAnimator4}[0].end();
                this.x = z8;
                return z7;
            }
            if (z3 || !valueAnimator4.isPaused()) {
                valueAnimator4.start();
            } else {
                valueAnimator4.resume();
            }
            return z7;
        }
    }

    public final void f(lk0 lk0) {
        ArrayList arrayList = this.w;
        if (arrayList != null && arrayList.contains(lk0)) {
            this.w.remove(lk0);
            if (this.w.isEmpty()) {
                this.w = null;
            }
        }
    }

    public final int getAlpha() {
        return this.X;
    }

    public final int getOpacity() {
        return -3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = r1.v;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isRunning() {
        /*
            r1 = this;
            android.animation.ValueAnimator r0 = r1.o
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x0015
        L_0x000a:
            android.animation.ValueAnimator r1 = r1.v
            if (r1 == 0) goto L_0x0017
            boolean r1 = r1.isRunning()
            if (r1 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av4.isRunning():boolean");
    }

    public final void setAlpha(int i) {
        this.X = i;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.z.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final boolean setVisible(boolean z2, boolean z3) {
        return d(z2, z3, true);
    }

    public final void start() {
        e(true, true, false);
    }

    public final void stop() {
        e(false, true, false);
    }
}
