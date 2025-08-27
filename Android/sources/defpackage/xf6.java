package defpackage;

import android.content.Context;
import android.os.Handler;
import androidx.fragment.app.b;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

/* renamed from: xf6  reason: default package */
public final /* synthetic */ class xf6 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachPhoto b;

    public /* synthetic */ xf6(FrgAttachPhoto frgAttachPhoto, int i) {
        this.a = i;
        this.b = frgAttachPhoto;
    }

    public final void run() {
        FrgAttachPhoto frgAttachPhoto = this.b;
        switch (this.a) {
            case 0:
                Context O1 = frgAttachPhoto.O1();
                if (O1 != null) {
                    int i = qad.U8;
                    Handler handler = hi7.j;
                    hi7.b0(0, O1, O1.getString(i));
                    return;
                }
                return;
            case 1:
                frgAttachPhoto.J1.r(frgAttachPhoto.D1, frgAttachPhoto.C1);
                b M1 = frgAttachPhoto.M1();
                if (M1 instanceof hn) {
                    M1.invalidateOptionsMenu();
                    return;
                }
                return;
            default:
                eg6 k3 = frgAttachPhoto.h3();
                if (k3 != null) {
                    ((ActAttachesView) k3).c();
                    return;
                }
                return;
        }
    }
}
