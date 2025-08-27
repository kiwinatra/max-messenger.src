package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;

/* renamed from: rmf  reason: default package */
public final class rmf extends bh8 implements cff {
    public CharSequence H0;
    public final Context I0;
    public final Paint.FontMetrics J0 = new Paint.FontMetrics();
    public final dff K0;
    public final dr0 L0;
    public final Rect M0;
    public int N0;
    public int O0;
    public int P0;
    public int Q0;
    public boolean R0;
    public int S0;
    public int T0;
    public float U0;
    public float V0;
    public float W0;
    public float X0;

    public rmf(Context context, int i) {
        super(context, (AttributeSet) null, 0, i);
        dff dff = new dff(this);
        this.K0 = dff;
        this.L0 = new dr0(17, this);
        this.M0 = new Rect();
        this.U0 = 1.0f;
        this.V0 = 1.0f;
        this.W0 = 0.5f;
        this.X0 = 1.0f;
        this.I0 = context;
        TextPaint textPaint = dff.a;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        float r = r();
        double sqrt = Math.sqrt(2.0d);
        canvas.scale(this.U0, this.V0, (((float) getBounds().width()) * 0.5f) + ((float) getBounds().left), (((float) getBounds().height()) * this.W0) + ((float) getBounds().top));
        canvas.translate(r, (float) (-((sqrt * ((double) this.S0)) - ((double) this.S0))));
        super.draw(canvas);
        if (this.H0 != null) {
            Rect bounds = getBounds();
            dff dff = this.K0;
            TextPaint textPaint = dff.a;
            Paint.FontMetrics fontMetrics = this.J0;
            textPaint.getFontMetrics(fontMetrics);
            int centerY = (int) (((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            vef vef = dff.g;
            TextPaint textPaint2 = dff.a;
            if (vef != null) {
                textPaint2.drawableState = getState();
                dff.g.e(this.I0, textPaint2, dff.b);
                textPaint2.setAlpha((int) (this.X0 * 255.0f));
            }
            CharSequence charSequence = this.H0;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) centerY, textPaint2);
        }
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return (int) Math.max(this.K0.a.getTextSize(), (float) this.P0);
    }

    public final int getIntrinsicWidth() {
        float f = (float) (this.N0 * 2);
        CharSequence charSequence = this.H0;
        return (int) Math.max(f + (charSequence == null ? c44.DEFAULT_ASPECT_RATIO : this.K0.a(charSequence.toString())), (float) this.O0);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.R0) {
            ypg e = this.a.a.e();
            e.k = s();
            setShapeAppearanceModel(e.c());
        }
    }

    public final float r() {
        int i;
        Rect rect = this.M0;
        if (((rect.right - getBounds().right) - this.T0) - this.Q0 < 0) {
            i = ((rect.right - getBounds().right) - this.T0) - this.Q0;
        } else if (((rect.left - getBounds().left) - this.T0) + this.Q0 <= 0) {
            return c44.DEFAULT_ASPECT_RATIO;
        } else {
            i = ((rect.left - getBounds().left) - this.T0) + this.Q0;
        }
        return (float) i;
    }

    public final fla s() {
        float width = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.S0)))) / 2.0f;
        return new fla(new qf8((float) this.S0), Math.min(Math.max(-r(), -width), width));
    }
}
