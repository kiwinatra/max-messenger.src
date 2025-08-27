package defpackage;

import android.os.Bundle;
import android.view.View;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;

/* renamed from: gg6  reason: default package */
public final /* synthetic */ class gg6 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgBaseProfile b;

    public /* synthetic */ gg6(FrgBaseProfile frgBaseProfile, int i) {
        this.a = i;
        this.b = frgBaseProfile;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.v3();
                return;
            case 1:
                this.b.A3(false);
                return;
            case 2:
                this.b.A3(true);
                return;
            case 3:
                FrgBaseProfile frgBaseProfile = this.b;
                ((qra) ((id3) frgBaseProfile.p1.b)).c().e("PROFILE_CONSTRUCT_TAP");
                vk3 l3 = frgBaseProfile.l3();
                if (l3 == null || frgBaseProfile.P1 == null) {
                    cs3 m3 = frgBaseProfile.m3();
                    if (m3 != null) {
                        frgBaseProfile.q1.i().z(m3.a, m3.o, tm3.b).i(qe.a()).j(new ao1(0, m58.g, new fg6(frgBaseProfile, m3, 1)));
                        return;
                    }
                    return;
                }
                frgBaseProfile.P1.e(frgBaseProfile.Q1, l3.r(), (Bundle) null);
                return;
            default:
                FrgBaseProfile frgBaseProfile2 = this.b;
                if (frgBaseProfile2.o1) {
                    frgBaseProfile2.s3();
                    return;
                }
                return;
        }
    }
}
