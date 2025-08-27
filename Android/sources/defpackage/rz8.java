package defpackage;

/* renamed from: rz8  reason: default package */
public final /* synthetic */ class rz8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cs b;
    public final /* synthetic */ wz8 c;
    public final /* synthetic */ l28 o;
    public final /* synthetic */ es8 v;

    public /* synthetic */ rz8(cs csVar, wz8 wz8, l28 l28, es8 es8, int i) {
        this.a = i;
        this.b = csVar;
        this.c = wz8;
        this.o = l28;
        this.v = es8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                cs csVar = this.b;
                this.c.A(csVar.b, (nz8) csVar.c, this.o, this.v);
                return;
            case 1:
                cs csVar2 = this.b;
                this.c.v(csVar2.b, (nz8) csVar2.c, this.o, this.v);
                return;
            default:
                cs csVar3 = this.b;
                this.c.s(csVar3.b, (nz8) csVar3.c, this.o, this.v);
                return;
        }
    }
}
