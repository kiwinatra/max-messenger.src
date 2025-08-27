package defpackage;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import one.me.sdk.design.theme.ChromaIllegalApplyThemeException;

/* renamed from: zna  reason: default package */
public final class zna extends AbstractCoroutineContextElement implements s04 {
    public final void m0(Throwable th, CoroutineContext coroutineContext) {
        IllegalStateException illegalStateException = th instanceof ChromaIllegalApplyThemeException ? (ChromaIllegalApplyThemeException) th : null;
        if (illegalStateException == null) {
            illegalStateException = new IllegalStateException(th);
        }
        h2g.a.d().a("ONEME-8759", illegalStateException);
    }
}
