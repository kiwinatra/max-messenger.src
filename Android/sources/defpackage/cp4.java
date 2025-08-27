package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cp4  reason: default package */
public enum cp4 implements Executor {
    ;

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final String toString() {
        return "DirectExecutor";
    }
}
