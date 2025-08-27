package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: ve8  reason: default package */
public final class ve8 {
    public final Lazy a;
    public final Lazy b;

    public ve8(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    public ve8(Context context, ltb ltb) {
        this.a = LazyKt.lazy(new a46(19));
        this.b = LazyKt.lazy(new u75(21, this));
    }
}
