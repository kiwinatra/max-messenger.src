package defpackage;

import android.content.Context;
import android.os.Handler;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

/* renamed from: zf6  reason: default package */
public final /* synthetic */ class zf6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachPhoto b;

    public /* synthetic */ zf6(FrgAttachPhoto frgAttachPhoto, int i) {
        this.a = i;
        this.b = frgAttachPhoto;
    }

    public final void run() {
        FrgAttachPhoto frgAttachPhoto = this.b;
        switch (this.a) {
            case 0:
                Context O1 = frgAttachPhoto.O1();
                if (O1 != null) {
                    int i = qad.t1;
                    Handler handler = hi7.j;
                    hi7.b0(0, O1, O1.getString(i));
                    return;
                }
                return;
            default:
                frgAttachPhoto.u3(false);
                return;
        }
    }
}
