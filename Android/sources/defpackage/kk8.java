package defpackage;

import androidx.fragment.app.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: kk8  reason: default package */
public final /* synthetic */ class kk8 implements x6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ok8 b;

    public /* synthetic */ kk8(ok8 ok8, int i) {
        this.a = i;
        this.b = ok8;
    }

    public final void run() {
        ok8 ok8 = this.b;
        int i = this.a;
        ok8.getClass();
        switch (i) {
            case 0:
                ((qra) ym.e()).c().e("MEDIA_SEND_VIDEO");
                ok8.x0.q0();
                ok8.postDelayed(new jk8(ok8, 2), 200);
                return;
            case 1:
                ((qra) ym.e()).c().e("MEDIA_SEND_FILE");
                lk8 lk8 = ok8.w0;
                if (lk8 != null) {
                    for (k1a k1a : (Set) ((i3a) lk8).a) {
                        e4 e4Var = k1a.o;
                        if (e4Var.o()) {
                            k1a.X();
                        } else {
                            a aVar = (a) e4Var.b;
                            if (aVar.O1() != null) {
                                n54.N(aVar, n54.n(), 168);
                            }
                        }
                    }
                    return;
                }
                return;
            case 2:
                ((qra) ym.e()).c().e("MEDIA_SEND_CONTACT");
                lk8 lk82 = ok8.w0;
                if (lk82 != null) {
                    for (k1a k1a2 : (Set) ((i3a) lk82).a) {
                        k1a2.getClass();
                        z68.c("k1a", "onContactSelected", new Object[0]);
                        n99 n99 = k1a2.c.a.b;
                        a32 a32 = n99.y;
                        b6.U(n99.w, 121, (ArrayList) null, (List) null, 4, 4, a32 == null ? -1 : a32.a);
                    }
                    return;
                }
                return;
            case 3:
                ((qra) ym.e()).c().e("MEDIA_SEND_LOCATION");
                lk8 lk83 = ok8.w0;
                if (lk83 != null) {
                    ((i3a) lk83).N(new k2a(20));
                    return;
                }
                return;
            case 4:
                ((qra) ym.e()).c().e("MEDIA_SEND_CONSTRUCTOR");
                lk8 lk84 = ok8.w0;
                if (lk84 != null) {
                    for (k1a k1a3 : (Set) ((i3a) lk84).a) {
                        i1a i1a = k1a3.c;
                        if (i1a != null) {
                            i1a.a.getClass();
                        }
                    }
                    return;
                }
                return;
            case 5:
                ((qra) ym.e()).c().e("MEDIA_SEND_GALLERY");
                ok8.p();
                return;
            default:
                ((qra) ym.e()).c().e("MEDIA_SEND_PHOTO");
                if (ok8.w0 != null) {
                    ok8.x0.q0();
                    ok8.postDelayed(new jk8(ok8, 3), 200);
                    return;
                }
                return;
        }
    }
}
