package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* renamed from: ord  reason: default package */
public final class ord extends iod {
    public final /* synthetic */ AtomicReferenceArray v = new AtomicReferenceArray(nrd.f);

    public ord(long j, ord ord, int i) {
        super(j, ord, i);
    }

    public final int g() {
        return nrd.f;
    }

    public final void h(int i, CoroutineContext coroutineContext) {
        this.v.set(i, nrd.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
