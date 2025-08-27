package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* renamed from: x6f  reason: default package */
public final class x6f implements Runnable {
    public final /* synthetic */ int a;
    public final z6f b;

    public /* synthetic */ x6f(z6f z6f, int i) {
        this.a = i;
        this.b = z6f;
    }

    public final void run() {
        ky6 ky6;
        x6f x6f;
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                synchronized (this.b.x) {
                    z6f z6f = this.b;
                    z6f.y = (Intent) z6f.x.get(0);
                }
                Intent intent = this.b.y;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.b.y.getIntExtra("KEY_START_ID", 0);
                    h88 x = h88.x();
                    String str = z6f.X;
                    x.p(str, "Processing command " + this.b.y + ", " + intExtra);
                    PowerManager.WakeLock a2 = teg.a(this.b.a, action + " (" + intExtra + ")");
                    try {
                        h88.x().p(str, "Acquiring operation wake lock (" + action + ") " + a2);
                        a2.acquire();
                        z6f z6f2 = this.b;
                        z6f2.w.a(z6f2.y, intExtra, z6f2);
                        h88.x().p(str, "Releasing operation wake lock (" + action + ") " + a2);
                        a2.release();
                        z6f z6f3 = this.b;
                        ky6 = (ky6) ((g6d) z6f3.b).o;
                        x6f = new x6f(z6f3, 1);
                    } catch (Throwable th) {
                        h88.x().p(z6f.X, "Releasing operation wake lock (" + action + ") " + a2);
                        a2.release();
                        z6f z6f4 = this.b;
                        ((ky6) ((g6d) z6f4.b).o).execute(new x6f(z6f4, 1));
                        throw th;
                    }
                    ky6.execute(x6f);
                    return;
                }
                return;
            default:
                z6f z6f5 = this.b;
                z6f5.getClass();
                h88 x2 = h88.x();
                String str2 = z6f.X;
                x2.p(str2, "Checking if commands are complete.");
                z6f.c();
                synchronized (z6f5.x) {
                    try {
                        if (z6f5.y != null) {
                            h88.x().p(str2, "Removing command " + z6f5.y);
                            if (((Intent) z6f5.x.remove(0)).equals(z6f5.y)) {
                                z6f5.y = null;
                            } else {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                        }
                        qn qnVar = (qn) ((g6d) z6f5.b).b;
                        f63 f63 = z6f5.w;
                        synchronized (f63.c) {
                            z = !f63.b.isEmpty();
                        }
                        if (!z) {
                            if (z6f5.x.isEmpty()) {
                                synchronized (qnVar.v) {
                                    z2 = !qnVar.b.isEmpty();
                                }
                                if (!z2) {
                                    h88.x().p(str2, "No more commands & intents.");
                                    y6f y6f = z6f5.z;
                                    if (y6f != null) {
                                        ((SystemAlarmService) y6f).a();
                                    }
                                }
                            }
                        }
                        if (!z6f5.x.isEmpty()) {
                            z6f5.d();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }
}
