package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gp5  reason: default package */
public final class gp5 extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public final Context a;

    public gp5(Context context) {
        this.a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (hp5.j) {
            try {
                Iterator it = ((ss) hp5.k.values()).iterator();
                while (it.hasNext()) {
                    ((hp5) it.next()).d();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.a.unregisterReceiver(this);
    }
}
