package defpackage;

import android.util.Size;
import android.view.Surface;

/* renamed from: za7  reason: default package */
public final class za7 extends lk4 {
    public final /* synthetic */ int n = 0;
    public final Object o;

    public za7(Surface surface, Size size, int i) {
        super(size, i);
        this.o = surface;
    }

    public final zz7 e() {
        switch (this.n) {
            case 0:
                return hd8.E((Surface) this.o);
            default:
                return ((z3f) this.o).g;
        }
    }

    public za7(Surface surface) {
        super(lk4.k, 0);
        this.o = surface;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public za7(z3f z3f, Size size) {
        super(size, 34);
        this.o = z3f;
    }
}
