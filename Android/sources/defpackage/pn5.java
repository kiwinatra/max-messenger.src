package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pn5  reason: default package */
public final class pn5 {
    public final sv0 a;
    public final n6e b = m5a.b(0, 0, (cu0) null, 7);
    public final jx3 c;

    public pn5(sv0 sv0, gaf gaf) {
        this.a = sv0;
        this.c = e14.a(((osa) gaf).c());
        sv0.d(this);
    }

    @oye
    public final void onEvent(ko5 ko5) {
        if (Intrinsics.areEqual((Object) b59.i, (Object) ko5.c)) {
            ev0.v(this.c, (CoroutineContext) null, (f14) null, new nn5(this, (Continuation) null), 3);
        }
    }

    @oye
    public final void onEvent(trd trd) {
        if (Intrinsics.areEqual((Object) "file.local.max.size.reached", (Object) trd.b)) {
            ev0.v(this.c, (CoroutineContext) null, (f14) null, new on5(this, (Continuation) null), 3);
        }
    }
}
