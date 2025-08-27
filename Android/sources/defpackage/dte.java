package defpackage;

import android.content.Intent;
import android.view.View;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.login.welcome.WelcomeScreen;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.protocol.HTTP;
import ru.ok.messages.calls.views.TopCallControlsView;
import ru.ok.messages.suggests.SuggestsFragment;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: dte  reason: default package */
public final /* synthetic */ class dte implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dte(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onClick(View view) {
        String str = null;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                KProperty[] kPropertyArr = StickersScreen.Y;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                StickersScreen stickersScreen = (StickersScreen) obj;
                sve sve = (sve) stickersScreen.e0().y0.a.getValue();
                intent.putExtra("android.intent.extra.TEXT", sve != null ? sve.c : null);
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                i9d i9d = (i9d) CollectionsKt.lastOrNull(stickersScreen.getRouter().e());
                if (i9d != null) {
                    str = i9d.b;
                }
                nue.b.W0().b(":chats/share", o54.f(TuplesKt.to("ru.ok.tamtam.extra.DATA", intent), TuplesKt.to("tag", str)));
                return;
            case 1:
                KProperty[] kPropertyArr2 = SuggestionsWidget.z0;
                ((SuggestionsWidget) obj).s0();
                return;
            case 2:
                SuggestsViewModel V2 = ((SuggestsFragment) ((d1f) obj).v.b).V2();
                if (!(((b2f) ((o85) V2.r.getValue()).a) instanceof y1f)) {
                    c2f c2f = V2.w;
                    c2f c2f2 = c2f.a;
                    if (c2f == c2f2) {
                        c2f2 = c2f.b;
                    }
                    V2.w = c2f2;
                    V2.o(new a2f(SuggestsViewModel.l(V2.v, c2f2), 0, c2f2));
                    return;
                }
                return;
            case 3:
                ((a3b) ((d3b) obj)).b.invoke(view);
                return;
            case 4:
                ((b3b) obj).e.invoke(view);
                return;
            case 5:
                ((ymf) obj).dismiss();
                return;
            case 6:
                int i = TopCallControlsView.M0;
                ((TopCallControlsView) obj).getClass();
                return;
            case 7:
                w4g w4g = (w4g) obj;
                o00 o00 = w4g.x;
                Long l = w4g.y;
                if (o00 != null && l != null) {
                    long longValue = l.longValue();
                    Function2 function2 = w4g.v;
                    if (function2 != null) {
                        function2.invoke(o00, Long.valueOf(longValue));
                        return;
                    }
                    return;
                }
                return;
            case 8:
                KProperty[] kPropertyArr3 = WebAppRootScreen.D0;
                hjg p0 = ((WebAppRootScreen) obj).p0();
                p0.getClass();
                p0.z0.setValue(p0, hjg.M0[0], xag.g(p0, (CoroutineContext) null, f14.b, new zig(p0, (Continuation) null), 1));
                return;
            default:
                aj7 aj7 = (aj7) ((WelcomeScreen) obj).x.getValue();
                aj7.getClass();
                aj7.a(iq.n(new InputPhoneScreen(), (ey3) null, (ey3) null), "InputPhoneScreen");
                return;
        }
    }
}
