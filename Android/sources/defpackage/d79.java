package defpackage;

import android.transition.Transition;
import android.widget.PopupWindow;

/* renamed from: d79  reason: default package */
public abstract class d79 {
    public static void a(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void b(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
