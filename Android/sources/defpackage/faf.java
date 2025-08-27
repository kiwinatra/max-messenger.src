package defpackage;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import ru.ok.tamtam.util.HandledException;

/* renamed from: faf  reason: default package */
public final class faf extends AbstractCoroutineContextElement implements s04 {
    public final m95 a;
    public final Function1 b;

    public faf(m95 m95, Function1 function1) {
        super(r04.a);
        this.a = m95;
        this.b = function1;
    }

    public final void m0(Throwable th, CoroutineContext coroutineContext) {
        HandledException handledException = new HandledException(th);
        Function1 function1 = this.b;
        if (function1 != null) {
            function1.invoke(handledException);
        }
        ((uta) this.a).c(handledException, function1 == null);
    }
}
