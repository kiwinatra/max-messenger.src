package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: gs  reason: default package */
public final class gs extends kne {
    public static volatile gs p;
    public static final fs q = new fs(0);
    public final ui4 o = new ui4();

    public gs() {
        super(20);
    }

    public static gs U() {
        if (p != null) {
            return p;
        }
        synchronized (gs.class) {
            try {
                if (p == null) {
                    p = new gs();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return p;
    }

    public final void V(Runnable runnable) {
        ui4 ui4 = this.o;
        if (ui4.q == null) {
            synchronized (ui4.o) {
                try {
                    if (ui4.q == null) {
                        ui4.q = Handler.createAsync(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        ui4.q.post(runnable);
    }
}
