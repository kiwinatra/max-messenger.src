package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: oc4  reason: default package */
public final /* synthetic */ class oc4 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Handler b;

    public /* synthetic */ oc4(Handler handler, int i) {
        this.a = i;
        this.b = handler;
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                this.b.post(runnable);
                return;
            default:
                v0g.W(this.b, runnable);
                return;
        }
    }
}
