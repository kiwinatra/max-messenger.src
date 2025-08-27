package defpackage;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: g  reason: default package */
public final class g implements gi7 {
    public final /* synthetic */ int a;

    public /* synthetic */ g(int i) {
        this.a = i;
    }

    public final Object a(q4 q4Var) {
        switch (this.a) {
            case 0:
                return j.a;
            case 1:
                return oq.a;
            case 2:
                return gr.a;
            case 3:
                return u31.a;
            case 4:
                return new rtd("Шеринг в 1-1", PmsKey.sse);
            case 5:
                return new rtd("Шеринг в групповом", PmsKey.gsse);
            case 6:
                return new rtd("Групповые звонки", PmsKey.gce);
            case 7:
                return new rtd("Запись звонка", PmsKey.grse);
            case 8:
                return new rtd("Групповые звонки по ссылке", PmsKey.lgce);
            case 9:
                Lazy h = q4Var.h(x23.class);
                return new q38((ngf) new mgf("Логгирование WebRtc в звонках"), (Function0) new s01((x23) h.getValue(), 0), (Function1) new f((x23) h.getValue(), 3), pec.ic_call_22, 16);
            case 10:
                return new qm0(1);
            case 11:
                return w61.a;
            case 12:
                return new p72(q4Var.h(bud.class), q4Var.h(uj5.class), q4Var.h(edd.class));
            case 13:
                PmsKey pmsKey = PmsKey.f18chatanim;
                return new rtd(new mgf(pmsKey.name()), pmsKey, 0);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new pn5((sv0) q4Var.g(sv0.class), (gaf) q4Var.g(gaf.class));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new sxb(1, q4Var.h(uj5.class));
            case 16:
                return new rtd("Превью видео при перемотке", PmsKey.f76mediaviewervideocollageenabled);
            case LangUtils.HASH_SEED /*17*/:
                return new ie6(q4Var.h(da7.class), q4Var.h(ccb.class), q4Var.h(gaf.class));
            case 18:
                return oy2.a;
            case 19:
                return new vt8(4);
            case 20:
                return new ny2((Context) q4Var.g(Context.class), (ptb) q4Var.g(ptb.class), (rtb) q4Var.g(rtb.class));
            case 21:
                return new dld((Context) q4Var.g(Context.class), (yva) q4Var.g(yva.class), (fq2) q4Var.g(fq2.class), (lua) q4Var.g(lua.class), (qx2) q4Var.g(qx2.class), (rtb) q4Var.g(rtb.class), (x23) q4Var.g(x23.class), q4Var.h(bud.class));
            case 22:
                return ia3.b;
            case 23:
                return new lt3(0, q4Var.h(bud.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                x23 x23 = (x23) q4Var.g(x23.class);
                return new q38((ngf) new igf(flc.oneme_settings_iar_time_condition), (Function0) new s01(x23, 19), (Function1) new f(x23, 15), 0, 24);
            case 25:
                x23 x232 = (x23) q4Var.g(x23.class);
                return new q38((ngf) new igf(flc.oneme_settings_iar_market_build_condition), (Function0) new s01(x232, 20), (Function1) new f(x232, 16), 0, 24);
            case 26:
                x23 x233 = (x23) q4Var.g(x23.class);
                return new q38((ngf) new igf(flc.oneme_settings_web_app_ssl), (Function0) new s01(x233, 21), (Function1) new f(x233, 17), 0, 24);
            case 27:
                return new w1e(1);
            case 28:
                return new ef7(q4Var.h(Context.class), q4Var.h(x23.class), q4Var.h(fn4.class));
            default:
                return new htd(q4Var.h(ta4.class), (x23) q4Var.g(x23.class));
        }
    }
}
