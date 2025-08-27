package defpackage;

/* renamed from: di8  reason: default package */
public final class di8 extends m2 {
    public final /* synthetic */ int b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ di8(ti8 ti8, int i) {
        super(ti8);
        this.b = i;
    }

    public final void g(pi8 pi8) {
        switch (this.b) {
            case 0:
                this.a.a(new ci8(pi8, 1));
                return;
            default:
                this.a.a(new ci8(pi8, 2));
                return;
        }
    }
}
