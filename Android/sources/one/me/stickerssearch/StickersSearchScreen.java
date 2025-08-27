package one.me.stickerssearch;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickerssearch/StickersSearchScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "stickers-search_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStickersSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickersSearchScreen.kt\none/me/stickerssearch/StickersSearchScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,276:1\n420#2:277\n235#2,10:278\n24#3:288\n24#3:290\n24#3:310\n1#4:289\n157#5,8:291\n256#5,2:299\n256#5,2:301\n256#5,2:303\n256#5,2:305\n256#5,2:307\n81#5:309\n*S KotlinDebug\n*F\n+ 1 StickersSearchScreen.kt\none/me/stickerssearch/StickersSearchScreen\n*L\n57#1:277\n62#1:278,10\n133#1:288\n158#1:290\n228#1:310\n159#1:291,8\n180#1:299,2\n182#1:301,2\n191#1:303,2\n202#1:305,2\n204#1:307,2\n218#1:309\n*E\n"})
public final class StickersSearchScreen extends Widget {
    public static final /* synthetic */ KProperty[] X;
    public final is a = new is(Long.class, "chat_id");
    public final Lazy b = createViewModelLazy(ute.class, new mle(4, new kte(this, 0)));
    public final Lazy c;
    public final hb8 o;
    public final ReadOnlyProperty v;
    public final ReadOnlyProperty w;
    public final sn0 x;
    public final sn0 y;
    public final t56 z;

    static {
        Class<StickersSearchScreen> cls = StickersSearchScreen.class;
        X = new KProperty[]{wj6.p(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wj6.p(cls, "stickersRecycler", "getStickersRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), wj6.p(cls, "searchView", "getSearchView()Lone/me/sdk/uikit/common/search/OneMeSearchView;", 0)};
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, hb8] */
    public StickersSearchScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        ite ite = ite.a;
        this.c = ite.getAccessor().h(jb8.class);
        this.o = new Object();
        this.v = viewBinding(j1b.a);
        this.w = viewBinding(j1b.b);
        this.x = binding(new kte(this, 1));
        this.y = binding(new kte(this, 2));
        this.z = new t56(((aua) ite.getAccessor().g(aua.class)).a(), new p3a((Object) this));
    }

    public final EndlessRecyclerView2 c0() {
        return (EndlessRecyclerView2) this.v.getValue(this, X[1]);
    }

    public final ute d0() {
        return (ute) this.b.getValue();
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
        b0h.H(frameLayout, new bs8(3, (Continuation) null, 3));
        pza pza = new pza(frameLayout.getContext());
        pza.setId(j1b.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        layoutParams.rightMargin = MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f);
        pza.setLayoutParams(layoutParams);
        pza.setSearchHint(pza.getContext().getString(k1b.a));
        pza.c();
        pza.setListener(new lte(this));
        frameLayout.addView(pza);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(j1b.a);
        endlessRecyclerView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int roundToInt = MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density);
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
        pza pza = (pza) this.w.getValue(this, X[2]);
        u3b.a(pza, new vj6((ViewGroup) pza, (Object) c0, (Object) this, 22));
        int A = b0h.A(c0.getContext());
        c0.getContext();
        c0.setLayoutManager(new GridLayoutManager(A));
        c0.setItemAnimator((yyc) null);
        c0.j(new jz0(A, MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), 7));
        c0.k(new xq7(3, this));
        c0.setPager(new k71(10, this));
        c0.setIgnoreRefreshingFlagsForScrollEvent(true);
        c0.setAdapter(this.z);
        etc etc = d0().x;
        ju7 lifecycle = this.lifecycleOwner.getLifecycle();
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, lifecycle, iu7), new p2c(2, this, StickersSearchScreen.class, "handleNewState", "handleNewState(Lone/me/stickerssearch/model/SearchState;)V", 4, 10), 5), getLifecycleScope());
        bs0.K(new ps5(ct.k(d0().y, this.lifecycleOwner.getLifecycle(), iu7), new p2c(2, this, StickersSearchScreen.class, "handleNavEvents", "handleNavEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 11), 5), getLifecycleScope());
    }
}
