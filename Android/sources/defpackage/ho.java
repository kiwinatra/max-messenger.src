package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* renamed from: ho  reason: default package */
public final class ho {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static ho c;
    public a4d a;

    public static synchronized ho a() {
        ho hoVar;
        synchronized (ho.class) {
            try {
                if (c == null) {
                    d();
                }
                hoVar = c;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return hoVar;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter g;
        synchronized (ho.class) {
            g = a4d.g(i, mode);
        }
        return g;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [ho, java.lang.Object] */
    public static synchronized void d() {
        synchronized (ho.class) {
            if (c == null) {
                ? obj = new Object();
                c = obj;
                obj.a = a4d.c();
                a4d a4d = c.a;
                q40 q40 = new q40();
                synchronized (a4d) {
                    a4d.e = q40;
                }
            }
        }
    }

    public static void e(Drawable drawable, ci3 ci3, int[] iArr) {
        PorterDuff.Mode mode = a4d.f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = ci3.c;
            if (z || ci3.b) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? (ColorStateList) ci3.d : null;
                PorterDuff.Mode mode2 = ci3.b ? (PorterDuff.Mode) ci3.e : a4d.f;
                if (!(colorStateList == null || mode2 == null)) {
                    porterDuffColorFilter = a4d.g(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
                return;
            }
            drawable.clearColorFilter();
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.f(context, i);
    }
}
