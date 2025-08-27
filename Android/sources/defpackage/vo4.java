package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.math.MathKt;

/* renamed from: vo4  reason: default package */
public abstract class vo4 {
    public static final Lazy a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new qr3(14));

    public static final int a(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16843499, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0;
    }

    public static final int b(int i) {
        return MathKt.roundToInt(((float) i) * c().getDisplayMetrics().density);
    }

    public static final Resources c() {
        return (Resources) a.getValue();
    }

    public static final float d(float f) {
        return TypedValue.applyDimension(2, f, c().getDisplayMetrics());
    }
}
