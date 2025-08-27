package defpackage;

/* renamed from: lb4  reason: default package */
public final /* synthetic */ class lb4 implements i08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ td b;
    public final /* synthetic */ ea6 c;

    public /* synthetic */ lb4(td tdVar, ea6 ea6, ea4 ea4, int i) {
        this.a = i;
        this.b = tdVar;
        this.c = ea6;
    }

    public final void invoke(Object obj) {
        ud udVar = (ud) obj;
        switch (this.a) {
            case 0:
                udVar.V(this.b, this.c);
                return;
            default:
                udVar.I(this.b, this.c);
                return;
        }
    }
}
