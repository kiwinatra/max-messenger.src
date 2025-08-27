package defpackage;

import java.util.HashMap;

/* renamed from: dqg  reason: default package */
public final class dqg {
    public static final String e = h88.V("WorkTimer");
    public final grg a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    public dqg(grg grg) {
        this.a = grg;
    }

    public final void a(wog wog) {
        synchronized (this.d) {
            try {
                if (((cqg) this.b.remove(wog)) != null) {
                    h88 x = h88.x();
                    String str = e;
                    x.p(str, "Stopping timer for " + wog);
                    this.c.remove(wog);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
