package defpackage;

import java.util.concurrent.Executor;

/* renamed from: dp4  reason: default package */
public enum dp4 implements Executor {
    ;

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
