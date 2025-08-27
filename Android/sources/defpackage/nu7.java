package defpackage;

import java.util.HashMap;
import java.util.Set;

/* renamed from: nu7  reason: default package */
public final class nu7 implements fv7 {
    public final pk4 a;
    public final jv7 b;

    public nu7(jv7 jv7, pk4 pk4) {
        this.b = jv7;
        this.a = pk4;
    }

    @mma(hu7.ON_DESTROY)
    public void onDestroy(jv7 jv7) {
        pk4 pk4 = this.a;
        synchronized (pk4.a) {
            try {
                nu7 y = pk4.y(jv7);
                if (y != null) {
                    pk4.G(jv7);
                    for (hb0 remove : (Set) ((HashMap) pk4.c).get(y)) {
                        ((HashMap) pk4.b).remove(remove);
                    }
                    ((HashMap) pk4.c).remove(y);
                    y.b.getLifecycle().b(y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @mma(hu7.ON_START)
    public void onStart(jv7 jv7) {
        this.a.F(jv7);
    }

    @mma(hu7.ON_STOP)
    public void onStop(jv7 jv7) {
        this.a.G(jv7);
    }
}
