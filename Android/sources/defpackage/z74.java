package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: z74  reason: default package */
public final class z74 extends View {
    public static final /* synthetic */ KProperty[] B0;
    public static final TextPaint C0 = new TextPaint();
    public final dz9 A0;
    public final float a = (vo4.c().getDisplayMetrics().density * 4.0f);
    public final int b = MathKt.roundToInt(((float) 16) * vo4.c().getDisplayMetrics().density);
    public int c;
    public final int o = MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density);
    public final int v = MathKt.roundToInt(((float) 3) * vo4.c().getDisplayMetrics().density);
    public hcg v0;
    public final float w = (vo4.c().getDisplayMetrics().density * 10.0f);
    public Drawable w0;
    public final Lazy x;
    public Layout x0;
    public int y;
    public final Lazy y0;
    public final y74 z;
    public final y74 z0;

    static {
        Class<z74> cls = z74.class;
        B0 = new KProperty[]{rae.s(cls, "isBackgroundEnabled", "isBackgroundEnabled()Z", 0), rae.s(cls, "text", "getText()Ljava/lang/CharSequence;", 0)};
    }

    public z74(Context context) {
        super(context);
        qr3 qr3 = new qr3(8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.x = LazyKt.lazy(lazyThreadSafetyMode, qr3);
        this.y = -1;
        Delegates delegates = Delegates.INSTANCE;
        this.z = new y74(this, 1);
        this.v0 = hcg.None;
        this.y0 = LazyKt.lazy(lazyThreadSafetyMode, new qr3(9));
        this.z0 = new y74(this, 0);
        setId(cwa.K);
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
        this.A0 = new dz9(hcg.y.size());
    }

    /* access modifiers changed from: private */
    public final BoringLayout.Metrics getMetrics() {
        return (BoringLayout.Metrics) this.y0.getValue();
    }

    private final CharSequence getText() {
        return (CharSequence) this.z0.getValue(this, B0[1]);
    }

    private final int getViewStatusTintColor() {
        int i = x74.$EnumSwitchMapping$0[this.v0.ordinal()];
        js9 js9 = fu4.k;
        if (i != 1) {
            return b() ? js9.e(getContext()).f().a().i().c.b : js9.e(getContext()).f().a().i().c.a;
        }
        js9.e(getContext()).f().a().i().c.getClass();
        return -1685946;
    }

    private final void setText(CharSequence charSequence) {
        this.z0.setValue(this, B0[1], charSequence);
    }

    public final boolean b() {
        return ((Boolean) this.z.getValue(this, B0[0])).booleanValue();
    }

    public final void c(CharSequence charSequence, boolean z2) {
        if (z2) {
            charSequence = new SpannableStringBuilder(getContext().getString(ewa.N0)).append(" · ").append(charSequence);
        }
        setText(charSequence);
    }

    public final void d(hcg hcg) {
        Drawable drawable = this.w0;
        if (drawable == null) {
            return;
        }
        if (hcg == hcg.Error) {
            EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
            if (enhancedVectorDrawable != null) {
                hi7.Y(enhancedVectorDrawable, "error", getViewStatusTintColor());
                return;
            }
            return;
        }
        drawable.setTint(getViewStatusTintColor());
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        Layout layout = this.x0;
        if (layout != null) {
            layout.getPaint().setColor(this.y);
            float height = ((float) (getHeight() - layout.getHeight())) * 0.5f;
            boolean b2 = b();
            float f = c44.DEFAULT_ASPECT_RATIO;
            if (b2) {
                f = c44.DEFAULT_ASPECT_RATIO + ((float) this.o);
                Lazy lazy = this.x;
                ((Paint) lazy.getValue()).setColor(this.c);
                float f2 = this.w;
                canvas.drawRoundRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, (float) getWidth(), (float) getHeight(), f2, f2, (Paint) lazy.getValue());
            }
            boolean y2 = ct.y(getContext());
            float f3 = this.a;
            if (y2) {
                Drawable drawable = this.w0;
                if (drawable != null) {
                    int save = canvas.save();
                    canvas.translate(f, ((float) (getHeight() - drawable.getBounds().height())) * 0.5f);
                    try {
                        drawable.draw(canvas);
                        canvas.restoreToCount(save);
                        f += ((float) drawable.getBounds().width()) + f3;
                    } catch (Throwable th) {
                        canvas.restoreToCount(save);
                        throw th;
                    }
                }
                int save2 = canvas.save();
                canvas.translate(f, height);
                try {
                    layout.draw(canvas);
                } finally {
                    canvas.restoreToCount(save2);
                }
            } else {
                int save3 = canvas.save();
                canvas.translate(f, height);
                try {
                    layout.draw(canvas);
                    canvas.restoreToCount(save3);
                    Drawable drawable2 = this.w0;
                    if (drawable2 != null) {
                        int save4 = canvas.save();
                        canvas.translate(f + ((float) layout.getWidth()) + f3, ((float) (getHeight() - drawable2.getBounds().height())) * 0.5f);
                        try {
                            drawable2.draw(canvas);
                        } finally {
                            canvas.restoreToCount(save4);
                        }
                    }
                } catch (Throwable th2) {
                    canvas.restoreToCount(save3);
                    throw th2;
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Layout layout = this.x0;
        if (layout != null) {
            i3 = layout.getWidth();
            i4 = layout.getHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        Drawable drawable = this.w0;
        if (drawable != null) {
            i3 += drawable.getBounds().width() + MathKt.roundToInt(this.a);
            i4 = Math.max(i4, drawable.getBounds().height());
        }
        if (b()) {
            i3 += this.o * 2;
            i4 += this.v * 2;
        }
        setMeasuredDimension(i3, i4);
    }

    public void setBackgroundColor(int i) {
        if (this.c != i) {
            this.c = i;
            invalidate();
        }
    }

    public final void setBackgroundEnabled(boolean z2) {
        this.z.setValue(this, B0[0], Boolean.valueOf(z2));
    }

    public final void setStatus(hcg hcg) {
        Drawable drawable;
        this.v0 = hcg;
        Integer num = hcg.a;
        if (num == null) {
            drawable = null;
        } else {
            int intValue = num.intValue();
            dz9 dz9 = this.A0;
            Object a2 = dz9.a(intValue);
            if (a2 == null) {
                hcg hcg2 = this.v0;
                hcg hcg3 = hcg.Error;
                Integer num2 = hcg.a;
                if (hcg2 == hcg3) {
                    a2 = new EnhancedVectorDrawable(getContext(), num2.intValue());
                } else {
                    a2 = ew3.b(getContext(), num2.intValue());
                }
                int b2 = dz9.b(intValue);
                dz9.b[b2] = intValue;
                dz9.c[b2] = a2;
            }
            drawable = (Drawable) a2;
        }
        boolean z2 = !Intrinsics.areEqual((Object) this.w0, (Object) drawable);
        if (drawable != null) {
            int i = this.b;
            drawable.setBounds(0, 0, i, i);
        }
        this.w0 = drawable;
        d(hcg);
        invalidate();
        if (z2) {
            requestLayout();
        }
    }

    public final void setTextColor(int i) {
        if (this.y != i) {
            this.y = i;
            C0.setColor(i);
            d(this.v0);
            invalidate();
        }
    }
}
