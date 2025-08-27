package defpackage;

/* renamed from: pka  reason: default package */
public final class pka extends r2 {
    public final /* synthetic */ int b;
    public final lfd c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pka(oka oka, lfd lfd, int i) {
        super(oka);
        this.b = i;
        this.c = lfd;
    }

    public final void w(cla cla) {
        switch (this.b) {
            case 0:
                ao1 ao1 = new ao1(cla);
                cla.c(ao1);
                qq4.e(ao1, this.c.c(new vj6((Object) this, (Object) ao1, false, 12)));
                return;
            default:
                this.a.a(new bla(cla, (ea5) this.c));
                return;
        }
    }
}
