package defpackage;

import java.util.concurrent.Future;
import kotlin.jvm.functions.Function1;

/* renamed from: aw1  reason: default package */
public final class aw1 implements bw1 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ aw1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void b(Throwable th) {
        switch (this.a) {
            case 0:
                if (th != null) {
                    ((Future) this.b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((Function1) this.b).invoke(th);
                return;
            default:
                ((pq4) this.b).dispose();
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) this.b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((Function1) this.b).getClass().getSimpleName() + '@' + n79.A(this) + ']';
            default:
                return "DisposeOnCancel[" + ((pq4) this.b) + ']';
        }
    }
}
