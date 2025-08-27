package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: bnb  reason: default package */
public final class bnb {
    public final Context a;
    public final pwa b;
    public final ed4 c;
    public final Lazy d;
    public final wsb e;

    public bnb(Context context, pwa pwa, ed4 ed4) {
        this.a = context;
        this.b = pwa;
        this.c = ed4;
        this.d = LazyKt.lazy(new a1b(context, 8));
        this.e = new wsb(context, pwa);
    }
}
