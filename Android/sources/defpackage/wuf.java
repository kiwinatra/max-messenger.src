package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: wuf  reason: default package */
public enum wuf implements Executor {
    ;
    
    public static final Handler b = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, wuf] */
    static {
        b = new Handler(Looper.getMainLooper());
    }

    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
