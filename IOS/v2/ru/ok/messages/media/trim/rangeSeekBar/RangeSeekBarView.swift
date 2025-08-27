package ru.ok.messages.media.trim.rangeSeekBar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.LongSparseArray;
import android.view.View;
import java.util.Set;
import kotlin.Lazy;
import ru.ok.messages.media.trim.FrgTrimVideo;

public class RangeSeekBarView extends View implements kac {
    public static int O0 = 0;
    public static float P0 = 1.0f;
    public static float Q0 = 1.0f;
    public float A0;
    public float B0;
    public long C0;
    public boolean D0;
    public final LongSparseArray E0 = new LongSparseArray();
    public Rect F0;
    public FrgTrimVideo G0;
    public or7 H0;
    public final Paint I0;
    public int J0;
    public float K0;
    public long L0;
    public final ro4 M0;
    public final boolean N0;
    public final int a;
    public final int b;
    public final int c;
    public sma o;
    public final int v;
    public iq0 v0;
    public final Paint w;
    public boolean w0;
    public int x;
    public float x0;
    public gqb y;
    public float y0;
    public iq0 z;
    public float z0;

    public RangeSeekBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        getContext();
        ro4 b2 = ro4.b();
        this.M0 = b2;
        int i = b2.h;
        this.a = i;
        int i2 = b2.e;
        this.b = i2;
        this.c = i + i2;
        Paint paint = new Paint();
        this.w = paint;
        Context context2 = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context2);
        paint.setColor(j4b.l0(0.8f, k0.n));
        Paint paint2 = new Paint();
        this.I0 = paint2;
        paint2.setColor(k0.n);
        paint2.setStrokeWidth(1.0f);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        this.v = b2.G;
        setLayerType(1, (Paint) null);
        this.N0 = ct.y(getContext());
    }

    public final void a() {
        int i = this.x;
        if (i == 0) {
            if (this.z.b() > this.v0.b()) {
                this.z.e(this.v0.b());
            } else if (this.z.b() < c44.DEFAULT_ASPECT_RATIO) {
                this.z.e(c44.DEFAULT_ASPECT_RATIO);
            }
            if (this.v0.b() - this.z.b() > this.y0) {
                this.z.e(this.v0.b() - this.y0);
            } else if (this.v0.b() - this.z.b() < this.x0) {
                this.z.e(this.v0.b() - this.x0);
            }
        } else if (i == 1) {
            if (this.v0.b() < this.z.b()) {
                this.v0.e(this.z.b());
            } else {
                float b2 = this.v0.b();
                float f = P0;
                if (b2 > f) {
                    this.v0.e(f);
                }
            }
            if (this.v0.b() - this.z.b() > this.y0) {
                this.v0.e(this.z.b() + this.y0);
            } else if (this.v0.b() - this.z.b() < this.x0) {
                this.v0.e(this.z.b() + this.x0);
            }
        }
        if (this.y.a() < this.z.b()) {
            this.y.c(this.z.b());
            this.w0 = true;
        } else if (this.y.a() > this.v0.b()) {
            this.y.c(this.v0.b());
            this.w0 = true;
        }
        getContext();
        float f2 = this.v0.j.left - ((float) (this.M0.k * 2));
        iq0 iq0 = this.z;
        RectF rectF = iq0.j;
        float f3 = rectF.right;
        if (((float) ro4.a(48.0f)) > f2 - f3) {
            iq0.d();
            this.v0.d();
            return;
        }
        RectF rectF2 = iq0.k;
        float f4 = rectF.left;
        float f5 = (float) iq0.d;
        rectF2.set(f4 - f5, rectF.top, f3 + f5, rectF.bottom);
        iq0 iq02 = this.v0;
        RectF rectF3 = iq02.k;
        RectF rectF4 = iq02.j;
        float f6 = rectF4.left;
        float f7 = (float) iq02.d;
        rectF3.set(f6 - f7, rectF4.top, rectF4.right + f7, rectF4.bottom);
    }

    public final float b(float f) {
        return (((f - c44.DEFAULT_ASPECT_RATIO) / Q0) * ((float) O0)) + ((float) this.M0.k) + ((float) this.a);
    }

    public final float c(float f) {
        return ((((f - ((float) this.M0.k)) - ((float) this.a)) * Q0) / ((float) O0)) + c44.DEFAULT_ASPECT_RATIO;
    }

    public final int d(long j) {
        long j2 = this.C0;
        return ((int) (((((float) j) - (c44.DEFAULT_ASPECT_RATIO * ((float) j2))) / (Q0 * ((float) j2))) * ((float) O0))) + this.M0.k + this.a;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jbd.c(this.H0);
    }

    public final void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.D0) {
            boolean z2 = this.N0;
            if (z2) {
                canvas.save();
                canvas2.scale(-1.0f, 1.0f, (float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2));
            }
            canvas.save();
            canvas2.translate(c44.DEFAULT_ASPECT_RATIO, (float) this.b);
            if (this.L0 != 0) {
                canvas.save();
                canvas2.clipRect(this.F0);
                long j = this.L0;
                long j2 = (((long) (((float) this.C0) * c44.DEFAULT_ASPECT_RATIO)) / j) * j;
                long j3 = (j * ((long) (((int) this.K0) + 2))) + j2;
                int d = d(j2);
                int d2 = d(j3);
                int i = d;
                while (i < d2) {
                    float f = (float) i;
                    float f2 = f;
                    int i2 = i;
                    canvas.drawLine(f, (float) 0, f2, (float) this.J0, this.I0);
                    i = i2 + this.J0;
                    j3 = j3;
                }
                long j4 = j3;
                LongSparseArray longSparseArray = this.E0;
                if (longSparseArray.size() != 0) {
                    if (z2) {
                        canvas.save();
                        canvas2.scale(-1.0f, 1.0f, (float) (canvas.getWidth() / 2), (float) (canvas.getHeight() / 2));
                    }
                    for (int i3 = 0; i3 < longSparseArray.size(); i3++) {
                        long keyAt = longSparseArray.keyAt(i3);
                        int d3 = d(keyAt);
                        if (z2) {
                            d3 = getWidth() - d3;
                        }
                        if (keyAt > j2 || keyAt < j4) {
                            canvas2.drawBitmap((Bitmap) longSparseArray.valueAt(i3), (float) d3, (float) 0, (Paint) null);
                        }
                    }
                    if (z2) {
                        canvas.restore();
                    }
                }
                canvas.restore();
            }
            float b2 = this.z.b();
            ro4 ro4 = this.M0;
            int i4 = (b2 > c((float) (ro4.k / 2)) ? 1 : (b2 == c((float) (ro4.k / 2)) ? 0 : -1));
            Paint paint = this.w;
            if (i4 > 0) {
                canvas.drawRect(b(c44.DEFAULT_ASPECT_RATIO), (float) 0, b(this.z.b()) - ((float) (ro4.k / 2)), (float) ro4.G, paint);
            }
            if (this.v0.b() < P0 - (c((float) (ro4.k / 2)) - c44.DEFAULT_ASPECT_RATIO)) {
                Canvas canvas3 = canvas;
                canvas3.drawRect(((float) (ro4.k / 2)) + b(this.v0.b()), (float) 0, b(P0), (float) ro4.G, paint);
            }
            this.z.a(canvas2);
            this.v0.a(canvas2);
            canvas.restore();
            gqb gqb = this.y;
            RectF rectF = gqb.i;
            canvas2.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.width() / 2.0f, gqb.c);
            RectF rectF2 = gqb.j;
            Paint paint2 = gqb.e;
            canvas2.drawRect(rectF2, paint2);
            canvas2.drawRect(gqb.k, paint2);
            canvas2.drawCircle(gqb.g.centerX(), (float) gqb.f, (float) gqb.b, gqb.d);
            if (z2) {
                canvas.restore();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        ro4 ro4 = this.M0;
        setMeasuredDimension(View.MeasureSpec.getSize(i), ro4.G + this.c + ro4.h + ro4.j);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int width = getWidth();
        ro4 ro4 = this.M0;
        int i5 = width - (ro4.k * 2);
        int i6 = this.a;
        O0 = i5 - (i6 * 2);
        this.y = new gqb(this.b + ro4.G + this.c + ro4.h, getContext(), this);
        int i7 = 0;
        this.z = new iq0(0, getContext(), this);
        this.v0 = new iq0(1, getContext(), this);
        this.z.e(this.z0);
        this.v0.e(this.A0);
        this.y.c(this.B0);
        this.x = 1;
        a();
        this.x = 3;
        int i8 = ro4.k + i6;
        int i9 = this.v;
        this.F0 = new Rect(i8, 0, O0 + i8, i9);
        this.J0 = i9;
        float width2 = ((float) (getWidth() - (ro4.k * 2))) / ((float) this.J0);
        this.K0 = width2;
        this.L0 = (long) ((int) ((Q0 * ((float) this.C0)) / width2));
        jbd.c(this.H0);
        LongSparseArray longSparseArray = this.E0;
        longSparseArray.clear();
        long j = this.L0;
        if (j != 0) {
            long j2 = (((long) (c44.DEFAULT_ASPECT_RATIO * ((float) this.C0))) / j) * j;
            long j3 = (j * ((long) (((int) this.K0) + 2))) + j2;
            while (i7 < longSparseArray.size()) {
                long keyAt = longSparseArray.keyAt(i7);
                long j4 = this.L0 * 30;
                if (keyAt < j2 - j4 || keyAt > j4 + j3) {
                    longSparseArray.removeAt(i7);
                    i7--;
                }
                i7++;
            }
            lja s = new gb3(3, new dr1((Object) this, j2, 7)).x(xfd.a()).s(qe.a());
            or7 or7 = new or7(new y3a(20, (Object) this), new qbb(5), m58.e);
            s.a(or7);
            this.H0 = or7;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r2 != 3) goto L_0x0287;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            iq0 r0 = r10.z
            r1 = 0
            if (r0 == 0) goto L_0x029a
            iq0 r0 = r10.v0
            if (r0 == 0) goto L_0x029a
            gqb r0 = r10.y
            if (r0 != 0) goto L_0x000f
            goto L_0x029a
        L_0x000f:
            boolean r0 = r10.N0
            if (r0 == 0) goto L_0x0024
            int r2 = r10.getWidth()
            float r2 = (float) r2
            float r3 = r11.getX()
            float r2 = r2 - r3
            float r3 = r11.getY()
            r11.setLocation(r2, r3)
        L_0x0024:
            int r2 = r11.getAction()
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x022a
            java.lang.String r6 = "ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView"
            java.lang.String r7 = "Unknown moving type: %s"
            if (r2 == r5) goto L_0x0140
            if (r2 == r4) goto L_0x0039
            if (r2 == r3) goto L_0x0140
            goto L_0x0287
        L_0x0039:
            int r2 = r10.x
            if (r2 == 0) goto L_0x005b
            if (r2 == r5) goto L_0x0055
            if (r2 == r4) goto L_0x004f
            if (r2 == r3) goto L_0x013d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            defpackage.z68.g(r6, r7, r2)
            goto L_0x0060
        L_0x004f:
            gqb r2 = r10.y
            r2.b(r11)
            goto L_0x0060
        L_0x0055:
            iq0 r2 = r10.v0
            r2.c(r11)
            goto L_0x0060
        L_0x005b:
            iq0 r2 = r10.z
            r2.c(r11)
        L_0x0060:
            r10.a()
            sma r2 = r10.o
            if (r2 != 0) goto L_0x006c
            r10.invalidate()
            goto L_0x013d
        L_0x006c:
            int r8 = r10.x
            if (r8 == 0) goto L_0x00d6
            if (r8 == r5) goto L_0x00bf
            if (r8 == r4) goto L_0x0082
            if (r8 == r3) goto L_0x00ec
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            defpackage.z68.g(r6, r7, r2)
            goto L_0x00ec
        L_0x0082:
            gqb r3 = r10.y
            float r3 = r3.a()
            long r6 = r10.C0
            float r4 = (float) r6
            float r3 = r3 * r4
            long r3 = (long) r3
            m4a r2 = (defpackage.m4a) r2
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0097:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00ec
            java.lang.Object r6 = r2.next()
            c2a r6 = (defpackage.c2a) r6
            r6.z = r3
            ju8 r7 = r6.v
            m48 r7 = (defpackage.m48) r7
            boolean r7 = r7.k()
            if (r7 == 0) goto L_0x00b2
            r6.W()
        L_0x00b2:
            r6.X()
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            dac r6 = r6.X
            r6.d(r7)
            goto L_0x0097
        L_0x00bf:
            iq0 r3 = r10.v0
            float r3 = r3.b()
            long r6 = r10.C0
            float r4 = (float) r6
            float r3 = r3 * r4
            long r3 = (long) r3
            m4a r2 = (defpackage.m4a) r2
            k4a r6 = new k4a
            r7 = 1
            r6.<init>(r3, r7)
            r2.N(r6)
            goto L_0x00ec
        L_0x00d6:
            iq0 r3 = r10.z
            float r3 = r3.b()
            long r6 = r10.C0
            float r4 = (float) r6
            float r3 = r3 * r4
            long r3 = (long) r3
            m4a r2 = (defpackage.m4a) r2
            k4a r6 = new k4a
            r7 = 0
            r6.<init>(r3, r7)
            r2.N(r6)
        L_0x00ec:
            boolean r2 = r10.w0
            if (r2 == 0) goto L_0x013a
            int r2 = r10.x
            if (r2 == 0) goto L_0x00f6
            if (r2 != r5) goto L_0x013a
        L_0x00f6:
            sma r2 = r10.o
            gqb r3 = r10.y
            float r3 = r3.a()
            long r6 = r10.C0
            float r4 = (float) r6
            float r3 = r3 * r4
            long r3 = (long) r3
            m4a r2 = (defpackage.m4a) r2
            r2.getClass()
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0110:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0138
            java.lang.Object r6 = r2.next()
            c2a r6 = (defpackage.c2a) r6
            r6.z = r3
            ju8 r7 = r6.v
            m48 r7 = (defpackage.m48) r7
            boolean r7 = r7.k()
            if (r7 == 0) goto L_0x012b
            r6.W()
        L_0x012b:
            r6.X()
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            dac r6 = r6.X
            r6.d(r7)
            goto L_0x0110
        L_0x0138:
            r10.w0 = r1
        L_0x013a:
            r10.invalidate()
        L_0x013d:
            r1 = r5
            goto L_0x0287
        L_0x0140:
            sma r2 = r10.o
            if (r2 == 0) goto L_0x0224
            int r8 = r10.x
            if (r8 == 0) goto L_0x01bc
            if (r8 == r5) goto L_0x0189
            if (r8 == r4) goto L_0x015b
            if (r8 == r3) goto L_0x01e7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            defpackage.z68.g(r6, r7, r2)
            goto L_0x01e7
        L_0x015b:
            gqb r4 = r10.y
            float r4 = r4.a()
            long r6 = r10.C0
            float r6 = (float) r6
            float r4 = r4 * r6
            long r6 = (long) r4
            m4a r2 = (defpackage.m4a) r2
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0170:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01e7
            java.lang.Object r4 = r2.next()
            c2a r4 = (defpackage.c2a) r4
            r4.z = r6
            r4.Z()
            ju8 r4 = r4.v
            m48 r4 = (defpackage.m48) r4
            r4.r(r6)
            goto L_0x0170
        L_0x0189:
            iq0 r4 = r10.v0
            float r4 = r4.b()
            long r6 = r10.C0
            float r6 = (float) r6
            float r4 = r4 * r6
            long r6 = (long) r4
            m4a r2 = (defpackage.m4a) r2
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x019e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01e7
            java.lang.Object r4 = r2.next()
            c2a r4 = (defpackage.c2a) r4
            r4.y = r6
            r4.a0()
            r4.Z()
            long r8 = r4.z
            ju8 r4 = r4.v
            m48 r4 = (defpackage.m48) r4
            r4.r(r8)
            goto L_0x019e
        L_0x01bc:
            iq0 r4 = r10.z
            r4.b()
            m4a r2 = (defpackage.m4a) r2
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x01cb:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01e7
            java.lang.Object r4 = r2.next()
            c2a r4 = (defpackage.c2a) r4
            r4.a0()
            r4.Z()
            long r6 = r4.z
            ju8 r4 = r4.v
            m48 r4 = (defpackage.m48) r4
            r4.r(r6)
            goto L_0x01cb
        L_0x01e7:
            boolean r2 = r10.w0
            if (r2 == 0) goto L_0x0224
            int r2 = r10.x
            if (r2 == 0) goto L_0x01f1
            if (r2 != r5) goto L_0x0224
        L_0x01f1:
            sma r2 = r10.o
            gqb r4 = r10.y
            float r4 = r4.a()
            long r6 = r10.C0
            float r6 = (float) r6
            float r4 = r4 * r6
            long r6 = (long) r4
            m4a r2 = (defpackage.m4a) r2
            r2.getClass()
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x020b:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0224
            java.lang.Object r4 = r2.next()
            c2a r4 = (defpackage.c2a) r4
            r4.z = r6
            r4.Z()
            ju8 r4 = r4.v
            m48 r4 = (defpackage.m48) r4
            r4.r(r6)
            goto L_0x020b
        L_0x0224:
            r10.x = r3
            r10.w0 = r1
            goto L_0x013d
        L_0x022a:
            iq0 r2 = r10.z
            float r6 = r11.getX()
            float r7 = r11.getY()
            android.graphics.RectF r2 = r2.k
            boolean r2 = r2.contains(r6, r7)
            if (r2 == 0) goto L_0x0244
            r10.x = r1
            iq0 r1 = r10.z
            r1.c(r11)
            goto L_0x027a
        L_0x0244:
            iq0 r1 = r10.v0
            float r2 = r11.getX()
            float r6 = r11.getY()
            android.graphics.RectF r1 = r1.k
            boolean r1 = r1.contains(r2, r6)
            if (r1 == 0) goto L_0x025e
            r10.x = r5
            iq0 r1 = r10.v0
            r1.c(r11)
            goto L_0x027a
        L_0x025e:
            gqb r1 = r10.y
            float r2 = r11.getX()
            float r6 = r11.getY()
            android.graphics.RectF r1 = r1.g
            boolean r1 = r1.contains(r2, r6)
            if (r1 == 0) goto L_0x0278
            r10.x = r4
            gqb r1 = r10.y
            r1.b(r11)
            goto L_0x027a
        L_0x0278:
            r10.x = r3
        L_0x027a:
            int r1 = r10.x
            if (r1 == r3) goto L_0x013d
            android.view.ViewParent r1 = r10.getParent()
            r1.requestDisallowInterceptTouchEvent(r5)
            goto L_0x013d
        L_0x0287:
            if (r0 == 0) goto L_0x029a
            int r10 = r10.getWidth()
            float r10 = (float) r10
            float r0 = r11.getX()
            float r10 = r10 - r0
            float r0 = r11.getY()
            r11.setLocation(r10, r0)
        L_0x029a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.trim.rangeSeekBar.RangeSeekBarView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEndPosition(long j) {
        this.v0.e(((float) j) / ((float) this.C0));
        a();
        invalidate();
    }

    public void setOnChangeRangeSeekBarListener(sma sma) {
        iq0 iq0;
        this.o = sma;
        if (sma != null && (iq0 = this.z) != null && this.v0 != null && this.y != null) {
            iq0.b();
            Set<c2a> set = (Set) ((m4a) sma).a;
            for (c2a c2a : set) {
                c2a.a0();
                c2a.Z();
                ((m48) c2a.v).r(c2a.z);
            }
            long b2 = (long) (this.v0.b() * ((float) this.C0));
            for (c2a c2a2 : set) {
                c2a2.y = b2;
                c2a2.a0();
                c2a2.Z();
                ((m48) c2a2.v).r(c2a2.z);
            }
            long a2 = (long) (this.y.a() * ((float) this.C0));
            for (c2a c2a3 : set) {
                c2a3.z = a2;
                c2a3.Z();
                ((m48) c2a3.v).r(a2);
            }
        }
    }

    public void setPointerPosition(long j) {
        this.y.c(((float) j) / ((float) this.C0));
        a();
        invalidate();
    }

    public void setStartPosition(long j) {
        this.z.e(((float) j) / ((float) this.C0));
        a();
        invalidate();
    }
}
