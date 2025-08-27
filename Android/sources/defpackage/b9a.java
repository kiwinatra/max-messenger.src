package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: b9a  reason: default package */
public final class b9a extends lfd {
    public static final hbd d = new hbd("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);
    public final ThreadFactory c = d;

    public final jfd b() {
        return new c9a(this.c);
    }
}
