package defpackage;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* renamed from: fq4  reason: default package */
public abstract class fq4 {
    public static DisplayCutout a(Rect rect, List<Rect> list) {
        return new DisplayCutout(rect, list);
    }

    public static List<Rect> b(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static int c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
