package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: ka5  reason: default package */
public final class ka5 implements Runnable {
    public final Runnable a;
    public final Function0 b;
    public final Function1 c;

    public ka5(Runnable runnable, fa5 fa5, ga5 ga5) {
        this.a = runnable;
        this.b = fa5;
        this.c = ga5;
    }

    public final void run() {
        Function1 function1 = this.c;
        Function0 function0 = this.b;
        Object invoke = function0 != null ? function0.invoke() : null;
        try {
            this.a.run();
        } finally {
            if (function1 != null) {
                function1.invoke(invoke);
            }
        }
    }
}
