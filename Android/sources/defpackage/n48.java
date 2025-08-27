package defpackage;

import java.io.File;
import kotlin.Lazy;

/* renamed from: n48  reason: default package */
public final class n48 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public n48(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [o48, java.lang.Object, m00] */
    public final o48 a(b58 b58, d48 d48) {
        boolean z = d48 instanceof k00;
        Lazy lazy = this.b;
        Lazy lazy2 = this.a;
        if (!z) {
            return new o48(b58, (sqd) lazy2.getValue(), (jbf) lazy.getValue(), d48);
        }
        sqd sqd = (sqd) lazy2.getValue();
        k00 k00 = (k00) d48;
        sz szVar = (sz) this.c.getValue();
        ? o48 = new o48(b58, sqd, (jbf) lazy.getValue(), k00);
        String str = k00.X.r;
        if (str == null || str.length() == 0) {
            z68.c("m00", "Start download attach", new Object[0]);
            b58.U0(true);
            srd a2 = szVar.a(k00.X);
            a2.O(new ba(1, o48, k00), new d9d(6, o48));
            o48.w = a2;
            return o48;
        }
        sqd.r(k00, new File(k00.X.r));
        b58.U0(false);
        return o48;
    }
}
