package one.me.webapp.rootscreen;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\b\u0000\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, d2 = {"Lone/me/webapp/rootscreen/WebAppRootScreen;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Lqg3;", "Lcx3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "botId", "Lkfg;", "entryPoint", "chatId", "", "startParam", "", "isFullscreen", "", "requestCode", "(JLkfg;Ljava/lang/Long;Ljava/lang/String;ZI)V", "web-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWebAppRootScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebAppRootScreen.kt\none/me/webapp/rootscreen/WebAppRootScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 ContextExt.kt\none/me/common/ext/ContextExtKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 10 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 11 AtomicFile.kt\none/me/sdk/android/tools/AtomicFileKt\n*L\n1#1,698:1\n420#2:699\n420#2:700\n420#2:701\n420#2:702\n419#2:703\n419#2:704\n235#2,10:706\n410#2,8:723\n5#3:705\n1#4:716\n24#5:717\n24#5:718\n24#5:720\n24#5:721\n24#5:722\n26#6:719\n65#7,4:731\n37#7:735\n53#7:736\n72#7:737\n256#7,2:807\n256#7,2:809\n256#7,2:811\n543#8,6:738\n135#9,3:744\n138#9,8:761\n135#9,3:769\n138#9,8:786\n33#10,14:747\n33#10,14:772\n13#11,13:794\n*S KotlinDebug\n*F\n+ 1 WebAppRootScreen.kt\none/me/webapp/rootscreen/WebAppRootScreen\n*L\n87#1:699\n88#1:700\n89#1:701\n90#1:702\n91#1:703\n93#1:704\n133#1:706,10\n373#1:723,8\n131#1:705\n300#1:717\n301#1:718\n326#1:720\n337#1:721\n338#1:722\n306#1:719\n380#1:731,4\n380#1:735\n380#1:736\n380#1:737\n223#1:807,2\n234#1:809,2\n245#1:811,2\n449#1:738,6\n501#1:744,3\n501#1:761,8\n580#1:769,3\n580#1:786,8\n501#1:747,14\n580#1:772,14\n647#1:794,13\n*E\n"})
@SuppressLint({"ValidController", "SetJavaScriptEnabled"})
public final class WebAppRootScreen extends BaseBottomSheetWidget implements qg3, cx3 {
    public static final /* synthetic */ KProperty[] D0;
    public final ReadOnlyProperty A0;
    public final sn0 B0;
    public final ReadOnlyProperty C0;
    public final is X;
    public final is Y;
    public final is Z;
    public final is v0;
    public final Lazy w0;
    public final w28 x0;
    public final is y;
    public final Lazy y0;
    public final is z;
    public final wie z0;

    static {
        Class<WebAppRootScreen> cls = WebAppRootScreen.class;
        D0 = new KProperty[]{rae.s(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()Ljava/lang/Long;", 0), rae.s(cls, "botId", "getBotId()J", 0), rae.s(cls, "entryPoint", "getEntryPoint()Lone/me/sdk/statistics/webapps/WebAppActionsStats$EntryPoint;", 0), rae.s(cls, "startParam", "getStartParam()Ljava/lang/String;", 0), rae.s(cls, "isFullscreen", "isFullscreen()Z", 0), wj6.p(cls, "requestCode", "getRequestCode()I", 0), rae.s(cls, "shareDialogJob", "getShareDialogJob()Lkotlinx/coroutines/Job;", 0), wj6.p(cls, "webView", "getWebView()Lone/me/webapp/rootscreen/ScrollTrackingWebView;", 0), wj6.p(cls, "webViewEventSender", "getWebViewEventSender()Lone/me/webapp/rootscreen/WebViewEventSender;", 0), wj6.p(cls, "toolbarView", "getToolbarView()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    }

    public WebAppRootScreen() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public static final void n0(WebAppRootScreen webAppRootScreen, Intent intent, tjg tjg) {
        Lazy lazy;
        Object obj;
        webAppRootScreen.getClass();
        byte[] bArr = tjg.a;
        String str = HTTP.PLAIN_TEXT_TYPE;
        if (bArr != null) {
            String str2 = tjg.b;
            String str3 = str2 == null ? "file" : str2;
            int i = 0;
            File file = null;
            while (true) {
                lazy = webAppRootScreen.y0;
                if (file != null && !file.exists()) {
                    break;
                } else if (i == 100) {
                    file = null;
                    break;
                } else {
                    file = ((po5) lazy.getValue()).i(tr1.j(str3, i > 0 ? a81.j(i, " (", ")") : ""));
                    i++;
                }
            }
            if (file != null) {
                ez ezVar = new ez(file, (lc5) null);
                FileOutputStream f = ezVar.f();
                if (f != null) {
                    try {
                        f.write(bArr);
                        ezVar.b(f);
                    } catch (Throwable th) {
                        ezVar.a(f);
                        throw th;
                    }
                }
                try {
                    Result.Companion companion = Result.Companion;
                    String str4 = tjg.c;
                    if (str4 != null) {
                        str = str4;
                    }
                    intent.setType(str);
                    if (str2 != null) {
                        intent.putExtra("android.intent.extra.TITLE", str2);
                    }
                    intent.putExtra("android.intent.extra.STREAM", ((po5) lazy.getValue()).f(webAppRootScreen.getContext(), file));
                    obj = Result.m23constructorimpl(intent.addFlags(1));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.Companion;
                    obj = Result.m23constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable r11 = Result.m26exceptionOrNullimpl(obj);
                if (r11 != null) {
                    r11.toString();
                }
                Result.m22boximpl(obj);
                return;
            }
            return;
        }
        intent.setType(str);
    }

    public static void s0(h3b h3b, boolean z2) {
        m2g S = m5a.S(wgf.f(h3b.getTitle()));
        l2g l2g = null;
        if (z2) {
            l2g b = wgf.b(h3b.getTitle());
            if ((b != null ? b.a : null) == S) {
                return;
            }
        }
        if (z2) {
            l2g b2 = wgf.b(h3b.getTitle());
            if ((b2 != null ? b2.a : null) != S) {
                l2g = new l2g(h3b.getContext(), S, new duc(29));
            }
        }
        wgf.e(h3b.getTitle(), l2g);
    }

    public final frb d0() {
        return new eig(this);
    }

    public final yh7 e0() {
        if (!r0()) {
            return this.o;
        }
        yh7 yh7 = yh7.c;
        return yh7.d;
    }

    public final void g(int i, Bundle bundle) {
        Integer valueOf = bundle != null ? Integer.valueOf(bundle.getInt("dialog_id")) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            if (i == 1) {
                hjg p0 = p0();
                p0.getClass();
                xag.h(p0.I0, new iig(false));
            }
        } else if (valueOf == null || valueOf.intValue() != 2) {
        } else {
            if (i == 1) {
                p0().l(true);
            } else if (i == 2) {
                p0().l(false);
            }
        }
    }

    public final pgd getScreenDelegate() {
        return this.x0;
    }

    public final boolean h0() {
        hjg p0 = p0();
        if (!((Boolean) p0.D0.getValue()).booleanValue()) {
            return true;
        }
        xag.g(p0, (CoroutineContext) null, (f14) null, new yig(p0, (Continuation) null), 3);
        return false;
    }

    public final boolean handleBack() {
        hjg p0 = p0();
        if (((Boolean) p0.C0.getValue()).booleanValue()) {
            tgg tgg = p0.A0;
            tgg.getClass();
            ev0.v((d14) tgg.a, (CoroutineContext) null, (f14) null, new so7(tgg, (Continuation) null), 3);
            return true;
        }
        xag.g(p0, (CoroutineContext) null, (f14) null, new yig(p0, (Continuation) null), 3);
        return true;
    }

    public final void k0() {
        hjg p0 = p0();
        if (!p0.F0) {
            lo7 lo7 = p0.J0;
            if (lo7 != null) {
                lo7.b(new v0());
            }
            p0.J0 = null;
            ConcurrentHashMap concurrentHashMap = p0.K0;
            concurrentHashMap.size();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                ((Number) entry.getKey()).longValue();
                ((lo7) entry.getValue()).b(new Throwable());
            }
            concurrentHashMap.clear();
            pm7 pm7 = p0.L0;
            if (pm7 != null) {
                pm7.b((CancellationException) null);
            }
            p0.L0 = null;
            KProperty[] kPropertyArr = hjg.M0;
            KProperty kProperty = kPropertyArr[0];
            wie wie = p0.z0;
            pm7 pm72 = (pm7) wie.getValue(p0, kProperty);
            if (pm72 != null) {
                pm72.b((CancellationException) null);
            }
            wie.setValue(p0, kPropertyArr[0], (Object) null);
        }
        hjg p02 = p0();
        if (!p02.F0) {
            p02.F0 = true;
            sfg sfg = (sfg) p02.v0.getValue();
            tfg tfg = p02.y0;
            if (tfg != null) {
                sfg.getClass();
                sfg.a(lfg.CLOSE, tfg.a, tfg.b, tfg.c, tfg.d, (String) null);
            }
        }
    }

    public final void m0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dig dig = new dig(this, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(q3b.c);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dig.invoke(linearLayout);
        frameLayout.addView(linearLayout);
    }

    public final h3b o0() {
        return (h3b) this.C0.getValue(this, D0[9]);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1013 && q0().getFilePathCallback() != null) {
            String str = null;
            if (i2 == -1) {
                if ((intent != null ? intent.getDataString() : null) != null) {
                    str = intent.getDataString();
                }
            }
            hjg p0 = p0();
            p0.getClass();
            xag.h(p0.I0, new sig(str));
        }
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new dr0(18, this));
        } else if (wgf.d(o0().getTitle())) {
            s0(o0(), true);
        }
    }

    public final void onDismiss() {
        KProperty[] kPropertyArr = D0;
        KProperty kProperty = kPropertyArr[6];
        wie wie = this.z0;
        pm7 pm7 = (pm7) wie.getValue(this, kProperty);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        wie.setValue(this, kPropertyArr[6], (Object) null);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        String string = getArgs().getString("web_root_screen:url");
        if (string != null) {
            q0().loadUrl(string);
        }
        bs0.K(new ps5(ct.k(p0().I0, getViewLifecycleOwner().getLifecycle(), iu7.o), new gig((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final hjg p0() {
        return (hjg) this.w0.getValue();
    }

    public final jid q0() {
        return (jid) this.A0.getValue(this, D0[7]);
    }

    public final boolean r0() {
        KProperty kProperty = D0[4];
        return ((Boolean) this.Z.a(this)).booleanValue();
    }

    public final void s(int i, Bundle bundle) {
        if (i == 1) {
            hjg p0 = p0();
            p0.getClass();
            aje g = xag.g(p0, (CoroutineContext) null, f14.b, new zig(p0, (Continuation) null), 1);
            p0.z0.setValue(p0, hjg.M0[0], g);
        }
    }

    public final void u0(boolean z2) {
        o0().setLeftActions(z2 ? new p2b(new dig(this, 1)) : new q2b(new dig(this, 2)));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebAppRootScreen(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }

    public WebAppRootScreen(Bundle bundle) {
        super(bundle);
        Class<Long> cls = Long.class;
        this.y = new is(cls, "web_root_screen:chat_id");
        this.z = new is(cls, "web_root_screen:bot_id");
        this.X = new is(kfg.class, "web_root_screen:entry_point");
        this.Y = new is(String.class, "web_root_screen:start_param");
        this.Z = new is(Boolean.class, Boolean.FALSE, "web_root_screen:is_fullscreen");
        this.v0 = new is(Integer.class, 0, "web_root_screen.request_code.key");
        this.w0 = createViewModelLazy(hjg.class, new mle(7, new cig(this, 0)));
        this.x0 = new w28(new i2g(9), new rh9(19, (Object) this), 4);
        this.y0 = xfg.a.getAccessor().h(po5.class);
        this.z0 = o5a.U();
        this.A0 = viewBinding(q3b.f);
        this.B0 = binding(new cig(this, 1));
        this.C0 = viewBinding(q3b.e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebAppRootScreen(long j, kfg kfg, Long l, String str, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, kfg, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? 0 : i);
    }

    public WebAppRootScreen(long j, kfg kfg, Long l, String str, boolean z2, int i) {
        this(o54.f(TuplesKt.to("web_root_screen:bot_id", Long.valueOf(j)), TuplesKt.to("web_root_screen:entry_point", kfg), TuplesKt.to("web_root_screen:chat_id", l), TuplesKt.to("web_root_screen:start_param", str), TuplesKt.to("web_root_screen:is_fullscreen", Boolean.valueOf(z2)), TuplesKt.to("web_root_screen.request_code.key", Integer.valueOf(i))));
    }
}
