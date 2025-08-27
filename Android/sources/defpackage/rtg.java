package defpackage;

import com.my.tracker.obfuscated.e0;

/* renamed from: rtg  reason: default package */
public final /* synthetic */ class rtg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ float o;
    public final /* synthetic */ float v;
    public final /* synthetic */ float w;

    public /* synthetic */ rtg(e0 e0Var, long j, float f, float f2, float f3, int i) {
        this.a = i;
        this.b = e0Var;
        this.c = j;
        this.o = f;
        this.v = f2;
        this.w = f3;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c, this.o, this.v, this.w);
                return;
            default:
                this.b.b(this.c, this.o, this.v, this.w);
                return;
        }
    }
}
