package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: em  reason: default package */
public final class em extends c5d {
    public final /* synthetic */ int b;

    public /* synthetic */ em(int i) {
        this.b = i;
    }

    public final Object b(q4 q4Var) {
        q4 q4Var2 = q4Var;
        switch (this.b) {
            case 0:
                return new mi0((sv0) q4Var2.g(sv0.class), (gaf) q4Var2.g(gaf.class));
            case 1:
                return new cpb((gaf) q4Var2.g(gaf.class), (dy9) q4Var2.g(dy9.class), (u50) q4Var2.g(u50.class));
            case 2:
                return new j00((gaf) q4Var2.g(gaf.class), (h00) q4Var2.g(h00.class), (Application) q4Var2.g(Application.class));
            case 3:
                return new h90(q4Var2.h(rh3.class), q4Var2.h(jtb.class), (ccb) q4Var2.g(ccb.class));
            case 4:
                return new u50((Context) q4Var2.g(Context.class), (dy9) q4Var2.g(dy9.class), (p9c) q4Var2.g(p9c.class));
            case 5:
                return new wu3();
            case 6:
                return new Object();
            case 7:
                return new nh0((Application) q4Var2.g(Application.class), (sv0) q4Var2.g(sv0.class), (gaf) q4Var2.g(gaf.class));
            case 8:
                return new nfa();
            case 9:
                m01 m01 = (m01) q4Var2.g(m01.class);
                a21 a21 = (a21) q4Var2.g(a21.class);
                kgd kgd = (kgd) q4Var2.g(kgd.class);
                nq1 nq1 = (nq1) q4Var2.g(nq1.class);
                Lazy h = q4Var2.h(tq1.class);
                return new ap1((dp1) q4Var2.g(dp1.class), m01, (by4) q4Var2.g(by4.class), (h9b) q4Var2.g(h9b.class), (q11) q4Var2.g(q11.class), a21, nq1, kgd, (ahd) q4Var2.g(ahd.class), (p9c) q4Var2.g(p9c.class), (cp1) q4Var2.g(cp1.class), h);
            case 10:
                return new hl1((Context) q4Var2.g(Context.class));
            case 11:
                return new ej9(q4Var2.h(to9.class), q4Var2.h(gb9.class), q4Var2.h(gaf.class));
            case 12:
                return new sn7(q4Var2.h(rl.class), q4Var2.h(qx2.class), q4Var2.h(sv0.class), q4Var2.h(x23.class));
            case 13:
                return new u39((sv0) q4Var2.g(sv0.class), (gaf) q4Var2.g(gaf.class));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new l59((eu3) q4Var2.g(eu3.class), (qx2) q4Var2.g(qx2.class), (o39) q4Var2.g(o39.class), (gaf) q4Var2.g(gaf.class), q4Var2.h(ns3.class), q4Var2.h(tld.class), LazyKt.lazy(new us2(q4Var2, 0)));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return (a59) q4Var2.g(l59.class);
            case 16:
                return (y59) q4Var2.g(l59.class);
            case LangUtils.HASH_SEED /*17*/:
                return new i39(q4Var2.h(eu3.class));
            case 18:
                return new jq6(q4Var2.h(bud.class));
            case 19:
                return z16.b;
            case 20:
                return (r46) q4Var2.g(z16.class);
            case 21:
                return new m46((Application) q4Var2.g(Application.class), q4Var2.h(r46.class), q4Var2.h(yva.class), q4Var2.h(r62.class), q4Var2.h(ch.class), q4Var2.h(rtb.class), q4Var2.h(ise.class), q4Var2.h(p25.class), LazyKt.lazy(new us2(q4Var2, 3)), q4Var2.h(x15.class), LazyKt.lazy(new us2(q4Var2, 4)), q4Var2.h(tld.class), q4Var2.h(u82.class), q4Var2.h(jua.class), q4Var2.h(fq.class), q4Var2.h(nd.class), q4Var2.h(gaf.class));
            case 22:
                return new lt6((Context) q4Var2.g(Context.class));
            case 23:
                return new Object();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new wt6((Context) q4Var2.g(Context.class), (gaf) q4Var2.g(gaf.class));
            case 25:
                return (dy9) q4Var2.g(xy9.class);
            case 26:
                return new xq6((Resources) q4Var2.g(Resources.class));
            case 27:
                return new bk5(q4Var2.h(fn4.class), q4Var2.h(doa.class), q4Var2.h(eu3.class), q4Var2.h(x23.class), q4Var2.h(bud.class), q4Var2.h(Context.class));
            case 28:
                return new r80(q4Var2.h(nd.class), q4Var2.h(x23.class), q4Var2.h(z5a.class));
            default:
                Context context = (Context) q4Var2.g(Context.class);
                jf4 jf4 = new jf4();
                synchronized (jf4) {
                    jf4.a = true;
                }
                fh4 fh4 = new fh4(context, jf4);
                gm8 gm8 = new gm8(q4Var2);
                fh4.b = gm8;
                ce ceVar = fh4.a;
                if (gm8 != ((g74) ceVar.v)) {
                    ceVar.v = gm8;
                    ((HashMap) ceVar.c).clear();
                    ((HashMap) ceVar.o).clear();
                }
                return fh4;
        }
    }
}
