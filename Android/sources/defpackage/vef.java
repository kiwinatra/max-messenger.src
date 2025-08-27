package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;

/* renamed from: vef  reason: default package */
public final class vef {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    public vef(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, tnc.TextAppearance);
        this.k = obtainStyledAttributes.getDimension(tnc.TextAppearance_android_textSize, c44.DEFAULT_ASPECT_RATIO);
        this.j = m5a.C(context, obtainStyledAttributes, tnc.TextAppearance_android_textColor);
        m5a.C(context, obtainStyledAttributes, tnc.TextAppearance_android_textColorHint);
        m5a.C(context, obtainStyledAttributes, tnc.TextAppearance_android_textColorLink);
        this.c = obtainStyledAttributes.getInt(tnc.TextAppearance_android_textStyle, 0);
        this.d = obtainStyledAttributes.getInt(tnc.TextAppearance_android_typeface, 1);
        int i3 = tnc.TextAppearance_fontFamily;
        i3 = !obtainStyledAttributes.hasValue(i3) ? tnc.TextAppearance_android_fontFamily : i3;
        this.l = obtainStyledAttributes.getResourceId(i3, 0);
        this.b = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(tnc.TextAppearance_textAllCaps, false);
        this.a = m5a.C(context, obtainStyledAttributes, tnc.TextAppearance_android_shadowColor);
        this.e = obtainStyledAttributes.getFloat(tnc.TextAppearance_android_shadowDx, c44.DEFAULT_ASPECT_RATIO);
        this.f = obtainStyledAttributes.getFloat(tnc.TextAppearance_android_shadowDy, c44.DEFAULT_ASPECT_RATIO);
        this.g = obtainStyledAttributes.getFloat(tnc.TextAppearance_android_shadowRadius, c44.DEFAULT_ASPECT_RATIO);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, tnc.MaterialTextAppearance);
        this.h = obtainStyledAttributes2.hasValue(tnc.MaterialTextAppearance_android_letterSpacing);
        this.i = obtainStyledAttributes2.getFloat(tnc.MaterialTextAppearance_android_letterSpacing, c44.DEFAULT_ASPECT_RATIO);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i2 = this.c;
        if (typeface == null && (str = this.b) != null) {
            this.n = Typeface.create(str, i2);
        }
        if (this.n == null) {
            int i3 = this.d;
            if (i3 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i3 == 2) {
                this.n = Typeface.SERIF;
            } else if (i3 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, i2);
        }
    }

    public final Typeface b(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = h4d.a(this.l, context);
                this.n = a2;
                if (a2 != null) {
                    this.n = Typeface.create(a2, this.c);
                }
            } catch (Resources.NotFoundException | Exception | UnsupportedOperationException unused) {
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public final void c(Context context, ryg ryg) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i2 = this.l;
        if (i2 == 0) {
            this.m = true;
        }
        if (this.m) {
            ryg.N(this.n, true);
            return;
        }
        try {
            tef tef = new tef(this, ryg);
            ThreadLocal threadLocal = h4d.a;
            if (context.isRestricted()) {
                tef.e(-4);
                return;
            }
            h4d.b(context, i2, new TypedValue(), 0, tef, false, false);
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            ryg.M(1);
        } catch (Exception unused2) {
            this.m = true;
            ryg.M(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i2 = this.l;
        if (i2 != 0) {
            ThreadLocal threadLocal = h4d.a;
            if (!context.isRestricted()) {
                typeface = h4d.b(context, i2, new TypedValue(), 0, (vzg) null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, ryg ryg) {
        f(context, textPaint, ryg);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.g, this.e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, ryg ryg) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new uef(this, context, textPaint, ryg));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface P = iq.P(context.getResources().getConfiguration(), typeface);
        if (P != null) {
            typeface = P;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : c44.DEFAULT_ASPECT_RATIO);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
