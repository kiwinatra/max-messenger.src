package one.me.chats.picker;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.ukb;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.views.MaxHeightScrollView;
import one.me.sdk.uikit.common.views.OneMeContactsChipGroup;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/chats/picker/AbstractPickerScreen;", "Lukb;", "T", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAbstractPickerScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPickerScreen.kt\none/me/chats/picker/AbstractPickerScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,168:1\n235#2,10:169\n410#2,8:184\n24#3:179\n32#3:180\n1#4:181\n1863#5,2:182\n49#6:192\n65#6,16:193\n93#6,3:209\n*S KotlinDebug\n*F\n+ 1 AbstractPickerScreen.kt\none/me/chats/picker/AbstractPickerScreen\n*L\n38#1:169,10\n145#1:184,8\n86#1:179\n103#1:180\n122#1:182,2\n63#1:192\n63#1:193,16\n63#1:209,3\n*E\n"})
public abstract class AbstractPickerScreen<T extends ukb> extends Widget {
    public static final /* synthetic */ KProperty[] x;
    public final yh7 a = yh7.d;
    public final String b = "PickerScreen";
    public final Lazy c;
    public final sn0 o;
    public final sn0 v;
    public final ReadOnlyProperty w;

    static {
        Class<AbstractPickerScreen> cls = AbstractPickerScreen.class;
        x = new KProperty[]{wj6.p(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "chips", "getChips()Lone/me/sdk/uikit/common/views/OneMeContactsChipGroup;", 0), wj6.p(cls, "mainContainer", "getMainContainer()Landroid/view/ViewGroup;", 0)};
    }

    public AbstractPickerScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.c = createViewModelLazy(vhb.class, new s(1, new s2(0, (Object) this, (Object) bundle)));
        this.o = binding(new t2(this, 0));
        this.v = binding(new t2(this, 1));
        this.w = viewBinding(hra.f0);
    }

    public abstract Iterable c0();

    public abstract ojb d0();

    public abstract Widget e0(String str);

    public abstract h3b f0(Context context);

    public abstract ukb g0();

    public yh7 getInsetsConfig() {
        return this.a;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m1548getScopeIdIluPPks() {
        return this.b;
    }

    public final OneMeContactsChipGroup h0() {
        KProperty kProperty = x[1];
        return (OneMeContactsChipGroup) this.v.getValue();
    }

    public abstract xme i0();

    public final ViewGroup j0() {
        return (ViewGroup) this.w.getValue(this, x[2]);
    }

    public final h3b k0() {
        KProperty kProperty = x[0];
        return (h3b) this.o.getValue();
    }

    public final vhb l0() {
        return (vhb) this.c.getValue();
    }

    public abstract Set m0(Bundle bundle);

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setId(hra.f0);
        linearLayout.addView(k0(), new FrameLayout.LayoutParams(-1, -2));
        MaxHeightScrollView maxHeightScrollView = new MaxHeightScrollView(linearLayout.getContext(), (AttributeSet) null);
        maxHeightScrollView.setMaxHeight(MathKt.roundToInt(((float) 100) * vo4.c().getDisplayMetrics().density));
        maxHeightScrollView.addView(h0(), new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(maxHeightScrollView, new LinearLayout.LayoutParams(-1, -2));
        View view = new View(linearLayout.getContext());
        b0h.H(view, new v2(3, (Continuation) null, 0));
        linearLayout.addView(view, new LinearLayout.LayoutParams(-1, MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 0.5d)));
        FrameLayout frameLayout = new FrameLayout(linearLayout.getContext());
        frameLayout.setId(hra.d0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 112;
        Unit unit = Unit.INSTANCE;
        linearLayout.addView(frameLayout, layoutParams);
        e9d childRouter = getChildRouter(frameLayout);
        Widget e0 = e0(this.b);
        e0.setRetainViewMode(yx3.b);
        if (!childRouter.n()) {
            childRouter.R(new i9d(e0, (String) null, (ey3) null, (ey3) null, false, -1));
        }
        for (View addView : c0()) {
            linearLayout.addView(addView);
        }
        FrameLayout frameLayout2 = new FrameLayout(layoutInflater.getContext());
        frameLayout2.addView(linearLayout);
        return frameLayout2;
    }

    public void onViewCreated(View view) {
        super.onViewCreated(view);
        bs0.K(new i21(MapsKt.emptyMap(), l0().v, new x2(this, (Continuation) null, 0)), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(l0().y, getViewLifecycleOwner().getLifecycle(), iu7.o), new w2((Continuation) null, this), 5), getViewLifecycleScope());
    }
}
