package defpackage;

import android.content.Context;
import kotlin.text.StringsKt;

/* renamed from: ccb  reason: default package */
public final class ccb {
    public final kn4 a;
    public final boolean b;

    public ccb(Context context) {
        kn4.a.getClass();
        kn4 a2 = jn4.a(context);
        this.a = a2;
        this.b = a2.compareTo(kn4.v) >= 0;
    }

    public final String toString() {
        return StringsKt.trimIndent("\n        PerformanceConfig(\n            perfClass=" + this.a + ",\n        )\n    ");
    }
}
