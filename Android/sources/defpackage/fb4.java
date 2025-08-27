package defpackage;

/* renamed from: fb4  reason: default package */
public final /* synthetic */ class fb4 implements i08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ td b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fb4(td tdVar, boolean z, int i) {
        this.a = i;
        this.b = tdVar;
        this.c = z;
    }

    public final void invoke(Object obj) {
        ud udVar = (ud) obj;
        switch (this.a) {
            case 0:
                udVar.u(this.b, this.c);
                return;
            case 1:
                udVar.A(this.b, this.c);
                return;
            case 2:
                udVar.s(this.b, this.c);
                return;
            default:
                udVar.getClass();
                udVar.x0(this.b, this.c);
                return;
        }
    }
}
