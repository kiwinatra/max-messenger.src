package defpackage;

import java.io.File;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

/* renamed from: yf6  reason: default package */
public final /* synthetic */ class yf6 implements qk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachPhoto b;
    public final /* synthetic */ int c;

    public /* synthetic */ yf6(FrgAttachPhoto frgAttachPhoto, int i, int i2) {
        this.a = i2;
        this.b = frgAttachPhoto;
        this.c = i;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                File file = (File) obj;
                FrgAttachPhoto frgAttachPhoto = this.b;
                frgAttachPhoto.M1 = null;
                frgAttachPhoto.a3();
                int i = this.c;
                if (i == 1) {
                    new ule(((qra) ((id3) frgAttachPhoto.p1.b)).p(), ((qra) ((id3) frgAttachPhoto.p1.b)).n(), ((qra) ((id3) frgAttachPhoto.p1.b)).y().b).a(frgAttachPhoto, file.getAbsolutePath());
                    return;
                } else if (i == 2) {
                    gsg.A(frgAttachPhoto.M1(), file, ((qra) ((id3) frgAttachPhoto.p1.b)).p());
                    return;
                } else if (i == 3) {
                    m58.E(frgAttachPhoto.O1(), frgAttachPhoto.C1, frgAttachPhoto.D1, frgAttachPhoto.q1.r(), ((qra) ((id3) frgAttachPhoto.p1.b)).p());
                    return;
                } else {
                    return;
                }
            default:
                Throwable th = (Throwable) obj;
                FrgAttachPhoto frgAttachPhoto2 = this.b;
                frgAttachPhoto2.M1 = null;
                frgAttachPhoto2.a3();
                int i2 = this.c;
                if (i2 == 1) {
                    hi7.a0(qad.V8, frgAttachPhoto2.O1());
                    return;
                } else if (i2 == 2) {
                    hi7.a0(qad.y9, frgAttachPhoto2.O1());
                    return;
                } else if (i2 == 3) {
                    hi7.a0(qad.o0, frgAttachPhoto2.O1());
                    return;
                } else {
                    return;
                }
        }
    }
}
