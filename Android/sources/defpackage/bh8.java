package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;

/* renamed from: bh8  reason: default package */
public class bh8 extends Drawable implements u4e {
    public static final Paint G0;
    public final j09 A0;
    public PorterDuffColorFilter B0;
    public PorterDuffColorFilter C0;
    public int D0;
    public final RectF E0;
    public final boolean F0;
    public final RectF X;
    public final Region Y;
    public final Region Z;
    public ah8 a;
    public final r4e[] b;
    public final r4e[] c;
    public final BitSet o;
    public boolean v;
    public j4e v0;
    public final Matrix w;
    public final Paint w0;
    public final Path x;
    public final Paint x0;
    public final Path y;
    public final h4e y0;
    public final RectF z;
    public final b8d z0;

    static {
        Paint paint = new Paint(1);
        G0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public bh8() {
        this(new j4e());
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        ah8 ah8 = this.a;
        this.A0.d(ah8.a, ah8.j, rectF, this.z0, path);
        if (this.a.i != 1.0f) {
            Matrix matrix = this.w;
            matrix.reset();
            float f = this.a.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.E0, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z2) {
        if (colorStateList == null || mode == null) {
            if (z2) {
                int color = paint.getColor();
                int d = d(color);
                this.D0 = d;
                if (d != color) {
                    return new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
                }
            }
            return null;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = d(colorForState);
        }
        this.D0 = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final int d(int i) {
        ah8 ah8 = this.a;
        float f = ah8.n + ah8.o + ah8.m;
        x05 x05 = ah8.b;
        return x05 != null ? x05.a(f, i) : i;
    }

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        Paint paint = this.w0;
        paint.setColorFilter(this.B0);
        int alpha = paint.getAlpha();
        int i = this.a.l;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.x0;
        paint2.setColorFilter(this.C0);
        paint2.setStrokeWidth(this.a.k);
        int alpha2 = paint2.getAlpha();
        int i2 = this.a.l;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.v;
        Path path = this.x;
        if (z2) {
            boolean i3 = i();
            float f = c44.DEFAULT_ASPECT_RATIO;
            float f2 = -(i3 ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            j4e j4e = this.a.a;
            ypg e = j4e.e();
            m04 m04 = j4e.e;
            if (!(m04 instanceof s0d)) {
                m04 = new ab(f2, m04);
            }
            e.e = m04;
            m04 m042 = j4e.f;
            if (!(m042 instanceof s0d)) {
                m042 = new ab(f2, m042);
            }
            e.f = m042;
            m04 m043 = j4e.h;
            if (!(m043 instanceof s0d)) {
                m043 = new ab(f2, m043);
            }
            e.h = m043;
            m04 m044 = j4e.g;
            if (!(m044 instanceof s0d)) {
                m044 = new ab(f2, m044);
            }
            e.g = m044;
            j4e c2 = e.c();
            this.v0 = c2;
            float f3 = this.a.j;
            RectF rectF = this.X;
            rectF.set(h());
            if (i()) {
                f = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f, f);
            this.A0.d(c2, f3, rectF, (b8d) null, this.y);
            b(h(), path);
            this.v = false;
        }
        ah8 ah8 = this.a;
        int i4 = ah8.p;
        if (i4 != 1 && ah8.q > 0) {
            if (i4 == 2) {
                canvas.save();
                ah8 ah82 = this.a;
                double sin = Math.sin(Math.toRadians((double) ah82.s));
                ah8 ah83 = this.a;
                canvas2.translate((float) ((int) (sin * ((double) ah82.r))), (float) ((int) (Math.cos(Math.toRadians((double) ah83.s)) * ((double) ah83.r))));
                if (!this.F0) {
                    e(canvas);
                    canvas.restore();
                } else {
                    RectF rectF2 = this.E0;
                    int width = (int) (rectF2.width() - ((float) getBounds().width()));
                    int height = (int) (rectF2.height() - ((float) getBounds().height()));
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.a.q * 2) + ((int) rectF2.width()) + width, (this.a.q * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(createBitmap);
                    float f4 = (float) ((getBounds().left - this.a.q) - width);
                    float f5 = (float) ((getBounds().top - this.a.q) - height);
                    canvas3.translate(-f4, -f5);
                    e(canvas3);
                    canvas2.drawBitmap(createBitmap, f4, f5, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                }
            } else if (!ah8.a.d(h())) {
                path.isConvex();
            }
        }
        ah8 ah84 = this.a;
        Paint.Style style = ah84.u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            f(canvas, paint, path, ah84.a, h());
        }
        if (i()) {
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        this.o.cardinality();
        int i = this.a.r;
        Path path = this.x;
        h4e h4e = this.y0;
        if (i != 0) {
            canvas.drawPath(path, h4e.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            r4e r4e = this.b[i2];
            int i3 = this.a.q;
            Matrix matrix = r4e.b;
            r4e.a(matrix, h4e, i3, canvas);
            this.c[i2].a(matrix, h4e, this.a.q, canvas);
        }
        if (this.F0) {
            ah8 ah8 = this.a;
            int sin = (int) (Math.sin(Math.toRadians((double) ah8.s)) * ((double) ah8.r));
            ah8 ah82 = this.a;
            int cos = (int) (Math.cos(Math.toRadians((double) ah82.s)) * ((double) ah82.r));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(path, G0);
            canvas.translate((float) sin, (float) cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, j4e j4e, RectF rectF) {
        if (j4e.d(rectF)) {
            float a2 = j4e.f.a(rectF) * this.a.j;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void g(Canvas canvas) {
        Paint paint = this.x0;
        Path path = this.y;
        j4e j4e = this.v0;
        RectF rectF = this.X;
        rectF.set(h());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : c44.DEFAULT_ASPECT_RATIO;
        rectF.inset(strokeWidth, strokeWidth);
        f(canvas, paint, path, j4e, rectF);
    }

    public int getAlpha() {
        return this.a.l;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        ah8 ah8 = this.a;
        if (ah8.p != 2) {
            if (ah8.a.d(h())) {
                outline.setRoundRect(getBounds(), this.a.a.e.a(h()) * this.a.j);
                return;
            }
            RectF h = h();
            Path path = this.x;
            b(h, path);
            if (Build.VERSION.SDK_INT >= 30) {
                xu4.a(outline, path);
                return;
            }
            try {
                wu4.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.Y;
        region.set(bounds);
        RectF h = h();
        Path path = this.x;
        b(h, path);
        Region region2 = this.Z;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.z;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean i() {
        Paint.Style style = this.a.u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.x0.getStrokeWidth() > c44.DEFAULT_ASPECT_RATIO;
    }

    public final void invalidateSelf() {
        this.v = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.a.d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r1.a.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.a.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.a.e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            ah8 r0 = r1.a
            android.content.res.ColorStateList r0 = r0.f
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            ah8 r0 = r1.a
            android.content.res.ColorStateList r0 = r0.e
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            ah8 r0 = r1.a
            android.content.res.ColorStateList r0 = r0.d
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            ah8 r1 = r1.a
            android.content.res.ColorStateList r1 = r1.c
            if (r1 == 0) goto L_0x0037
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r1 = 0
            goto L_0x003a
        L_0x0039:
            r1 = 1
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh8.isStateful():boolean");
    }

    public final void j(Context context) {
        this.a.b = new x05(context);
        q();
    }

    public final void k(float f) {
        ah8 ah8 = this.a;
        if (ah8.n != f) {
            ah8.n = f;
            q();
        }
    }

    public final void l(ColorStateList colorStateList) {
        ah8 ah8 = this.a;
        if (ah8.c != colorStateList) {
            ah8.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void m() {
        ah8 ah8 = this.a;
        if (ah8.p != 2) {
            ah8.p = 2;
            super.invalidateSelf();
        }
    }

    public Drawable mutate() {
        this.a = new ah8(this.a);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        ah8 ah8 = this.a;
        if (ah8.d != colorStateList) {
            ah8.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean o(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.c == null || (color2 = paint2.getColor()) == (colorForState2 = this.a.c.getColorForState(iArr, color2))) {
            z2 = false;
        } else {
            (paint2 = this.w0).setColor(colorForState2);
            z2 = true;
        }
        if (this.a.d == null || (color = paint.getColor()) == (colorForState = this.a.d.getColorForState(iArr, color))) {
            return z2;
        }
        (paint = this.x0).setColor(colorForState);
        return true;
    }

    public void onBoundsChange(Rect rect) {
        this.v = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z2 = o(iArr) || p();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public final boolean p() {
        PorterDuffColorFilter porterDuffColorFilter = this.B0;
        PorterDuffColorFilter porterDuffColorFilter2 = this.C0;
        ah8 ah8 = this.a;
        this.B0 = c(ah8.f, ah8.g, this.w0, true);
        ah8 ah82 = this.a;
        this.C0 = c(ah82.e, ah82.g, this.x0, false);
        ah8 ah83 = this.a;
        if (ah83.t) {
            this.y0.a(ah83.f.getColorForState(getState(), 0));
        }
        return !Objects.equals(porterDuffColorFilter, this.B0) || !Objects.equals(porterDuffColorFilter2, this.C0);
    }

    public final void q() {
        ah8 ah8 = this.a;
        float f = ah8.n + ah8.o;
        ah8.q = (int) Math.ceil((double) (0.75f * f));
        this.a.r = (int) Math.ceil((double) (f * 0.25f));
        p();
        super.invalidateSelf();
    }

    public void setAlpha(int i) {
        ah8 ah8 = this.a;
        if (ah8.l != i) {
            ah8.l = i;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(j4e j4e) {
        this.a.a = j4e;
        invalidateSelf();
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.a.f = colorStateList;
        p();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        ah8 ah8 = this.a;
        if (ah8.g != mode) {
            ah8.g = mode;
            p();
            super.invalidateSelf();
        }
    }

    public bh8(Context context, AttributeSet attributeSet, int i, int i2) {
        this(j4e.b(context, attributeSet, i, i2).c());
    }

    public bh8(j4e j4e) {
        this(new ah8(j4e));
    }

    public bh8(ah8 ah8) {
        j09 j09;
        this.b = new r4e[4];
        this.c = new r4e[4];
        this.o = new BitSet(8);
        this.w = new Matrix();
        this.x = new Path();
        this.y = new Path();
        this.z = new RectF();
        this.X = new RectF();
        this.Y = new Region();
        this.Z = new Region();
        Paint paint = new Paint(1);
        this.w0 = paint;
        Paint paint2 = new Paint(1);
        this.x0 = paint2;
        this.y0 = new h4e();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            j09 = k4e.a;
        } else {
            j09 = new j09();
        }
        this.A0 = j09;
        this.E0 = new RectF();
        this.F0 = true;
        this.a = ah8;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        p();
        o(getState());
        this.z0 = new b8d((Object) this);
    }
}
