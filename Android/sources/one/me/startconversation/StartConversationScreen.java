package one.me.startconversation;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lone/me/startconversation/StartConversationScreen;", "Lone/me/sdk/arch/Widget;", "Lro3;", "Lps6;", "Lys3;", "Lnt3;", "Lj24;", "Lak7;", "<init>", "()V", "start-conversation_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStartConversationScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartConversationScreen.kt\none/me/startconversation/StartConversationScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 ContextExt.kt\none/me/common/ext/ContextExtKt\n+ 4 StringExt.kt\nru/ok/tamtam/shared/StringExtKt\n*L\n1#1,462:1\n419#2:463\n419#2:464\n419#2:465\n235#2,10:466\n235#2,10:476\n20#3:486\n4#4:487\n4#4:488\n4#4:489\n*S KotlinDebug\n*F\n+ 1 StartConversationScreen.kt\none/me/startconversation/StartConversationScreen\n*L\n84#1:463\n85#1:464\n86#1:465\n90#1:466,10\n102#1:476,10\n209#1:486\n271#1:487\n291#1:488\n299#1:489\n*E\n"})
@SuppressLint({"ValidController"})
public final class StartConversationScreen extends Widget implements ro3, ps6, ys3, nt3, j24, ak7 {
    public static final /* synthetic */ KProperty[] E0;
    public final t56 A0;
    public final t56 B0;
    public final rd3 C0;
    public final wx3 D0;
    public final ReadOnlyProperty X;
    public final Lazy Y;
    public final ExecutorService Z;
    public final w28 a = new w28(new red(29), (Function0) null, 6);
    public final yh7 b = yh7.d;
    public final is c;
    public final is o;
    public final is v;
    public final t56 v0;
    public final Lazy w;
    public final t56 w0;
    public final Lazy x;
    public final t56 x0;
    public final Lazy y;
    public final t56 y0;
    public final ReadOnlyProperty z;
    public final t56 z0;

