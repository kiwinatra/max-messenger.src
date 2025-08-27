package defpackage;

import com.my.tracker.obfuscated.e0;

/* renamed from: xtg  reason: default package */
public final /* synthetic */ class xtg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float o;

    public /* synthetic */ xtg(e0 e0Var, long j, float f, int i) {
        this.a = i;
        this.b = e0Var;
        this.c = j;
        this.o = f;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c, this.o);
                return;
            case 1:
                this.b.b(this.c, this.o);
                return;
            default:
                this.b.c(this.c, this.o);
                return;
        }
    }
}
