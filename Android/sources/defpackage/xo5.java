package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: xo5  reason: default package */
public final class xo5 extends ThreadPoolExecutor {
    public final void finalize() {
        shutdown();
    }
}
