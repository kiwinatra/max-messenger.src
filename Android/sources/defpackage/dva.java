package defpackage;

import java.lang.Thread;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: dva  reason: default package */
public final /* synthetic */ class dva implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ kva a;
    public final /* synthetic */ Thread.UncaughtExceptionHandler b;

    public /* synthetic */ dva(kva kva, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = kva;
        this.b = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        kva kva = this.a;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        String str = kva.g;
        a67 a67 = z68.b;
        if (a67 != null) {
            a67.b(a67, w78.y, str, "!!! APPCRASH !!!", (Object[]) null, th, 8);
        }
        kva.h();
        Object unused = ev0.C(EmptyCoroutineContext.INSTANCE, new iva(kva, (Continuation) null));
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
