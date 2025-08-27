package defpackage;

import android.os.Bundle;
import ru.ok.messages.views.fragments.base.FrgBaseProfile;

/* renamed from: fg6  reason: default package */
public final /* synthetic */ class fg6 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgBaseProfile b;
    public final /* synthetic */ cs3 c;

    public /* synthetic */ fg6(FrgBaseProfile frgBaseProfile, cs3 cs3, int i) {
        this.a = i;
        this.b = frgBaseProfile;
        this.c = cs3;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                q5.U(this.b.X2(), this.c.a.a);
                return;
            default:
                FrgBaseProfile frgBaseProfile = this.b;
                frgBaseProfile.getClass();
                frgBaseProfile.P1.e(frgBaseProfile.Q1, this.c.a.a, (Bundle) null);
                return;
        }
    }
}
