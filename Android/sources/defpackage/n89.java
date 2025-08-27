package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* renamed from: n89  reason: default package */
public final class n89 extends bj0 {
    public final a89 b;
    public final l20 c;
    public boolean d = false;
    public final /* synthetic */ p89 e;

    public n89(p89 p89, a89 a89, l20 l20) {
        this.e = p89;
        this.b = a89;
        this.c = l20;
    }

    public final void a(String str, k97 k97, Animatable animatable) {
        if (!this.d) {
            boolean z = true;
            this.d = true;
            boolean z2 = k97 instanceof t33;
            l20 l20 = this.c;
            if (z2) {
                m5a.j((t33) k97, l20);
            }
            if (!ld8.T(l20) && !ld8.W(l20) && !l20.n.c()) {
                d20 d20 = d20.c;
                p89 p89 = this.e;
                long j = p89.w0.a.b;
                a89 a89 = this.b;
                if (j != a89.a.b) {
                    z = false;
                }
                p89.S(a89, l20, d20, z);
                if (((qra) p89.a).y().c.g.getBoolean("app.media.save.to.gallery", false)) {
                    p00 p00 = new p00(12, this, k97);
                    p79 p79 = new p79(2);
                    jbf H = ((qra) p89.a).H();
                    H.getClass();
                    jbd.a(p00, ((kbf) H).a(), (x6) null, p79, (lfd) null);
                }
            }
        }
    }

    public final void b(String str, Throwable th) {
        Drawable drawable = p89.W0;
        StringBuilder sb = new StringBuilder("Set photo attach failed, messageId ");
        p89 p89 = this.e;
        sb.append(p89.w0.a.b);
        z68.f("p89", sb.toString(), th);
        if (!(th instanceof NullPointerException)) {
            d20 d20 = d20.o;
            long j = p89.w0.a.b;
            a89 a89 = this.b;
            p89.S(a89, this.c, d20, j == a89.a.b);
        }
    }
}
