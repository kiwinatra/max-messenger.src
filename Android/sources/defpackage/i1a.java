package defpackage;

import android.text.Editable;
import kotlin.Lazy;
import ru.ok.messages.stickers.FrgGifsLoader;
import ru.ok.messages.stickers.FrgStickersLoader;

/* renamed from: i1a  reason: default package */
public final class i1a {
    public final k0a a;
    public final yva b;
    public final p1a c;
    public final h1a d;
    public final a2a e;
    public final k1a f;
    public final Lazy g;

    public i1a(k0a k0a, tff tff, FrgStickersLoader frgStickersLoader, FrgGifsLoader frgGifsLoader, mre mre, ni3 ni3, e4 e4Var, jd8 jd8, ltb ltb, h48 h48, moe moe, yva yva, jbf jbf, ai5 ai5, ve4 ve4, Lazy lazy) {
        ltb ltb2 = ltb;
        this.a = k0a;
        this.b = yva;
        tff tff2 = tff;
        this.c = new p1a(this, tff, ltb2);
        hq hqVar = ltb2.c;
        this.d = new h1a(ve4, this);
        this.e = new a2a(this, frgStickersLoader, frgGifsLoader, mre, jd8, moe, ai5, jbf);
        this.f = new k1a(this, jd8, ni3, e4Var, h48);
        this.g = lazy;
    }

    public final void a() {
        k1a k1a = this.f;
        k1a.getClass();
        f2a f2a = k1a.a;
        if (f2a != null) {
            ((i3a) f2a).a0((Runnable) null, false);
        }
    }

    public final void b(boolean z) {
        p1a p1a = this.c;
        sff a2 = p1a.o.a();
        a2.m = z;
        p1a.o = new tff(a2);
        f2a f2a = p1a.a;
        if (f2a != null) {
            ((s3a) f2a).Z(p1a.o);
        }
    }

    public final void c() {
        this.a.b.getClass();
        throw null;
    }

    public final void d() {
        k0a k0a = this.a;
        int c2 = ((qra) k0a.b.x).s().f.c();
        k0a.getClass();
        p1a p1a = this.c;
        Editable text = ((s3a) p1a.a).X.getText();
        boolean z = (text != null && !cvg.A(text.toString().trim())) || c2 > 0;
        sff a2 = p1a.o.a();
        a2.a = z;
        a2.l = !z;
        a2.b = c2;
        p1a.o = new tff(a2);
        f2a f2a = p1a.a;
        if (f2a != null) {
            ((s3a) f2a).Z(p1a.o);
        }
    }
}
