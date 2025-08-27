package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ysg  reason: default package */
public final /* synthetic */ class ysg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5h b;
    public final /* synthetic */ n9d c;

    public /* synthetic */ ysg(o5h o5h, n9d n9d, int i) {
        this.a = i;
        this.b = o5h;
        this.c = n9d;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                n9d n9d = this.c;
                o5h o5h = this.b;
                Iterator it = ((CopyOnWriteArrayList) o5h.b).iterator();
                while (it.hasNext()) {
                    r9d r9d = (r9d) it.next();
                    try {
                        r9d.d.put(n9d, Long.valueOf(r9d.c.getAndIncrement()));
                    } catch (Throwable th) {
                        ((voc) o5h.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsubmit", th);
                    }
                }
                return;
            case 1:
                n9d n9d2 = this.c;
                o5h o5h2 = this.b;
                Iterator it2 = ((CopyOnWriteArrayList) o5h2.b).iterator();
                while (it2.hasNext()) {
                    try {
                        ((r9d) it2.next()).d.remove(n9d2);
                    } catch (Throwable th2) {
                        ((voc) o5h2.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandremove", th2);
                    }
                }
                return;
            default:
                n9d n9d3 = this.c;
                o5h o5h3 = this.b;
                Iterator it3 = ((CopyOnWriteArrayList) o5h3.b).iterator();
                while (it3.hasNext()) {
                    r9d r9d2 = (r9d) it3.next();
                    try {
                        Long l = (Long) r9d2.d.get(n9d3);
                        if (l != null) {
                            r9d2.b.log(r9d2.a, "-> [" + l + "]: " + n9d3);
                        }
                    } catch (Throwable th3) {
                        ((voc) o5h3.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsent", th3);
                    }
                }
                return;
        }
    }
}
