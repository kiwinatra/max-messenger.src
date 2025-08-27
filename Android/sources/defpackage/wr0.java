package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;

/* renamed from: wr0  reason: default package */
public final class wr0 extends sr0 {
    public final Boolean a;
    public final iog b;
    public Window c;
    public boolean d;

    public wr0(View view, iog iog) {
        ColorStateList colorStateList;
        this.b = iog;
        bh8 bh8 = BottomSheetBehavior.C(view).i;
        if (bh8 != null) {
            colorStateList = bh8.a.c;
        } else {
            WeakHashMap weakHashMap = gag.a;
            colorStateList = v9g.g(view);
        }
        if (colorStateList != null) {
            this.a = Boolean.valueOf(ld9.G(colorStateList.getDefaultColor()));
            return;
        }
        ColorStateList m = gsg.m(view.getBackground());
        Integer valueOf = m != null ? Integer.valueOf(m.getDefaultColor()) : null;
        if (valueOf != null) {
            this.a = Boolean.valueOf(ld9.G(valueOf.intValue()));
        } else {
            this.a = null;
        }
    }

    public final void a(View view) {
        d(view);
    }

    public final void b(View view) {
        d(view);
    }

    public final void c(View view, int i) {
        d(view);
    }

    public final void d(View view) {
        int top = view.getTop();
        iog iog = this.b;
        if (top < iog.d()) {
            Window window = this.c;
            if (window != null) {
                Boolean bool = this.a;
                new log(window, window.getDecorView()).b(bool == null ? this.d : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), iog.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else if (view.getTop() != 0) {
            Window window2 = this.c;
            if (window2 != null) {
                new log(window2, window2.getDecorView()).b(this.d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.c != window) {
            this.c = window;
            if (window != null) {
                this.d = new log(window, window.getDecorView()).a.S();
            }
        }
    }
}
