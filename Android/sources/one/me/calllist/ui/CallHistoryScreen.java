package one.me.calllist.ui;

import android.animation.StateListAnimator;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calllist/ui/CallHistoryScreen;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "<init>", "()V", "call-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallHistoryScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallHistoryScreen.kt\none/me/calllist/ui/CallHistoryScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 4 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 TextSource.kt\none/me/sdk/uikit/common/TextSourceKt\n*L\n1#1,333:1\n235#2,10:334\n410#2,8:357\n410#2,8:365\n8#3:344\n28#4:345\n24#4:347\n24#4:348\n24#4:349\n24#4:352\n1#5:346\n256#6,2:350\n256#6,2:355\n256#6,2:373\n256#6,2:375\n256#6,2:377\n256#6,2:379\n256#6,2:381\n256#6,2:383\n167#7:353\n167#7:354\n*S KotlinDebug\n*F\n+ 1 CallHistoryScreen.kt\none/me/calllist/ui/CallHistoryScreen\n*L\n49#1:334,10\n230#1:357,8\n236#1:365,8\n61#1:344\n96#1:345\n146#1:347\n155#1:348\n162#1:349\n172#1:352\n169#1:350,2\n226#1:355,2\n272#1:373,2\n273#1:375,2\n277#1:377,2\n278#1:379,2\n289#1:381,2\n292#1:383,2\n210#1:353\n211#1:354\n*E\n"})
public final class CallHistoryScreen extends Widget implements qg3 {
    public static final /* synthetic */ KProperty[] y0;
    public final ReadOnlyProperty X = viewBinding(igc.call_history_empty);
    public final w71 Y;
    public final g71 Z;
    public final Lazy a = rjd.N;
    public final Lazy b = createViewModelLazy(v71.class, new s(7, new o71(this, 1)));
    public final Lazy c = LazyKt.lazy(LazyThreadSafetyMode.NONE, new o71(this, 2));
    public final ReadOnlyProperty o = viewBinding(kqa.g);
    public final ReadOnlyProperty v = viewBinding(kqa.i);
    public m56 v0;
    public final ReadOnlyProperty w = viewBinding(igc.call_history_tabs);
    public final yh7 w0;
    public final ReadOnlyProperty x = viewBinding(igc.call_history_pager);
    public final String x0;
    public final ReadOnlyProperty y = viewBinding(kqa.h);
    public final ReadOnlyProperty z = viewBinding(kqa.f);

    static {
        Class<CallHistoryScreen> cls = CallHistoryScreen.class;
        y0 = new KProperty[]{wj6.p(cls, "container", "getContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0), wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "callTabLayout", "getCallTabLayout()Lone/me/common/tablayout/OneMeTabLayout;", 0), wj6.p(cls, "callHistoryPager", "getCallHistoryPager()Landroidx/viewpager2/widget/ViewPager2;", 0), wj6.p(cls, "createGroupCallButton", "getCreateGroupCallButton()Lone/me/calllist/view/CallActionItemView;", 0), wj6.p(cls, "callToContactButton", "getCallToContactButton()Lone/me/calllist/view/CallActionItemView;", 0), wj6.p(cls, "callEmptyHistoryView", "getCallEmptyHistoryView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0)};
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [w71, java.lang.Object] */
    public CallHistoryScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
        ? obj = new Object();
        obj.a = CollectionsKt.emptyList();
        this.Y = obj;
        this.Z = new g71(this);
        this.w0 = yh7.d;
        this.x0 = "call_history_scope_id";
    }

    public final ViewPager2 c0() {
        return (ViewPager2) this.x.getValue(this, y0[3]);
    }

    public final v71 d0() {
        return (v71) this.b.getValue();
    }

    public final void g(int i, Bundle bundle) {
        ((lf1) this.c.getValue()).g(i);
    }

