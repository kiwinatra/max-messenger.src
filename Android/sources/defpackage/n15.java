package defpackage;

import android.os.Build;
import java.util.Set;

/* renamed from: n15  reason: default package */
public final class n15 extends kv0 {
    public final /* synthetic */ o15 i;

    public n15(o15 o15) {
        this.i = o15;
    }

    public final void U(Throwable th) {
        ((s15) this.i.a).e(th);
    }

    public final void V(gq9 gq9) {
        o15 o15 = this.i;
        if (gq9 == null) {
            ((s15) o15.a).e(new IllegalArgumentException("metadataRepo cannot be null"));
            return;
        }
        o15.c = gq9;
        gq9 gq92 = (gq9) o15.c;
        s15 s15 = (s15) o15.a;
        o15.b = new pv0(gq92, s15.g, (p15) s15.n, s15.i, s15.j, (Set) Build.VERSION.SDK_INT >= 34 ? a25.a() : n54.i());
        ((s15) o15.a).f();
    }
}
