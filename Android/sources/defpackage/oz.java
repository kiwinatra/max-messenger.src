package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: oz  reason: default package */
public final class oz {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;

    public oz(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9) {
        this.a = lazy2;
        this.b = lazy;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy6;
        this.f = lazy7;
        this.g = lazy5;
        this.h = lazy8;
        this.i = lazy9;
    }

    public static Object b(oz ozVar, ha9 ha9, boolean z, Long l, int i2, ContinuationImpl continuationImpl, int i3) {
        boolean z2 = (i3 & 2) != 0 ? false : z;
        if ((i3 & 4) != 0) {
            l = null;
        }
        return ev0.I(((osa) ((gaf) ozVar.d.getValue())).b(), new nz(ozVar, ha9, (i3 & 8) != 0 ? 0 : i2, l, z2, (Continuation) null), continuationImpl);
    }

    public final Context a() {
        return (Context) this.g.getValue();
    }
}
