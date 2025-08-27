package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;

/* renamed from: d4d  reason: default package */
public abstract class d4d {
    public static int a(Resources resources, int i, Resources.Theme theme) {
        return resources.getColor(i, theme);
    }

    public static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
        return resources.getColorStateList(i, theme);
    }
}
