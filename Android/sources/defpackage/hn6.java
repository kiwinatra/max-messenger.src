package defpackage;

import kotlin.reflect.KProperty;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: hn6  reason: default package */
public final /* synthetic */ class hn6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hn6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a(rqd rqd) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                z68.c("gp6", "got toggle state " + rqd, new Object[0]);
                xme xme = ((gp6) obj).M0;
                xme.getClass();
                xme.m((Object) null, rqd);
                return;
            default:
                KProperty[] kPropertyArr = GalleryViewModel.S;
                z68.c(GalleryViewModel.T, "got toggle state " + rqd, new Object[0]);
                xme xme2 = ((GalleryViewModel) obj).N;
                xme2.getClass();
                xme2.m((Object) null, rqd);
                return;
        }
    }
}
