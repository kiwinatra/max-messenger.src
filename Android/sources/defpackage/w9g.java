package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: w9g  reason: default package */
public abstract class w9g {
    public static iog a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        iog g = iog.g((View) null, rootWindowInsets);
        fog fog = g.a;
        fog.q(g);
        fog.d(view.getRootView());
        return g;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}
