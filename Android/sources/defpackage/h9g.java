package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RecordingCanvas;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: h9g  reason: default package */
public final class h9g extends FrameLayout implements TextureView.SurfaceTextureListener {
    public static final /* synthetic */ KProperty[] x0 = {rae.s(h9g.class, "corners", "getCorners()[F", 0)};
    public final String a = h9g.class.getName();
    public g9g b;
    public Surface c;
    public SurfaceTexture o;
    public f9g v;
    public final bl v0;
    public int w;
    public final Path w0;
    public int x;
    public int y;
    public final int[] z = new int[2];

    public h9g(Context context) {
        super(context);
        Delegates delegates = Delegates.INSTANCE;
        this.v0 = new bl(29, this);
        this.w0 = new Path();
    }

    public final void a(f9g f9g) {
        int i;
        String str = this.a;
        a67 a67 = z68.b;
        boolean z2 = false;
        if (a67 != null && a67.c()) {
            a67.d(w78.o, str, i2a.i("Video view. Bind listener and create surface, has listener:", f9g != null), (Throwable) null);
        }
        this.v = f9g;
        if (f9g != null) {
            f9g.f();
            i = 2;
        } else {
            i = 0;
        }
        this.y = i;
        d();
        if (this.b != null) {
            String str2 = this.a;
            a67 a672 = z68.b;
            if (a672 != null && a672.c()) {
                w78 w78 = w78.o;
                if (this.c != null) {
                    z2 = true;
                }
                a672.d(w78, str2, i2a.i("Video view. Already has texture, has surface:", z2), (Throwable) null);
            }
            Surface surface = this.c;
            if (surface != null && f9g != null) {
                f9g.j(surface);
                return;
            }
            return;
        }
        g9g g9g = new g9g(this, getContext());
        g9g.setSurfaceTextureListener(this);
        addView(g9g, 0);
        this.b = g9g;
    }

    public final void b() {
        this.v = null;
        this.y = 0;
        this.w = 0;
        this.x = 0;
        g9g g9g = this.b;
        if (g9g != null) {
            g9g.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            removeView(g9g);
            this.b = null;
        }
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        this.c = null;
        SurfaceTexture surfaceTexture = this.o;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.o = null;
    }

    public final void c(int i, int i2, boolean z2) {
        int i3 = 0;
        if (z2) {
            int i4 = this.y;
            boolean z3 = true;
            boolean z4 = i > 0 && i2 > 0;
            if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
                z3 = false;
            }
            if (z4 && z3 && i4 != 0) {
                ft ftVar = new ft(getMeasuredWidth(), getMeasuredHeight(), 8);
                ft ftVar2 = new ft(i, i2, 8);
                Matrix matrix = new Matrix();
                matrix.postConcat(kr7.v(ftVar2, ftVar, i4));
                g9g g9g = this.b;
                if (g9g != null) {
                    g9g.setTransform(matrix);
                }
                this.w = i;
                this.x = i2;
            }
        } else {
            this.w = i;
            this.x = i2;
            requestLayout();
        }
        g9g g9g2 = this.b;
        if (g9g2 != null) {
            if (this.w <= 0 || this.x <= 0) {
                i3 = 4;
            }
            g9g2.setVisibility(i3);
        }
    }

    public final void d() {
        f9g f9g = this.v;
        int p = f9g != null ? f9g.p() : 0;
        f9g f9g2 = this.v;
        c(p, f9g2 != null ? f9g2.B() : 0, false);
    }

    public final void dispatchDraw(Canvas canvas) {
        Path path = this.w0;
        if (!path.isEmpty()) {
            int save = canvas.save();
            canvas.clipPath(path);
            try {
                super.dispatchDraw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            super.dispatchDraw(canvas);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        return ((canvas instanceof RecordingCanvas) || Intrinsics.areEqual((Object) canvas.getClass(), (Object) Canvas.class)) && super.drawChild(canvas, view, j);
    }

    public final float[] getCorners() {
        return (float[]) this.v0.getValue(this, x0[0]);
    }

    public final void onMeasure(int i, int i2) {
        if (this.w <= 0 || this.x <= 0) {
            super.onMeasure(i, i2);
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int i3 = this.w;
            int i4 = this.x;
            int[] iArr = this.z;
            ryg.p(size, size2, i3, i4, iArr);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iArr[0], 1073741824), View.MeasureSpec.makeMeasureSpec(iArr[1], 1073741824));
            c(this.w, this.x, true);
        }
        float[] corners = getCorners();
        if (corners != null && getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            Path path = this.w0;
            path.reset();
            path.addRoundRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getMeasuredWidth(), (float) getMeasuredHeight(), corners, Path.Direction.CW);
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        String str = this.a;
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            w78 w78 = w78.o;
            boolean z2 = this.v != null;
            a67.d(w78, str, "Video view. Surface available " + surfaceTexture + ", has listener:" + z2, (Throwable) null);
        }
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        this.c = null;
        SurfaceTexture surfaceTexture2 = this.o;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
        }
        this.o = surfaceTexture;
        this.c = new Surface(surfaceTexture);
        d();
        f9g f9g = this.v;
        if (f9g != null) {
            f9g.j(this.c);
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        d();
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void setCorners(float[] fArr) {
        this.v0.setValue(this, x0[0], fArr);
    }
}
