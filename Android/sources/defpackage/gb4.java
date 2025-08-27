package defpackage;

/* renamed from: gb4  reason: default package */
public final /* synthetic */ class gb4 implements i08 {
    public final /* synthetic */ int a;
    public final /* synthetic */ td b;
    public final /* synthetic */ String c;

    public /* synthetic */ gb4(td tdVar, String str, int i) {
        this.a = i;
        this.b = tdVar;
        this.c = str;
    }

    public final void invoke(Object obj) {
        ud udVar = (ud) obj;
        switch (this.a) {
            case 0:
                udVar.getClass();
                udVar.D(this.b, this.c);
                return;
            case 1:
                udVar.g0(this.b, this.c);
                return;
            case 2:
                udVar.getClass();
                udVar.v0(this.b, this.c);
                return;
            default:
                udVar.y(this.b, this.c);
                return;
        }
    }

    public /* synthetic */ gb4(td tdVar, String str, long j, long j2, int i) {
        this.a = i;
        this.b = tdVar;
        this.c = str;
    }
}
