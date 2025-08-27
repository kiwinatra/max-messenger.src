package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import kotlin.Lazy;

/* renamed from: r20  reason: default package */
public final class r20 extends Drawable {
    public static final int u = ((int) ym.v.getResources().getDimension(ydc.attach_drawable));
    public final int a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public long j;
    public boolean k;
    public boolean l;
    public final Paint m;
    public final Paint n;
    public final Drawable o;
    public final RectF p;
    public ValueAnimator q;
    public final q20 r;
    public final q20 s;
    public final b t;

    public r20(Context context) {
        this(context, cad.n0);
    }

    public final void b(Canvas canvas, boolean z) {
        Canvas canvas2 = canvas;
        if (!this.k) {
            return;
        }
        if (this.b == 10000 && !this.l) {
            return;
        }
        if (System.currentTimeMillis() - this.j < 150) {
            invalidateSelf();
            return;
        }
        int centerX = getBounds().centerX();
        int centerY = getBounds().centerY();
        canvas2.drawCircle((float) centerX, (float) centerY, (float) (this.c / 2), this.m);
        boolean c2 = c();
        Paint paint = this.n;
        int i2 = this.a;
        RectF rectF = this.p;
        if (c2) {
            if (this.k) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.i;
                this.i = elapsedRealtime;
                int i3 = this.f;
                float f2 = ((float) j2) / 30.0f;
                int i4 = (int) ((10.0f * f2) + ((float) i3));
                if (Math.abs(i4 - i3) > 360) {
                    this.h = true;
                    this.f = 0;
                    this.e = 0;
                } else {
                    boolean z2 = this.h;
                    int i5 = z2 ? (int) ((f2 * 200.0f) + ((float) this.e)) : (int) (((float) this.e) - (f2 * 200.0f));
                    int i6 = this.b;
                    boolean z3 = i6 != 0 && this.e == this.g;
                    boolean z4 = z3 && this.f == 270;
                    if (i6 != 0) {
                        if (!z3) {
                            if (z2) {
                                int i7 = this.e;
                                int i8 = this.g;
                                if (i7 < i8 && i5 >= i8) {
                                    this.e = i8;
                                }
                            } else {
                                int i9 = this.e;
                                int i10 = this.g;
                                if (i9 > i10 && i5 <= i10) {
                                    this.e = i10;
                                }
                            }
                            z3 = true;
                        }
                        if (z3 && this.f < 270 && i4 >= 270) {
                            this.f = 270;
                            z4 = true;
                        }
                        if (z4) {
                            this.b = this.g;
                            onLevelChange(i6);
                        }
                    }
                    if (!z3) {
                        this.e = i5;
                    }
                    this.f = i4;
                    int i11 = this.e;
                    if (i11 > 10000) {
                        this.e = 10000 - (i11 - 10000);
                        this.h = false;
                    } else if (i11 < 0) {
                        this.e = -i11;
                        this.h = true;
                    }
                    if (i4 >= 360) {
                        this.f = i4 - 360;
                    }
                }
            }
            float f3 = (((float) this.e) / 10000.0f) * 360.0f;
            if (f3 >= 360.0f) {
                f3 = 359.0f;
            }
            if (f3 == c44.DEFAULT_ASPECT_RATIO) {
                f3 = 1.0f;
            }
            float f4 = f3;
            int i12 = this.c;
            rectF.set((float) ((centerX - (i12 / 2)) + i2), (float) ((centerY - (i12 / 2)) + i2), (float) (((i12 / 2) + centerX) - i2), (float) (((i12 / 2) + centerY) - i2));
            canvas.drawArc(rectF, (float) this.f, f4, false, paint);
        } else {
            int i13 = this.c;
            rectF.set((float) ((centerX - (i13 / 2)) + i2), (float) ((centerY - (i13 / 2)) + i2), (float) (((i13 / 2) + centerX) - i2), (float) (((i13 / 2) + centerY) - i2));
            canvas.drawArc(rectF, 270.0f, (((float) this.b) / 10000.0f) * 360.0f, false, paint);
        }
        Drawable drawable = this.o;
        if (drawable != null && z) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int i14 = this.c;
            int intrinsicWidth2 = (intrinsicWidth > i14 / 2 ? i14 / 2 : drawable.getIntrinsicWidth()) / 2;
            drawable.setBounds(centerX - intrinsicWidth2, centerY - intrinsicWidth2, centerX + intrinsicWidth2, centerY + intrinsicWidth2);
            drawable.draw(canvas2);
        }
        if (c()) {
            invalidateSelf();
        }
    }

    public final boolean c() {
        return (this.b != 0 && this.g == this.e && this.f == 270) ? false : true;
    }

    public final void d(ws0 ws0) {
        this.m.setColor(ws0.c.d);
        xs0 xs0 = ws0.c;
        this.o.setTint(xs0.d);
        this.n.setColor(xs0.d);
    }

    public final void draw(Canvas canvas) {
        b(canvas, true);
    }

    public final int getIntrinsicHeight() {
        return this.c;
    }

    public final int getIntrinsicWidth() {
        return this.c;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void invalidateSelf() {
        b bVar = this.t;
        unscheduleSelf(bVar);
        scheduleSelf(bVar, 0);
    }

    public final boolean onLevelChange(int i2) {
        if (this.b == 0 && i2 != 0) {
            this.g = i2;
            if (this.f == 270) {
                this.e = i2;
            }
        }
        float f2 = ((float) i2) / 10000.0f;
        if (f2 == -0.1f) {
            this.k = false;
        } else if (f2 == -0.2f) {
            this.k = true;
        } else {
            if (i2 == 0) {
                this.j = System.currentTimeMillis() + 150;
            }
            boolean c2 = c();
            q20 q20 = this.s;
            q20 q202 = this.r;
            if (c2 || i2 < this.b || i2 == 10000) {
                this.b = i2;
                if (this.q != null) {
                    if (Looper.getMainLooper().isCurrentThread()) {
                        this.q.cancel();
                    } else {
                        unscheduleSelf(q202);
                        unscheduleSelf(q20);
                        scheduleSelf(q202, 0);
                    }
                }
            } else {
                if (this.q == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.q = valueAnimator;
                    valueAnimator.addUpdateListener(new z00(1, (Object) this));
                    this.q.setDuration(200);
                } else if (Looper.getMainLooper().isCurrentThread()) {
                    this.q.cancel();
                } else {
                    unscheduleSelf(q202);
                    unscheduleSelf(q20);
                    scheduleSelf(q202, 0);
                }
                this.q.setIntValues(new int[]{this.b, i2});
                if (Looper.getMainLooper().isCurrentThread()) {
                    this.q.start();
                } else {
                    unscheduleSelf(q202);
                    unscheduleSelf(q20);
                    scheduleSelf(q20, 0);
                }
            }
        }
        invalidateSelf();
        return true;
    }

    public final void setAlpha(int i2) {
    }

    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        if (!this.d && rect.width() > 0 && rect.width() < u) {
            this.c = rect.width();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public r20(Context context, int i2) {
        this.c = u;
        this.e = 0;
        this.f = 270;
        this.j = 0;
        this.k = true;
        this.p = new RectF();
        this.r = new q20(this, 0);
        this.s = new q20(this, 1);
        this.t = new b(11, (Object) this);
        int i3 = ro4.b().b;
        this.a = i3;
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        Paint paint = new Paint();
        this.m = paint;
        paint.setColor(k0.s);
        paint.setAntiAlias(true);
        int i4 = k0.u;
        if (i2 > 0) {
            this.o = iq.E(i2, i4, context);
        }
        Paint paint2 = new Paint();
        this.n = paint2;
        paint2.setColor(i4);
        paint2.setStrokeWidth((float) i3);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
    }

    public final void setBounds(int i2, int i3, int i4, int i5) {
        super.setBounds(i2, i3, i4, i5);
        if (!this.d && getBounds().width() > 0 && getBounds().width() < u) {
            this.c = getBounds().width();
        }
    }
}
