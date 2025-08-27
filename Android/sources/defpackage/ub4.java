package defpackage;

/* renamed from: ub4  reason: default package */
public final /* synthetic */ class ub4 implements i08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ td b;
    public final /* synthetic */ es8 c;

    public /* synthetic */ ub4(td tdVar, es8 es8, int i) {
        this.a = i;
        this.b = tdVar;
        this.c = es8;
    }

    public final void invoke(Object obj) {
        ud udVar = (ud) obj;
        switch (this.a) {
            case 0:
                udVar.D0(this.b, this.c);
                return;
            default:
                udVar.W(this.b, this.c);
                return;
        }
    }
}
