package defpackage;

import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: r69  reason: default package */
public final class r69 {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final HashMap c = new HashMap();

    public r69(Runnable runnable) {
        this.a = runnable;
    }

    public final boolean a(MenuItem menuItem) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((vc6) ((j79) it.next())).a.p(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void b(j79 j79) {
        this.b.remove(j79);
        q69 q69 = (q69) this.c.remove(j79);
        if (q69 != null) {
            q69.a.b(q69.b);
            q69.b = null;
        }
        this.a.run();
    }
}
