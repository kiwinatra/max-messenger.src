package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.photoeditor.ActPhotoEditor;
import ru.ok.tamtam.nano.Protos;

/* renamed from: j6  reason: default package */
public final /* synthetic */ class j6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke() {
        Object value;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                int i = ActLocalMedias.W0;
                int intExtra = ((ActLocalMedias) obj).getIntent().getIntExtra("act:local_medias:chat_mode", 0);
                uk2.c.getClass();
                try {
                    return uk2.values()[intExtra];
                } catch (Throwable unused) {
                    return uk2.DEFAULT;
                }
            case 1:
                int i2 = ActPhotoEditor.E0;
                return Boolean.valueOf(((ActPhotoEditor) obj).getIntent().getBooleanExtra("photo_editor:regular_sending", true));
            case 2:
                KProperty[] kPropertyArr = AddChatAdminsScreen.w0;
                h9 h9Var = new h9(5);
                long c0 = ((AddChatAdminsScreen) obj).c0();
                jxb jxb = jxb.a;
                return new i49((Function1) h9Var, new z9(c0, jxb.c(), jxb.getAccessor().h(ptb.class), jxb.d(), jxb.getAccessor().h(ttb.class), 0), 4);
            case 3:
                KProperty[] kPropertyArr2 = AddChatMembersScreen.Z;
                int i3 = pq7.a;
                if (pq7.b(pq7.c)) {
                    kr7.z((AddChatMembersScreen) obj);
                }
                return Unit.INSTANCE;
            case 4:
                KProperty[] kPropertyArr3 = AdminsFromContactsScreen.X;
                AdminsFromContactsScreen adminsFromContactsScreen = (AdminsFromContactsScreen) obj;
                adminsFromContactsScreen.getClass();
                KProperty kProperty = AdminsFromContactsScreen.X[0];
                long longValue = ((Number) adminsFromContactsScreen.a.a(adminsFromContactsScreen)).longValue();
                jxb jxb2 = jxb.a;
                return new xb(longValue, (lb) jxb2.getAccessor().g(lb.class), jxb2.c(), jxb2.f());
            case 5:
                return ((me) obj).b.getContentResolver();
            case 6:
                q45 q45 = new q45();
                q45.setCallback(((cl) obj).z);
                return q45;
            case 7:
                w62 w62 = new w62();
                w62.e = Collections.singletonMap(1L, 1L);
                as asVar = (as) obj;
                a32 a2 = ((o82) asVar.w.getValue()).a(0, 0, w62.b(), (a89) null, (a89) null, (a89) null);
                a2.p0((km3) asVar.y.getValue());
                return a2;
            case 8:
                return ((gx) obj).i.k();
            case 9:
                nx nxVar = (nx) obj;
                return new z0g(nxVar.d, nxVar.c);
            case 10:
                AudioAttachView audioAttachView = (AudioAttachView) obj;
                for (Map.Entry entry : audioAttachView.H0.entrySet()) {
                    ViewGroup viewGroup = (ViewGroup) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    viewGroup.setClipToPadding((intValue & 1) != 0);
                    viewGroup.setClipChildren((intValue & 2) != 0);
                }
                audioAttachView.H0.clear();
                return Unit.INSTANCE;
            case 11:
                return q50.a((q50) obj);
            case 12:
                return new t50((u50) obj);
            case 13:
                ejd ejd = r89.y;
                k2b f = fu4.k.f((cn0) obj);
                ejd.getClass();
                return ejd.a(f);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                v01 v01 = (v01) obj;
                View m = y7e.m(v01, kgc.call_bottom_control_container);
                return m == null ? v01 : m;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                z01 z01 = (z01) obj;
                View m2 = y7e.m(z01, kgc.call_bottom_control_container);
                return m2 == null ? z01 : m2;
            case 16:
                KProperty[] kPropertyArr4 = CallBottomPanelWidget.y;
                CallBottomPanelWidget callBottomPanelWidget = (CallBottomPanelWidget) obj;
                return new i11(new eng(callBottomPanelWidget, 1), callBottomPanelWidget.d0());
            case LangUtils.HASH_SEED /*17*/:
                return new r11(sag.a((s11) obj));
            case 18:
                z68.f(((g71) obj).Z, "Didn't updated calls adapter after 5 times, too much computing!", (Throwable) null);
                return Unit.INSTANCE;
            case 19:
                e71 e71 = (e71) obj;
                return new be0(ew3.b(((kl3) e71.a).getContext(), oec.ic_call_24), goa.a, ((kl3) e71.a).getContext(), new d71(e71, 0), new d71(e71, 1));
            case 20:
                return Boolean.valueOf(((vj5) ((uj5) ((v71) obj).b.getValue())).o());
            case 21:
                u9a u9a = CallIncomingScreen.x;
                return new eng((CallIncomingScreen) obj, 1);
            case 22:
                o7e o7e = new o7e(((v81) obj).a);
                KProperty[] kPropertyArr5 = o7e.y0;
                o7e.x0.setValue(o7e, kPropertyArr5[7], Boolean.TRUE);
                o7e.y.setValue(o7e, kPropertyArr5[0], l7e.b);
                o7e.Z.setValue(o7e, kPropertyArr5[4], new float[]{0.9f, 1.1f, 0.9f});
                o7e.v0.setValue(o7e, kPropertyArr5[5], 8000L);
                o7e.z.setValue(o7e, kPropertyArr5[1], new float[]{c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO});
                o7e.Y.setValue(o7e, kPropertyArr5[3], 0L);
                o7e.a(l2b.a);
                return o7e;
            case 23:
                l2b.f.getClass();
                b38 b38 = new b38(jqa.g, -16745729, (Context) ((npg) obj).b);
                float f2 = (float) 12;
                b38.setBounds(0, 0, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
                return b38;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return Long.valueOf(((qjd) ((x23) ((ya1) obj).c.a.getValue())).s());
            case 25:
                return oc1.a((oc1) obj);
            case 26:
                ((rf1) obj).getClass();
                return null;
            case 27:
                KProperty[] kPropertyArr6 = CallRateBottomSheet.G0;
                CallRateBottomSheet callRateBottomSheet = (CallRateBottomSheet) obj;
                callRateBottomSheet.getClass();
                KProperty[] kPropertyArr7 = CallRateBottomSheet.G0;
                KProperty kProperty2 = kPropertyArr7[0];
                KProperty kProperty3 = kPropertyArr7[1];
                boolean booleanValue = ((Boolean) callRateBottomSheet.x0.a(callRateBottomSheet)).booleanValue();
                KProperty kProperty4 = kPropertyArr7[2];
                return new fg1((String) callRateBottomSheet.w0.a(callRateBottomSheet), booleanValue, (List) callRateBottomSheet.y0.a(callRateBottomSheet));
            case 28:
                return Integer.valueOf(jk1.L((jk1) obj));
            default:
                sl1 sl1 = ((tl1) obj).E0;
                if (sl1 != null) {
                    KProperty[] kPropertyArr8 = CallTopPanelWidget.o;
                    xme xme = ((chd) ((CallTopPanelWidget) ((wie) sl1).b).d0().c.i).o;
                    do {
                        value = xme.getValue();
                    } while (!xme.b(value, dhd.a((dhd) value, (ehd) null, (zgd) null, true, 3)));
                }
                return Unit.INSTANCE;
        }
    }
}
