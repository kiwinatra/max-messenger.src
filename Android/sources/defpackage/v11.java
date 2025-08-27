package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.ColorDrawable;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: v11  reason: default package */
public final /* synthetic */ class v11 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ v11(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<edb> cls = edb.class;
        switch (this.a) {
            case 0:
                return new AnimatorSet();
            case 1:
                return m21.a.c();
            case 2:
                return new hg5(50);
            case 3:
                return new hg5(50);
            case 4:
                return new k41(0);
            case 5:
                return new e41();
            case 6:
                s9a s9a = CallHistoryPageScreen.X;
                igf igf = new igf(vkc.call_history_item_call_context_action_remove);
                int i = oec.ic_delete_22;
                return CollectionsKt.listOf(new ow3(0, (ngf) igf, Integer.valueOf(jya.I), Integer.valueOf(i), Integer.valueOf(jya.E)));
            case 7:
                b71.b.n1((Long) null, (String) null, (CharSequence) null);
                return Unit.INSTANCE;
            case 8:
                u9a u9a = CallIncomingScreen.x;
                return (edb) m21.a.getAccessor().g(cls);
            case 9:
                return new ki1();
            case 10:
                return new ColorDrawable(0);
            case 11:
                KProperty[] kPropertyArr = CallJoinLinkPreviewWidget.z0;
                return jgd.CALL_JOIN_LINK_PREVIEW;
            case 12:
                KProperty[] kPropertyArr2 = CallLinkInfoScreen.z0;
                return jgd.CALL_CREATE_GROUP_LINK;
            case 13:
                KProperty[] kPropertyArr3 = CallMoreBottomSheet.v0;
                return new nxc();
            case Protos.Attaches.Attach.LOCATION:
                return new cx4(10).thenComparing(new cx4(11)).reversed();
            case Protos.Attaches.Attach.DAILY_MEDIA:
                KProperty[] kPropertyArr4 = CallOpponentsListWidget.B0;
                Lazy lazy = rjd.a;
                gaf y = sjd.a.y();
                oh1 oh1 = oh1.a;
                return new he1(oh1.getAccessor().h(hl1.class), (h9b) m21.a.getAccessor().g(h9b.class), y, (ap1) oh1.getAccessor().g(ap1.class));
            case 16:
                KProperty[] kPropertyArr5 = CallOpponentsListWidget.B0;
                float f = vo4.c().getDisplayMetrics().density * 12.0f;
                return new float[]{f, f, f, f, f, f, f, f};
            case LangUtils.HASH_SEED:
                return m21.a.c();
            case 18:
                KProperty[] kPropertyArr6 = rf1.v0;
                return 262952;
            case 19:
                gga gga = CallScreen.J0;
                return (nj1) m21.a.getAccessor().g(nj1.class);
            case 20:
                gga gga2 = CallScreen.J0;
                return new qcb(m21.a.getAccessor().h(cls));
            case 21:
                gga gga3 = CallScreen.J0;
                return new mk1();
            case 22:
                gga gga4 = CallScreen.J0;
                return jgd.CALL;
            case 23:
                return new p6g(m21.a.getAccessor().h(dp1.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return new ll1();
            case 25:
                nj1 nj1 = CallServiceImpl.y;
                return (kq1) m21.a.getAccessor().g(kq1.class);
            case 26:
                nj1 nj12 = CallServiceImpl.y;
                return m21.a.c();
            case 27:
                nj1 nj13 = CallServiceImpl.y;
                return (a21) m21.a.getAccessor().g(a21.class);
            case 28:
                nj1 nj14 = CallServiceImpl.y;
                return (kgd) m21.a.getAccessor().g(kgd.class);
            default:
                nj1 nj15 = CallServiceImpl.y;
                return (edb) m21.a.getAccessor().g(cls);
        }
    }
}
