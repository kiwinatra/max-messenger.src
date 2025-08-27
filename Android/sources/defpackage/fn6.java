package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: fn6  reason: default package */
public final /* synthetic */ class fn6 implements pqd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fn6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void K(uqd uqd) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                gp6 gp6 = (gp6) obj;
                xag.g(gp6, ((osa) gp6.l()).e().plus(gp6.o), (f14) null, new io6(gp6, uqd, (Continuation) null), 2);
                return;
            default:
                KProperty[] kPropertyArr = GalleryViewModel.S;
                GalleryViewModel galleryViewModel = (GalleryViewModel) obj;
                ev0.v(b0h.C(galleryViewModel), ((osa) galleryViewModel.o()).e().plus(galleryViewModel.h), (f14) null, new ho6(galleryViewModel, uqd, (Continuation) null), 2);
                return;
        }
    }
}
