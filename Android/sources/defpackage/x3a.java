package defpackage;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.a;
import java.util.Set;

/* renamed from: x3a  reason: default package */
public final /* synthetic */ class x3a implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b4a b;

    public /* synthetic */ x3a(b4a b4a, int i) {
        this.a = i;
        this.b = b4a;
    }

    public final void run() {
        b4a b4a = this.b;
        switch (this.a) {
            case 0:
                b4a.getClass();
                z68.c("b4a", "onClickOpenFullQuickCamera", new Object[0]);
                a aVar = (a) b4a.v.b;
                Context O1 = aVar.O1();
                if (n54.f(O1) || n54.e(O1, n54.e)) {
                    String[] strArr = n54.e;
                    if (!n54.e(O1, strArr)) {
                        n54.K(aVar, strArr, qad.O6, 170, false);
                        return;
                    } else if (!n54.f(O1)) {
                        n54.N(aVar, n54.n(), 157);
                        return;
                    } else if (!b4a.D0.h() || !b4a.D0.j()) {
                        for (v1a v1a : (Set) b4a.a) {
                            ((i3a) ((ok8) v1a.b).w0).N(new k2a(22));
                        }
                        return;
                    } else {
                        b4a.F0.setRotation(c44.DEFAULT_ASPECT_RATIO);
                        b4a.M0.setRotation(c44.DEFAULT_ASPECT_RATIO);
                        b4a.J0.setRotation(c44.DEFAULT_ASPECT_RATIO);
                        b4a.d0(true);
                        b4a.N(new l3a(6));
                        return;
                    }
                } else {
                    n54.K(aVar, n54.l(), qad.S6, 172, false);
                    return;
                }
            case 1:
                b4a.e0();
                return;
            case 2:
                if (b4a.c0()) {
                    b4a.Z0 = 1;
                    b4a.D0.b();
                    b4a.W0.s(b4a.E0, true);
                    return;
                }
                a aVar2 = (a) b4a.v.b;
                Context O12 = aVar2.O1();
                String[] strArr2 = n54.f;
                if (!n54.e(O12, strArr2)) {
                    n54.O(aVar2, strArr2, 171, qad.v6);
                    return;
                }
                b4a.k0(false);
                b4a.W0.s(b4a.E0, false);
                return;
            case 3:
                if (b4a.D0.o()) {
                    npg npg = b4a.W0;
                    float rotation = b4a.J0.getRotation();
                    View[] viewArr = {b4a.J0};
                    npg.getClass();
                    npg.t(rotation, c44.DEFAULT_ASPECT_RATIO, (he) null, viewArr);
                    b4a.D0.f(false);
                    return;
                }
                npg npg2 = b4a.W0;
                float rotation2 = b4a.J0.getRotation();
                View[] viewArr2 = {b4a.J0};
                npg2.getClass();
                npg.t(rotation2, -180.0f, (he) null, viewArr2);
                b4a.D0.f(true);
                return;
            case 4:
                b4a.N(new l3a(5));
                return;
            default:
                b4a.getClass();
                z68.a("b4a", "closeFullScreenMode");
                b4a.N(new l3a(7));
                return;
        }
    }
}
