package defpackage;

import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ema  reason: default package */
public final class ema implements jw1 {
    public final xla a;
    public final /* synthetic */ fma b;

    public ema(fma fma, xla xla) {
        this.b = fma;
        this.a = xla;
    }

    public final void cancel() {
        fma fma = this.b;
        ArrayDeque arrayDeque = fma.b;
        xla xla = this.a;
        arrayDeque.remove(xla);
        if (Intrinsics.areEqual((Object) fma.c, (Object) xla)) {
            xla.a();
            fma.c = null;
        }
        xla.b.remove(this);
        Function0 function0 = xla.c;
        if (function0 != null) {
            function0.invoke();
        }
        xla.c = null;
    }
}
