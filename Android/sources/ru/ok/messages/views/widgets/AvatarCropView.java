package ru.ok.messages.views.widgets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.util.AttributeSet;
import kotlin.KotlinVersion;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.views.ActAvatarCrop;
import ru.ok.tamtam.android.prefs.PmsKey;

public class AvatarCropView extends ZoomableDraweeView {
    public final int E0;
    public final int F0;
    public final int G0;
    public final int H0;
    public final Path I0;
    public final Paint J0;
    public final Paint K0;
    public final Rect L0;
    public int M0;
    public int N0 = 0;
    public td0 O0;

    public AvatarCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        ro4 b = ro4.b();
        int i = b.q;
        this.E0 = i;
        this.F0 = b.M;
        this.G0 = i;
        this.H0 = b.I;
        cud cud = ((qra) ym.e()).y().b;
        cud.getClass();
        setZoomableController(new e44(new ata(new o67()), (int) cud.r(PmsKey.f79minimagesidesize, (long) 64)));
        this.I0 = new Path();
        this.L0 = new Rect();
        Paint paint = new Paint();
        this.J0 = paint;
        paint.setColor(fu4.k.e(getContext()).f().c().d);
        this.J0.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.K0 = paint2;
        paint2.setColor(getResources().getColor(lad.v));
        this.K0.setStyle(Paint.Style.STROKE);
        this.K0.setAntiAlias(true);
        this.K0.setStrokeWidth((float) b.a);
    }

    public final void b(Matrix matrix) {
        super.b(matrix);
        ((ActAvatarCrop) this.O0).D0.setVisibility(0);
    }

    public final void o(k97 k97) {
        super.o(k97);
        this.M0 = k97.getWidth();
        ((e44) getZoomableController()).e();
        if (this.N0 == 0) {
            ((e44) getZoomableController()).d(this.M0);
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipPath(this.I0, Region.Op.DIFFERENCE);
        canvas.drawRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getMeasuredWidth(), (float) getMeasuredHeight(), this.J0);
        canvas.restore();
        if (this.N0 == 1) {
            Canvas canvas2 = canvas;
            canvas2.drawRect((float) ((getMeasuredWidth() / 2) - (this.L0.width() / 2)), (float) ((getMeasuredHeight() / 2) - (this.L0.height() / 2)), (float) ((this.L0.width() / 2) + (getMeasuredWidth() / 2)), (float) ((this.L0.height() / 2) + (getMeasuredHeight() / 2)), this.K0);
            return;
        }
        canvas.drawCircle((float) this.L0.centerX(), (float) this.L0.centerY(), (float) (this.L0.width() / 2), this.K0);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ((e44) getZoomableController()).e();
        if (this.M0 > 0 && this.N0 == 0) {
            ((e44) getZoomableController()).d(this.M0);
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        if (this.N0 == 1) {
            i3 = getMeasuredWidth() - (this.G0 * 2);
            i4 = getMeasuredHeight() - (this.H0 * 2);
        } else {
            i3 = Math.min(getMeasuredWidth() - (this.E0 * 2), getMeasuredHeight() - (this.F0 * 2));
            i4 = i3;
        }
        this.I0.reset();
        if (this.N0 == 1) {
            int i5 = i3 / 2;
            int i6 = i4 / 2;
            this.I0.addRect((float) ((getMeasuredWidth() / 2) - i5), (float) ((getMeasuredHeight() / 2) - i6), (float) ((getMeasuredWidth() / 2) + i5), (float) ((getMeasuredHeight() / 2) + i6), Path.Direction.CCW);
        } else {
            this.I0.addCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) (i3 / 2), Path.Direction.CCW);
        }
        int i7 = i3 / 2;
        int i8 = i4 / 2;
        this.L0.set((getMeasuredWidth() / 2) - i7, (getMeasuredHeight() / 2) - i8, (getMeasuredWidth() / 2) + i7, (getMeasuredHeight() / 2) + i8);
        ((e44) getZoomableController()).v0 = this.L0;
    }

    public void setMode(int i) {
        this.N0 = i;
        if (i == 1) {
            this.K0.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
            ((e44) getZoomableController()).x0 = false;
            return;
        }
        this.K0.setAlpha(50);
        ((e44) getZoomableController()).x0 = true;
    }

    public void setTransformChangeListener(td0 td0) {
        this.O0 = td0;
    }
}
