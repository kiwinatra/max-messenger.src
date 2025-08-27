package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.math.MathKt;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ws7  reason: default package */
public final class ws7 extends dce {
    public final /* synthetic */ int b;

    public /* synthetic */ ws7(int i) {
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r2v69, types: [he3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v28, types: [r3, java.lang.Object] */
    public final Object b(q4 q4Var) {
        q4 q4Var2 = q4Var;
        switch (this.b) {
            case 0:
                return new ge6((ca7) q4Var2.g(ca7.class), q4Var2.h(jbf.class), q4Var2.h(m95.class), q4Var2.h(hn4.class));
            case 1:
                return new yd7((Context) q4Var2.g(Context.class), (s04) q4Var2.g(s04.class), (gaf) q4Var2.g(gaf.class), q4Var2.h(edb.class));
            case 2:
                return new yj5(q4Var2.h(jtb.class), q4Var2.h(doa.class), q4Var2.h(km3.class), q4Var2.h(fn4.class), q4Var2.h(m95.class));
            case 3:
                return new hcf(q4Var2.h(nd.class));
            case 4:
                return (v21) q4Var2.g(w21.class);
            case 5:
                rh3 rh3 = (rh3) q4Var2.g(rh3.class);
                pwa pwa = (pwa) q4Var2.g(pwa.class);
                a74 a74 = (a74) q4Var2.g(a74.class);
                po5 po5 = (po5) q4Var2.g(po5.class);
                r62 r62 = (r62) q4Var2.g(r62.class);
                km3 km3 = (km3) q4Var2.g(km3.class);
                jd8 jd8 = (jd8) q4Var2.g(jd8.class);
                rl rlVar = (rl) q4Var2.g(rl.class);
                nh3 nh3 = (nh3) q4Var2.g(nh3.class);
                doa doa = (doa) q4Var2.g(doa.class);
                m95 m95 = (m95) q4Var2.g(m95.class);
                Class<jbf> cls = jbf.class;
                jbf jbf = (jbf) q4Var2.g(cls);
                jbf.getClass();
                ((kbf) jbf).a();
                ((kbf) ((jbf) q4Var2.g(cls))).c();
                k78 k78 = (k78) q4Var2.g(k78.class);
                gcf gcf = (gcf) q4Var2.g(gcf.class);
                return new w21((Context) q4Var2.g(Context.class), (hn4) q4Var2.g(hn4.class), (cq) q4Var2.g(cq.class), (ltb) q4Var2.g(ltb.class), (nd) q4Var2.g(nd.class), q4Var2.h(ipg.class));
            case 6:
                ExecutorService b2 = ((aua) q4Var2.g(aua.class)).b();
                er7 er7 = new er7(23, (Object) q4Var2);
                Lazy h = q4Var2.h(m95.class);
                return new bt7(q4Var, (Context) q4Var2.g(Context.class), b2, er7, h);
            case 7:
                Lazy h2 = q4Var2.h(jbf.class);
                Context context = (Context) q4Var2.g(Context.class);
                ? obj = new Object();
                obj.d = new ct7(h2);
                int roundToInt = MathKt.roundToInt(((float) 80) * vo4.c().getDisplayMetrics().density);
                obj.a = roundToInt;
                obj.b = 4;
                obj.c = 8;
                if (roundToInt <= 0) {
                    obj.a = (int) ld9.r(context, 80.0f);
                }
                if (obj.b <= 0) {
                    obj.b = 4;
                }
                if (obj.c <= 0) {
                    obj.c = 8;
                }
                if (((wpe) obj.d) == null) {
                    obj.d = new dbe(10);
                }
                ? obj2 = new Object();
                obj2.a = obj.a;
                obj2.b = obj.b;
                obj2.c = obj.c;
                if (ise.c == null) {
                    synchronized (ise.b) {
                        try {
                            if (ise.c == null) {
                                ise.c = new ise(obj2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return ise.c;
            case 8:
                return new cbf(q4Var2.h(qa4.class), q4Var2.h(nd.class), q4Var2.h(iac.class), q4Var2.h(rl.class), q4Var2.h(d18.class), q4Var2.h(dp1.class));
            case 9:
                return new daf((Context) q4Var2.g(Context.class), new yj9(q4Var2.h(km3.class)), (lfd) ((kbf) ((jbf) q4Var2.g(jbf.class))).d.getValue(), (doa) q4Var2.g(doa.class), (epa) q4Var2.g(epa.class), (s74) q4Var2.g(s74.class), (jtb) q4Var2.g(jtb.class), (m95) q4Var2.g(m95.class));
            case 10:
                return new k8();
            case 11:
                return new r9c(q4Var2.h(vaf.class), q4Var2.h(e24.class));
            case 12:
                m95 m952 = (m95) q4Var2.g(m95.class);
                ve4 ve4 = (ve4) q4Var2.g(ve4.class);
                return new t25((Context) q4Var2.g(Context.class), (jbf) q4Var2.g(jbf.class), (u25) q4Var2.g(c35.class));
            case 13:
                return new tcf((Context) q4Var2.g(Context.class), (ltb) q4Var2.g(ltb.class), (k8) q4Var2.g(k8.class), (esb) q4Var2.g(esb.class), (r62) q4Var2.g(r62.class), (km3) q4Var2.g(km3.class), q4Var2.h(ksd.class), (po5) q4Var2.g(po5.class));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new f40((Context) q4Var2.g(Context.class), (sv0) q4Var2.g(sv0.class), q4Var2.h(ksd.class), q4Var2.h(cq.class), (xy9) q4Var2.g(xy9.class), q4Var2.h(ltb.class), q4Var2.h(m95.class), q4Var2.h(fa9.class), q4Var2.h(r62.class), LazyKt.lazy(new us2(q4Var2, 6)), q4Var2.h(gaf.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new nlb((Context) q4Var2.g(Context.class), (hq) q4Var2.g(hq.class), (xq) q4Var2.g(xq.class));
            case 16:
                return new qa4((Context) q4Var2.g(Context.class), q4Var2.h(pwa.class), q4Var2.h(ed4.class), q4Var2.h(yva.class), q4Var2.h(r62.class), q4Var2.h(ce0.class), q4Var2.h(x23.class), LazyKt.lazy(new us2(q4Var2, 7)));
            case LangUtils.HASH_SEED /*17*/:
                bl3 bl3 = (bl3) q4Var2.g(bl3.class);
                return new Object();
            case 18:
                return new no9(q4Var2.h(iac.class), q4Var2.h(z84.class), q4Var2.h(qfa.class), q4Var2.h(hga.class), q4Var2.d(s98.class, false));
            case 19:
                return new yaf((Context) q4Var2.g(Context.class), q4Var2.h(r62.class));
            case 20:
                return new kb5((Context) q4Var2.g(Context.class), q4Var2.h(vaf.class), q4Var2.h(cx0.class));
            case 21:
                po5 po52 = (po5) ((ln5) q4Var2.g(ln5.class));
                po52.getClass();
                return new sae(po5.g(po52.b(), "videoCache"), new os7());
            case 22:
                Context context2 = (Context) q4Var2.g(Context.class);
                yva yva = (yva) q4Var2.g(yva.class);
                return new Object();
            case 23:
                return new ql5(q4Var2.h(nd.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new oeb(q4Var2.h(s74.class), q4Var2.h(rl.class), (sv0) q4Var2.g(sv0.class), q4Var2.h(jtb.class), LazyKt.lazy(new us2(q4Var2, 8)), q4Var2.h(km3.class), q4Var2.h(uu3.class), (m95) q4Var2.g(m95.class));
            case 25:
                return new xe3((Context) q4Var2.g(Context.class));
            case 26:
                pid pid = (pid) ((fq) q4Var2.g(fq.class));
                return new rta(bs0.X(bs0.F(bs0.w(new k26(kv0.h(pid.i), 19)), ((osa) ((gaf) q4Var2.g(gaf.class))).c().t0()), e14.a(CoroutineContext.Element.DefaultImpls.plus(kv0.b(), (s04) xd3.h.getValue())), z6e.a, te8.c(pid.d("app.extra.text.size.mode", 1))));
            case 27:
                return new p9c(q4Var2.h(Context.class));
            case 28:
                eld eld = (eld) q4Var2.g(eld.class);
                r62 r622 = (r62) q4Var2.g(r62.class);
                jbf jbf2 = (jbf) q4Var2.g(jbf.class);
                ry6 ry6 = (ry6) q4Var2.g(ry6.class);
                return new ekd(0);
            default:
                Context context3 = (Context) q4Var2.g(Context.class);
                return new eld(q4Var2.h(x23.class), q4Var2.h(yva.class), q4Var2.h(r62.class));
        }
    }
}
