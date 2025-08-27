package defpackage;

import android.content.Context;
import android.graphics.Rect;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: n35  reason: default package */
public final class n35 {
    public static final Rect c = new Rect();
    public final Lazy a;
    public final Lazy b = LazyKt.lazy(new nm1(28, this));

    public n35(Context context) {
        this.a = LazyKt.lazy(new j35(1, (Object) this, (Object) context));
    }

    public final float a() {
        return ((Number) this.a.getValue()).floatValue();
    }
}
