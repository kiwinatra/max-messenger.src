package one.me.pinbars;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.miniplayer.MiniPlayerView;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\tB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\n"}, d2 = {"Lone/me/pinbars/PinBarsWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "dlb", "pinbars_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPinBarsWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PinBarsWidget.kt\none/me/pinbars/PinBarsWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,297:1\n259#2,5:298\n235#2,10:303\n410#2,8:319\n32#3:313\n24#3:329\n17#4:314\n19#4:318\n46#5:315\n51#5:317\n105#6:316\n65#7,2:327\n68#7:330\n37#7:331\n53#7:332\n72#7:333\n*S KotlinDebug\n*F\n+ 1 PinBarsWidget.kt\none/me/pinbars/PinBarsWidget\n*L\n51#1:298,5\n55#1:303,10\n238#1:319,8\n141#1:313\n263#1:329\n202#1:314\n202#1:318\n202#1:315\n202#1:317\n202#1:316\n258#1:327,2\n258#1:330\n258#1:331\n258#1:332\n258#1:333\n*E\n"})
public final class PinBarsWidget extends Widget {
    public static final /* synthetic */ int x = 0;
    public ymf a;
    public final Lazy b;
    public final Lazy c;
    public MiniPlayerView o;
    public cxa v;
    public svf w;

    public PinBarsWidget() {
        this((Bundle) null, 1, (DefaultConstructorMarker) null);
    }

    public final blb c0() {
        return (blb) this.c.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setId(axa.c);
        linearLayout.setShowDividers(7);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        b0h.H(linearLayout, new sa((Object) shapeDrawable, (Continuation) null, 28));
        shapeDrawable.setIntrinsicHeight(MathKt.roundToInt(((double) vo4.c().getDisplayMetrics().density) * 0.5d));
        linearLayout.setDividerDrawable(shapeDrawable);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.o = null;
        this.w = null;
        this.v = null;
        c0().v.h();
        ymf ymf = this.a;
        if (ymf != null) {
            ymf.dismiss();
        }
        this.a = null;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = (ViewGroup) view;
        bs0.K(new ps5(c0().w, new hlb(view, this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(c0().X, new ilb(view, this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(new zjb(c0().Y, this, 2), new jlb((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(bs0.u(c0().X, c0().w, c0().x, new jp2(this, view, (Continuation) null, 1)), getViewLifecycleScope());
        bs0.K(new ps5(c0().Z, new klb((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(c0().y, getViewLifecycleOwner().getLifecycle(), iu7.o), new elb((Continuation) null, this), 5), getViewLifecycleScope());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r2 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PinBarsWidget(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 2
            r2 = 0
            r3.<init>(r4, r0, r1, r2)
            if (r4 == 0) goto L_0x0016
            java.lang.String r0 = "arg_key_scope_id"
            android.os.Parcelable r4 = r4.getParcelable(r0)
            egd r4 = (defpackage.egd) r4
            if (r4 == 0) goto L_0x0014
            java.lang.String r2 = r4.a
        L_0x0014:
            if (r2 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r2 = ""
        L_0x0018:
            lgb r4 = new lgb
            r0 = 12
            r4.<init>((int) r0)
            java.lang.Class<alb> r0 = defpackage.alb.class
            kotlin.Lazy r4 = r3.m1571getSharedViewModelcp94BC8(r2, r0, r4)
            r3.b = r4
            ifb r4 = new ifb
            r0 = 3
            r4.<init>(r0, r3)
            zfa r0 = new zfa
            r1 = 12
            r0.<init>(r1, r4)
            java.lang.Class<blb> r4 = defpackage.blb.class
            kotlin.Lazy r4 = r3.createViewModelLazy(r4, r0)
            r3.c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.pinbars.PinBarsWidget.<init>(android.os.Bundle):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PinBarsWidget(Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bundle);
    }

    public PinBarsWidget(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID)));
    }
}
