package defpackage;

/* renamed from: h0  reason: default package */
public final class h0 implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ r74 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ i0 o;

    public h0(i0 i0Var, boolean z, r74 r74, boolean z2) {
        this.o = i0Var;
        this.a = z;
        this.b = r74;
        this.c = z2;
    }

    public final void run() {
        boolean z = this.a;
        i0 i0Var = this.o;
        r74 r74 = this.b;
        if (z) {
            r74.c(i0Var);
        } else if (this.c) {
            r74.d();
        } else {
            r74.a(i0Var);
        }
    }
}
