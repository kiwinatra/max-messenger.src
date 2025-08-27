package defpackage;

import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: hn9  reason: default package */
public final /* synthetic */ class hn9 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ hn9(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    public final Object invoke(Object obj) {
        MessagesListWidget messagesListWidget = this.b;
        switch (this.a) {
            case 0:
                f3g f3g = (f3g) obj;
                KProperty[] kPropertyArr = MessagesListWidget.R0;
                en9 k0 = messagesListWidget.k0();
                k0.getClass();
                k0.j1.setValue(k0, en9.A1[6], xag.g(k0, (CoroutineContext) null, f14.b, new tm9(k0, f3g, (Continuation) null), 1));
                messagesListWidget.k0().C(f3g.c, f3g.a, (String) null);
                return Unit.INSTANCE;
            case 1:
                FrameLayout frameLayout = (FrameLayout) obj;
                KProperty[] kPropertyArr2 = MessagesListWidget.R0;
                messagesListWidget.getClass();
                EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), (AttributeSet) null, 6);
                endlessRecyclerView2.setId(cwa.T);
                endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                endlessRecyclerView2.setLayoutManager(messagesListWidget.e0());
                xj9 xj9 = messagesListWidget.v0;
                endlessRecyclerView2.setAdapter(xj9);
                endlessRecyclerView2.setHasFixedSize(true);
                endlessRecyclerView2.setItemAnimator((yyc) null);
                endlessRecyclerView2.setThreshold(20);
                endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
                endlessRecyclerView2.setPager(new ch2(17, messagesListWidget));
                endlessRecyclerView2.m(messagesListWidget.H0);
                endlessRecyclerView2.m(messagesListWidget.I0);
                endlessRecyclerView2.m(messagesListWidget.J0);
                endlessRecyclerView2.k(new xq7(1, messagesListWidget));
                v74 v74 = new v74(new hn9(messagesListWidget, 4));
                messagesListWidget.B0 = v74;
                nwe nwe = new nwe(endlessRecyclerView2, xj9, v74);
                endlessRecyclerView2.j(nwe);
                messagesListWidget.C0 = nwe;
                bwf bwf = new bwf(xj9, endlessRecyclerView2);
                endlessRecyclerView2.j(bwf);
                messagesListWidget.A0 = bwf;
                g6f g6f = new g6f(vi9.a.getAccessor().h(lo0.class), new WeakReference(endlessRecyclerView2), messagesListWidget.requireActivity(), new gn9(messagesListWidget, 6), new hn9(messagesListWidget, 5));
                messagesListWidget.Y = g6f;
                eo9 eo9 = new eo9(messagesListWidget, g6f);
                messagesListWidget.Z = eo9;
                eo9.i(endlessRecyclerView2);
                b0h.H(endlessRecyclerView2, new sa((Object) messagesListWidget, (Continuation) null, 20, false));
                frameLayout.addView(endlessRecyclerView2);
                frameLayout.addView(messagesListWidget.d0());
                KProperty kProperty = MessagesListWidget.R0[10];
                frameLayout.addView((vqc) messagesListWidget.O0.getValue());
                xhd xhd = new xhd(frameLayout.getContext());
                xhd.setId(cwa.U);
                xhd.setOnClickListener(new hn9(messagesListWidget, 2));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density));
                layoutParams.gravity = 8388693;
                Unit unit = Unit.INSTANCE;
                frameLayout.addView(xhd, layoutParams);
                return Unit.INSTANCE;
            case 2:
                KProperty[] kPropertyArr3 = MessagesListWidget.R0;
                int ordinal = ((rhd) obj).ordinal();
                if (ordinal == 0) {
                    MessageModel N = messagesListWidget.v0.N(messagesListWidget.h0().getLinearLayoutManager().X0());
                    if (N == null) {
                        return Unit.INSTANCE;
                    }
                    en9 k02 = messagesListWidget.k0();
                    k02.H(ev0.u(k02.a, k02.A0, f14.b, new nm9(k02, N, (Continuation) null)));
                } else if (ordinal == 1) {
                    en9 k03 = messagesListWidget.k0();
                    k03.H(ev0.u(k03.a, k03.A0, f14.b, new sl9(k03, (Continuation) null)));
                } else if (ordinal == 2) {
                    en9 k04 = messagesListWidget.k0();
                    k04.H(ev0.u(k04.a, k04.A0, f14.b, new km9(k04, (Continuation) null)));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            case 3:
                long longValue = ((Long) obj).longValue();
                KProperty[] kPropertyArr4 = MessagesListWidget.R0;
                messagesListWidget.k0().z(longValue);
                return Unit.INSTANCE;
            case 4:
                MessageModel N2 = messagesListWidget.v0.N(((Integer) obj).intValue());
                CharSequence charSequence = N2 != null ? N2.w : null;
                if (charSequence == null || charSequence.length() == 0) {
                    return null;
                }
                return charSequence;
            default:
                int intValue = ((Integer) obj).intValue();
                KProperty[] kPropertyArr5 = MessagesListWidget.R0;
                messagesListWidget.l0();
                MessageModel N3 = messagesListWidget.v0.N(intValue);
                if (N3 != null) {
                    rk9 i0 = messagesListWidget.i0();
                    i0.getClass();
                    xag.h(i0.z, new pk9(N3.a));
                }
                return Unit.INSTANCE;
        }
    }
}
