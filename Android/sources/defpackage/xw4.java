package defpackage;

import android.widget.AbsListView;

/* renamed from: xw4  reason: default package */
public abstract class xw4 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z) {
        absListView.setSelectedChildViewEnabled(z);
    }
}
