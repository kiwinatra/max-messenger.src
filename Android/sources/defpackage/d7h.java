package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: d7h  reason: default package */
public final class d7h {
    public static final Object h = new Object();
    public static d7h i;
    public static HandlerThread j;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile ws9 c;
    public final li3 d;
    public final long e;
    public final long f;
    public volatile Executor g;

    public d7h(Context context, Looper looper) {
        hv hvVar = new hv(3, this);
        this.b = context.getApplicationContext();
        ws9 ws9 = new ws9(looper, (Handler.Callback) hvVar, 5);
        Looper.getMainLooper();
        this.c = ws9;
        this.d = li3.a();
        this.e = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        this.f = 300000;
        this.g = null;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z) {
        g6h g6h = new g6h(str, z);
        vzg.n(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                i6h i6h = (i6h) this.a.get(g6h);
                if (i6h == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(g6h.toString()));
                } else if (i6h.a.containsKey(serviceConnection)) {
                    i6h.a.remove(serviceConnection);
                    if (i6h.a.isEmpty()) {
                        this.c.sendMessageDelayed(this.c.obtainMessage(0, g6h), this.e);
                    }
                } else {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(g6h.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(g6h g6h, m1h m1h, String str) {
        boolean z;
        synchronized (this.a) {
            try {
                i6h i6h = (i6h) this.a.get(g6h);
                Executor executor = this.g;
                if (i6h == null) {
                    i6h = new i6h(this, g6h);
                    i6h.a.put(m1h, m1h);
                    i6h.a(str, executor);
                    this.a.put(g6h, i6h);
                } else {
                    this.c.removeMessages(0, g6h);
                    if (!i6h.a.containsKey(m1h)) {
                        i6h.a.put(m1h, m1h);
                        int i2 = i6h.b;
                        if (i2 == 1) {
                            m1h.onServiceConnected(i6h.w, i6h.o);
                        } else if (i2 == 2) {
                            i6h.a(str, executor);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(g6h.toString()));
                    }
                }
                z = i6h.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
