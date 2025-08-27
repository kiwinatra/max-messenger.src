package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* renamed from: zhf  reason: default package */
public abstract class zhf {
    public static final ThreadLocal a = new ThreadLocal();
    public static final int[] b = {-16842910};
    public static final int[] c = {16842908};
    public static final int[] d = {16842919};
    public static final int[] e = {16842912};
    public static final int[] f = new int[0];
    public static final int[] g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(koc.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(koc.AppCompatTheme_windowActionBar)) {
                view.getClass().toString();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(int i, Context context) {
        ColorStateList d2 = d(i, context);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(b, d2.getDefaultColor());
        }
        ThreadLocal threadLocal = a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f2 = typedValue.getFloat();
        int c2 = c(i, context);
        return w53.h(c2, Math.round(((float) Color.alpha(c2)) * f2));
    }

    public static int c(int i, Context context) {
        int[] iArr = g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(int i, Context context) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = q8.j(resourceId, context)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
