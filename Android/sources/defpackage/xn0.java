package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.animated.gif.GifImage;
import kotlin.jvm.functions.Function0;

/* renamed from: xn0  reason: default package */
public final class xn0 implements dg {
    public Rect X;
    public int Y;
    public int Z;
    public final ynb a;
    public final do0 b;
    public final og c;
    public final pv0 o;
    public final boolean v;
    public final eo0 w;
    public final zc4 x;
    public final Bitmap.Config y = Bitmap.Config.ARGB_8888;
    public final Paint z = new Paint(6);

    public xn0(ynb ynb, do0 do0, grg grg, pv0 pv0, boolean z2, eo0 eo0, zc4 zc4) {
        this.a = ynb;
        this.b = do0;
        this.c = grg;
        this.o = pv0;
        this.v = z2;
        this.w = eo0;
        this.x = zc4;
        new Path();
        new Matrix();
        c();
    }

    public final boolean a(int i, y33 y33, Canvas canvas, int i2) {
        if (y33 == null || !y33.m0(y33)) {
            return false;
        }
        Bitmap bitmap = (Bitmap) y33.e0();
        Rect rect = this.X;
        Paint paint = this.z;
        if (rect == null) {
            canvas.drawBitmap(bitmap, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, paint);
        } else {
            rect.width();
            rect.height();
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        }
        if (i2 == 3 || this.v) {
            return true;
        }
        this.b.s(i, y33);
        return true;
    }

    public final boolean b(Canvas canvas, int i, int i2) {
        boolean z2;
        boolean z3;
        boolean z4;
        y33 y33 = null;
        try {
            boolean z5 = false;
            int i3 = 1;
            if (this.v) {
                eo0 eo0 = this.w;
                y33 h = eo0 != null ? eo0.h(i, canvas.getWidth(), canvas.getHeight()) : null;
                if (h != null) {
                    try {
                        if (h.k0()) {
                            Bitmap bitmap = (Bitmap) h.e0();
                            Rect rect = this.X;
                            Paint paint = this.z;
                            if (rect == null) {
                                canvas.drawBitmap(bitmap, c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, paint);
                            } else {
                                rect.width();
                                rect.height();
                                canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                            }
                            y33.U(h);
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        y33 = h;
                        y33.U(y33);
                        throw th;
                    }
                }
                if (eo0 != null) {
                    eo0.j(canvas.getWidth(), canvas.getHeight());
                }
                y33.U(h);
                return false;
            }
            do0 do0 = this.b;
            if (i2 != 0) {
                pv0 pv0 = this.o;
                if (i2 == 1) {
                    y33 = do0.y();
                    if (y33 != null) {
                        if (y33.k0()) {
                            z3 = pv0.h((Bitmap) y33.e0(), i);
                            if (!z3) {
                                y33.U(y33);
                            }
                            if (z3 && a(i, y33, canvas, 1)) {
                                z5 = true;
                            }
                            z2 = z5;
                            i3 = 2;
                        }
                    }
                    z3 = false;
                    z5 = true;
                    z2 = z5;
                    i3 = 2;
                } else if (i2 == 2) {
                    y33 = this.a.c(this.Y, this.Z, this.y);
                    if (y33 != null) {
                        if (y33.k0()) {
                            z4 = pv0.h((Bitmap) y33.e0(), i);
                            if (!z4) {
                                y33.U(y33);
                            }
                            if (z4 && a(i, y33, canvas, 2)) {
                                z5 = true;
                            }
                            z2 = z5;
                            i3 = 3;
                        }
                    }
                    z4 = false;
                    z5 = true;
                    z2 = z5;
                    i3 = 3;
                } else if (i2 != 3) {
                    return false;
                } else {
                    y33 = do0.q();
                    z2 = a(i, y33, canvas, 3);
                    i3 = -1;
                }
            } else {
                y33 = do0.A(i);
                z2 = a(i, y33, canvas, 0);
            }
            y33.U(y33);
            return (z2 || i3 == -1) ? z2 : b(canvas, i, i3);
        } catch (RuntimeException e) {
            bg5.k(xn0.class, e);
            return false;
        } catch (Throwable th2) {
            th = th2;
            y33.U(y33);
            throw th;
        }
    }

    public final void c() {
        pv0 pv0 = this.o;
        int k = ((GifImage) ((ef) pv0.o).e).k();
        this.Y = k;
        int i = -1;
        if (k == -1) {
            Rect rect = this.X;
            this.Y = rect != null ? rect.width() : -1;
        }
        int h = ((GifImage) ((ef) pv0.o).e).h();
        this.Z = h;
        if (h == -1) {
            Rect rect2 = this.X;
            if (rect2 != null) {
                i = rect2.height();
            }
            this.Z = i;
        }
    }

    public final void clear() {
        if (this.v) {
            eo0 eo0 = this.w;
            if (eo0 != null) {
                eo0.i();
                return;
            }
            return;
        }
        this.b.clear();
    }

    public final void d(int i) {
        this.z.setAlpha(i);
    }

    public final int e() {
        return this.c.e();
    }

    public final void h(ColorFilter colorFilter) {
        this.z.setColorFilter(colorFilter);
    }

    public final int i() {
        return this.c.i();
    }

    public final int j(int i) {
        return this.c.j(i);
    }

    public final int l() {
        return this.Z;
    }

    public final void o(Rect rect) {
        this.X = rect;
        pv0 pv0 = this.o;
        ef efVar = (ef) pv0.o;
        if (!ef.a((GifImage) efVar.e, rect).equals((Rect) efVar.f)) {
            boolean z2 = efVar.b;
            efVar = new ef((djd) efVar.c, (m7f) efVar.d, rect, z2);
        }
        if (efVar != ((ef) pv0.o)) {
            pv0.o = efVar;
            pv0.v = new lf6(efVar, pv0.b, (u6h) pv0.w);
        }
        c();
    }

    public final int p() {
        return this.Y;
    }

    public final void q(ts1 ts1) {
    }

    public final boolean s(Drawable drawable, Canvas canvas, int i) {
        zc4 zc4;
        eo0 eo0;
        boolean b2 = b(canvas, i, 0);
        if (!(this.v || (zc4 = this.x) == null || (eo0 = this.w) == null)) {
            eo0.g(zc4, this.b, this, i, (Function0) null);
        }
        return b2;
    }

    public final int t() {
        return this.c.t();
    }
}
