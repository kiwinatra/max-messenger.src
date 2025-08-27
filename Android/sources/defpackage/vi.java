package defpackage;

import android.content.res.Resources;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.math.MathKt;

/* renamed from: vi  reason: default package */
public final class vi implements xi {
    public final int a() {
        return MathKt.roundToInt(Resources.getSystem().getDisplayMetrics().density * 48.0f);
    }

    public final int b() {
        return 5;
    }

    public final Set c() {
        return SetsKt.emptySet();
    }
}
