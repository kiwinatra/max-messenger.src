package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: c3d  reason: default package */
public final class c3d implements ThreadFactory {
    public String a;
    public int b;

    public final Thread newThread(Runnable runnable) {
        return new b3d(runnable, this.a, this.b);
    }
}
