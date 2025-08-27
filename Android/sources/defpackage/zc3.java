package defpackage;

import java.util.concurrent.Executor;

/* renamed from: zc3  reason: default package */
public final /* synthetic */ class zc3 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ iw6 b;

    public /* synthetic */ zc3(iw6 iw6, int i) {
        this.a = i;
        this.b = iw6;
    }

    public final void execute(Runnable runnable) {
        int i = this.a;
        ((k7f) this.b).d(runnable);
    }
}
