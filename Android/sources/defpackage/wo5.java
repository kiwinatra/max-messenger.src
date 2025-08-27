package defpackage;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: wo5  reason: default package */
public final class wo5 extends ScheduledThreadPoolExecutor {
    public final void finalize() {
        shutdown();
    }
}
