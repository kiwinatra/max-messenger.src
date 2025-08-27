package defpackage;

/* renamed from: qz8  reason: default package */
public final /* synthetic */ class qz8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uz8 b;
    public final /* synthetic */ vz8 c;
    public final /* synthetic */ k28 o;
    public final /* synthetic */ es8 v;

    public /* synthetic */ qz8(uz8 uz8, vz8 vz8, k28 k28, es8 es8, int i) {
        this.a = i;
        this.b = uz8;
        this.c = vz8;
        this.o = k28;
        this.v = es8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                uz8 uz8 = this.b;
                this.c.L(uz8.a, uz8.b, this.o, this.v);
                return;
            case 1:
                uz8 uz82 = this.b;
                this.c.K(uz82.a, uz82.b, this.o, this.v);
                return;
            default:
                uz8 uz83 = this.b;
                this.c.a(uz83.a, uz83.b, this.o, this.v);
                return;
        }
    }
}
