package defpackage;

import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: a1a  reason: default package */
public final /* synthetic */ class a1a implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1a b;

    public /* synthetic */ a1a(b1a b1a, int i) {
        this.a = i;
        this.b = b1a;
    }

    public final void accept(Object obj) {
        hi6 h3;
        switch (this.a) {
            case 0:
                b1a b1a = this.b;
                f4g f4g = (f4g) obj;
                ((m48) b1a.b).t(f4g, b1a);
                r7g a2 = b1a.y.a();
                a2.j = ((ol0) f4g).a;
                a2.n = f4g;
                r7g r7g = new r7g(a2);
                b1a.y = r7g;
                o4a o4a = (o4a) b1a.a;
                o4a.m(r7g);
                o4a.i(b1a);
                return;
            case 1:
                Throwable th = (Throwable) obj;
                FrgLocalVideo frgLocalVideo = this.b.w;
                if (frgLocalVideo != null) {
                    frgLocalVideo.W0(th);
                    return;
                }
                return;
            case 2:
                Long l = (Long) obj;
                b1a b1a2 = this.b;
                kj8 kj8 = b1a2.Z;
                if (kj8 != null) {
                    ActLocalMedias actLocalMedias = (ActLocalMedias) kj8;
                    if (actLocalMedias.J0.O0.isFocused() && actLocalMedias.K0.b.w) {
                        return;
                    }
                }
                r7g a3 = b1a2.y.a();
                a3.a = false;
                r7g r7g2 = new r7g(a3);
                b1a2.y = r7g2;
                ((o4a) b1a2.a).m(r7g2);
                FrgLocalVideo frgLocalVideo2 = b1a2.w;
                if (frgLocalVideo2 != null && (h3 = frgLocalVideo2.h3()) != null) {
                    h3.b(false, true, false);
                    return;
                }
                return;
            default:
                Long l2 = (Long) obj;
                b1a b1a3 = this.b;
                r7g a4 = b1a3.y.a();
                m48 m48 = (m48) b1a3.b;
                a4.k = m48.f();
                a4.l = m48.d();
                r7g r7g3 = new r7g(a4);
                b1a3.y = r7g3;
                ((o4a) b1a3.a).m(r7g3);
                return;
        }
    }
}
