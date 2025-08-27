package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.messages.list.loader.MessageModel;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: wg7  reason: default package */
public final /* synthetic */ class wg7 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ wg7(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                return n79.C(((TamErrorException) obj).a);
            case 1:
                return n79.C(((TamErrorException) obj).a);
            case 2:
                return Boolean.valueOf(StringsKt__StringsJVMKt.startsWith$default((String) ((Map.Entry) obj).getKey(), "MP4", false, 2, (Object) null));
            case 3:
                return new ik5(p5g.MP4, (String) ((Map.Entry) obj).getValue());
            case 4:
                return Boolean.valueOf(StringsKt__StringsJVMKt.startsWith$default((String) ((Map.Entry) obj).getKey(), "MP4", false, 2, (Object) null));
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                return new hk5(3, -1, j4b.G((String) entry.getKey()), 0, (String) entry.getValue());
            case 6:
                qaf qaf = ((TamErrorException) obj).a;
                xk7.y0.getClass();
                if (qaf instanceof aaf) {
                    aaf aaf = (aaf) qaf;
                    return (Intrinsics.areEqual((Object) aaf.b, (Object) "service.unavailable") || Intrinsics.areEqual((Object) aaf.b, (Object) "service.timeout")) ? new hk7(new igf(ead.Q), new igf(ead.P)) : new hk7(new igf(ead.O), new igf(ead.N));
                }
                if (!Intrinsics.areEqual((Object) qaf.b, (Object) "contact.not.found")) {
                    String str = qaf.b;
                    if (!Intrinsics.areEqual((Object) str, (Object) "not.found")) {
                        if (Intrinsics.areEqual((Object) str, (Object) "too.many.requests")) {
                            return jk7.a;
                        }
                        String str2 = qaf.o;
                        return new gk7((str2 == null || str2.length() == 0) ? new igf(qad.u1) : new mgf(str2));
                    }
                }
                return ik7.a;
            case 7:
                return ((k48) obj).b;
            case 8:
                return obj.toString();
            case 9:
                return Long.toString(((Long) obj).longValue());
            case 10:
                Intent intent = (Intent) obj;
                return Unit.INSTANCE;
            case 11:
                return new EnhancedAnimatedVectorDrawable((Context) obj, lva.b);
            case 12:
                return new EnhancedAnimatedVectorDrawable((Context) obj, lva.d);
            case 13:
                return Long.valueOf(((z29) obj).a);
            case Protos.Attaches.Attach.LOCATION:
                return Long.valueOf(((z29) obj).a);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                vk3 vk3 = (vk3) obj;
                if (!vk3.w && !kv0.M(vk3) && vk3.n() == 0 && (!vk3.x() || !vk3.A())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 16:
                return ((hhb) obj).c.toString();
            case LangUtils.HASH_SEED:
                return ((hhb) obj).c.toString();
            case 18:
                return Boolean.valueOf(((View) obj).isClickable());
            case 19:
                return new k2g(0, ((k2b) obj).getIcon().a.c);
            case 20:
                return new sc9((Context) obj);
            case 21:
                if (((wd9) obj).a.a != rqc.EMOJI) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                return ((wd9) obj).a.b;
            case 23:
                KProperty[] kPropertyArr = MessageWriteWidget.C0;
                return new k2g(0, ((k2b) obj).getIcon().a.c);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return Boolean.valueOf(((IndexedValue) obj).getValue() instanceof MessageModel);
            case 25:
                if (((c89) obj) != c89.x) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                return Boolean.valueOf(((yk2) obj).f.isEmpty());
            case 27:
                bd9 bd9 = (bd9) obj;
                return new jga(bd9.c, bd9.e, bd9.i, hx4.MESSAGES_LIMIT);
            case 28:
                bd9 bd92 = (bd9) obj;
                return new jga(bd92.c, bd92.e, bd92.i, hx4.NOTIFICATIONS_LIMIT);
            default:
                return ((bd9) obj).l;
        }
    }
}
