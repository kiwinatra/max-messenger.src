package defpackage;

/* renamed from: mk8  reason: default package */
public final /* synthetic */ class mk8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object o;

    public /* synthetic */ mk8(Object obj, boolean z, int i, int i2) {
        this.a = i2;
        this.o = obj;
        this.b = z;
        this.c = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((ok8) ((hk3) this.o).b).S0.s(this.c, this.b, false);
                return;
            default:
                ((m0a) this.o).Y(this.c, this.b);
                return;
        }
    }
}
