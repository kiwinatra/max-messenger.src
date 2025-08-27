package defpackage;

import androidx.fragment.app.b;
import androidx.viewpager.widget.ViewPager;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* renamed from: cg6  reason: default package */
public final /* synthetic */ class cg6 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachVideo b;

    public /* synthetic */ cg6(FrgAttachVideo frgAttachVideo, int i) {
        this.a = i;
        this.b = frgAttachVideo;
    }

    public final void run() {
        ViewPager viewPager;
        v7b r;
        l20 l20;
        switch (this.a) {
            case 0:
                FrgAttachVideo frgAttachVideo = this.b;
                if (frgAttachVideo.o1) {
                    frgAttachVideo.A3();
                    b M1 = frgAttachVideo.M1();
                    if (M1 instanceof hn) {
                        M1.invalidateOptionsMenu();
                    }
                    eg6 k3 = frgAttachVideo.h3();
                    if (k3 != null) {
                        String str = frgAttachVideo.D1.q;
                        ActAttachesView actAttachesView = (ActAttachesView) k3;
                        s20 s20 = actAttachesView.A0;
                        boolean z = false;
                        if (!(s20 == null || (viewPager = actAttachesView.K0) == null || (r = s20.r(viewPager.getCurrentItem())) == null || (l20 = (l20) r.a) == null)) {
                            z = cvg.c(l20.q, str);
                        }
                        if (z && frgAttachVideo.N1 == null) {
                            frgAttachVideo.u3();
                            return;
                        }
                    }
                    frgAttachVideo.y3();
                    return;
                }
                return;
            case 1:
                eg6 k32 = this.b.h3();
                if (k32 != null) {
                    ((ActAttachesView) k32).c();
                    return;
                }
                return;
            default:
                FrgAttachVideo frgAttachVideo2 = this.b;
                if (frgAttachVideo2.D1.d.a == 0) {
                    frgAttachVideo2.q1.r().a(frgAttachVideo2.C1, frgAttachVideo2.D1.q, (rf9) frgAttachVideo2.q1.getAccessor().g(rf9.class));
                    return;
                } else {
                    frgAttachVideo2.y3();
                    return;
                }
        }
    }
}
