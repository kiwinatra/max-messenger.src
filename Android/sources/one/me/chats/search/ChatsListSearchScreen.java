package one.me.chats.search;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lone/me/chats/search/ChatsListSearchScreen;", "Lone/me/sdk/arch/Widget;", "Lcx3;", "Le23;", "Lqg3;", "Ldkd;", "Lys3;", "<init>", "()V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nChatsListSearchScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatsListSearchScreen.kt\none/me/chats/search/ChatsListSearchScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 8 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n+ 9 Tag.kt\nru/ok/tamtam/logger/TagKt\n+ 10 Log.kt\nru/ok/tamtam/logger/Log\n*L\n1#1,566:1\n419#2:567\n235#2,10:568\n235#2,10:578\n410#2,8:588\n410#2,8:596\n423#2,2:646\n32#3:604\n17#3:605\n19#3:609\n46#4:606\n51#4:608\n105#5:607\n1#6:610\n135#7,3:611\n138#7,8:628\n33#8,14:614\n5#9:636\n5#9:641\n32#10,4:637\n32#10,4:642\n*S KotlinDebug\n*F\n+ 1 ChatsListSearchScreen.kt\none/me/chats/search/ChatsListSearchScreen\n*L\n103#1:567\n105#1:568,10\n107#1:578,10\n207#1:588,8\n213#1:596,8\n496#1:646,2\n229#1:604\n229#1:605\n229#1:609\n229#1:606\n229#1:608\n229#1:607\n439#1:611,3\n439#1:628,8\n439#1:614,14\n443#1:636\n477#1:641\n443#1:637,4\n477#1:642,4\n*E\n"})
public final class ChatsListSearchScreen extends Widget implements cx3, e23, qg3, dkd, ys3 {
    public static final /* synthetic */ KProperty[] F0;
    public final kx2 A0;
    public final rd3 B0;
    public final ReadOnlyProperty C0;
    public final wie D0;
    public z3a E0;
    public final t56 X;
    public final c73 Y;
    public final t56 Z;
    public final w28 a = new w28(new s01(7, (Object) this), (Function0) null, 6);
    public final Lazy b;
    public final yh7 c;
    public final is o;
    public final Lazy v;
    public final t45 v0;
    public final Lazy w;
    public final c73 w0;
    public final ExecutorService x;
    public final kx2 x0;
    public final Lazy y;
    public final kx2 y0;
    public final c73 z;
    public final t56 z0;

