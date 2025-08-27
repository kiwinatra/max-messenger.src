package defpackage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: gn6  reason: default package */
public final /* synthetic */ class gn6 implements qqd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gn6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void N(Set set) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                gp6 gp6 = (gp6) obj;
                xme xme = gp6.Y;
                Boolean valueOf = Boolean.valueOf(set.size() >= 100);
                xme.getClass();
                xme.m((Object) null, valueOf);
                int size = set.size();
                z68.c("gp6", "onSelectedMediasChangeListener(), selectedCount " + size, new Object[0]);
                if (!set.isEmpty()) {
                    aje aje = gp6.J0;
                    if (aje != null) {
                        aje.b((CancellationException) null);
                    }
                    gp6.J0 = xag.g(gp6, gp6.o, (f14) null, new mo6(gp6, set, (Continuation) null), 2);
                } else {
                    gp6.k(gp6, false, 1);
                }
                ArrayList v = vzg.v(gp6.D0);
                om6 om6 = gp6.w;
                om6.getClass();
                xag.h(om6.c, new im6(v));
                return;
            default:
                KProperty[] kPropertyArr = GalleryViewModel.S;
                GalleryViewModel galleryViewModel = (GalleryViewModel) obj;
                if (set.isEmpty()) {
                    galleryViewModel.l(true);
                    return;
                }
                aje aje2 = galleryViewModel.K;
                if (aje2 != null) {
                    aje2.b((CancellationException) null);
                }
                galleryViewModel.K = ev0.v(b0h.C(galleryViewModel), galleryViewModel.h, (f14) null, new lo6(set, (Continuation) null, galleryViewModel), 2);
                return;
        }
    }
}
