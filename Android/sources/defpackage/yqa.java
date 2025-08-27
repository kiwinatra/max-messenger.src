package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: yqa  reason: default package */
public final class yqa implements dz6 {
    public final long b;
    public final Lazy c;

    public yqa(Lazy lazy, long j) {
        this.b = j;
        this.c = lazy;
    }

    public final long g() {
        return ((a32) ev0.C(EmptyCoroutineContext.INSTANCE, new xqa(this, (Continuation) null))).b.x;
    }

    public final long h() {
        return ((a32) ev0.C(EmptyCoroutineContext.INSTANCE, new xqa(this, (Continuation) null))).b.j;
    }

    public final List i() {
        return ((a32) ev0.C(EmptyCoroutineContext.INSTANCE, new xqa(this, (Continuation) null))).b.n.d(bl4.REGULAR);
    }
}
