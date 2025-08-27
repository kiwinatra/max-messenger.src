package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.Locale;
import ru.ok.messages.views.fragments.FrgContactProfile;

/* renamed from: zg6  reason: default package */
public final /* synthetic */ class zg6 implements qk3, f0b, tg3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgContactProfile b;

    public /* synthetic */ zg6(FrgContactProfile frgContactProfile, int i) {
        this.a = i;
        this.b = frgContactProfile;
    }

    public void accept(Object obj) {
        FrgContactProfile frgContactProfile = this.b;
        switch (this.a) {
            case 0:
                q5.T(frgContactProfile.M1(), t5.a(((a32) obj).a));
                frgContactProfile.U2();
                return;
            case 2:
                Context O1 = frgContactProfile.O1();
                Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, String.valueOf((Integer) obj));
                ArrayList arrayList = gsg.j;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(withAppendedPath);
                try {
                    O1.startActivity(intent);
                    return;
                } catch (ActivityNotFoundException e) {
                    z68.f("gsg", "viewContact: ", e);
                    hi7.a0(qad.B5, O1);
                    return;
                }
            case 4:
                a32 a32 = (a32) obj;
                b M1 = frgContactProfile.M1();
                if (M1 != null) {
                    ((qra) ym.e()).c().e("PROFILE_REQUEST_LOCATION");
                    t5 a2 = t5.a(a32.a);
                    a2.h = true;
                    q5.T(M1, a2);
                    return;
                }
                return;
            case 5:
                frgContactProfile.getClass();
                frgContactProfile.X1 = ((a32) obj).a;
                return;
            default:
                frgContactProfile.getClass();
                Locale locale = Locale.ENGLISH;
                long j = frgContactProfile.X1;
                z68.f("ru.ok.messages.views.fragments.FrgContactProfile", "Can't get getActiveLiveLocations for chat " + j, (Throwable) obj);
                return;
        }
    }

    public void h() {
        FrgContactProfile frgContactProfile = this.b;
        frgContactProfile.q1.i().y(frgContactProfile.W1.r());
        FrameLayout frameLayout = (FrameLayout) frgContactProfile.S0;
        if (frameLayout != null) {
            e0b e0b = new e0b((ViewGroup) frameLayout);
            e0b.f(r0b.a);
            e0b.i(frgContactProfile.S1(qad.Z1));
            e0b.g(t0b.a);
            e0b.d(new zg6(frgContactProfile, 1));
            e0b.j();
        }
    }

    public void l(g0b g0b) {
        FrgContactProfile frgContactProfile = this.b;
        frgContactProfile.getClass();
        if (g0b == g0b.v) {
            frgContactProfile.q1.i().c(frgContactProfile.W1.r());
        }
    }
}
