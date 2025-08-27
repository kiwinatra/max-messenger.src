package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.math.MathKt;

/* renamed from: p7e  reason: default package */
public final class p7e extends LayerDrawable implements Animatable, phf {
    public final int a;
    public final o7e b;
    public final int c;
    public int o = MathKt.roundToInt(((float) 80) * vo4.c().getDisplayMetrics().density);
    public int v = -1;
    public final boolean w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p7e(Context context) {
        super(new Drawable[0]);
        boolean z = false;
        o7e o7e = new o7e(context);
        this.b = o7e;
        kn4.a.getClass();
        this.w = jn4.a(context).compareTo(kn4.v) >= 0 ? true : z;
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setCallback(this);
        int addLayer = addLayer(colorDrawable);
        this.a = addLayer;
        setLayerGravity(addLayer, 119);
        int addLayer2 = addLayer(o7e);
        this.c = addLayer2;
        o7e.setCallback(this);
        setLayerGravity(addLayer2, 17);
        onThemeChanged(fu4.k.e(context).f());
    }

    public final void a(int i) {
        this.v = i;
        if (!getBounds().isEmpty()) {
            setLayerInsetBottom(this.c, getBounds().centerY() - i);
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(drawable);
        }
    }

    public final boolean isRunning() {
        return this.w && this.b.isRunning();
    }

    public final void onBoundsChange(Rect rect) {
        int min = Math.min(rect.width() - (this.o * 2), rect.height() - (this.o * 2));
        int i = this.c;
        setLayerSize(i, min, min);
        int i2 = this.v;
        if (i2 > 0) {
            setLayerInsetBottom(i, rect.centerY() - i2);
        }
        super.onBoundsChange(rect);
    }

    public final void onThemeChanged(k2b k2b) {
        this.b.a(k2b);
        ((ColorDrawable) getDrawable(this.a)).setColor(k2b.c().i);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z2);
    }

    public final void start() {
        if (this.w) {
            this.b.start();
        }
    }

    public final void stop() {
        if (this.w) {
            this.b.stop();
        }
    }
}
