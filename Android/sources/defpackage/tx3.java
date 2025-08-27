package defpackage;

import android.content.Intent;

/* renamed from: tx3  reason: default package */
public final /* synthetic */ class tx3 implements f9d {
    public final /* synthetic */ int a;
    public final /* synthetic */ zx3 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Cloneable d;

    public /* synthetic */ tx3(zx3 zx3, Cloneable cloneable, int i, int i2) {
        this.a = i2;
        this.b = zx3;
        this.d = cloneable;
        this.c = i;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                zx3 zx3 = this.b;
                zx3.router.U(zx3.instanceId, (Intent) this.d, this.c);
                return;
            default:
                zx3 zx32 = this.b;
                zx32.router.M(zx32.instanceId, (String[]) this.d, this.c);
                return;
        }
    }
}
