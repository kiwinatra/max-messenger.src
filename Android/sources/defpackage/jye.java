package defpackage;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: jye  reason: default package */
public final class jye extends dce {
    public final /* synthetic */ int b;

    public /* synthetic */ jye(int i) {
        this.b = i;
    }

    public final Object b(q4 q4Var) {
        q4 q4Var2 = q4Var;
        Class<fzf> cls = fzf.class;
        Class<rl> cls2 = rl.class;
        Class<nd> cls3 = nd.class;
        Class<udg> cls4 = udg.class;
        Class<vpa> cls5 = vpa.class;
        Class<cxe> cls6 = cxe.class;
        Class<rla> cls7 = rla.class;
        Class<x23> cls8 = x23.class;
        Class<Context> cls9 = Context.class;
        Class<gaf> cls10 = gaf.class;
        Class<yqf> cls11 = yqf.class;
        switch (this.b) {
            case 0:
                return new Object();
            case 1:
                return new Object();
            case 2:
                Lazy h = q4Var2.h(cls3);
                Lazy h2 = q4Var2.h(m95.class);
                Lazy h3 = q4Var2.h(rh3.class);
                Lazy h4 = q4Var2.h(fn4.class);
                return new yqf(h, h3, h4, h2, LazyKt.lazy(new ws2(1, h4)), q4Var2.h(ln5.class), q4Var2.h(ou8.class));
            case 3:
                return new jxf((fzf) q4Var2.g(cls), (gcf) q4Var2.g(gcf.class), (icf) q4Var2.g(icf.class), (yqf) q4Var2.g(cls11), (x23) q4Var2.g(cls8), (rl) q4Var2.g(cls2), (lfd) ((kbf) ((jbf) q4Var2.g(jbf.class))).g.getValue());
            case 4:
                Lazy h5 = q4Var2.h(tt0.class);
                gaf gaf = (gaf) q4Var2.g(cls10);
                Lazy h6 = q4Var2.h(cls7);
                return new zqf(q4Var, gaf, LazyKt.lazy(new pjd(q4Var2, 27)), h6, h5, (yqf) q4Var2.g(cls11));
            case 5:
                return new h5f(q4Var2.h(cls2), q4Var2.h(cls8), q4Var2.h(hxd.class), q4Var2.h(cls), q4Var2.h(zqf.class), (yqf) q4Var2.g(cls11));
            case 6:
                return new l5f(q4Var2.h(cls10), q4Var2.h(ooe.class), q4Var2.h(pz3.class), q4Var2.h(h5f.class));
            case 7:
                return new jo5(q4Var2.h(cls7), (yqf) q4Var2.g(cls11));
            case 8:
                return new w47(new ee(q4Var2.h(cls7), (yqf) q4Var2.g(cls11)));
            case 9:
                return new k4f(new y1b(q4Var2.h(cls7), (yqf) q4Var2.g(cls11)));
            case 10:
                return new oqf(new xo4());
            case 11:
                return new xgd((Context) q4Var2.g(cls9));
            case 12:
                return new f2g(q4Var2);
            case 13:
                return new f8f(q4Var2.h(cls6), q4Var2.h(cls8), q4Var2.h(cls5), (hl7) q4Var2.g(hl7.class), q4Var2.h(SystemServicesManager$PushTokenGeneratedListener.class), q4Var2.h(e24.class), (s04) q4Var2.g(s04.class));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                Context context = (Context) q4Var2.g(cls9);
                grg grg = new grg(0, context);
                Lazy lazy = j2g.a;
                return new g2g(((Boolean) j2g.a.getValue()).booleanValue(), grg, (NotificationManager) context.getSystemService("notification"));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                Lazy h7 = q4Var2.h(vdg.class);
                Lazy h8 = q4Var2.h(cls3);
                Lazy h9 = q4Var2.h(cls8);
                q04 b2 = ((osa) ((gaf) q4Var2.g(cls10))).b();
                p04 p04 = q04.a;
                return new udg((Application) q4Var2.g(Application.class), (xgd) q4Var2.g(xgd.class), h7, h8, h9, b2.s0(1, (String) null), q4Var2.h(edb.class));
            case 16:
                return (xq) q4Var2.g(cls4);
            case LangUtils.HASH_SEED /*17*/:
                return (fn4) q4Var2.g(hn4.class);
            case 18:
                return new hn4((Context) q4Var2.g(cls9), (jtb) q4Var2.g(jtb.class), (cxe) q4Var2.g(cls6), q4Var2.h(cls5), q4Var2.h(f8f.class), q4Var2.h(cls4));
            case 19:
                return o5a.v((Context) q4Var2.g(cls9));
            case 20:
                return new po7(q4Var2.h(cls10), q4Var2.d(xo7.class, false));
            default:
                return new d93(yo7.d, q4Var2.h(wfg.class));
        }
    }
}
