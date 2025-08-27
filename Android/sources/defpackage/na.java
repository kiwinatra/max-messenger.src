package defpackage;

/* renamed from: na  reason: default package */
public final class na extends hl4 {
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ na(zi0 zi0, int i) {
        super(zi0);
        this.c = i;
    }

    public final void h(int i, Object obj) {
        switch (this.c) {
            case 0:
                j55 j55 = (j55) obj;
                zi0 zi0 = this.b;
                if (j55 == null) {
                    zi0.g(i, (Object) null);
                    return;
                }
                if (!j55.V(j55)) {
                    j55.U();
                }
                zi0.g(i, j55);
                return;
            case 1:
                y33 y33 = (y33) obj;
                if (!zi0.b(i)) {
                    this.b.g(i, y33);
                    return;
                }
                return;
            case 2:
                j55 j552 = (j55) obj;
                y33 y332 = null;
                try {
                    if (j55.k0(j552) && j552 != null) {
                        y332 = y33.o(j552.a);
                    }
                    this.b.g(i, y332);
                    return;
                } finally {
                    y33.U(y332);
                }
            default:
                if (zi0.a(i)) {
                    this.b.g(i, (Object) null);
                    return;
                }
                return;
        }
    }
}
