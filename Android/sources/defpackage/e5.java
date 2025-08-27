package defpackage;

import androidx.fragment.app.a;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.attaches.fragments.FrgAttachUnknown;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;

/* renamed from: e5  reason: default package */
public final class e5 implements rbg {
    public final /* synthetic */ int a;
    public final /* synthetic */ o5 b;

    public /* synthetic */ e5(o5 o5Var, int i) {
        this.a = i;
        this.b = o5Var;
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(float f, int i) {
    }

    private final void d(float f, int i) {
    }

    public final void f(float f, int i) {
        int i2 = this.a;
    }

    public final void l(int i) {
        int i2 = this.a;
    }

    public final void m(int i) {
        switch (this.a) {
            case 0:
                ActAttachesView actAttachesView = (ActAttachesView) this.b;
                s20 s20 = actAttachesView.A0;
                if (s20 != null) {
                    if (s20.j.indexOf(actAttachesView.L0) != i) {
                        FrgAttachView q = actAttachesView.A0.q(actAttachesView.L0);
                        if (q instanceof FrgAttachVideo) {
                            ((FrgAttachVideo) q).v3();
                        }
                        s20 s202 = actAttachesView.A0;
                        a aVar = (a) s202.g.get(s202.n(i));
                        if (aVar instanceof FrgAttachVideo) {
                            ((FrgAttachVideo) aVar).u3();
                        }
                        v7b r = actAttachesView.A0.r(i);
                        if (r != null) {
                            actAttachesView.L0 = ((l20) r.a).q;
                            actAttachesView.J0 = false;
                            actAttachesView.e0();
                            actAttachesView.g0();
                            FrgAttachView q2 = actAttachesView.A0.q(actAttachesView.L0);
                            String str = q2 instanceof FrgAttachPhoto ? "ATTACH_PHOTO" : q2 instanceof FrgAttachVideo ? "ATTACH_VIDEO" : q2 instanceof FrgAttachUnknown ? "ATTACH_UNKNOWN" : null;
                            if (!cvg.A(str)) {
                                z68.c("ru.ok.messages.media.attaches.ActAttachesView", "sendFragmentStats: " + str, new Object[0]);
                                ((qra) ym.e()).c().e(str);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ((ActContactAvatars) this.b).m(i);
                return;
        }
    }
}
