package defpackage;

import android.view.ViewGroup;

/* renamed from: nag  reason: default package */
public abstract class nag {
    public static int a(ViewGroup viewGroup, int i) {
        return viewGroup.getChildDrawingOrder(i);
    }

    public static void b(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }
}
