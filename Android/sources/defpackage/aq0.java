package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: aq0  reason: default package */
public final class aq0 extends Drawable {
    public static final int[] n = new int[2];
    public static final int[] o = new int[2];
    public final int a;
    public final boolean b;
    public wp0 c;
    public final Lazy d;
    public final yp0 e;
    public boolean f;
    public Bitmap g;
    public xp0 h;
    public Function0 i;
    public Function0 j;
    public final float k;
    public boolean l;
    public final zp0 m;

    public aq0(Context context, int i2, float f2, boolean z, boolean z2) {
        this.a = i2;
        this.b = z;
        this.c = (z2 || Build.VERSION.SDK_INT < 31) ? new ccf(context) : new nob(2);
        this.d = LazyKt.lazy(new v4(context, 5));
        this.e = new yp0(0, this);
        this.k = f2;
        this.m = new zp0(this, context, z2);
    }

    public final View a() {
        Drawable.Callback callback = getCallback();
        while (callback != null) {
            if (callback instanceof Drawable) {
                callback = ((Drawable) callback).getCallback();
            }
            if (callback instanceof View) {
                return (View) callback;
            }
        }
        return null;
    }

    public final void b(boolean z) {
        View rootView;
        View a2 = a();
        if (a2 != null && (rootView = a2.getRootView()) != null) {
            ViewTreeObserver viewTreeObserver = a2.getViewTreeObserver();
            yp0 yp0 = this.e;
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(yp0);
            }
            ViewTreeObserver viewTreeObserver2 = rootView.getViewTreeObserver();
            if (viewTreeObserver2 != null) {
                viewTreeObserver2.removeOnPreDrawListener(yp0);
            }
            if (z) {
                rootView.getViewTreeObserver().addOnPreDrawListener(yp0);
                if (!Intrinsics.areEqual((Object) rootView.getWindowId(), (Object) a2.getWindowId())) {
                    a2.getViewTreeObserver().addOnPreDrawListener(yp0);
                }
            }
        }
    }

    public final void c() {
        Bitmap bitmap;
        View a2;
        wp0 wp0;
        xp0 xp0 = this.h;
        if (xp0 != null && (bitmap = this.g) != null && (a2 = a()) != null && (wp0 = this.c) != null) {
            View rootView = a2.getRootView();
            bitmap.eraseColor(0);
            xp0.save();
            Function0 function0 = this.i;
            if (function0 != null) {
                function0.invoke();
            }
            int[] iArr = n;
            rootView.getLocationOnScreen(iArr);
            int[] iArr2 = o;
            a2.getLocationOnScreen(iArr2);
            int i2 = iArr2[1] - iArr[1];
            float height = ((float) a2.getHeight()) / ((float) bitmap.getHeight());
            float width = ((float) a2.getWidth()) / ((float) bitmap.getWidth());
            xp0.translate(((float) (-(iArr2[0] - iArr[0]))) / width, ((float) (-i2)) / height);
            float f2 = (float) 1;
            xp0.scale(f2 / width, f2 / height);
            try {
                rootView.draw(xp0);
            } catch (Throwable th) {
                z68.o(aq0.class.getName(), "fail to draw blur", th);
            }
            xp0.restore();
            if (!bitmap.isRecycled()) {
                wp0.m(bitmap, this.k);
                this.f = true;
            }
            Function0 function02 = this.j;
            if (function02 != null) {
                function02.invoke();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f && !(canvas instanceof xp0) && (bitmap = this.g) != null && !bitmap.isRecycled()) {
            float width = ((float) getBounds().width()) / ((float) bitmap.getWidth());
            float height = ((float) getBounds().height()) / ((float) bitmap.getHeight());
            int save = canvas.save();
            canvas.scale(width, height, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO);
            try {
                if (canvas.isHardwareAccelerated()) {
                    wp0 wp0 = this.c;
                    if (wp0 != null) {
                        wp0.k(canvas, bitmap);
                    }
                } else {
                    canvas.drawBitmap(bitmap, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, ((ccf) this.d.getValue()).a);
                }
                canvas.restoreToCount(save);
                int i2 = this.a;
                if (i2 != 0) {
                    canvas.drawColor(i2);
                }
            } catch (Throwable th) {
                canvas.restoreToCount(save);
                throw th;
            }
        }
    }

    public final int getOpacity() {
        return -1;
    }

    public final void invalidateSelf() {
        super.invalidateSelf();
        c();
        if (!this.l) {
            View a2 = a();
            if (a2 != null) {
                a2.addOnAttachStateChangeListener(this.m);
            }
            this.l = true;
        }
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [xp0, android.graphics.Canvas] */
    public final void onBoundsChange(Rect rect) {
        b(this.b);
        int width = rect.width();
        int height = rect.height();
        if (((int) Math.ceil((double) (((float) width) / 6.0f))) != 0 && ((int) Math.ceil((double) (((float) height) / 6.0f))) != 0) {
            this.f = false;
            int ceil = (int) Math.ceil((double) (((float) rect.width()) / 6.0f));
            int i2 = ceil % 64;
            if (i2 != 0) {
                ceil = (ceil - i2) + 64;
            }
            int ceil2 = (int) Math.ceil((double) (((float) rect.height()) / (((float) rect.width()) / ((float) ceil))));
            Bitmap bitmap = this.g;
            if (bitmap == null || bitmap.isRecycled() || ceil >= bitmap.getWidth() || ceil2 >= bitmap.getHeight()) {
                bitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                Bitmap bitmap2 = this.g;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.g = bitmap;
            } else {
                bitmap.reconfigure(ceil, ceil2, Bitmap.Config.ARGB_8888);
            }
            this.h = new Canvas(bitmap);
            c();
        }
    }

    public final void setAlpha(int i2) {
        wp0 wp0 = this.c;
        if (wp0 != null) {
            wp0.d(i2);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
