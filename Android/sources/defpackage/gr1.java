package defpackage;

import java.util.concurrent.Executor;

/* renamed from: gr1  reason: default package */
public final /* synthetic */ class gr1 implements vu, lp8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public /* synthetic */ gr1(Object obj, int i, int i2, int i3) {
        this.o = obj;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public zz7 apply(Object obj) {
        Void voidR = (Void) obj;
        u40 u40 = ((lr1) this.o).n;
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        return hd8.E(new hs1(u40.e(i2, i3, i), (Executor) u40.g, i3));
    }

    public void d(i67 i67, int i) {
        i67 i672 = i67;
        int i2 = i;
        i672.B0(((np8) this.o).c, i2, this.a, this.b, this.c);
    }
}
