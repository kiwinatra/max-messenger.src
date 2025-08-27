package defpackage;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* renamed from: es5  reason: default package */
public final class es5 extends dgd {
    public final boolean D(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return z(th);
    }
}
