package defpackage;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.arch.Widget;

/* renamed from: nh2  reason: default package */
public final class nh2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMediaViewerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nh2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.b = chatMediaViewerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        nh2 nh2 = new nh2(continuation, this.b);
        nh2.a = obj;
        return nh2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nh2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        n09 n09;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        p85 p85 = (p85) this.a;
        KProperty[] kPropertyArr = ChatMediaViewerScreen.H0;
        ChatMediaViewerScreen chatMediaViewerScreen = this.b;
        chatMediaViewerScreen.getClass();
        m09 m09 = null;
        if (p85 instanceof j85) {
            pm7 pm7 = chatMediaViewerScreen.F0;
            if (pm7 != null) {
                pm7.b((CancellationException) null);
            }
            if (((j85) p85).a instanceof fr8) {
                chatMediaViewerScreen.o0().a((yh2) chatMediaViewerScreen.r0().Q0.a.getValue());
                n09 n092 = chatMediaViewerScreen.x0;
                if (n092 != null) {
                    y7e.c((ViewGroup) n092.b, n092.g(), -1);
                }
                if (chatMediaViewerScreen.o0().getVisibility() == 0 && (n09 = chatMediaViewerScreen.x0) != null) {
                    n09.m(true);
                }
                n7g p0 = chatMediaViewerScreen.p0();
                if (chatMediaViewerScreen.D0 < c44.DEFAULT_ASPECT_RATIO && p0.b() == c44.DEFAULT_ASPECT_RATIO) {
                    p0.g(1.0f);
                }
                chatMediaViewerScreen.u0();
            } else {
                hf7 o0 = chatMediaViewerScreen.o0();
                Lazy lazy = o0.z;
                if (lazy.isInitialized()) {
                    ((xob) lazy.getValue()).setVisibility(8);
                }
                Lazy lazy2 = o0.v0;
                if (lazy2.isInitialized()) {
                    ((ImageView) lazy2.getValue()).setVisibility(8);
                }
            }
        } else if (!(p85 instanceof k85)) {
            if (p85 instanceof h85) {
                h85 h85 = (h85) p85;
                if (h85.a != null) {
                    e0b e0b = new e0b((Widget) chatMediaViewerScreen);
                    e0b.i(chatMediaViewerScreen.getContext().getString(h85.a.intValue()));
                    e0b.f(new o0b(cad.K));
                    e0b.j();
                }
                fma onBackPressedDispatcher = chatMediaViewerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
            } else if (p85 instanceof i85) {
                i85 i85 = (i85) p85;
                m09 m092 = i85.a;
                if (m092 == m09.v) {
                    n09 n093 = chatMediaViewerScreen.x0;
                    if (n093 != null) {
                        m09 = (m09) n093.z;
                    }
                    if (m09 != m092) {
                        chatMediaViewerScreen.s0(i85.b);
                    }
                }
                n09 n094 = chatMediaViewerScreen.x0;
                if (n094 != null) {
                    n094.l(i85.a);
                }
            } else if (!(p85 instanceof l85)) {
                if (p85 instanceof m85) {
                    hh2 hh2 = hh2.b;
                    m85 m85 = (m85) p85;
                    long j = m85.a;
                    int k0 = chatMediaViewerScreen.k0();
                    ta4 W0 = hh2.W0();
                    zqd zqd = new zqd(9);
                    zqd.b = ":dialogs/share-media";
                    zqd.z(Long.valueOf(j), "msg_id");
                    zqd.z(Long.valueOf(m85.b), "attach_id");
                    zqd.z(m85.c, "local_attach_id");
                    zqd.z(Integer.valueOf(m85.d.ordinal()), "cause_ordinal");
                    zqd.z(Integer.valueOf(k0), "snack_bot_margin");
                    zqd.z(Boolean.TRUE, "force_dark");
                    W0.c(zqd.p(), (Bundle) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
