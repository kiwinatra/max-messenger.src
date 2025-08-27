package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

public class VideoView extends FrameLayout implements TextureView.SurfaceTextureListener {
    public qcf a;
    public Surface b;
    public SurfaceTexture c;
    public e9g o;
    public int v;
    public int w;
    public int x;
    public int y;

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [qcf, android.view.TextureView] */
    public final void a(e9g e9g) {
        this.o = e9g;
        this.y = e9g.f();
        d();
        if (this.a == null) {
            ? textureView = new TextureView(getContext());
            this.a = textureView;
            textureView.setSurfaceTextureListener(this);
            addView(this.a, 0);
        }
    }

    public final void b() {
        this.o = null;
        this.y = 0;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        qcf qcf = this.a;
        if (qcf != null) {
            qcf.setListener((pcf) null);
            this.a.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
            removeView(this.a);
            this.a = null;
        }
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.b = null;
        }
        SurfaceTexture surfaceTexture = this.c;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.c = null;
        }
    }

    public final void c(int i, int i2, int i3, boolean z) {
        if (!z) {
            this.v = i;
            this.w = i2;
            this.x = i3;
            requestLayout();
        } else if (i > 0 && i2 > 0 && getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && this.y != 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            ft ftVar = new ft(measuredWidth, measuredHeight, 8);
            ft ftVar2 = new ft(i, i2, 8);
            Matrix matrix = new Matrix();
            matrix.postConcat(kr7.v(ftVar2, ftVar, this.y));
            float f = ((float) measuredWidth) / 2.0f;
            float f2 = ((float) measuredHeight) / 2.0f;
            matrix.postRotate((float) i3, f, f2);
            if (i3 == 90 || i3 == 270) {
                float measuredHeight2 = ((float) getMeasuredHeight()) / ((float) getMeasuredWidth());
                matrix.postScale(1.0f / measuredHeight2, measuredHeight2, f, f2);
            }
            qcf qcf = this.a;
            if (qcf != null) {
                qcf.setTransform(matrix);
            }
            this.v = i;
            this.w = i2;
            this.x = i3;
        }
        qcf qcf2 = this.a;
        if (qcf2 != null) {
            qcf2.setVisibility((this.v <= 0 || this.w <= 0) ? 4 : 0);
        }
    }

    public final void d() {
        e9g e9g = this.o;
        int p = e9g == null ? 0 : e9g.p();
        e9g e9g2 = this.o;
        int B = e9g2 == null ? 0 : e9g2.B();
        e9g e9g3 = this.o;
        c(p, B, e9g3 == null ? 0 : e9g3.E(), false);
    }

    public BitmapDrawable getVideoScreenShot() {
        qcf qcf = this.a;
        if (qcf == null || this.x != 0 || !qcf.isAvailable() || !this.a.isShown() || this.v <= 0 || this.w <= 0) {
            return null;
        }
        int width = this.a.getWidth();
        int height = this.a.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        float f = (float) width;
        float f2 = 1.0f;
        float f3 = f > 640.0f ? 640.0f / f : 1.0f;
        float f4 = (float) height;
        if (f4 > 480.0f) {
            f2 = 480.0f / f4;
        }
        int min = (int) Math.min(f3, f2);
        Bitmap bitmap = this.a.getBitmap(width * min, height * min);
        if (bitmap == null) {
            return null;
        }
        return new BitmapDrawable(getResources(), bitmap);
    }

    public final void onMeasure(int i, int i2) {
        if (this.v <= 0 || this.w <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        int[] B = iq.B(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2), this.v, this.w);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(B[0], 1073741824), View.MeasureSpec.makeMeasureSpec(B[1], 1073741824));
        c(this.v, this.w, this.x, true);
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
            this.b = null;
        }
        SurfaceTexture surfaceTexture2 = this.c;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.c = null;
        }
        this.c = surfaceTexture;
        this.b = new Surface(surfaceTexture);
        d();
        e9g e9g = this.o;
        if (e9g != null) {
            e9g.j(this.b);
            this.a.setListener(new jrf(this, surfaceTexture));
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
}
