package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: hw6  reason: default package */
public final class hw6 extends lfd {
    public final Handler c;
    public final boolean d = true;

    public hw6(Handler handler) {
        this.c = handler;
    }

    public final jfd b() {
        return new fw6(this.c, this.d);
    }

    public final mq4 d(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            Handler handler = this.c;
            gw6 gw6 = new gw6(handler, runnable);
            Message obtain = Message.obtain(handler, gw6);
            if (this.d) {
                obtain.setAsynchronous(true);
            }
            handler.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            return gw6;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
