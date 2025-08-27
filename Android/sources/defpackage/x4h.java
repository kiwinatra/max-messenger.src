package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* renamed from: x4h  reason: default package */
public abstract class x4h {
    public static final cs a = new cs("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        u6h.r(context).h();
        Set set = mvg.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            synchronized (ht6.z0) {
                try {
                    ht6 ht6 = ht6.A0;
                    if (ht6 != null) {
                        ht6.z.incrementAndGet();
                        ws9 ws9 = ht6.v0;
                        ws9.sendMessageAtFrontOfQueue(ws9.obtainMessage(10));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ((mvg) it.next()).getClass();
        throw new UnsupportedOperationException();
    }
}
