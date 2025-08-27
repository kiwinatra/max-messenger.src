package defpackage;

import java.util.concurrent.Executor;

/* renamed from: fs  reason: default package */
public final /* synthetic */ class fs implements Executor {
    public final /* synthetic */ int a;

    public /* synthetic */ fs(int i) {
        this.a = i;
    }

    private final void a(Runnable runnable) {
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                gs.U().o.p.execute(runnable);
                return;
            case 1:
                return;
            default:
                runnable.run();
                return;
        }
    }
}
