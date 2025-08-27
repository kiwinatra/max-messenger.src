package defpackage;

import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.arch.Widget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: xoa  reason: default package */
public final class xoa implements gi7 {
    public final /* synthetic */ int a;

    public /* synthetic */ xoa(int i) {
        this.a = i;
    }

    public final Object a(q4 q4Var) {
        switch (this.a) {
            case 0:
                return new ipa(q4Var);
            case 1:
                return new lpa(q4Var);
            case 2:
                return u4a.a;
            case 3:
                return new dpa(q4Var);
            case 4:
                return (cm) q4Var.g(fz7.class);
            case 5:
                lq lqVar = lq.a;
                lq.b = q4Var.h(cud.class);
                return lqVar;
            case 6:
                return mq.a;
            case 7:
                i9d i9d = (i9d) CollectionsKt.lastOrNull(((bta) q4Var.g(bta.class)).e().x().e());
                return new e0b((Widget) (i9d != null ? i9d.a : null));
            case 8:
                return new cy7(q4Var.h(by7.class));
            case 9:
                return new sxb(0, q4Var.h(x23.class));
            case 10:
                x23 x23 = (x23) q4Var.g(x23.class);
                return new q38((ngf) new mgf("Отображение debug info в профиле"), (Function0) new rh9(x23, 7), (Function1) new hq7(x23, 11), cad.b1, 16);
            case 11:
                Lazy h = q4Var.h(x23.class);
                return new q38((ngf) new mgf("Новый toolbar"), (Function0) new rh9((x23) h.getValue(), 8), (Function1) new hq7((x23) h.getValue(), 12), lya.r, (Function1) l9.c);
            case 12:
                return new rtd("Включить видеосообщения", PmsKey.f117videomsgenabled);
            case 13:
                return new ezb(0, q4Var.h(bud.class));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new rtd("Пункт \"Тип канала и ссылка\" (при редактировании канала)", PmsKey.f32editchanneltypescreenenabled);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new rtd("Пункт \"Тип чата и ссылка\" (при редактировании чата)", PmsKey.f33editchattypescreenenabled);
            case 16:
                return new rtd("Включить права на управления ссылкой в чате", PmsKey.f21chatinvitelinkpermissionsenabled);
            case LangUtils.HASH_SEED /*17*/:
                return new rtd("Новые пермишены для админов", PmsKey.f85newadminpermissions);
            case 18:
                Class<uj5> cls = uj5.class;
                Class<ttb> cls2 = ttb.class;
                Class<ptb> cls3 = ptb.class;
                return ((vj5) ((uj5) q4Var.g(cls))).p() ? new j5c(q4Var.h(cls3), q4Var.h(cls2), q4Var.h(eu3.class), q4Var.h(cls)) : new ayb(q4Var.h(cls3), q4Var.h(cls2), q4Var.h(cls));
            case 19:
                return (s98) q4Var.g(meb.class);
            case 20:
                return (s98) q4Var.g(iac.class);
            case 21:
                return (s98) q4Var.g(mfa.class);
            case 22:
                return (s98) q4Var.g(rj5.class);
            case 23:
                return (s98) q4Var.g(gj5.class);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return (s98) q4Var.g(qj5.class);
            case 25:
                return (s98) q4Var.g(pga.class);
            case 26:
                return (s98) q4Var.g(ve4.class);
            case 27:
                return (s98) q4Var.g(zp1.class);
            case 28:
                return (s98) q4Var.g(k78.class);
            default:
                return (s98) q4Var.g(ptb.class);
        }
    }
}
