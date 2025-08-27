package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

/* renamed from: m3g  reason: default package */
public final class m3g extends View {
    public static final /* synthetic */ KProperty[] B0;
    public static final TextPaint C0 = new TextPaint();
    public final l3g A0;
    public final ds7 a = ((ds7) vi9.a.getAccessor().g(ds7.class));
    public final float b = (vo4.c().getDisplayMetrics().density * 4.0f);
    public final int c;
    public final int o;
    public final int v;
    public final l3g v0;
    public final int w;
    public final l3g w0;
    public final float x;
    public Drawable x0;
    public final Lazy y;
    public Layout y0;
    public final int z;
    public final Lazy z0;

    static {
        Class<m3g> cls = m3g.class;
        B0 = new KProperty[]{rae.s(cls, "isBackgroundEnabled", "isBackgroundEnabled()Z", 0), rae.s(cls, "isDrawableEnabled", "isDrawableEnabled()Z", 0), rae.s(cls, "text", "getText()Ljava/lang/CharSequence;", 0)};
    }

    public m3g(Context context) {
        super(context);
        int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        this.c = roundToInt;
        this.o = getBackgroundColor();
        this.v = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
        this.w = MathKt.roundToInt(((float) 3) * vo4.c().getDisplayMetrics().density);
        this.x = vo4.c().getDisplayMetrics().density * 10.0f;
        i2g i2g = new i2g(1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.y = LazyKt.lazy(lazyThreadSafetyMode, i2g);
        this.z = fu4.k.e(getContext()).f().a().l().b.a;
        Delegates delegates = Delegates.INSTANCE;
        this.v0 = new l3g(this, 1);
        l3g l3g = new l3g(this, 2);
        this.w0 = l3g;
        this.z0 = LazyKt.lazy(lazyThreadSafetyMode, new i2g(2));
        this.A0 = new l3g(this, 0);
        setId(cwa.P);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
        TextPaint textPaint = C0;
        textPaint.setAntiAlias(true);
        ogf ogf = tr2.c;
        ogf.getClass();
        textPaint.setTextSize(so4.c(ogf.g(uy4.b), context));
        textPaint.setLetterSpacing(so4.d(ogf.e, context.getResources().getDisplayMetrics()));
        textPaint.setTypeface(Typeface.create(Typeface.create(ogf.f, 0), ogf.g.a));
        setWillNotDraw(false);
        if (((Boolean) l3g.getValue(this, B0[1])).booleanValue()) {
            Drawable b2 = ew3.b(getContext(), cad.k2);
            b2.setBounds(0, 0, roundToInt, roundToInt);
            b2.setTint(getDrawableColor());
            this.x0 = b2;
        }
    }

    private final int getBackgroundColor() {
        return fu4.k.e(getContext()).f().a().l().a.e;
    }

    /* access modifiers changed from: private */
    public final int getDrawableColor() {
        fu4.k.e(getContext()).f().a().l().c.getClass();
        return -1;
    }

    /* access modifiers changed from: private */
    public final BoringLayout.Metrics getMetrics() {
        return (BoringLayout.Metrics) this.z0.getValue();
    }

    private final CharSequence getText() {
        return (CharSequence) this.A0.getValue(this, B0[2]);
    }

    private final void setText(CharSequence charSequence) {
        this.A0.setValue(this, B0[2], charSequence);
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        Layout layout = this.y0;
        if (layout != null) {
            layout.getPaint().setColor(this.z);
            float height = ((float) (getHeight() - layout.getHeight())) * 0.5f;
            boolean booleanValue = ((Boolean) this.v0.getValue(this, B0[0])).booleanValue();
            float f = c44.DEFAULT_ASPECT_RATIO;
            if (booleanValue) {
                f = c44.DEFAULT_ASPECT_RATIO + ((float) this.v);
                Lazy lazy = this.y;
                ((Paint) lazy.getValue()).setColor(this.o);
                float f2 = this.x;
                canvas.drawRoundRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getWidth(), (float) getHeight(), f2, f2, (Paint) lazy.getValue());
            }
            boolean y2 = ct.y(getContext());
            float f3 = this.b;
            if (y2) {
                int save = canvas.save();
                canvas.translate(f, height);
                try {
                    layout.draw(canvas);
                    canvas.restoreToCount(save);
                    Drawable drawable = this.x0;
                    if (drawable != null) {
                        int save2 = canvas.save();
                        canvas.translate(f + ((float) layout.getWidth()) + f3, ((float) (getHeight() - drawable.getBounds().height())) * 0.5f);
                        try {
                            drawable.draw(canvas);
                        } finally {
                            canvas.restoreToCount(save2);
                        }
                    }
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            } else {
                Drawable drawable2 = this.x0;
                if (drawable2 != null) {
                    int save3 = canvas.save();
                    canvas.translate(f, ((float) (getHeight() - drawable2.getBounds().height())) * 0.5f);
                    try {
                        drawable2.draw(canvas);
                        canvas.restoreToCount(save3);
                        f += ((float) drawable2.getBounds().width()) + f3;
                    } catch (Throwable th2) {
                        canvas.restoreToCount(save3);
                        throw th2;
                    }
                }
                int save4 = canvas.save();
                canvas.translate(f, height);
                try {
                    layout.draw(canvas);
                } finally {
                    canvas.restoreToCount(save4);
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Layout layout = this.y0;
        if (layout != null) {
            i4 = layout.getWidth();
            i3 = layout.getHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        Drawable drawable = this.x0;
        if (drawable != null) {
            i4 += drawable.getBounds().width() + MathKt.roundToInt(this.b);
            i3 = Math.max(i3, drawable.getBounds().height());
        }
        if (((Boolean) this.v0.getValue(this, B0[0])).booleanValue()) {
            i4 += this.v * 2;
            i3 += this.w * 2;
        }
        setMeasuredDimension(i4, i3);
    }

    public final void setBackgroundEnabled(boolean z2) {
        this.v0.setValue(this, B0[0], Boolean.valueOf(z2));
    }

    public final void setContent(CharSequence charSequence) {
        setText(charSequence);
    }

    public final void setDrawableEnabled(boolean z2) {
        this.w0.setValue(this, B0[1], Boolean.valueOf(z2));
    }
}
