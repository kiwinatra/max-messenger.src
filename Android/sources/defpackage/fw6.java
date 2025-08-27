package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: fw6  reason: default package */
public final class fw6 extends jfd {
    public final Handler a;
    public final boolean b;
    public volatile boolean c;

    public fw6(Handler handler, boolean z) {
        this.a = handler;
        this.b = z;
    }

    public final mq4 b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            boolean z = this.c;
            p45 p45 = p45.a;
            if (z) {
                return p45;
            }
            Handler handler = this.a;
            gw6 gw6 = new gw6(handler, runnable);
            Message obtain = Message.obtain(handler, gw6);
            obtain.obj = this;
            if (this.b) {
                obtain.setAsynchronous(true);
            }
            this.a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.c) {
                return gw6;
            }
            this.a.removeCallbacks(gw6);
            return p45;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public final void dispose() {
        this.c = true;
        this.a.removeCallbacksAndMessages(this);
    }

    public final boolean f() {
        return this.c;
    }
}
