package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: yof  reason: default package */
public final class yof {
    public final Lazy a;
    public final Lazy b = LazyKt.lazy(new ve(10, (Object) this));

    public yof(Context context) {
        this.a = LazyKt.lazy(new jof(context, 1));
    }
}
