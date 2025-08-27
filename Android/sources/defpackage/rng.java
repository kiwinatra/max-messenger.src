package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* renamed from: rng  reason: default package */
public final class rng extends ung {
    public static final PathInterpolator e = new PathInterpolator(c44.DEFAULT_ASPECT_RATIO, 1.1f, c44.DEFAULT_ASPECT_RATIO, 1.0f);
    public static final fh5 f = new fh5(0);
    public static final DecelerateInterpolator g = new DecelerateInterpolator();

    public static void e(View view, vng vng) {
        n22 j = j(view);
        if (j != null) {
            j.b(vng);
            if (j.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), vng);
            }
        }
    }

    public static void f(View view, vng vng, WindowInsets windowInsets, boolean z) {
        n22 j = j(view);
        if (j != null) {
            j.b = windowInsets;
            if (!z) {
                j.c(vng);
                z = j.a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), vng, windowInsets, z);
            }
        }
    }

    public static void g(View view, iog iog, List list) {
        n22 j = j(view);
        if (j != null) {
            iog = j.d(iog, list);
            if (j.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), iog, list);
            }
        }
    }

    public static void h(View view, vng vng, h0h h0h) {
        n22 j = j(view);
        if (j != null) {
            j.e(vng, h0h);
            if (j.a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), vng, h0h);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(ahc.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static n22 j(View view) {
        Object tag = view.getTag(ahc.tag_window_insets_animation_callback);
        if (tag instanceof qng) {
            return ((qng) tag).a;
        }
        return null;
    }
}
