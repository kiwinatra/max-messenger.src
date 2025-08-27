package defpackage;

import com.my.tracker.obfuscated.i2;

/* renamed from: mug  reason: default package */
public final /* synthetic */ class mug implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ mug(i2 i2Var, long j, int i) {
        this.a = i;
        this.b = i2Var;
        this.c = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(this.c);
                return;
            default:
                this.b.d(this.c);
                return;
        }
    }
}
