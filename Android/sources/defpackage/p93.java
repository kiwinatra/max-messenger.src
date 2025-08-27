package defpackage;

/* renamed from: p93  reason: default package */
public final class p93 extends r93 {
    public final /* synthetic */ int v;
    public final /* synthetic */ t93 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p93(t93 t93, int i) {
        super(t93);
        this.v = i;
        this.w = t93;
    }

    public final Object a(int i) {
        switch (this.v) {
            case 0:
                return this.w.i()[i];
            case 1:
                return new s93(this.w, i);
            default:
                return this.w.j()[i];
        }
    }
}
