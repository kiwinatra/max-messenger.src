package defpackage;

/* renamed from: ai8  reason: default package */
public final class ai8 extends m2 {
    public final /* synthetic */ int b;
    public final zi6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai8(ti8 ti8, zi6 zi6, int i) {
        super(ti8);
        this.b = i;
        this.c = zi6;
    }

    public final void g(pi8 pi8) {
        switch (this.b) {
            case 0:
                this.a.a(new oh8(pi8, this.c));
                return;
            default:
                this.a.a(new ab3(1, pi8, this.c));
                return;
        }
    }
}
