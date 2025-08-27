package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.Set;

/* renamed from: yvg  reason: default package */
public final class yvg extends svg implements ft6, gt6 {
    public static final cvg k = cwg.a;
    public final Context d;
    public final Handler e;
    public final cvg f = k;
    public final Set g;
    public final b33 h;
    public f9e i;
    public ce j;

    public yvg(Context context, Handler handler, b33 b33) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.d = context;
        this.e = handler;
        this.h = b33;
        this.g = (Set) b33.b;
    }

    public final void R(int i2) {
        ce ceVar = this.j;
        kvg kvg = (kvg) ((ht6) ceVar.w).X.get((bm) ceVar.c);
        if (kvg == null) {
            return;
        }
        if (kvg.k) {
            kvg.n(new bi3(17));
        } else {
            kvg.R(i2);
        }
    }

    public final void l(bi3 bi3) {
        this.j.t(bi3);
    }

    public final void onConnected() {
        this.i.x(this);
    }
}
