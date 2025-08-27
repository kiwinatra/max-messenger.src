package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: qg  reason: default package */
public final /* synthetic */ class qg implements ThreadFactory {
    public final /* synthetic */ int a;

    public /* synthetic */ qg(int i) {
        this.a = i;
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setPriority(1);
                return thread;
            default:
                return new Thread(runnable, "tracer-scheduler");
        }
    }
}
