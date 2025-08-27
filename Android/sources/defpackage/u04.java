package defpackage;

import kotlin.ExceptionsKt;
import kotlin.coroutines.CoroutineContext;

/* renamed from: u04  reason: default package */
public abstract class u04 {
    public static final void a(Throwable th, CoroutineContext coroutineContext) {
        try {
            s04 s04 = (s04) coroutineContext.get(r04.a);
            if (s04 != null) {
                s04.m0(th, coroutineContext);
            } else {
                m5a.I(th, coroutineContext);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                ExceptionsKt.addSuppressed(runtimeException, th);
                th = runtimeException;
            }
            m5a.I(th, coroutineContext);
        }
    }
}
