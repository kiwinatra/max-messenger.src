package defpackage;

import kotlin.Lazy;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* renamed from: f2g  reason: default package */
public final class f2g implements SystemServicesManager$PushTokenGeneratedListener {
    public final Lazy a;
    public final Lazy b;

    public f2g(q4 q4Var) {
        this.a = q4Var.h(doa.class);
        this.b = q4Var.h(rl.class);
    }

    public final void onPushTokenGenerated(String str) {
        zq0 d = ((doa) this.a.getValue()).d();
        if (d.a && !d.b) {
            ((jna) ((rl) this.b.getValue())).v();
        }
    }
}
