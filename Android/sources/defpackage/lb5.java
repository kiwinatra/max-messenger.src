package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: lb5  reason: default package */
public final class lb5 {
    public final Lazy a;
    public final Lazy b;

    public lb5(Context context, Lazy lazy) {
        this.a = LazyKt.lazy(new p35(context, 3));
        this.b = LazyKt.lazy(new j35(4, (Object) lazy, (Object) this));
    }
}