    static {
        Class<ChatsListSearchScreen> cls = ChatsListSearchScreen.class;
        F0 = new KProperty[]{rae.s(cls, "selectedChatIdForAction", "getSelectedChatIdForAction()Ljava/lang/Long;", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), rae.s(cls, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;", 0)};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatsListSearchScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        cs2 cs2 = cs2.a;
        this.b = cs2.getAccessor().h(z5a.class);
        this.c = yh7.d;
        this.o = new is(Long.class, (Object) null, "selected.chatId.Action");
        this.v = createViewModelLazy(ov2.class, new rn2(10, new oq2(1)));
        this.w = createViewModelLazy(wh0.class, new rn2(11, new oq2(2)));
        ExecutorService a2 = cs2.d().a();
        this.x = a2;
        this.y = cs2.getAccessor().h(edb.class);
        c73 c73 = new c73(new gu2(this), a2);
        this.z = c73;
        t56 t56 = new t56((Object) new qu2(this), a2, 23);
        this.X = t56;
        c73 c732 = new c73((dkd) this, a2);
        this.Y = c732;
        t56 t562 = new t56((Object) new ch2(2, this), a2, 7);
        this.Z = t562;
        this.v0 = new t45(2, this);
        c73 c733 = new c73((dkd) this, a2);
        this.w0 = c733;
        kx2 kx2 = new kx2(a2, 3);
        this.x0 = kx2;
        kx2 kx22 = new kx2(a2, 2);
        this.y0 = kx22;
        t56 t563 = new t56((Object) this, a2, 4);
        this.z0 = t563;
        kx2 kx23 = new kx2(a2, 0);
        this.A0 = kx23;
        this.B0 = new rd3(new qd3(false, 1), c73, t563, t56, c732, t562, c733, kx23, kx2, kx22);
        this.C0 = viewBinding(hra.g);
        this.D0 = o5a.U();
    }

    public final void c0() {
        this.z.G((List) null);
        this.X.G(CollectionsKt.emptyList());
        this.Y.G(CollectionsKt.emptyList());
        this.Z.G(CollectionsKt.emptyList());
    }

    public final ov2 d0() {
        return (ov2) this.v.getValue();
    }

    public final void e0(ykd ykd) {
        ykd ykd2 = ykd;
        Activity activity = getActivity();
        if (activity != null) {
            kr7.A(activity);
        }
        int ordinal = ykd2.a.ordinal();
        if (ordinal == 0) {
            ov2 d0 = d0();
            xag.g(d0, ((osa) d0.x).b(), (f14) null, new nv2(d0, ykd.getItemId(), (Continuation) null), 2);
            ox2.p1(ox2.b, ykd.getItemId(), "local", (Long) null, (Long) null, (List) null, (String) null, 124);
        } else if (ordinal == 1) {
            ox2.p1(ox2.b, ykd.getItemId(), "server", (Long) null, (Long) null, (List) null, (String) null, 124);
        } else if (ordinal == 2) {
            ov2 d02 = d0();
            ev0.v(d02.a, ((osa) d02.x).a(), (f14) null, new jv2(d02, ykd.getItemId(), (Continuation) null), 2);
        } else if (ordinal == 3) {
            ov2 d03 = d0();
            ev0.v(d03.a, ((osa) d03.x).a(), (f14) null, new lv2(d03, (ss6) ykd2, (Continuation) null), 2);
        } else if (ordinal == 4) {
            ge9 ge9 = (ge9) ykd2;
            if (ge9.w != null) {
                ev0.v(getViewLifecycleScope(), (CoroutineContext) null, (f14) null, new ju2(this, ge9, (Continuation) null), 3);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void f(xs3 xs3) {
        ((edb) this.y.getValue()).f(new eng(this, 1), edb.e, 156);
    }

    public final void f0(ykd ykd, View view) {
        if (ykd instanceof pp2) {
            long j = ((pp2) ykd).G0;
            Activity activity = getActivity();
            if (activity != null) {
                kr7.A(activity);
            }
            aje v2 = ev0.v(getViewLifecycleScope(), (CoroutineContext) null, f14.b, new ru2(this, j, view, (Continuation) null), 1);
            this.D0.setValue(this, F0[2], v2);
        }
    }

    public final void g(int i, Bundle bundle) {
        if (bundle != null) {
            long j = bundle.getLong("selected.chatId.Action");
            ov2 d0 = d0();
            xag.g(d0, ((osa) d0.x).a(), (f14) null, new gv2(i, d0, j, (Continuation) null), 2);
        }
    }

    public final void g0() {
        if (getView() != null) {
            ((EndlessRecyclerView2) this.C0.getValue(this, F0[1])).z0(0);
        }
    }

    public final yh7 getInsetsConfig() {
        return this.c;
    }

    public final pgd getScreenDelegate() {
        return this.a;
    }

    public final void onChangeEnded(ey3 ey3, fy3 fy3) {
        super.onChangeEnded(ey3, fy3);
        if (fy3 == fy3.POP_ENTER) {
            ov2 d0 = d0();
            d0.o.h = d0;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(hra.h);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        b0h.H(linearLayout, new o(3, (Continuation) null, 2));
        h3b d = o54.d(getContext(), (AttributeSet) null);
        d.setId(hra.i);
        d.setTransitionName(d.getContext().getString(jra.q));
        d.setForm(z2b.b);
        d.setRightActions(new u2b(new c3b(new ata(7, this, d)), new a3b(lya.j, new gl1(22))));
        d.setTitle(jra.p);
        pza searchView = d.getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(searchView.getResources().getString(jra.y));
            searchView.setCollapsible(false);
            searchView.setSearchText(((vu2) d0().D0.a.getValue()).b);
            if (bundle != null) {
                searchView.setExpandWithAnimation(false);
                searchView.d();
            }
        }
        linearLayout.addView(d);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(hra.g);
        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
        endlessRecyclerView2.setItemAnimator((yyc) null);
        rd3 rd3 = this.B0;
        endlessRecyclerView2.setAdapter(rd3);
        endlessRecyclerView2.setHasFixedSize(true);
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2.setPager(new k71(1, this));
        endlessRecyclerView2.setDelegate(this.A0);
        nwe nwe = new nwe(endlessRecyclerView2, rd3, new fl2(1, new wk(6, this, endlessRecyclerView2)));
        endlessRecyclerView2.j(nwe);
        b0h.H(endlessRecyclerView2, new hl2(nwe, (Continuation) null, 1));
        linearLayout.addView(endlessRecyclerView2);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        this.E0 = null;
        this.w0.D(this.v0);
        super.onDestroyView(view);
    }

    public final void onDismiss() {
        KProperty[] kPropertyArr = F0;
        KProperty kProperty = kPropertyArr[0];
        this.o.b(this, (Object) null);
        pm7 pm7 = (pm7) this.D0.getValue(this, kPropertyArr[2]);
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            eng eng = new eng(this, 1);
            String[] strArr2 = edb.e;
            int i2 = qad.t6;
            int i3 = qad.U6;
            ((edb) this.y.getValue()).getClass();
            edb.k(eng, strArr, iArr, strArr2, i2, i3);
        }
    }

    public final void onViewCreated(View view) {
        this.w0.A(this.v0);
        etc etc = d0().D0;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(etc, getViewLifecycleOwner().getLifecycle(), iu7), new ku2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new i21(((wh0) this.w.getValue()).y, d0().D0, new AdaptedFunctionReference(3, this, ChatsListSearchScreen.class, "combineSearchAndBanners", "combineSearchAndBanners(Ljava/util/List;Lone/me/chats/search/ChatsListSearchState;)Ljava/util/List;", 4), 4), getViewLifecycleOwner().getLifecycle(), iu7), new lu2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(d0().F0, getViewLifecycleOwner().getLifecycle(), iu7), new ou2((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(new on2(ct.k(d0().G0, getViewLifecycleOwner().getLifecycle(), iu7), 5), new pu2((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void s(int i, Bundle bundle) {
        KProperty[] kPropertyArr = F0;
        KProperty kProperty = kPropertyArr[0];
        is isVar = this.o;
        Long l = (Long) isVar.a(this);
        if (l != null) {
            long longValue = l.longValue();
            KProperty kProperty2 = kPropertyArr[0];
            isVar.b(this, (Object) null);
            ov2 d0 = d0();
            xag.g(d0, ((osa) d0.x).a(), (f14) null, new gv2(i, d0, longValue, (Continuation) null), 2);
        }
    }
}
