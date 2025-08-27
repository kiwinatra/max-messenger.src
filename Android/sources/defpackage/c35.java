package defpackage;

import java.util.List;
import kotlin.Lazy;

/* renamed from: c35  reason: default package */
public final class c35 extends q15 implements u25 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public w15 d;
    public o35 e;
    public boolean f;

    public c35(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    public final List a(CharSequence charSequence) {
        return j().a(charSequence);
    }

    public final CharSequence c(CharSequence charSequence) {
        return j().c(charSequence);
    }

    public final List d(CharSequence charSequence) {
        return j().d(charSequence);
    }

    public final boolean f(CharSequence charSequence) {
        return j().f(charSequence);
    }

    public final boolean g(CharSequence charSequence, int i) {
        return j().g(charSequence, i);
    }

    public final void h(Throwable th) {
        w25 w25;
        Lazy lazy = this.b;
        if (lazy != null && (w25 = (w25) lazy.getValue()) != null) {
            ((uta) ((m95) w25.e.getValue())).c(new Exception("Can't load emoji", th), true);
        }
    }

    public final void i() {
        w25 w25;
        this.d = new w15(s15.a());
        this.f = true;
        Lazy lazy = this.b;
        if (lazy != null && (w25 = (w25) lazy.getValue()) != null) {
            ((kbf) ((jbf) w25.d.getValue())).a().c(new ne4(17, w25));
            t25 t25 = (t25) w25.f.getValue();
            if (t25.d == null) {
                z68.c("t25", "invalidate: palette is null. Ignore", new Object[0]);
                return;
            }
            z68.c("t25", "invalidate", new Object[0]);
            new yia(jha.n(t25.d), new s25(t25, 0), 1).B().n(((kbf) t25.b).a()).l(new ao1(3, new s25(t25, 1), new lw4(3)));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [o35, java.lang.Object] */
    public final u25 j() {
        w15 w15 = this.d;
        if (w15 != null) {
            return w15;
        }
        if (this.e == null) {
            this.e = new Object();
        }
        return this.e;
    }
}
