package one.me.keyboardmedia.stickers;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/keyboardmedia/stickers/KeyboardStickersWidget;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "Legd;", "scopeId", "(JLjava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "keyboard-media_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nKeyboardStickersWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardStickersWidget.kt\none/me/keyboardmedia/stickers/KeyboardStickersWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 BottomSheetWidget.kt\none/me/sdk/bottomsheet/BottomSheetWidget$Companion\n+ 7 WidgetExt.kt\none/me/sdk/arch/ext/WidgetExtKt\n*L\n1#1,241:1\n235#2,10:242\n255#2,9:252\n24#3:261\n24#3:262\n24#3:263\n24#3:267\n24#3:268\n24#3:277\n24#3:303\n163#4,2:264\n157#4,8:269\n1#5:266\n135#6,3:278\n138#6,8:295\n33#7,14:281\n*S KotlinDebug\n*F\n+ 1 KeyboardStickersWidget.kt\none/me/keyboardmedia/stickers/KeyboardStickersWidget\n*L\n56#1:242,10\n71#1:252,9\n129#1:261\n133#1:262\n134#1:263\n161#1:267\n162#1:268\n173#1:277\n214#1:303\n135#1:264,2\n162#1:269,8\n198#1:278,3\n198#1:295,8\n198#1:281,14\n*E\n"})
public final class KeyboardStickersWidget extends Widget implements qg3 {
    public static final /* synthetic */ KProperty[] z;
    public final Lazy a;
    public final Lazy b;
    public hb8 c;
    public final ReadOnlyProperty o;
    public final ReadOnlyProperty v;
    public final r35 w;
    public final jse x;
    public final yx1 y;

    static {
        Class<KeyboardStickersWidget> cls = KeyboardStickersWidget.class;
        z = new KProperty[]{wj6.p(cls, "contentRecyclerView", "getContentRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), wj6.p(cls, "stickersTabsRecyclerView", "getStickersTabsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    }

    public KeyboardStickersWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        Class<hwe> cls = hwe.class;
        this.a = createViewModelLazy(cls, new i76(9, new bg2(bundle, 2)));
        this.b = m1571getSharedViewModelcp94BC8(bundle.getString(Widget.ARG_SCOPE_ID), sr8.class, (Function0) null);
        this.o = viewBinding(zua.n);
        this.v = viewBinding(zua.o);
        fq7 fq7 = fq7.a;
        Class<aua> cls2 = aua.class;
        this.w = new r35(((aua) fq7.getAccessor().g(cls2)).a(), new vq7(0, (Object) this));
        jse jse = new jse(((aua) fq7.getAccessor().g(cls2)).a(), new zq7(this, bundle));
        this.x = jse;
        hwe e0 = e0();
        e0.getClass();
        z68.c(cls.getName(), "loadStickers", new Object[0]);
        co1 h = kv0.h(((moe) e0.c.getValue()).a());
        co1 h2 = kv0.h(((vi5) e0.v.getValue()).a());
        co1 h3 = kv0.h(((ai5) e0.w.getValue()).c());
        z8e z8e = (z8e) e0.y.getValue();
        i21 i21 = new i21(new zjb(kv0.h(((moe) z8e.a.getValue()).m), z8e, 5), ((due) z8e.b.getValue()).e, y8e.a, 4);
        bs5[] bs5Arr = {h, h2, h3, i21};
        bs0.K(bs0.F(new ps5(new wb(18, bs5Arr, new SuspendLambda(5, (Continuation<Object>) null)), new cwe(e0, (Continuation) null), 5), ((osa) e0.b).b()), e0.a);
        bs0.K(new ps5(e0().X, new wq7(this, (Continuation) null), 5), getLifecycleScope());
        this.y = new yx1((pae) jse, (Function1) new hq7(e0()));
    }

    public final EndlessRecyclerView2 c0() {
        return (EndlessRecyclerView2) this.o.getValue(this, z[0]);
    }

    public final RecyclerView d0() {
        return (RecyclerView) this.v.getValue(this, z[1]);
    }

    public final hwe e0() {
        return (hwe) this.a.getValue();
    }

    public final void g(int i, Bundle bundle) {
        if (i == zua.g) {
            hwe e0 = e0();
            aje u = ev0.u(e0.a, ((osa) e0.b).b(), f14.b, new dwe(e0, (Continuation) null));
            e0.y0.setValue(e0, hwe.z0[2], u);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(zua.l);
        int roundToInt = MathKt.roundToInt(((float) 44) * vo4.c().getDisplayMetrics().density);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), (AttributeSet) null);
        recyclerView.setId(zua.o);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, roundToInt));
        int roundToInt2 = MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density);
        int roundToInt3 = MathKt.roundToInt(((float) 8) * vo4.c().getDisplayMetrics().density);
        recyclerView.setPadding(roundToInt3, roundToInt2, roundToInt3, roundToInt2);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator((yyc) null);
        b0h.H(recyclerView, new iq7(3, (Continuation) null, 2));
        frameLayout.addView(recyclerView);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), (AttributeSet) null, 6);
        endlessRecyclerView2.setId(zua.n);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = roundToInt;
        endlessRecyclerView2.setLayoutParams(layoutParams);
        b0h.H(endlessRecyclerView2, new mh0(3, (Continuation) null, 7));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int roundToInt4 = MathKt.roundToInt(((float) 12) * vo4.c().getDisplayMetrics().density);
        endlessRecyclerView2.setPadding(roundToInt4, endlessRecyclerView2.getPaddingTop(), roundToInt4, MathKt.roundToInt(((float) 48) * vo4.c().getDisplayMetrics().density));
        frameLayout.addView(endlessRecyclerView2);
        return frameLayout;
    }

    public final void onDestroyView(View view) {
        c0().setAdapter((tyc) null);
        c0().u0(this.y);
        d0().setAdapter((tyc) null);
    }

    public final void onViewCreated(View view) {
        d0().setAdapter(this.w);
        d0().j(new w51(MathKt.roundToInt(((float) 2) * vo4.c().getDisplayMetrics().density), 4));
        EndlessRecyclerView2 c0 = c0();
        hb8 hb8 = this.c;
        jse jse = this.x;
        jse.x = hb8;
        int A = b0h.A(c0.getContext());
        c0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(A);
        gridLayoutManager.K = new mse(gridLayoutManager, jse, 1);
        c0.setLayoutManager(gridLayoutManager);
        c0.j(new jz0(A, MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), 7));
        c0.m(this.y);
        c0.m(new k61(7, this));
        c0.k(new xq7(0, this));
        c0.setAdapter(jse);
        bs0.K(new ps5(e0().v0, new yq7(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public KeyboardStickersWidget(long j, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(TuplesKt.to("arg_key_chat_id", Long.valueOf(j)), TuplesKt.to(Widget.ARG_SCOPE_ID, str)));
    }
}
