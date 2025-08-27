package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import java.util.EnumMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.math.MathKt;

/* renamed from: km5  reason: default package */
public final class km5 extends Drawable implements phf {
    public float X;
    public final Context a;
    public final jm5 b;
    public vk5 c;
    public final RectF o = new RectF();
    public final TextPaint v;
    public final Lazy w;
    public final BoringLayout.Metrics x;
    public BoringLayout y;
    public final float z;

    public km5(Context context, jm5 jm5) {
        this.a = context;
        this.b = jm5;
        TextPaint textPaint = new TextPaint();
        this.v = textPaint;
        this.w = LazyKt.lazy(LazyThreadSafetyMode.NONE, new qr3(27));
        this.x = new BoringLayout.Metrics();
        this.z = 9.0f;
        long b2 = so4.b(9.0f, 1);
        long b3 = so4.b(14.0f, 1);
        long b4 = so4.b(0.03f, 0);
        String str = puf.r.f;
        j96 j96 = j96.Regular;
        Class<uy4> cls = uy4.class;
        EnumMap enumMap = new EnumMap(cls);
        uy4 uy4 = uy4.b;
        rae.u(b2, enumMap, uy4);
        Unit unit = Unit.INSTANCE;
        new EnumMap(cls).put(uy4, new so4(b3));
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        textPaint.setTypeface(Typeface.create(Typeface.create(str, 0), 500, false));
        textPaint.setLetterSpacing(so4.d(b4, displayMetrics));
        so4 so4 = (so4) enumMap.get(uy4);
        textPaint.setTextSize(so4.d((so4 == null ? (so4) CollectionsKt.first(enumMap.values()) : so4).a, displayMetrics));
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
        this.X = 1.0f;
    }

    public final void a(vk5 vk5) {
        if (this.c != vk5) {
            this.c = vk5;
            onThemeChanged(fu4.k.e(this.a).f());
            onBoundsChange(getBounds());
            invalidateSelf();
        }
    }

    /* JADX INFO: finally extract failed */
    public final void draw(Canvas canvas) {
        float f = vo4.c().getDisplayMetrics().density * 6.0f * this.X;
        float f2 = vo4.c().getDisplayMetrics().density * 2.0f * this.X;
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            this.b.draw(canvas);
            canvas.restoreToCount(save);
            float f3 = vo4.c().getDisplayMetrics().density * 4.0f * this.X;
            RectF rectF = this.o;
            canvas.drawRoundRect(rectF, f3, f3, (Paint) this.w.getValue());
            BoringLayout boringLayout = this.y;
            if (boringLayout != null) {
                float f4 = i2a.f(rectF.width(), (float) boringLayout.getWidth(), 0.5f, rectF.left);
                float f5 = i2a.f(rectF.height(), (float) boringLayout.getHeight(), 0.5f, rectF.top);
                int save2 = canvas.save();
                canvas.translate(f4, f5);
                try {
                    boringLayout.draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            }
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void invalidateSelf() {
        jm5 jm5 = this.b;
        if (jm5.getCallback() != getCallback()) {
            jm5.setCallback(getCallback());
        }
        jm5.invalidateSelf();
        super.invalidateSelf();
    }

    public final void onBoundsChange(Rect rect) {
        String str = "file";
        int width = rect.width();
        if (width != 0) {
            float f = (float) width;
            this.X = f / ((float) MathKt.roundToInt(((float) 40) * vo4.c().getDisplayMetrics().density));
            vk5 vk5 = this.c;
            if (vk5 != null) {
                this.b.setBounds(0, 0, MathKt.roundToInt(((float) MathKt.roundToInt(((float) 28) * vo4.c().getDisplayMetrics().density)) * this.X), MathKt.roundToInt(((float) MathKt.roundToInt(((float) 36) * vo4.c().getDisplayMetrics().density)) * this.X));
                RectF rectF = this.o;
                rectF.set(vo4.c().getDisplayMetrics().density * 4.0f * this.X, vo4.c().getDisplayMetrics().density * 18.0f * this.X, f - ((vo4.c().getDisplayMetrics().density * 4.0f) * this.X), f - ((vo4.c().getDisplayMetrics().density * 8.0f) * this.X));
                TextPaint textPaint = this.v;
                try {
                    textPaint.setTextSize(this.z * vo4.c().getDisplayMetrics().density * this.X);
                    BoringLayout.Metrics metrics = this.x;
                    textPaint.getFontMetricsInt(metrics);
                    this.y = BoringLayout.make(vk5 == vk5.UNKNOWN ? str : vk5.name(), textPaint, MathKt.roundToInt(rectF.width()), Layout.Alignment.ALIGN_CENTER, 1.0f, c44.DEFAULT_ASPECT_RATIO, metrics, false);
                } catch (Throwable th) {
                    this.y = null;
                    String name = km5.class.getName();
                    if (vk5 != vk5.UNKNOWN) {
                        str = vk5.name();
                    }
                    z68.f(name, "fail to generate boring layout for " + str, th);
                }
            }
        }
    }

    public final void onThemeChanged(k2b k2b) {
        vk5 vk5 = this.c;
        if (vk5 != null) {
            int i = k2b.a().l().a.b.d;
            ok5 ok5 = vk5.a;
            this.b.a(i, k2b.i(ok5.b), k2b.i(ok5.c));
            ((Paint) this.w.getValue()).setColor(k2b.i(ok5.a));
            this.v.setColor(k2b.i(ok5.o));
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
