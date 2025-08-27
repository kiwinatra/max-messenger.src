package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.functions.Function2;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.profile.ProfileScreen;
import org.apache.http.util.LangUtils;
import ru.ok.messages.calls.views.CallControlsView;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.media.attaches.MessageAttachmentsLayout;
import ru.ok.messages.media.audio.AudioListenView;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.tamtam.nano.Protos;

/* renamed from: z20  reason: default package */
public final /* synthetic */ class z20 implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z20(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onLongClick(View view) {
        x20 x20;
        boolean z = false;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                x20 x202 = ((AudioAttachView) obj).w0;
                if (x202 != null) {
                    gg9 gg9 = (gg9) x202;
                    if (gg9.b1 != null) {
                        a89 a89 = gg9.U0.a;
                    }
                }
                return true;
            case 1:
                f50 f50 = ((AudioListenView) obj).x;
                if (f50 != null) {
                    s60 s60 = (s60) f50;
                    s60.d.e("ACTION_AUDIO_RECORD_REGULAR_LONG_CLICK");
                    if (s60.m != r60.c) {
                        z = true;
                    }
                    if (s60.x > 1000) {
                        if (z) {
                            s60.G.e(s60.o);
                        }
                        for (q60 b2 : s60.k) {
                            b2.b(s60.f());
                        }
                    } else {
                        s60.k();
                    }
                    s60.v();
                }
                return true;
            case 2:
                y70 y70 = ((z70) obj).a;
                if (!(y70 == null || (x20 = ((AudioAttachView) y70).w0) == null)) {
                    gg9 gg92 = (gg9) x20;
                    if (gg92.b1 != null) {
                        a89 a892 = gg92.U0.a;
                    }
                }
                return true;
            case 3:
                return ((cn0) obj).performLongClick();
            case 4:
                j01 j01 = ((l01) obj).a;
                if (j01 != null) {
                    gg9 gg93 = (gg9) j01;
                    if (gg93.b1 != null) {
                        a89 a893 = gg93.U0.a;
                    }
                }
                return true;
            case 5:
                int i = CallControlsView.x;
                ((CallControlsView) obj).getClass();
                return false;
            case 6:
                kl3 kl3 = (kl3) obj;
                er7 er7 = kl3.N0;
                if (er7 != null) {
                    long j = kl3.P0;
                    s9a s9a = CallHistoryPageScreen.X;
                    CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) er7.b;
                    if (!((t71) callHistoryPageScreen.e0().x.getValue()).a) {
                        callHistoryPageScreen.f0().w0 = Long.valueOf(j);
                        m58.b(ix3.b).h((List) callHistoryPageScreen.y.getValue()).o(kl3).k(vo4.c().getDisplayMetrics().density * 12.0f).build().o(callHistoryPageScreen);
                    }
                }
                return kl3.N0 != null;
            case 7:
                ((MediaBarPreviewLayout) obj).R0.o();
                return true;
            case 8:
                p89 p89 = ((MessageAttachmentsLayout) obj).v;
                l89 l89 = p89.x0;
                p89.z.F(0);
                l89.a();
                return true;
            case 9:
                kg9 kg9 = (kg9) obj;
                if (kg9.z0 != null) {
                    kg9.w.getViewMessage();
                }
                return true;
            case 10:
                ((h2a) obj).N(new zj0(22));
                return true;
            case 11:
                ((n2a) obj).N(new zj0(22));
                return true;
            case 12:
                ((u3a) obj).N(new zj0(22));
                return true;
            case 13:
                b4a b4a = (b4a) obj;
                dac dac = b4a.y;
                if (dac != null) {
                    dac.d(new x3a(b4a, 4));
                }
                return true;
            case Protos.Attaches.Attach.LOCATION:
                ((g4a) obj).N(new zj0(22));
                return true;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                k7c g0 = ((ProfileScreen) ((x5c) obj).v).g0();
                xag.h(g0.w0, new f6c((List) ((nxb) g0.A0.getValue()).l.getValue()));
                return true;
            case 16:
                return ((a6e) obj).performLongClick();
            case LangUtils.HASH_SEED:
                hse hse = (hse) obj;
                gse gse = hse.K0;
                if (gse != null) {
                    gse.D(hse.L0);
                }
                return true;
            case 18:
                return ((vff) obj).performLongClick();
            default:
                w4g w4g = (w4g) obj;
                Long l = w4g.y;
                if (l != null) {
                    long longValue = l.longValue();
                    Function2 function2 = w4g.w;
                    if (function2 != null) {
                        Long valueOf = Long.valueOf(longValue);
                        ViewGroup viewGroup = (ViewGroup) w4g.b;
                        if (viewGroup == null) {
                            viewGroup = null;
                        }
                        function2.invoke(valueOf, viewGroup);
                    }
                }
                return true;
        }
    }
}
