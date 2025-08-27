package defpackage;

import android.view.ViewGroup;

/* renamed from: lag  reason: default package */
public abstract class lag {
    public static int a(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static boolean b(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    public static void c(ViewGroup viewGroup, boolean z) {
        viewGroup.setTransitionGroup(z);
    }
}
