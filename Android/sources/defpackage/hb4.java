package defpackage;

/* renamed from: hb4  reason: default package */
public final /* synthetic */ class hb4 implements i08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ td b;
    public final /* synthetic */ int c;

    public /* synthetic */ hb4(td tdVar, int i, int i2) {
        this.a = i2;
        this.b = tdVar;
        this.c = i;
    }

    public final void invoke(Object obj) {
        ud udVar = (ud) obj;
        switch (this.a) {
            case 0:
                udVar.B0(this.b, this.c);
                return;
            case 1:
                udVar.G(this.b, this.c);
                return;
            case 2:
                udVar.F(this.b, this.c);
                return;
            case 3:
                udVar.L(this.b, this.c);
                return;
            case 4:
                udVar.getClass();
                udVar.j0(this.b, this.c);
                return;
            case 5:
                udVar.U(this.b, this.c);
                return;
            default:
                udVar.Z(this.b, this.c);
                return;
        }
    }

    public /* synthetic */ hb4(td tdVar, int i, long j) {
        this.a = 1;
        this.b = tdVar;
        this.c = i;
    }

    public /* synthetic */ hb4(td tdVar, ir8 ir8, int i) {
        this.a = 6;
        this.b = tdVar;
        this.c = i;
    }
}
