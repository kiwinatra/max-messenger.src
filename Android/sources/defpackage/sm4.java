package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.logout.a;
import ru.ok.tamtam.nano.Protos;

/* renamed from: sm4  reason: default package */
public final class sm4 implements gi7 {
    public final /* synthetic */ int a;

    public /* synthetic */ sm4(int i) {
        this.a = i;
    }

    public final Object a(q4 q4Var) {
        q4 q4Var2 = q4Var;
        switch (this.a) {
            case 0:
                return new t5e(q4Var2.h(Context.class), q4Var2.h(gaf.class));
            case 1:
                return new lt7(q4Var2.h(ta4.class));
            case 2:
                return new lpa(q4Var2.h(gaf.class));
            case 3:
                return new qx6(q4Var2.h(Context.class), q4Var2.h(po5.class), q4Var2.h(gaf.class), q4Var2.h(e0b.class));
            case 4:
                return new rd(q4Var2.h(e0b.class), q4Var2.h(k78.class), 0);
            case 5:
                return new rd(q4Var2.h(r62.class), q4Var2.h(qwa.class), 1);
            case 6:
                return new vt8(1);
            case 7:
                return new w1e(2);
            case 8:
                return it6.a;
            case 9:
                return new vt8(2);
            case 10:
                vc7 vc7 = (vc7) q4Var2.g(vc7.class);
                vc7.getClass();
                if (((doa) mc7.a.getAccessor().g(doa.class)).e()) {
                    return vc7.c;
                }
                vc7.c = null;
                return null;
            case 11:
                return new ir9((uua) q4Var2.g(uua.class), (gaf) q4Var2.g(gaf.class), (a) q4Var2.g(a.class), q4Var2.h(t8c.class), q4Var2.h(no0.class));
            case 12:
                return (xt2) q4Var2.g(ir9.class);
            case 13:
                return new w1e(3);
            case Protos.Attaches.Attach.LOCATION:
                return new oq6(q4Var2.h(eu3.class), q4Var2.h(tra.class));
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return new vt8(3);
            case 16:
                return new Object();
            case LangUtils.HASH_SEED:
                return new by7(q4Var2.h(km3.class), q4Var2.h(r62.class), q4Var2.h(qx2.class), q4Var2.h(fz7.class), q4Var2.h(rl.class), q4Var2.h(fa9.class), q4Var2.h(gaf.class), q4Var2.h(qa2.class), q4Var2.h(pa2.class), q4Var2.h(qw7.class), q4Var2.h(x23.class), q4Var2.h(uj5.class), q4Var2.h(opa.class), q4Var2.h(ta4.class), q4Var2.h(gq6.class), q4Var2.h(u82.class), q4Var2.h(doa.class));
            case 18:
                return o88.a;
            case 19:
                return new w1e(4);
            case 20:
                return new lt3(1, q4Var2.h(y7d.class));
            case 21:
                return new vt8(0);
            case 22:
                return cp9.a;
            case 23:
                return new w1e(5);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                q4Var2.h(pm0.class);
                return new qm0(0);
            case 25:
                return wn7.a;
            case 26:
                return rw7.a;
            case 27:
                return re5.a;
            case 28:
                return (s98) q4Var2.g(c8e.class);
            default:
                return (s98) q4Var2.g(ng0.class);
        }
    }
}
