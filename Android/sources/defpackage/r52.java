package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: r52  reason: default package */
public final /* synthetic */ class r52 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ r52(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<jab> cls = jab.class;
        Class<ggd> cls2 = ggd.class;
        Class<Context> cls3 = Context.class;
        Class<rl> cls4 = rl.class;
        Class<gaf> cls5 = gaf.class;
        switch (this.a) {
            case 0:
                return f6e.a((Object) null);
            case 1:
                return new t5f(0);
            case 2:
                return new t5f(0);
            case 3:
                return new pg3(jxa.y, new igf(lxa.X), og3.c);
            case 4:
                return new ow3(jxa.d0, (ngf) new igf(lxa.q1), Integer.valueOf(jya.I), Integer.valueOf(cad.y), Integer.valueOf(jya.E));
            case 5:
                return new ow3(jxa.Z, (ngf) new igf(lxa.y1), Integer.valueOf(cad.n1), (Integer) null, 20);
            case 6:
                return new t5f(0);
            case 7:
                return new t5f(0);
            case 8:
                KProperty[] kPropertyArr = ChatMediaDownloadBottomSheet.C0;
                u5e u5e = u5e.a;
                return new wd2(u5e.getAccessor().h(to9.class), u5e.getAccessor().h(k4f.class), u5e.getAccessor().h(cls4), u5e.getAccessor().h(ln5.class), u5e.getAccessor().h(ou8.class), (Context) u5e.getAccessor().g(cls3), (gaf) u5e.getAccessor().g(cls5), new vcd((ggd) u5e.getAccessor().g(cls2), ((osa) ((gaf) u5e.getAccessor().g(cls5))).b(), (jab) u5e.getAccessor().g(cls)));
            case 9:
                jxb jxb = jxb.a;
                jxb.getClass();
                return new vcd((ggd) jxb.getAccessor().g(cls2), ((osa) ((gaf) jxb.getAccessor().g(cls5))).b(), (jab) jxb.getAccessor().g(cls));
            case 10:
                return new dd2();
            case 11:
                KProperty[] kPropertyArr2 = ChatMediaViewerScreen.H0;
                return jgd.CHAT_MEDIA_VIEWER;
            case 12:
                return new ow3(jxa.s0, (ngf) new igf(lxa.T1), Integer.valueOf(jya.K), Integer.valueOf(cad.s), Integer.valueOf(jya.F));
            case 13:
                return new ow3(jxa.r0, (ngf) new igf(lxa.S1), Integer.valueOf(jya.I), Integer.valueOf(cad.y), Integer.valueOf(jya.E));
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new ow3(jxa.q0, (ngf) new igf(lxa.R1), Integer.valueOf(jya.I), Integer.valueOf(cad.y), Integer.valueOf(jya.E));
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new ow3(jxa.p0, (ngf) new igf(lxa.Q1), Integer.valueOf(jya.I), Integer.valueOf(cad.y), Integer.valueOf(jya.E));
            case 16:
                KProperty[] kPropertyArr3 = ChatMembersScreen.X;
                return jgd.CHAT_INFO_ALL_PARTICIPANTS;
            case LangUtils.HASH_SEED:
                return new tl4(jxb.a.getAccessor().h(cls4));
            case 18:
                KProperty[] kPropertyArr4 = ChatNotificationsSettingsScreen.w;
                return new jl2();
            case 19:
                return new tl4(jxb.a.getAccessor().h(cls4));
            case 20:
                return jxb.a.getAccessor().h(is9.class);
            case 21:
                return new nxb();
            case 22:
                return new swb();
            case 23:
                KProperty[] kPropertyArr5 = ChatScreen.d1;
                return new kf8();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                KProperty[] kPropertyArr6 = ChatScreen.d1;
                return new sr8((uq7) un2.a.getAccessor().g(uq7.class), 7);
            case 25:
                KProperty[] kPropertyArr7 = ChatScreen.d1;
                return un2.a.d();
            case 26:
                KProperty[] kPropertyArr8 = ChatScreen.d1;
                un2 un2 = un2.a;
                return new oz(un2.getAccessor().h(fq.class), un2.getAccessor().h(ghf.class), un2.getAccessor().h(x23.class), un2.getAccessor().h(cls5), un2.getAccessor().h(cls3), un2.getAccessor().h(gb9.class), un2.getAccessor().h(qx2.class), un2.getAccessor().h(bl3.class), un2.getAccessor().h(yva.class));
            case 27:
                KProperty[] kPropertyArr9 = ChatScreen.d1;
                return new yvc();
            case 28:
                KProperty[] kPropertyArr10 = ChatScreen.d1;
                return new rk9();
            default:
                un2 un22 = un2.a;
                return new vrd(un22.getAccessor().h(cls5), un22.getAccessor().h(jqg.class), un22.getAccessor().h(o29.class), un22.getAccessor().h(ej9.class), un22.getAccessor().h(ar6.class));
        }
    }
}
