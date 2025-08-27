package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: ux3  reason: default package */
public final /* synthetic */ class ux3 implements f9d {
    public final /* synthetic */ zx3 a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ ux3(zx3 zx3, Intent intent, int i, Bundle bundle) {
        this.a = zx3;
        this.b = intent;
        this.c = i;
        this.d = bundle;
    }

    public final void a() {
        zx3 zx3 = this.a;
        zx3.router.V(zx3.instanceId, this.b, this.c, this.d);
    }
}
