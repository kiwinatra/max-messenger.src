package one.me.calllist.ui.callinfo;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/calllist/ui/callinfo/CallLinkInfoScreen;", "Lone/me/sdk/arch/Widget;", "Lqg3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "link", "title", "", "isLinkCall", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Z)V", "call-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallLinkInfoScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallLinkInfoScreen.kt\none/me/calllist/ui/callinfo/CallLinkInfoScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n*L\n1#1,480:1\n235#2,10:481\n410#2,8:493\n410#2,8:501\n5#3:491\n5#3:492\n1#4:509\n24#5:510\n24#5:519\n24#5:520\n24#5:521\n24#5:522\n24#5:523\n24#5:524\n24#5:525\n24#5:526\n24#5:527\n24#5:528\n24#5:529\n142#6,8:511\n23#7:530\n23#7:531\n*S KotlinDebug\n*F\n+ 1 CallLinkInfoScreen.kt\none/me/calllist/ui/callinfo/CallLinkInfoScreen\n*L\n83#1:481,10\n205#1:493,8\n237#1:501,8\n118#1:491\n127#1:492\n377#1:510\n389#1:519\n400#1:520\n402#1:521\n413#1:522\n422#1:523\n432#1:524\n445#1:525\n446#1:526\n447#1:527\n448#1:528\n464#1:529\n377#1:511,8\n111#1:530\n120#1:531\n*E\n"})
public final class CallLinkInfoScreen extends Widget implements qg3 {
    public static final /* synthetic */ KProperty[] z0;
    public final ReadOnlyProperty X;
    public final ReadOnlyProperty Y;
    public final ReadOnlyProperty Z;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final ReadOnlyProperty v0;
    public final Lazy w;
    public final ReadOnlyProperty w0;
    public final ReadOnlyProperty x;
    public final t56 x0;
    public final ReadOnlyProperty y;
    public final w28 y0;
    public final ReadOnlyProperty z;

    static {
        Class<CallLinkInfoScreen> cls = CallLinkInfoScreen.class;
        z0 = new KProperty[]{wj6.p(cls, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0), wj6.p(cls, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), wj6.p(cls, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wj6.p(cls, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0), wj6.p(cls, "descriptionTextView", "getDescriptionTextView()Landroid/widget/TextView;", 0), wj6.p(cls, "linkTextView", "getLinkTextView()Landroid/widget/TextView;", 0), wj6.p(cls, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), wj6.p(cls, "icon", "getIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0)};
    }

    public CallLinkInfoScreen() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public final tq1 c0() {
        return (tq1) this.b.getValue();
    }

    public final dc1 d0() {
        return (dc1) this.c.getValue();
    }

    public final void g(int i, Bundle bundle) {
        ((lf1) this.w.getValue()).g(i);
    }

    public final yh7 getInsetsConfig() {
        yh7 yh7 = yh7.c;
        return yh7.d;
    }

    public final pgd getScreenDelegate() {
        return this.y0;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ub1 ub1 = new ub1(this, 0);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(kqa.o);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ub1.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((lf1) this.w.getValue()).b(i, strArr, iArr);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        gh5 gh5 = new gh5();
        KProperty[] kPropertyArr = z0;
        KProperty kProperty = kPropertyArr[1];
        ReadOnlyProperty readOnlyProperty = this.y;
        ((AppBarLayout) readOnlyProperty.getValue(this, kProperty)).a(h88.d0(new xb1(gh5, this, 0), (AppBarLayout) readOnlyProperty.getValue(this, kPropertyArr[1]), getViewLifecycleOwner()));
        s85 s85 = d0().z;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(s85, getViewLifecycleOwner().getLifecycle(), iu7), new zb1((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(d0().y, getViewLifecycleOwner().getLifecycle(), iu7), new ac1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public CallLinkInfoScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.a = rjd.N;
        u61 u61 = u61.a;
        this.b = u61.getAccessor().h(tq1.class);
        this.c = createViewModelLazy(dc1.class, new s(11, new s2(bundle, (Widget) this, 9)));
        this.o = LazyKt.lazy(new wb1(this, 1));
        wb1 wb1 = new wb1(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.v = LazyKt.lazy(lazyThreadSafetyMode, wb1);
        this.w = LazyKt.lazy(lazyThreadSafetyMode, new wb1(this, 3));
        this.x = viewBinding(kqa.n);
        this.y = viewBinding(kqa.l);
        this.z = viewBinding(kqa.s);
        this.X = viewBinding(kqa.t);
        this.Y = viewBinding(kqa.p);
        this.Z = viewBinding(kqa.r);
        this.v0 = viewBinding(kqa.m);
        this.w0 = viewBinding(kqa.q);
        this.x0 = new t56((Object) new e4(5, (Object) this), ((aua) u61.getAccessor().g(aua.class)).a(), 5);
        this.y0 = new w28(new v11(12), (Function0) null, 6);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CallLinkInfoScreen(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }

    public CallLinkInfoScreen(Long l, String str, String str2, boolean z2) {
        this(o54.f(TuplesKt.to("link_param", str), TuplesKt.to("title_param", str2), TuplesKt.to("id_param", l), TuplesKt.to("is_link_call", Boolean.valueOf(z2))));
    }
}
