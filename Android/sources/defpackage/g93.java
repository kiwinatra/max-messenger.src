package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;

/* renamed from: g93  reason: default package */
public final class g93 {
    public final Lazy a;

    public g93() {
        this.a = LazyKt.lazy(LazyThreadSafetyMode.NONE, new oq2(9));
    }

    public g93(Context context, String str) {
        this.a = LazyKt.lazy(new aob(3, context, str));
    }
}
