package defpackage;

import com.my.tracker.obfuscated.i2;

/* renamed from: oug  reason: default package */
public final /* synthetic */ class oug implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i2 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int o;

    public /* synthetic */ oug(i2 i2Var, long j, int i, int i2) {
        this.a = i2;
        this.b = i2Var;
        this.c = j;
        this.o = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(this.c, this.o);
                return;
            case 1:
                this.b.h(this.c, this.o);
                return;
            case 2:
                this.b.e(this.c, this.o);
                return;
            default:
                this.b.f(this.c, this.o);
                return;
        }
    }
}
