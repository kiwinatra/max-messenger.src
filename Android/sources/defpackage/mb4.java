package defpackage;

/* renamed from: mb4  reason: default package */
public final /* synthetic */ class mb4 implements i08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ td b;
    public final /* synthetic */ i70 c;

    public /* synthetic */ mb4(td tdVar, i70 i70, int i) {
        this.a = i;
        this.b = tdVar;
        this.c = i70;
    }

    public final void invoke(Object obj) {
        ud udVar = (ud) obj;
        switch (this.a) {
            case 0:
                udVar.P(this.b, this.c);
                return;
            default:
                udVar.h0(this.b, this.c);
                return;
        }
    }
}