    public final yh7 getInsetsConfig() {
        return this.w0;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1545getScopeIdIluPPks() {
        return this.x0;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        h3b d = o54.d(linearLayout.getContext(), (AttributeSet) null);
        d.setId(kqa.i);
        d.setForm(z2b.b);
        d.setTitle(vkc.call_history_call_title);
        d.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.addView(d);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(linearLayout.getContext(), (AttributeSet) null);
        coordinatorLayout.setId(kqa.g);
        coordinatorLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        AppBarLayout appBarLayout = new AppBarLayout(coordinatorLayout.getContext(), (AttributeSet) null);
        appBarLayout.setElevation(vo4.c().getDisplayMetrics().density * c44.DEFAULT_ASPECT_RATIO);
        appBarLayout.setLayoutParams(new wz3(-1, -2));
        appBarLayout.setBackground((Drawable) null);
        i53 i53 = new i53(appBarLayout.getContext(), (AttributeSet) null);
        i53.setTitleEnabled(false);
        dn dnVar = new dn(-1, -2);
        dnVar.a = 3;
        i53.setLayoutParams(dnVar);
        LinearLayout linearLayout2 = new LinearLayout(i53.getContext());
        linearLayout2.setOrientation(1);
        iz0 iz0 = new iz0(linearLayout2.getContext(), (AttributeSet) null);
        float f = (float) 16;
        float f2 = (float) 0;
        iz0.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2));
        iz0.setId(kqa.f);
        iz0.setActionIcon(jqa.b);
        iz0.setActionText(vkc.call_history_call_contact_action);
        ct.G(iz0, 300, new p71(0));
        float f3 = (float) 56;
        iz0.setLayoutParams(new LinearLayout.LayoutParams(-1, MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f3)));
        linearLayout2.addView(iz0);
        iz0 iz02 = new iz0(linearLayout2.getContext(), (AttributeSet) null);
        iz02.setPadding(MathKt.roundToInt(((float) 20) * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        iz02.setId(kqa.h);
        iz02.setActionIcon(jqa.f);
        iz02.setActionText(vkc.call_history_call_create_group_call_by_link);
        ct.G(iz02, 300, new x4(13, (Object) this));
        iz02.setVisibility(8);
        iz02.setLayoutParams(new LinearLayout.LayoutParams(-1, MathKt.roundToInt(f3 * vo4.c().getDisplayMetrics().density)));
        linearLayout2.addView(iz02);
        linearLayout2.setLayoutParams(new f53(-1, -2));
        i53.addView(linearLayout2);
        appBarLayout.addView(i53);
        c2b c2b = new c2b(appBarLayout.getContext(), (AttributeSet) null);
        c2b.setId(igc.call_history_tabs);
        c2b.setTabMode(0);
        c2b.setLayoutParams(new dn(-1, -2));
        appBarLayout.addView(c2b);
        appBarLayout.setStateListAnimator((StateListAnimator) null);
        coordinatorLayout.addView(appBarLayout);
        ViewPager2 viewPager2 = new ViewPager2(coordinatorLayout.getContext());
        viewPager2.setId(igc.call_history_pager);
        wz3 wz3 = new wz3(-1, -1);
        wz3.b(new AppBarLayout.ScrollingViewBehavior());
        viewPager2.setLayoutParams(wz3);
        hsg.m(viewPager2);
        coordinatorLayout.addView(viewPager2);
        linearLayout.addView(coordinatorLayout);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        xme xme;
        Object value;
        super.onDestroyView(view);
        if (!requireActivity().isChangingConfigurations()) {
            c0().setAdapter((tyc) null);
            v71 d0 = d0();
            do {
                xme = d0.w;
                value = xme.getValue();
                t71 t71 = (t71) value;
            } while (!xme.b(value, new t71()));
        }
        m56 m56 = this.v0;
        if (m56 != null) {
            m56.f();
        }
        this.v0 = null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((lf1) this.c.getValue()).b(i, strArr, iArr);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        xme xme = d0().z;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(xme, getViewLifecycleOwner().getLifecycle(), iu7), new q71((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(d0().x, getViewLifecycleOwner().getLifecycle(), iu7), new r71((Continuation) null, this), 5), getViewLifecycleScope());
        c0().setAdapter(this.Z);
        c0().setOffscreenPageLimit(1);
        c2b c2b = (c2b) this.w.getValue(this, y0[2]);
        ViewPager2 c0 = c0();
        w71 w71 = this.Y;
        w71.getClass();
        m56 m56 = new m56(c2b, c0, true, new ba(7, w71, c2b));
        m56.d();
        this.v0 = m56;
    }
}
