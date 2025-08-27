package defpackage;

import android.content.Context;
import java.util.List;
import javax.crypto.Cipher;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chats.picker.PickerChatController;
import one.me.chats.picker.PickerChatsTabWidget;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.chats.picker.chats.PickerChatsTabWidget2;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.pinbars.PinBarsWidget;
import one.me.startconversation.channel.PickSubscribersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: lgb  reason: default package */
public final /* synthetic */ class lgb implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ lgb(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<jua> cls = jua.class;
        Class<fua> cls2 = fua.class;
        Class<gaf> cls3 = gaf.class;
        Class<x23> cls4 = x23.class;
        Class<yva> cls5 = yva.class;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = PickSubscribersScreen.w0;
                return wke.a.c();
            case 1:
                KProperty[] kPropertyArr2 = PickerChatController.z0;
                return new sr8((uq7) null, 15);
            case 2:
                KProperty[] kPropertyArr3 = PickerChatController.z0;
                return Boolean.FALSE;
            case 3:
                return new jbe(false);
            case 4:
                return new jbe(true);
            case 5:
                KProperty[] kPropertyArr4 = PickerChatsListWidget2.w0;
                return Boolean.FALSE;
            case 6:
                KProperty[] kPropertyArr5 = PickerChatsListWidget2.w0;
                cs2 cs2 = cs2.a;
                return new pjb(cs2.getAccessor().h(cls4), cs2.getAccessor().h(rtb.class), cs2.getAccessor().h(ptb.class));
            case 7:
                KProperty[] kPropertyArr6 = PickerChatsTabWidget.Z;
                Lazy lazy = rjd.a;
                sjd sjd = sjd.a;
                return new djb((fua) cs2.a.getAccessor().g(cls2), sjd.y(), (jua) sjd.getAccessor().g(cls));
            case 8:
                KProperty[] kPropertyArr7 = PickerChatsTabWidget2.Z;
                Lazy lazy2 = rjd.a;
                sjd sjd2 = sjd.a;
                return new cjb((fua) cs2.a.getAccessor().g(cls2), sjd2.y(), (jua) sjd2.getAccessor().g(cls));
            case 9:
                KProperty[] kPropertyArr8 = PickerContactsListWidget.x0;
                cs2 cs22 = cs2.a;
                return new akb((cp3) cs22.getAccessor().g(cp3.class), cs22.getAccessor().h(cls3), cs22.getAccessor().h(tld.class));
            case 10:
                KProperty[] kPropertyArr9 = PickerContactsListWidget.x0;
                return new wh0(yh0.a.getAccessor().h(wu3.class), true, (zp3) null, 46);
            case 11:
                cs2 cs23 = cs2.a;
                return new oz(cs23.getAccessor().h(fq.class), cs23.getAccessor().h(ghf.class), cs23.getAccessor().h(cls4), cs23.getAccessor().h(cls3), cs23.getAccessor().h(Context.class), cs23.getAccessor().h(gb9.class), cs23.getAccessor().h(qx2.class), cs23.getAccessor().h(bl3.class), cs23.getAccessor().h(cls5));
            case 12:
                int i = PinBarsWidget.x;
                return new alb((ome) null, (Long) null, ta2.a);
            case 13:
                return Unit.INSTANCE;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                int i2 = pq7.a;
                return Boolean.valueOf(pq7.b(pq7.c));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return Cipher.getInstance("AES/CBC/PKCS7Padding");
            case 16:
                return ((qra) ym.e()).G();
            case LangUtils.HASH_SEED /*17*/:
                return new p6g(m21.a.getAccessor().h(dp1.class));
            case 18:
                return (oca) ((qra) ym.e()).f().r.getValue();
            case 19:
                return PmsKey.keys_delegate$lambda$1();
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return new gw0(jxb.a.d());
            case 23:
                jxb jxb = jxb.a;
                return new ind(jxb.getAccessor().h(cls5), jxb.getAccessor().h(aeb.class), jxb.d(), jxb.getAccessor().h(bud.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return new pg3(jxa.y, new igf(lxa.X), og3.c);
            case 25:
                return new ow3(jxa.G0, (ngf) new igf(lxa.q), Integer.valueOf(cad.c), (Integer) null, 20);
            case 26:
                return new ow3(jxa.N0, (ngf) new igf(lxa.x), Integer.valueOf(jya.I), Integer.valueOf(cad.D), Integer.valueOf(jya.E));
            case 27:
                return new ow3(jxa.M0, (ngf) new igf(lxa.w), Integer.valueOf(jya.I), Integer.valueOf(cad.D), Integer.valueOf(jya.E));
            case 28:
                return new ow3(jxa.r0, (ngf) new igf(lxa.S1), Integer.valueOf(jya.I), Integer.valueOf(cad.y), Integer.valueOf(jya.E));
            default:
                List createListBuilder = CollectionsKt.createListBuilder();
                createListBuilder.add(new ow3(jxa.a1, (ngf) new igf(lxa.z2), Integer.valueOf(cad.B1), (Integer) null, 20));
                createListBuilder.add(new ow3(jxa.Z0, (ngf) new igf(lxa.y2), Integer.valueOf(cad.n2), (Integer) null, 20));
                createListBuilder.add(new ow3(jxa.b1, (ngf) new igf(lxa.A2), Integer.valueOf(cad.A1), (Integer) null, 20));
                createListBuilder.add(new ow3(jxa.Y0, (ngf) new igf(lxa.x2), Integer.valueOf(cad.s), (Integer) null, 20));
                return CollectionsKt.build(createListBuilder);
        }
    }

    public /* synthetic */ lgb(Context context) {
        this.a = 18;
    }
}
