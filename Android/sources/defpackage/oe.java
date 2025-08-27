package defpackage;

import java.util.Collections;
import java.util.concurrent.Callable;

/* renamed from: oe  reason: default package */
public final /* synthetic */ class oe implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ oe(int i) {
        this.a = i;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                return pe.a;
            case 1:
                return Collections.emptyList();
            default:
                return Thread.currentThread();
        }
    }
}
