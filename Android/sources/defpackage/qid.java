package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: qid  reason: default package */
public final class qid implements gi7 {
    public final /* synthetic */ int a;

    public /* synthetic */ qid(int i) {
        this.a = i;
    }

    public final Object a(q4 q4Var) {
        switch (this.a) {
            case 0:
                return (s98) q4Var.g(my2.class);
            case 1:
                return (s98) q4Var.g(is9.class);
            case 2:
                return (s98) q4Var.g(iaa.class);
            case 3:
                return (s98) q4Var.g(vqe.class);
            case 4:
                return (s98) q4Var.g(ai5.class);
            case 5:
                return (s98) q4Var.g(u82.class);
            case 6:
                return (s98) q4Var.g(qfa.class);
            case 7:
                return new ay6((ipg) q4Var.g(ipg.class));
            case 8:
                return new ffa((ipg) q4Var.g(ipg.class));
            case 9:
                return new mq6((rl) q4Var.g(rl.class), (sv0) q4Var.g(sv0.class), (r62) q4Var.g(r62.class));
            case 10:
                return new ywf(q4Var.h(rl.class), q4Var.h(fq.class), q4Var.h(x23.class), q4Var.h(bud.class), q4Var.h(hl7.class), q4Var.h(qe3.class));
            case 11:
                return new pwf(q4Var.h(rl.class), q4Var.h(fq.class), q4Var.h(gaf.class));
            case 12:
                return new lua((Context) q4Var.g(Context.class), (yva) q4Var.g(yva.class));
            case 13:
                return new w1e(0);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return m2e.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return g3e.a;
            case 16:
                return new mbe(new mgf("Сброс UserSettings.SAFE_MODE"), nad.W1, new pjd(q4Var, 26));
            case LangUtils.HASH_SEED:
                return new w1e(6);
            case 18:
                return w5e.b;
            case 19:
                return new rd(q4Var);
            case 20:
                return yke.a;
            case 21:
                return use.a;
            case 22:
                return mte.a;
            case 23:
                return tue.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return eve.a;
            case 25:
                return new rtd("Новый файловый загрузчик", PmsKey.f88newuploaderenabled);
            case 26:
                return new xlf(LazyKt.lazy(gy3.w0), q4Var.h(tt0.class), (yqf) q4Var.g(yqf.class));
            case 27:
                return (s98) q4Var.g(f8f.class);
            case 28:
                return new ezb(1, q4Var.h(x23.class));
            default:
                Lazy h = q4Var.h(x23.class);
                return new q38((ngf) new mgf("Полноэкранный режим веб-аппов"), (Function0) new rh9((x23) h.getValue(), 18), (Function1) new hq7((x23) h.getValue(), 19), cad.U1, 16);
        }
    }
}