    static {
        Class<StartConversationScreen> cls = StartConversationScreen.class;
        E0 = new KProperty[]{rae.s(cls, "isNeedScrollToTop", "isNeedScrollToTop()Z", 0), rae.s(cls, "searchQuery", "getSearchQuery()Ljava/lang/CharSequence;", 0), rae.s(cls, "isInSearch", "isInSearch()Z", 0), wj6.p(cls, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StartConversationScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        Boolean bool = Boolean.FALSE;
        Class<Boolean> cls = Boolean.class;
        this.c = new is(cls, bool, "start_conversations_widget_is_need_scroll_to_top");
        this.o = new is(CharSequence.class, (Object) null, "start_conversations_widget_search_query");
        is isVar = new is(cls, bool, "contact_list_widget_is_in_search");
        this.v = isVar;
        this.w = LazyKt.lazy(new dle(1));
        this.x = createViewModelLazy(rle.class, new zfa(29, new dle(2)));
        this.y = createViewModelLazy(wh0.class, new mle(0, new dle(3)));
        this.z = viewBinding(f1b.o);
        this.X = viewBinding(f1b.q);
        this.Y = fdb.a.c();
        ExecutorService a2 = ((aua) wke.a.getAccessor().g(aua.class)).a();
        this.Z = a2;
        t56 t56 = new t56((Object) this, a2, 9);
        this.v0 = t56;
        t56 t562 = new t56((Object) this, a2, 4);
        this.w0 = t562;
        t56 t563 = new t56((Object) this, a2, 7);
        this.x0 = t563;
        t56 t564 = new t56((Object) this, a2, 13);
        this.y0 = t564;
        t56 t565 = new t56((Object) this, a2, 7);
        this.z0 = t565;
        t56 t566 = new t56((Object) this, a2, 15);
        this.A0 = t566;
        t56 t567 = new t56((Object) this, a2, 8);
        this.B0 = t567;
        rd3 rd3 = new rd3(new qd3(false, 1), t56, t566, t562, t563, t564, t565, t567);
        rd3.A(new t45(9, new lce(1, this)));
        this.C0 = rd3;
        KProperty kProperty = E0[2];
        this.D0 = new wx3(this, ((Boolean) isVar.a(this)).booleanValue());
        bs0.K(new ps5(d0().z.i, new gle(this, (Continuation) null), 5), getLifecycleScope());
        bs0.K(new ps5(d0().Y, new hle(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final void B(qs6 qs6) {
        Activity activity = getActivity();
        if (activity != null) {
            kr7.A(activity);
        }
        ev0.v(getViewLifecycleScope(), (CoroutineContext) null, (f14) null, new kle(this, qs6, (Continuation) null), 3);
    }

    public final void I() {
        q();
    }

    public final CharSequence c0() {
        KProperty kProperty = E0[1];
        return (CharSequence) this.o.a(this);
    }

    public final rle d0() {
        return (rle) this.x.getValue();
    }

    public final void f(xs3 xs3) {
        if (ile.$EnumSwitchMapping$0[xs3.ordinal()] != 1) {
            q();
        } else if (Build.VERSION.SDK_INT >= 33) {
            ((edb) this.Y.getValue()).f(new eng(this, 1), edb.k, 177);
        }
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    public final pgd getScreenDelegate() {
        return this.a;
    }

    public final void onContextAvailable(Context context) {
        super.onContextAvailable(context);
        fma onBackPressedDispatcher = getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.a(this.lifecycleOwner, this.D0);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(f1b.m);
        h3b d = o54.d(constraintLayout.getContext(), (AttributeSet) null);
        d.setId(f1b.q);
        d.setForm(z2b.a);
        d.setTitle(g1b.f);
        d.setLeftActions(new p2b(new ele(this, 0)));
        d.setRightActions(new u2b((d3b) null, new c3b(new jle(this))));
        pza searchView = d.getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(q8.p(g1b.y, d.getContext()));
            KProperty kProperty = E0[2];
            if (((Boolean) this.v.a(this)).booleanValue()) {
                searchView.setExpandWithAnimation(false);
                searchView.d();
                searchView.setExpandWithAnimation(true);
                searchView.setSearchText(c0());
            }
        }
        fj3 fj3 = new fj3(-1, -2);
        fj3.i = 0;
        fj3.e = 0;
        fj3.h = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(d, fj3);
        RecyclerView recyclerView = new RecyclerView(constraintLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(f1b.o);
        recyclerView.setItemAnimator((yyc) null);
        rd3 rd3 = this.C0;
        recyclerView.setAdapter(rd3);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setClipToPadding(false);
        recyclerView.addOnAttachStateChangeListener(new p50(10, (Object) recyclerView));
        fl2 fl2 = new fl2(4, new ele(this, 1));
        nwe nwe = new nwe(recyclerView, rd3, fl2);
        recyclerView.j(nwe);
        js9 js9 = fu4.k;
        recyclerView.j(new vo3(fl2, js9.e(recyclerView.getContext()).f(), (uo3) new fle(this, 0)));
        recyclerView.j(new fr(4));
        recyclerView.j(new nwe(recyclerView, rd3, new fl2(3, new cle(this, recyclerView, 1))));
        recyclerView.j(new m66(js9.e(recyclerView.getContext()).f(), new fle(this, 1)));
        recyclerView.j(new nwe(recyclerView, rd3, new fl2(2, new cle(this, recyclerView, 0))));
        b0h.H(recyclerView, new mb(nwe, (Continuation) null, 4));
        fj3 fj32 = new fj3(-1, 0);
        fj32.j = d.getId();
        fj32.e = 0;
        fj32.h = 0;
        fj32.l = 0;
        constraintLayout.addView(recyclerView, fj32);
        return constraintLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            eng eng = new eng(this, 1);
            String[] strArr2 = edb.e;
            int i2 = qad.t6;
            int i3 = qad.U6;
            ((edb) this.Y.getValue()).getClass();
            edb.k(eng, strArr, iArr, strArr2, i2, i3);
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bs0.K(new ps5(d0().Z, new lle(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new i21(d0().y, ((wh0) this.y.getValue()).y, new zpd((Object) this, (Continuation) null, 2), 4), getViewLifecycleScope());
    }

    public final void q() {
        ((edb) this.Y.getValue()).f(new eng(this, 1), edb.e, 156);
    }

    public final void t0(long j) {
        rle d0 = d0();
        xag.g(d0, ((osa) ((gaf) d0.o.getValue())).a(), (f14) null, new qle(d0, j, (Continuation) null), 2);
        kr7.A(requireActivity());
    }

    public final void u(wj7 wj7) {
        int ordinal = wj7.ordinal();
        if (ordinal == 0) {
            ble.b.W0().b(":invite/phone", (Bundle) null);
        } else if (ordinal == 1) {
            ble.b.W0().b(":invite/qr", (Bundle) null);
        } else if (ordinal == 2) {
            ((oo3) this.w.getValue()).a(getContext());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void v(long j) {
        ((oo3) this.w.getValue()).a(getContext());
    }
}
