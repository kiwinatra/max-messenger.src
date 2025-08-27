package one.me.calls.ui.bottomsheet.exit;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/bottomsheet/exit/RecordExitBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "Lpxc;", "openType", "(Ljava/lang/String;Lpxc;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nRecordExitBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordExitBottomSheet.kt\none/me/calls/ui/bottomsheet/exit/RecordExitBottomSheet\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\none/me/sdk/kotlintools/delegates/LazyExtKt\n+ 4 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetExtKt\n+ 5 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetBuilder\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 7 ContextExt.kt\none/me/sdk/arch/ext/ContextExtKt\n+ 8 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,220:1\n419#2:221\n255#2,9:223\n235#2,10:232\n410#2,8:265\n410#2,8:273\n5#3:222\n20#4:242\n21#4:264\n186#5:243\n187#5:245\n186#5:246\n187#5:248\n186#5:249\n187#5:251\n186#5:252\n187#5:256\n186#5:257\n187#5:260\n186#5:261\n187#5:263\n24#6:244\n24#6:247\n24#6:250\n24#6:253\n24#6:254\n24#6:255\n24#6:258\n24#6:259\n24#6:262\n24#6:281\n28#6:284\n24#6:287\n26#7:282\n23#7:283\n256#8,2:285\n*S KotlinDebug\n*F\n+ 1 RecordExitBottomSheet.kt\none/me/calls/ui/bottomsheet/exit/RecordExitBottomSheet\n*L\n48#1:221\n52#1:223,9\n53#1:232,10\n182#1:265,8\n185#1:273,8\n50#1:222\n133#1:242\n133#1:264\n134#1:243\n134#1:245\n142#1:246\n142#1:248\n149#1:249\n149#1:251\n156#1:252\n156#1:256\n163#1:257\n163#1:260\n170#1:261\n170#1:263\n135#1:244\n143#1:247\n150#1:250\n157#1:253\n158#1:254\n159#1:255\n164#1:258\n165#1:259\n173#1:262\n68#1:281\n102#1:284\n118#1:287\n100#1:282\n100#1:283\n117#1:285,2\n*E\n"})
public final class RecordExitBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ KProperty[] F0;
    public final sn0 A0;
    public final sn0 B0;
    public final sn0 C0;
    public final sn0 D0;
    public final sn0 E0;
    public final Lazy w0;
    public final Lazy x0;
    public final Lazy y0;
    public final sn0 z0;

    static {
        Class<RecordExitBottomSheet> cls = RecordExitBottomSheet.class;
        F0 = new KProperty[]{wj6.p(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "titleView", "getTitleView()Landroid/widget/TextView;", 0), wj6.p(cls, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0), wj6.p(cls, "negativeBtn", "getNegativeBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), wj6.p(cls, "positiveBtn", "getPositiveBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), wj6.p(cls, "recordInfo", "getRecordInfo()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent;", 0), wj6.p(cls, "needRemoveView", "getNeedRemoveView()Lone/me/calls/ui/view/CheckBoxWithPaddingFix;", 0)};
    }

    public RecordExitBottomSheet(Bundle bundle) {
        super(bundle);
        is isVar = new is(egd.class, new egd("default"), Widget.ARG_SCOPE_ID);
        this.w0 = LazyKt.lazy(LazyThreadSafetyMode.NONE, new oxc(this, 0));
        KProperty kProperty = F0[0];
        this.x0 = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, jj1.class, (Function0) null);
        this.y0 = createViewModelLazy(vxc.class, new zfa(20, new vra(14, bundle, this)));
        this.z0 = binding(new oxc(this, 1));
        this.A0 = binding(new oxc(this, 2));
        this.B0 = binding(new oxc(this, 3));
        this.C0 = binding(new oxc(this, 4));
        this.D0 = binding(new oxc(this, 5));
        this.E0 = binding(new oxc(this, 6));
    }

    public final k2b g0() {
        return l2b.a;
    }

    public final View n0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.addView(w0(), -1, -2);
        constraintLayout.addView(v0(), -1, -2);
        constraintLayout.addView(u0(), -1, -2);
        constraintLayout.addView(r0(), 0, -2);
        constraintLayout.addView(s0(), 0, -2);
        constraintLayout.addView(q0(), 0, -2);
        pj3 h = ct.h(constraintLayout);
        int id = w0().getId();
        h.e(id, 3, 0, 3);
        tr1.u((float) 16, vo4.c().getDisplayMetrics().density, new ila(h, 3, id, 4));
        h.e(id, 7, 0, 7);
        h.e(id, 6, 0, 6);
        h.e(id, 4, v0().getId(), 3);
        h.j(id).d.W = 2;
        int id2 = v0().getId();
        h.e(id2, 3, w0().getId(), 4);
        float f = (float) 4;
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 3, id2, 4));
        h.e(id2, 7, 0, 7);
        h.e(id2, 6, 0, 6);
        h.e(id2, 4, u0().getId(), 3);
        int id3 = u0().getId();
        h.e(id3, 3, v0().getId(), 4);
        tr1.u((float) 22, vo4.c().getDisplayMetrics().density, new ila(h, 3, id3, 4));
        h.e(id3, 7, 0, 7);
        h.e(id3, 6, 0, 6);
        h.e(id3, 4, q0().getId(), 3);
        int id4 = q0().getId();
        h.e(id4, 3, u0().getId(), 4);
        float f2 = (float) 12;
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 3, id4, 4));
        h.e(id4, 7, 0, 7);
        tr1.u(f2, vo4.c().getDisplayMetrics().density, new ila(h, 7, id4, 4));
        h.e(id4, 6, 0, 6);
        new ila(h, 6, id4, 4).e(MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        h.e(id4, 4, r0().getId(), 3);
        int id5 = r0().getId();
        h.e(id5, 3, q0().getId(), 4);
        new ila(h, 3, id5, 4).e(MathKt.roundToInt(((float) 24) * vo4.c().getDisplayMetrics().density));
        h.e(id5, 7, s0().getId(), 6);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 7, id5, 4));
        h.e(id5, 6, 0, 6);
        h.e(id5, 4, 0, 3);
        int id6 = s0().getId();
        h.e(id6, 3, r0().getId(), 3);
        h.e(id6, 7, 0, 7);
        h.e(id6, 6, r0().getId(), 7);
        new ila(h, 6, id6, 4).e(MathKt.roundToInt(f * vo4.c().getDisplayMetrics().density));
        h.e(id6, 4, r0().getId(), 4);
        h.a(constraintLayout);
        return constraintLayout;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Lazy lazy = this.y0;
        zjb zjb = ((vxc) lazy.getValue()).x;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(zjb, getViewLifecycleOwner().getLifecycle(), iu7), new qxc((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(new on2(((vxc) lazy.getValue()).w, 28), getViewLifecycleOwner().getLifecycle(), iu7), new rxc((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final bz2 q0() {
        KProperty kProperty = F0[6];
        return (bz2) this.E0.getValue();
    }

    public final OneMeButton r0() {
        KProperty kProperty = F0[3];
        return (OneMeButton) this.B0.getValue();
    }

    public final OneMeButton s0() {
        KProperty kProperty = F0[4];
        return (OneMeButton) this.C0.getValue();
    }

    public final r1e u0() {
        KProperty kProperty = F0[5];
        return (r1e) this.D0.getValue();
    }

    public final TextView v0() {
        KProperty kProperty = F0[2];
        return (TextView) this.A0.getValue();
    }

    public final TextView w0() {
        KProperty kProperty = F0[1];
        return (TextView) this.z0.getValue();
    }

    public RecordExitBottomSheet(String str, pxc pxc, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID), TuplesKt.to("open_type", pxc.name())));
    }
}
