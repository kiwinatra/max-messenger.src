package defpackage;

import android.text.TextUtils;
import androidx.fragment.app.b;
import ru.ok.messages.views.fragments.base.FrgBaseProfileLinkDescription;

/* renamed from: w1c  reason: default package */
public final /* synthetic */ class w1c implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1c b;

    public /* synthetic */ w1c(x1c x1c, int i) {
        this.a = i;
        this.b = x1c;
    }

    public final void run() {
        b M1;
        switch (this.a) {
            case 0:
                FrgBaseProfileLinkDescription frgBaseProfileLinkDescription = this.b.G0;
                if (frgBaseProfileLinkDescription != null) {
                    String C3 = frgBaseProfileLinkDescription.C3();
                    if (!TextUtils.isEmpty(C3)) {
                        gsg.B(frgBaseProfileLinkDescription.O1(), C3);
                        return;
                    }
                    return;
                }
                return;
            default:
                FrgBaseProfileLinkDescription frgBaseProfileLinkDescription2 = this.b.G0;
                if (frgBaseProfileLinkDescription2 != null && (M1 = frgBaseProfileLinkDescription2.M1()) != null) {
                    te8.f(M1, frgBaseProfileLinkDescription2.C3());
                    hi7.b0(0, M1, frgBaseProfileLinkDescription2.S1(qad.z0));
                    return;
                }
                return;
        }
    }
}
