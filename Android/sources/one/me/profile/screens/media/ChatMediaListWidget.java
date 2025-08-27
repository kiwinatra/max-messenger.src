package one.me.profile.screens.media;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profile/screens/media/ChatMediaListWidget;", "Lone/me/sdk/arch/Widget;", "Lle2;", "Lcx3;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Leg2;", "type", "(JLeg2;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatMediaListWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatMediaListWidget.kt\none/me/profile/screens/media/ChatMediaListWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 5 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,281:1\n420#2:282\n410#2,8:284\n410#2,8:292\n24#3:283\n135#4,3:300\n138#4,8:317\n33#5,14:303\n*S KotlinDebug\n*F\n+ 1 ChatMediaListWidget.kt\none/me/profile/screens/media/ChatMediaListWidget\n*L\n54#1:282\n126#1:284,8\n135#1:292,8\n111#1:283\n243#1:300,3\n243#1:317,8\n243#1:303,14\n*E\n"})
@SuppressLint({"ValidController"})
public final class ChatMediaListWidget extends Widget implements le2, cx3, qg3 {
    public static final /* synthetic */ KProperty[] y;
    public m29 a;
    public final wie b;
    public final is c;
    public final gh2 o;
    public final Lazy v;
    public final ReadOnlyProperty w;
    public final sn0 x;

    static {
        Class<ChatMediaListWidget> cls = ChatMediaListWidget.class;
        y = new KProperty[]{rae.s(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;", 0), wj6.p(cls, "mediaType", "getMediaType()Lone/me/profile/screens/media/model/ChatMediaType;", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), wj6.p(cls, "emptyView", "getEmptyView()Lone/me/profile/screens/media/view/ChatMediaEmptyView;", 0)};
    }

    public ChatMediaListWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.b = o5a.U();
        this.c = new is(eg2.class, "media_type");
        long j = bundle.getLong("chat_id");
        eg2 d0 = d0();
        jxb jxb = jxb.a;
        long j2 = bundle.getLong("chat_id");
        q4 q4Var = ((rwb) jxb.getAccessor().g(rwb.class)).a;
        gh2 gh2 = new gh2(j, d0, new he2(j2, (sv0) q4Var.g(sv0.class), (gaf) q4Var.g(gaf.class)));
        this.o = gh2;
        this.v = jxb.getAccessor().h(cpb.class);
        this.w = viewBinding(jxa.j0);
        a32 o2 = gh2.o();
        a89 a89 = o2 != null ? o2.c : null;
        Long valueOf = a89 != null ? Long.valueOf(a89.h()) : null;
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            se2 r = gh2.r();
            if (r != null) {
                z68.c(r.a, "load: time = %d, loadOperation = %s", Long.valueOf(longValue), r.y);
                if (longValue != 0) {
                    synchronized (r.y) {
                        try {
                            synchronized (r.y) {
                            }
                            if (r.y.b == longValue) {
                                z68.n(r.a, (IOException) null, "load: duplicate invocation", Arrays.copyOf(new Object[0], 0));
                            } else {
                                r.X.a();
                                r.z.a();
                                r.y.a();
                                r.y.b = longValue;
                                dv dvVar = r.y;
                                na3 na3 = new na3(1, new qa3(0, new bv(new yu(r, longValue, 1))).l(r.c).i(r.o), new zu(r, 2));
                                ao1 ao1 = new ao1(0, new zu(r, 3), new av(r, 1));
                                na3.j(ao1);
                                dvVar.o = ao1;
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                }
            }
        }
        this.x = binding(new nm1(6, this));
    }

    public static final EndlessRecyclerView2 c0(ChatMediaListWidget chatMediaListWidget) {
        chatMediaListWidget.getClass();
        return (EndlessRecyclerView2) chatMediaListWidget.w.getValue(chatMediaListWidget, y[2]);
    }

    public final eg2 d0() {
        KProperty kProperty = y[1];
        return (eg2) this.c.a(this);
    }

    public final void e0(m29 m29) {
        gh2 gh2 = this.o;
        aje u = ev0.u(gh2.a, ((osa) gh2.q()).b(), f14.b, new vg2(gh2, m29, (Continuation) null));
        gh2.B0.setValue(gh2, gh2.P0[0], u);
    }

    public final void f0(m29 m29, View view) {
        b0h.K(view, rw6.LONG_PRESS);
        if (this.a == null) {
            KProperty[] kPropertyArr = y;
            KProperty kProperty = kPropertyArr[0];
            wie wie = this.b;
            pm7 pm7 = (pm7) wie.getValue(this, kProperty);
            if (pm7 == null || !pm7.isActive()) {
                wie.setValue(this, kPropertyArr[0], ev0.v(getViewLifecycleScope(), (CoroutineContext) null, f14.b, new re2(this, m29, view, (Continuation) null), 1));
            }
        }
    }

    public final void g(int i, Bundle bundle) {
        Object obj;
        if (bundle != null) {
            long j = bundle.getLong("selected_message_id");
            long j2 = bundle.getLong("selected_attach_id");
            gh2 gh2 = this.o;
            Iterator it = ((jg2) gh2.M0.getValue()).a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                m29 m29 = (m29) obj;
                if (m29.m() == j && m29.j() == j2) {
                    break;
                }
            }
            m29 m292 = (m29) obj;
            if (m292 != null) {
                gh2.x(i, m292);
            }
        }
    }

    public final void onAttach(View view) {
        if (d0() == eg2.b) {
            u50 u50 = ((cpb) this.v.getValue()).b;
            u50.x = true;
            u50.e();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(layoutInflater.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(jxa.j0);
        endlessRecyclerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        endlessRecyclerView2.setPager(this.o.L0);
        endlessRecyclerView2.setThreshold(20);
        endlessRecyclerView2.setAdapter(new me2(((aua) jxb.a.getAccessor().g(aua.class)).a(), this));
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        mg4 mg4 = new mg4();
        mg4.g = false;
        endlessRecyclerView2.setItemAnimator(mg4);
        endlessRecyclerView2.setOverScrollMode(2);
        KProperty[] kPropertyArr = y;
        KProperty kProperty = kPropertyArr[3];
        sn0 sn0 = this.x;
        endlessRecyclerView2.setEmptyView((yd2) sn0.getValue());
        endlessRecyclerView2.setHasFixedSize(true);
        if (oe2.$EnumSwitchMapping$0[d0().ordinal()] == 1) {
            endlessRecyclerView2.getContext();
            endlessRecyclerView2.setLayoutManager(new GridLayoutManager(3));
            endlessRecyclerView2.j(new cl2(3, MathKt.roundToInt(((float) 3) * vo4.c().getDisplayMetrics().density), 3));
        } else {
            endlessRecyclerView2.getContext();
            endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
        }
        frameLayout.addView(endlessRecyclerView2);
        KProperty kProperty2 = kPropertyArr[3];
        frameLayout.addView((yd2) sn0.getValue());
        return frameLayout;
    }

    public final void onDetach(View view) {
        if (d0() == eg2.b) {
            u50 u50 = ((cpb) this.v.getValue()).b;
            u50.x = false;
            if (u50.w) {
                u50.w = false;
                p9c p9c = u50.b;
                p9c.b();
                p9c.h.remove(u50.y);
            }
        }
    }

    public final void onDismiss() {
        pm7 pm7 = (pm7) this.b.getValue(this, y[0]);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        this.a = null;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gh2 gh2 = this.o;
        etc etc = gh2.N0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new pe2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(gh2.I0, getViewLifecycleOwner().getLifecycle(), iu7), new qe2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void s(int i, Bundle bundle) {
        m29 m29 = this.a;
        if (m29 != null) {
            this.a = null;
            this.o.x(i, m29);
        }
    }

    public ChatMediaListWidget(long j, eg2 eg2) {
        this(o54.f(TuplesKt.to("chat_id", Long.valueOf(j)), TuplesKt.to("media_type", eg2)));
    }
}
