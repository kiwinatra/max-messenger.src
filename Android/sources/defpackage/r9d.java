package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: r9d  reason: default package */
public final class r9d {
    public final String a;
    public final voc b;
    public final AtomicLong c = new AtomicLong(1);
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public r9d(voc voc) {
        if (voc != null) {
            this.a = "RtcCommands";
            this.b = voc;
            return;
        }
        throw new IllegalArgumentException("Illegal 'logger' value: null");
    }
}
