package defpackage;

/* renamed from: ck4  reason: default package */
public final /* synthetic */ class ck4 implements t5g {
    public final /* synthetic */ int a;
    public final /* synthetic */ gk4 b;
    public final /* synthetic */ cs c;

    public /* synthetic */ ck4(gk4 gk4, cs csVar, int i) {
        this.a = i;
        this.b = gk4;
        this.c = csVar;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(this.c, true);
                return;
            default:
                this.b.a(this.c, false);
                return;
        }
    }
}
