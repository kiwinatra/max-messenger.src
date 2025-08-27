package one.me.chats.picker;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/chats/picker/PickerChatsTabWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPickerChatsTabWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickerChatsTabWidget.kt\none/me/chats/picker/PickerChatsTabWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Display.kt\nru/ok/tamtam/shared/DisplayKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n420#2:174\n255#2,9:175\n235#2,10:184\n43#3:194\n46#3:195\n49#4:196\n51#4:200\n46#5:197\n51#5:199\n105#6:198\n1#7:201\n*S KotlinDebug\n*F\n+ 1 PickerChatsTabWidget.kt\none/me/chats/picker/PickerChatsTabWidget\n*L\n41#1:174\n58#1:175,9\n62#1:184,10\n144#1:194\n145#1:195\n150#1:196\n150#1:200\n150#1:197\n150#1:199\n150#1:198\n*E\n"})
@SuppressLint({"ValidController"})
public final class PickerChatsTabWidget extends Widget {
    public static final /* synthetic */ KProperty[] Z;
    public final y66 X;
    public final gsf Y;
    public final is a;
    public final yh7 b;
    public final sn0 c;
    public final sn0 o;
    public final Lazy v;
    public final Lazy w;
    public m56 x;
    public final he y;
    public final int z;

    static {
        Class<PickerChatsTabWidget> cls = PickerChatsTabWidget.class;
        Z = new KProperty[]{wj6.p(cls, "sharedScopeId", "getSharedScopeId-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "foldersTabs", "getFoldersTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), wj6.p(cls, "foldersViewPager", "getFoldersViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    }

    public PickerChatsTabWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        is isVar = new is(egd.class, "scope.id");
        this.a = isVar;
        this.b = yh7.c;
        this.c = binding(new ejb(this, 0));
        this.o = binding(new ejb(this, 1));
        KProperty kProperty = Z[0];
        this.v = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, whb.class, (Function0) null);
        Lazy<VM> createViewModelLazy = createViewModelLazy(djb.class, new zfa(7, new lgb(7)));
        this.w = createViewModelLazy;
        this.y = new he(false);
        this.z = 3;
        b bVar = new b();
        bVar.setMaxRecycledViews(jhb.a, 30);
        Unit unit = Unit.INSTANCE;
        this.X = new y66(this, bVar, new y3a(9, (Object) this));
        gsf gsf = new gsf();
        gsf.S(new yrf());
        gsf.S(new odg());
        gsf.V(0);
        gsf.I(150);
        this.Y = gsf;
        setRetainViewMode(yx3.b);
        bs0.K(new ps5(((djb) createViewModelLazy.getValue()).c, new fjb(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final c2b c0() {
        KProperty kProperty = Z[1];
        return (c2b) this.c.getValue();
    }

    public final ViewPager2 d0() {
        KProperty kProperty = Z[2];
        return (ViewPager2) this.o.getValue();
    }

    public final yh7 getInsetsConfig() {
        return this.b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        c2b c0 = c0();
        fj3 fj3 = new fj3(0, -2);
        fj3.i = 0;
        fj3.e = 0;
        fj3.h = 0;
        Unit unit = Unit.INSTANCE;
        constraintLayout.addView(c0, fj3);
        ViewPager2 d0 = d0();
        fj3 fj32 = new fj3(0, 0);
        fj32.j = hra.e;
        fj32.l = 0;
        fj32.e = 0;
        fj32.h = 0;
        constraintLayout.addView(d0, fj32);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        m56 m56 = this.x;
        if (m56 != null) {
            m56.f();
        }
        this.x = null;
    }

    public final void onViewCreated(View view) {
        ViewPager2 d0 = d0();
        y66 y66 = this.X;
        d0.setAdapter(y66);
        d0().setOffscreenPageLimit(this.z);
        c2b c0 = c0();
        ViewPager2 d02 = d0();
        oo9 oo9 = new oo9(19);
        ui0 ui0 = new ui0(15);
        he heVar = this.y;
        heVar.getClass();
        m56 m56 = new m56(c0, d02, true, new fm3(c0, heVar, oo9, ui0));
        m56.d();
        this.x = m56;
        View childAt = d0().getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setItemAnimator((yyc) null);
        }
        if (y66.x0.size() > 0) {
            d0().e(0, false);
            d0().measure(View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().widthPixels, IntCompanionObject.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getContext().getResources().getDisplayMetrics().heightPixels, IntCompanionObject.MIN_VALUE));
        }
        bs0.K(new ps5(bs0.w(new ql8(((whb) this.v.getValue()).z0, 25)), new ijb(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public PickerChatsTabWidget(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, "scope.id")));
    }
}
