package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: pt1  reason: default package */
public final class pt1 extends View {
    public static final float A0 = (vo4.c().getDisplayMetrics().density * 14.0f);
    public static final float v0;
    public static final float w0;
    public static final float x0 = (vo4.c().getDisplayMetrics().density * 4.0f);
    public static final float y0 = (vo4.c().getDisplayMetrics().density * 8.0f);
    public static final /* synthetic */ KProperty[] z = {rae.s(pt1.class, "type", "getType()Lone/me/sdk/gallery/view/quickcamera/CameraCentralButton$Type;", 0)};
    public static final float z0 = (vo4.c().getDisplayMetrics().density * 4.0f);
    public final bl a = new bl(this);
    public final ArgbEvaluator b = new ArgbEvaluator();
    public final FloatEvaluator c = new FloatEvaluator();
    public ValueAnimator o;
    public final Paint v;
    public final Paint w;
    public float x;
    public float y;

    static {
        float f = vo4.c().getDisplayMetrics().density * 4.0f;
        v0 = f;
        w0 = f / ((float) 2);
    }

    public pt1(Context context) {
        super(context, (AttributeSet) null);
        Delegates delegates = Delegates.INSTANCE;
        ot1 ot1 = ot1.a;
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(v0);
        this.v = paint;
        Paint paint2 = new Paint();
        fu4.k.e(getContext()).f().h().getClass();
        paint2.setColor(1308622847);
        this.w = paint2;
        this.x = x0;
    }

    public final ot1 getType() {
        return (ot1) this.a.getValue(this, z[0]);
    }

    public final void onDraw(Canvas canvas) {
        float width = ((float) getWidth()) / 2.0f;
        canvas.drawCircle(width, width, width - w0, this.v);
        float f = v0 + this.x;
        float floatValue = this.c.evaluate(this.y, Float.valueOf(1.0f), Float.valueOf(0.5f)).floatValue() * ((((float) getWidth()) - f) / ((float) 2));
        canvas.drawRoundRect(f, f, ((float) getWidth()) - f, ((float) getHeight()) - f, floatValue, floatValue, this.w);
        super.onDraw(canvas);
    }

    public final void setType(ot1 ot1) {
        this.a.setValue(this, z[0], ot1);
    }
}
