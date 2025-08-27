package one.me.stickersshowcase;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickersshowcase/StickersShowcaseScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "stickers-showcase_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStickersShowcaseScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickersShowcaseScreen.kt\none/me/stickersshowcase/StickersShowcaseScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,288:1\n419#2:289\n235#2,10:290\n1#3:300\n24#4:301\n24#4:321\n157#5,8:302\n256#5,2:310\n256#5,2:312\n256#5,2:314\n256#5,2:316\n256#5,2:318\n81#5:320\n*S KotlinDebug\n*F\n+ 1 StickersShowcaseScreen.kt\none/me/stickersshowcase/StickersShowcaseScreen\n*L\n58#1:289\n60#1:290,10\n167#1:301\n247#1:321\n168#1:302,8\n191#1:310,2\n193#1:312,2\n202#1:314,2\n214#1:316,2\n216#1:318,2\n239#1:320\n*E\n"})
public final class StickersShowcaseScreen extends Widget {
    public static final /* synthetic */ KProperty[] Y;
    public final o61 X;
    public final is a = new is(Long.class, 0L, "chat_id");
    public final Lazy b = createViewModelLazy(mve.class, new mle(6, new cve(this, 0)));
    public final Lazy c;
    public final hb8 o;
    public final ReadOnlyProperty v;
    public final ReadOnlyProperty w;
    public final sn0 x;
    public final sn0 y;
    public z3a z;

    static {
        Class<StickersShowcaseScreen> cls = StickersShowcaseScreen.class;
        Y = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "setsRecycler", "getSetsRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0)};
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, hb8] */
    public StickersShowcaseScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        ave ave = ave.a;
        this.c = ave.getAccessor().h(jb8.class);
        ? obj = new Object();
        this.o = obj;
        this.v = viewBinding(o1b.b);
        this.w = viewBinding(o1b.a);
        this.x = binding(new cve(this, 1));
        this.y = binding(new cve(this, 2));
        this.X = new o61(((aua) ave.getAccessor().g(aua.class)).a(), obj, new ykb(7, this));
    }

    public final EndlessRecyclerView2 c0() {
        return (EndlessRecyclerView2) this.w.getValue(this, Y[2]);
    }

    public final mve d0() {
        return (mve) this.b.getValue();
    }

    public final yh7 getInsetsConfig() {
        yh7 yh7 = yh7.c;
        return yh7.d;
    }

    public final void onActivityPaused(Activity activity) {
        ((jb8) this.c.getValue()).a(this.o);
    }

    public final void onActivityResumed(Activity activity) {
        ((jb8) this.c.getValue()).b(this.o);
    }

    public final void onChangeStarted(ey3 ey3, fy3 fy3) {
        super.onChangeStarted(ey3, fy3);
        fy3 fy32 = fy3.POP_ENTER;
        Lazy lazy = this.c;
        hb8 hb8 = this.o;
        if (fy3 == fy32 || fy3 == fy3.PUSH_ENTER) {
            ((jb8) lazy.getValue()).b(hb8);
        } else if (fy3 == fy3.PUSH_EXIT) {
            ((jb8) lazy.getValue()).a(hb8);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        b0h.H(frameLayout, new bs8(3, (Continuation) null, 4));
        h3b d = o54.d(frameLayout.getContext(), (AttributeSet) null);
        d.setId(o1b.b);
        d.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        d.setTitle(p1b.a);
        d.setForm(z2b.a);
        d.setRightActions(new u2b(new c3b(new dve(this)), new a3b(lya.z, new duc(10))));
        d.setLeftActions(new p2b(new jkb(24, (Object) this)));
        frameLayout.addView(d);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(o1b.a);
        endlessRecyclerView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int roundToInt = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        endlessRecyclerView2.setPadding(roundToInt, endlessRecyclerView2.getPaddingTop(), roundToInt, endlessRecyclerView2.getPaddingBottom());
        frameLayout.addView(endlessRecyclerView2);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        this.o.a();
        EndlessRecyclerView2 c0 = c0();
        c0.setAdapter((tyc) null);
        c0.setPager((u65) null);
    }

    public final void onViewCreated(View view) {
        EndlessRecyclerView2 c0 = c0();
        h3b h3b = (h3b) this.v.getValue(this, Y[1]);
        u3b.a(h3b, new uj6((ViewGroup) h3b, (RecyclerView) c0, (Widget) this, 25));
        c0.getContext();
        c0.setLayoutManager(new LinearLayoutManager());
        c0.setItemAnimator((yyc) null);
        c0.j(new cl2(MathKt.roundToInt(((float) 6) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density), 6));
        c0.setPager(new k71(11, this));
        c0.setIgnoreRefreshingFlagsForScrollEvent(true);
        c0.setAdapter(this.X);
        bs0.K(new ps5(d0().Y, new p2c(2, this, StickersShowcaseScreen.class, "handleNewState", "handleNewState(Lone/me/stickersshowcase/model/ShowcaseState;)V", 4, 15), 5), getViewLifecycleScope());
        bs0.K(new ps5(d0().y, new p2c(2, this, StickersShowcaseScreen.class, "handleEvents", "handleEvents(Lone/me/stickersshowcase/ShowcaseEvent;)V", 4, 16), 5), getViewLifecycleScope());
        bs0.K(new ps5(d0().z, new p2c(2, this, StickersShowcaseScreen.class, "handleNavEvents", "handleNavEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 17), 5), getViewLifecycleScope());
    }
}
