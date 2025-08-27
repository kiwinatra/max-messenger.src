package defpackage;

import java.util.Collections;
import ru.ok.messages.views.fragments.FrgProfilePhoto;

/* renamed from: gi6  reason: default package */
public final /* synthetic */ class gi6 implements qk3, dsg {
    public final /* synthetic */ FrgProfilePhoto a;

    public /* synthetic */ gi6(FrgProfilePhoto frgProfilePhoto) {
        this.a = frgProfilePhoto;
    }

    public void accept(Object obj) {
        FrgProfilePhoto frgProfilePhoto = this.a;
        frgProfilePhoto.getClass();
        ha9 ha9 = ((a89) obj).a;
        frgProfilePhoto.F1 = ha9;
        String str = ha9.f().f;
        frgProfilePhoto.F1.f().getClass();
        frgProfilePhoto.E1 = new t6(Collections.singletonList(str), frgProfilePhoto.E1.c);
        frgProfilePhoto.H1 = true;
        frgProfilePhoto.i3();
    }

    public void g(Throwable th) {
        FrgProfilePhoto frgProfilePhoto = this.a;
        frgProfilePhoto.C1.setVisibility(4);
        frgProfilePhoto.D1.setVisibility(0);
        frgProfilePhoto.D1.setZoomEnabled(false);
        hi7.b0(1, frgProfilePhoto.M1(), frgProfilePhoto.S1(qad.w1));
    }
}
