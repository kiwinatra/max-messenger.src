package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import java.util.logging.Logger;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.rlottie.NativeLibraryLoader;
import one.me.rlottie.RLottie;
import org.apache.http.util.LangUtils;
import ru.ok.messages.a;
import ru.ok.tamtam.nano.Protos;

/* renamed from: zoa  reason: default package */
public final class zoa extends dce {
    public final /* synthetic */ int b;

    public /* synthetic */ zoa(int i) {
        this.b = i;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [one.me.rlottie.RLottie$Logger, java.lang.Object] */
    public final Object b(q4 q4Var) {
        q4 q4Var2 = q4Var;
        Class<ltb> cls = ltb.class;
        Class<km3> cls2 = km3.class;
        Class<vpa> cls3 = vpa.class;
        Class<po5> cls4 = po5.class;
        Class<lq> cls5 = lq.class;
        Class<qx2> cls6 = qx2.class;
        Class<hxd> cls7 = hxd.class;
        Class<Application> cls8 = Application.class;
        Class<aua> cls9 = aua.class;
        Class<doa> cls10 = doa.class;
        Class<r62> cls11 = r62.class;
        Class<sv0> cls12 = sv0.class;
        Class<gaf> cls13 = gaf.class;
        Class<Context> cls14 = Context.class;
        Class<k45> cls15 = k45.class;
        switch (this.b) {
            case 0:
                return new x25(q4Var2.h(cls15), q4Var2.h(gj.class));
            case 1:
                return new k45((Context) q4Var2.g(cls14), q4Var2.h(cls13));
            case 2:
                return (i25) q4Var2.g(cls15);
            case 3:
                kn4.a.getClass();
                return jn4.a((Context) q4Var2.g(cls14));
            case 4:
                return new RLottie.Config((Context) q4Var2.g(cls14), LazyKt.lazy(new us2(q4Var2, 12)), new g43(q4Var2.h(rla.class)), new u6h(26, q4Var2), NativeLibraryLoader.Companion.getDefault(), c44.DEFAULT_ASPECT_RATIO, new Object(), Runtime.getRuntime().availableProcessors(), 6, new hpa(q4Var2), new us2(q4Var2, 13), (Resources) null, 2080, (DefaultConstructorMarker) null);
            case 5:
                int i = qad.s2;
                int i2 = qad.m0;
                return new Object();
            case 6:
                Context context = (Context) q4Var2.g(cls14);
                return new b97((ltb) q4Var2.g(cls), q4Var2.h(cls11), q4Var2.h(cls2), q4Var2.h(cls9));
            case 7:
                return new ym((Application) q4Var2.g(cls8), q4Var2.h(cls), LazyKt.lazy(gy3.z), (vpa) q4Var2.g(cls3));
            case 8:
                return new le3(new q13(q4Var, q4Var2.h(esb.class), q4Var2.h(cls2), q4Var2.h(cls11), q4Var2.h(tcf.class)));
            case 9:
                return new uta((gaf) q4Var2.g(cls13), q4Var2.h(kva.class), q4Var2.h(f8f.class));
            case 10:
                return vpa.a;
            case 11:
                return (s04) xd3.h.getValue();
            case 12:
                Regex regex = new Regex("^TTSession#.*$");
                return new kva((eva) q4Var2.g(cls5), new fva(CollectionsKt.listOf(new gva("all-logs", (Regex) null, regex, 0, 26), new gva("important-logs", regex, (Regex) null, 2048, 12), new gva("missed-contacts", new Regex("^MissedContactsController.*$"), (Regex) null, ConstantsKt.DEFAULT_BLOCK_SIZE, 12), new gva("calls-sdk-logs", new Regex("^CallsSdk.*$"), (Regex) null, ConstantsKt.DEFAULT_BLOCK_SIZE, 12)), q4Var2.h(cls4), new us2(q4Var2, 14), new us2(q4Var2, 15)));
            case 13:
                Context context2 = (Context) q4Var2.g(cls14);
                Logger logger = aeb.h;
                if (context2 != null) {
                    grg grg = new grg(3, context2.getAssets());
                    hh4 hh4 = new hh4(grg);
                    return new aeb(new fj(hh4.b, grg, hh4.a), fqc.o());
                }
                throw new IllegalArgumentException("context could not be null.");
            case Protos.Attaches.Attach.LOCATION /*14*/:
                Context context3 = (Context) q4Var2.g(cls14);
                q4Var2.h(fa9.class);
                q4Var2.h(cls11);
                q4Var2.h(cls7);
                q4Var2.h(xq.class);
                q4Var2.h(a33.class);
                q4Var2.h(rl.class);
                q4Var2.h(cls12);
                q4Var2.h(cls4);
                ((vpa) q4Var2.g(cls3)).getClass();
                Duration.Companion companion = Duration.Companion;
                Duration.m1371getInWholeMillisecondsimpl(DurationKt.toDuration(12, DurationUnit.HOURS));
                q4Var2.h(bta.class);
                q4Var2.h(cls13);
                return new Object();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return (e24) q4Var2.g(cls5);
            case 16:
                return (qd) q4Var2.g(mq.class);
            case LangUtils.HASH_SEED /*17*/:
                return new c8e((Context) q4Var2.g(cls14), q4Var2.h(cls10), q4Var2.h(cls6), q4Var2.h(s04.class), q4Var2.h(x23.class), q4Var2.h(cls13), q4Var2.h(cm.class), q4Var2.h(jca.class));
            case 18:
                return new jca((Context) q4Var2.g(cls14), q4Var2.h(yva.class), q4Var2.h(ba7.class));
            case 19:
                return new ng0((Context) q4Var2.g(cls14), (qx2) q4Var2.g(cls6), (ns2) q4Var2.g(ns2.class), (gaf) q4Var2.g(cls13));
            case 20:
                return new ji3((sv0) q4Var2.g(cls12), (gaf) q4Var2.g(cls13), (hxd) q4Var2.g(cls7));
            case 21:
                return ((Application) q4Var2.g(cls8)).getResources();
            case 22:
                return new tt7((sv0) q4Var2.g(cls12), (ne7) q4Var2.g(ne7.class), q4Var2.h(fq2.class), (gaf) q4Var2.g(cls13));
            case 23:
                return new opa(q4Var2);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new u4(((Context) q4Var2.g(cls14)).getString(rkc.account_auth_type));
            case 25:
                g7a g7a = new g7a(1);
                g7a.a = Math.min(100, 50);
                g7a.d = ((aua) q4Var2.g(cls9)).b();
                g7a.b = ((aua) q4Var2.g(cls9)).a();
                g7a.c = (a) q4Var2.g(a.class);
                return new ve3(g7a);
            case 26:
                return new dta(q4Var2.h(cls10));
            case 27:
                return (va4) q4Var2.g(dta.class);
            case 28:
                bta bta = new bta(q4Var2.h(e24.class));
                bta.e = new bpa(q4Var2);
                return bta;
            default:
                return new edb((Context) q4Var2.g(cls14), (g2g) q4Var2.g(g2g.class));
        }
    }
}
