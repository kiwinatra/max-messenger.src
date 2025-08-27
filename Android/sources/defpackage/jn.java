package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: jn  reason: default package */
public final class jn {
    public final View a;
    public final ho b;
    public int c = -1;
    public ci3 d;
    public ci3 e;
    public ci3 f;

    public jn(View view) {
        this.a = view;
        this.b = ho.a();
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f == null) {
                    this.f = new ci3(2);
                }
                ci3 ci3 = this.f;
                ci3.d = null;
                ci3.c = false;
                ci3.e = null;
                ci3.b = false;
                WeakHashMap weakHashMap = gag.a;
                ColorStateList g = v9g.g(view);
                if (g != null) {
                    ci3.c = true;
                    ci3.d = g;
                }
                PorterDuff.Mode h = v9g.h(view);
                if (h != null) {
                    ci3.b = true;
                    ci3.e = h;
                }
                if (ci3.c || ci3.b) {
                    ho.e(background, ci3, view.getDrawableState());
                    return;
                }
            }
            ci3 ci32 = this.e;
            if (ci32 != null) {
                ho.e(background, ci32, view.getDrawableState());
                return;
            }
            ci3 ci33 = this.d;
            if (ci33 != null) {
                ho.e(background, ci33, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        ci3 ci3 = this.e;
        if (ci3 != null) {
            return (ColorStateList) ci3.d;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        ci3 ci3 = this.e;
        if (ci3 != null) {
            return (PorterDuff.Mode) ci3.e;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList h;
        View view = this.a;
        g6d w = g6d.w(view.getContext(), attributeSet, koc.ViewBackgroundHelper, i, 0);
        TypedArray typedArray = (TypedArray) w.c;
        View view2 = this.a;
        Context context = view2.getContext();
        int[] iArr = koc.ViewBackgroundHelper;
        WeakHashMap weakHashMap = gag.a;
        bag.d(view2, context, iArr, attributeSet, (TypedArray) w.c, i, 0);
        try {
            if (typedArray.hasValue(koc.ViewBackgroundHelper_android_background)) {
                this.c = typedArray.getResourceId(koc.ViewBackgroundHelper_android_background, -1);
                ho hoVar = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (hoVar) {
                    h = hoVar.a.h(i2, context2);
                }
                if (h != null) {
                    g(h);
                }
            }
            if (typedArray.hasValue(koc.ViewBackgroundHelper_backgroundTint)) {
                v9g.q(view, w.o(koc.ViewBackgroundHelper_backgroundTint));
            }
            if (typedArray.hasValue(koc.ViewBackgroundHelper_backgroundTintMode)) {
                v9g.r(view, yu4.c(typedArray.getInt(koc.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode) null));
            }
            w.x();
        } catch (Throwable th) {
            w.x();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g((ColorStateList) null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.c = i;
        ho hoVar = this.b;
        if (hoVar != null) {
            Context context = this.a.getContext();
            synchronized (hoVar) {
                colorStateList = hoVar.a.h(i, context);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new ci3(2);
            }
            ci3 ci3 = this.d;
            ci3.d = colorStateList;
            ci3.c = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new ci3(2);
        }
        ci3 ci3 = this.e;
        ci3.d = colorStateList;
        ci3.c = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new ci3(2);
        }
        ci3 ci3 = this.e;
        ci3.e = mode;
        ci3.b = true;
        a();
    }
}
