package defpackage;

import android.graphics.drawable.Drawable;
import java.io.Closeable;
import java.util.concurrent.CancellationException;

/* renamed from: hd4  reason: default package */
public final class hd4 extends id4 implements z33, phf {
    public Drawable o;
    public final ome v;
    public boolean w;
    public final jx3 x;

    public hd4(Drawable drawable, etc etc, gc8 gc8) {
        this.o = drawable;
        this.v = etc;
        jx3 a = e14.a(gc8);
        this.x = a;
        bs0.K(new ps5(etc, new wq0(2, this, hd4.class, "onThemeChanged", "onThemeChanged(Lone/me/sdk/design/OneMeTheme;)V", 4, 14), 5), a);
    }

    public final Drawable K() {
        Drawable drawable = this.o;
        if (drawable == null) {
            return null;
        }
        Drawable mutate = drawable.mutate();
        if (mutate != drawable) {
            mutate.setBounds(drawable.getBounds());
        }
        if (mutate instanceof phf) {
            ((phf) mutate).onThemeChanged((k2b) this.v.getValue());
        }
        return mutate;
    }

    public final void close() {
        e14.c(this.x, (CancellationException) null);
        Drawable drawable = this.o;
        Closeable closeable = drawable instanceof Closeable ? (Closeable) drawable : null;
        if (closeable != null) {
            closeable.close();
        }
        this.o = null;
        this.w = true;
    }

    public final int getHeight() {
        Drawable drawable = this.o;
        if (drawable != null) {
            Integer valueOf = Integer.valueOf(drawable.getIntrinsicHeight());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    public final int getSizeInBytes() {
        return getHeight() * getWidth() * 4;
    }

    public final int getWidth() {
        Drawable drawable = this.o;
        if (drawable != null) {
            Integer valueOf = Integer.valueOf(drawable.getIntrinsicWidth());
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        return 0;
    }

    public final boolean isClosed() {
        return this.w;
    }

    public final boolean isStateful() {
        Drawable drawable = this.o;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return false;
    }

    public final void onThemeChanged(k2b k2b) {
        Drawable drawable = this.o;
        phf phf = drawable instanceof phf ? (phf) drawable : null;
        if (phf != null) {
            phf.onThemeChanged(k2b);
        }
    }
}
