package defpackage;

import android.app.Application;
import android.os.Bundle;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: nn6  reason: default package */
public final class nn6 extends i3 {
    public final Application d;

    public nn6(Application application, odd odd, Bundle bundle) {
        super(odd, bundle);
        this.d = application;
    }

    public final yag e(hdd hdd) {
        qra qra = (qra) ym.e();
        h48 s = qra.s();
        hs7 j = hsg.j(new mn6(qra, 0));
        hs7 j2 = hsg.j(new mn6(qra, 1));
        hs7 j3 = hsg.j(new mn6(qra, 2));
        return new GalleryViewModel(this.d, qra.p(), qra.y().b, hdd, qra.o(), (s48) qra.getAccessor().g(s48.class), s, j, j2, j3);
    }
}
