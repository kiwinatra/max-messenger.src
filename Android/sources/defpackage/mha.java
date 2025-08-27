package defpackage;

/* renamed from: mha  reason: default package */
public final class mha extends r2 {
    public final /* synthetic */ int b;
    public final nsb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mha(oka oka, nsb nsb, int i) {
        super(oka);
        this.b = i;
        this.c = nsb;
    }

    public final void w(cla cla) {
        switch (this.b) {
            case 0:
                this.a.a(new lha(cla, this.c, 0));
                return;
            case 1:
                this.a.a(new qia(cla, this.c, 0));
                return;
            case 2:
                this.a.a(new lha(cla, (aef) this.c, 1));
                return;
            default:
                this.a.a(new lha(cla, this.c, 2));
                return;
        }
    }
}
