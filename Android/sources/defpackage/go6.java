package defpackage;

import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: go6  reason: default package */
public final class go6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ go6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(uqd uqd) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                GalleryViewModel galleryViewModel = (GalleryViewModel) obj;
                if (!galleryViewModel.F) {
                    galleryViewModel.s(cvg.N(uqd.a), true, false);
                    return;
                }
                return;
            default:
                z68.c("gp6", "onMediaDeselect()", new Object[0]);
                gp6 gp6 = (gp6) obj;
                if (!gp6.E0) {
                    gp6.n(cvg.N(uqd.a), false);
                    return;
                }
                return;
        }
    }

    public final void b(uqd uqd) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                GalleryViewModel galleryViewModel = (GalleryViewModel) obj;
                if (!galleryViewModel.F) {
                    galleryViewModel.s(cvg.N(uqd.a), true, false);
                    return;
                }
                return;
            default:
                z68.c("gp6", "onMediaSelect()", new Object[0]);
                gp6 gp6 = (gp6) obj;
                if (!gp6.E0) {
                    gp6.n(cvg.N(uqd.a), false);
                    return;
                }
                return;
        }
    }
}
