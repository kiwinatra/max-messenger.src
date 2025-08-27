package defpackage;

import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.TuplesKt;

/* renamed from: j1g  reason: default package */
public final class j1g {
    public final thf a;
    public final Lazy b;
    public final Lazy c;
    public final ArrayList d = new ArrayList();

    public j1g(thf thf) {
        this.a = thf;
        dle dle = new dle(28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.b = LazyKt.lazy(lazyThreadSafetyMode, dle);
        this.c = LazyKt.lazy(lazyThreadSafetyMode, new dle(29));
        thf.getClass();
    }

    public static final void a(float[] fArr, float f, int i, int i2) {
        float f2 = ((float) i) / 2.0f;
        float f3 = ((float) i2) / 2.0f;
        double d2 = (double) f;
        float cos = (float) Math.cos(Math.toRadians(d2));
        float sin = (float) Math.sin(Math.toRadians(d2));
        float abs = Math.abs(f2 / cos);
        float abs2 = Math.abs(f3 / sin);
        Pair pair = abs >= abs2 ? TuplesKt.to(Float.valueOf(Math.abs(abs2 * cos)), Float.valueOf(f3)) : TuplesKt.to(Float.valueOf(f2), Float.valueOf(Math.abs(abs * sin)));
        float floatValue = ((Number) pair.component1()).floatValue();
        float floatValue2 = ((Number) pair.component2()).floatValue();
        int i3 = (cos > c44.DEFAULT_ASPECT_RATIO ? 1 : (cos == c44.DEFAULT_ASPECT_RATIO ? 0 : -1));
        if (i3 < 0 || sin < c44.DEFAULT_ASPECT_RATIO) {
            int i4 = (cos > c44.DEFAULT_ASPECT_RATIO ? 1 : (cos == c44.DEFAULT_ASPECT_RATIO ? 0 : -1));
            if (i4 < 0 && sin >= c44.DEFAULT_ASPECT_RATIO) {
                fArr[0] = f2 - floatValue;
                fArr[1] = f3 - floatValue2;
            } else if (i4 < 0 && sin < c44.DEFAULT_ASPECT_RATIO) {
                fArr[0] = f2 - floatValue;
                fArr[1] = f3 + floatValue2;
            } else if (i3 >= 0 && sin < c44.DEFAULT_ASPECT_RATIO) {
                fArr[0] = f2 + floatValue;
                fArr[1] = f3 + floatValue2;
            }
        } else {
            fArr[0] = f2 + floatValue;
            fArr[1] = f3 - floatValue2;
        }
    }
}
