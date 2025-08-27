package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.ExceptionHandler$HandledException;

/* renamed from: uta  reason: default package */
public final class uta implements m95 {
    public static final AtomicInteger c = new AtomicInteger();
    public final Lazy a;
    public final xme b;

    public uta(gaf gaf, Lazy lazy, Lazy lazy2) {
        this.a = lazy2;
        jx3 a2 = e14.a(((osa) gaf).b().s0(1, "excp"));
        xme a3 = f6e.a(0);
        this.b = a3;
        bs0.K(new ps5(new eu5(bs0.v(a3, 300), 0), new tta(lazy, (Continuation) null), 5), a2);
    }

    public final void c(Throwable th, boolean z) {
        String str;
        AtomicInteger atomicInteger;
        int i;
        int i2;
        String str2 = null;
        if (z) {
            String name = uta.class.getName();
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            z68.f(name, "Got exception for handle", cause);
            do {
                atomicInteger = c;
                i = atomicInteger.get();
                i2 = i + 1;
                if (i2 > 2147483645) {
                    i2 = 1;
                }
            } while (!atomicInteger.compareAndSet(i, i2));
            Integer valueOf = Integer.valueOf(i);
            xme xme = this.b;
            xme.getClass();
            xme.m((Object) null, valueOf);
        }
        e24 d = ((f8f) this.a.getValue()).d();
        Throwable cause2 = th.getCause();
        boolean z2 = th instanceof ExceptionHandler$HandledException;
        if (!z2) {
            cause2 = null;
        }
        if (cause2 == null) {
            cause2 = th;
        }
        ExceptionHandler$HandledException exceptionHandler$HandledException = z2 ? (ExceptionHandler$HandledException) th : null;
        if (exceptionHandler$HandledException == null || (str = exceptionHandler$HandledException.a) == null) {
            Throwable cause3 = th.getCause();
            ExceptionHandler$HandledException exceptionHandler$HandledException2 = cause3 instanceof ExceptionHandler$HandledException ? (ExceptionHandler$HandledException) cause3 : null;
            if (exceptionHandler$HandledException2 != null) {
                str2 = exceptionHandler$HandledException2.a;
            }
        } else {
            str2 = str;
        }
        d.a(str2, cause2);
    }
}
