package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: zsg  reason: default package */
public final /* synthetic */ class zsg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5h b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int o;

    public /* synthetic */ zsg(o5h o5h, byte[] bArr, int i, int i2) {
        this.a = i2;
        this.b = o5h;
        this.c = bArr;
        this.o = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                int i = this.o;
                o5h o5h = this.b;
                Iterator it = ((CopyOnWriteArrayList) o5h.b).iterator();
                while (it.hasNext()) {
                    r9d r9d = (r9d) it.next();
                    try {
                        r9d.getClass();
                        int i2 = nsg.a[tr1.y(i)];
                        byte[] bArr = this.c;
                        r9d.b.log(r9d.a, "<- ".concat(i2 != 1 ? i2 != 2 ? "<unknown>" : fy6.a(bArr) : new String(bArr)));
                    } catch (Throwable th) {
                        ((voc) o5h.a).reportException("CallsListeners", "rtc.command.handle.listeners.ondatareceive", th);
                    }
                }
                return;
            default:
                int i3 = this.o;
                o5h o5h2 = this.b;
                Iterator it2 = ((CopyOnWriteArrayList) o5h2.b).iterator();
                while (it2.hasNext()) {
                    r9d r9d2 = (r9d) it2.next();
                    try {
                        r9d2.getClass();
                        int i4 = nsg.a[tr1.y(i3)];
                        byte[] bArr2 = this.c;
                        r9d2.b.log(r9d2.a, "-> ".concat(i4 != 1 ? i4 != 2 ? "<unknown>" : fy6.a(bArr2) : new String(bArr2)));
                    } catch (Throwable th2) {
                        ((voc) o5h2.a).reportException("CallsListeners", "rtc.command.handle.listeners.ondatasend", th2);
                    }
                }
                return;
        }
    }
}
