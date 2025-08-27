package one.me.sdk.messagewrite.mention;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/sdk/messagewrite/mention/SuggestionsWidget;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Ll0f;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSuggestionsWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestionsWidget.kt\none/me/sdk/messagewrite/mention/SuggestionsWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n+ 4 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetExtKt\n+ 5 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetBuilder\n+ 6 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 7 View.kt\nandroidx/core/view/ViewKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Ripple.kt\none/me/sdk/uikit/common/RippleKt\n*L\n1#1,315:1\n420#2:316\n255#2,9:317\n8#3:326\n20#4:327\n21#4:340\n186#5,2:328\n186#5:330\n187#5:333\n186#5:334\n187#5:336\n186#5:337\n187#5:339\n24#6:331\n24#6:332\n24#6:335\n24#6:338\n24#6:341\n24#6:342\n28#6:343\n24#6:344\n24#6:345\n24#6:350\n24#6:355\n172#7,2:346\n256#7,2:351\n256#7,2:353\n1#8:348\n23#9:349\n*S KotlinDebug\n*F\n+ 1 SuggestionsWidget.kt\none/me/sdk/messagewrite/mention/SuggestionsWidget\n*L\n54#1:316\n57#1:317,9\n61#1:326\n253#1:327\n253#1:340\n254#1:328,2\n260#1:330\n260#1:333\n266#1:334\n266#1:336\n271#1:337\n271#1:339\n262#1:331\n263#1:332\n267#1:335\n272#1:338\n71#1:341\n73#1:342\n75#1:343\n97#1:344\n100#1:345\n117#1:350\n149#1:355\n100#1:346,2\n134#1:351,2\n148#1:353,2\n106#1:349\n*E\n"})
public final class SuggestionsWidget extends BaseBottomSheetWidget implements l0f {
    public static final /* synthetic */ KProperty[] z0;
    public final Lazy X;
    public final sn0 Y;
    public final sn0 Z;
    public final sn0 v0;
    public final sn0 w0;
    public final sn0 x0;
    public final Lazy y;
    public final sn0 y0;
    public final ReadOnlyProperty z;

    static {
        Class<SuggestionsWidget> cls = SuggestionsWidget.class;
        z0 = new KProperty[]{rae.s(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "suggestionsContainer", "getSuggestionsContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), wj6.p(cls, "dragView", "getDragView()Landroid/widget/FrameLayout;", 0), wj6.p(cls, "suggestionsRecyclerView", "getSuggestionsRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView;", 0), wj6.p(cls, "closeView", "getCloseView()Landroidx/appcompat/widget/AppCompatImageView;", 0), wj6.p(cls, "titleView", "getTitleView()Landroidx/appcompat/widget/AppCompatTextView;", 0), wj6.p(cls, "closePanelView", "getClosePanelView()Landroid/widget/FrameLayout;", 0), wj6.p(cls, "notFoundView", "getNotFoundView()Landroidx/appcompat/widget/AppCompatTextView;", 0)};
    }

    public SuggestionsWidget(Bundle bundle) {
        super(bundle);
        is isVar = new is(egd.class, Widget.ARG_SCOPE_ID);
        KProperty kProperty = z0[0];
        this.y = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, v0f.class, (Function0) null);
        this.z = viewBinding(xya.E);
        this.X = LazyKt.lazy(LazyThreadSafetyMode.NONE, new w0f(this, 0));
        this.Y = binding(new w0f(this, 1));
        this.Z = binding(new w0f(this, 2));
        this.v0 = binding(new w0f(this, 3));
        this.w0 = binding(new w0f(this, 4));
        this.x0 = binding(new w0f(this, 5));
        this.y0 = binding(new w0f(this, 6));
        l0(false);
    }

    public final frb d0() {
        return new qa(this, 6);
    }

    public final yh7 e0() {
        return new yh7((jdb) null, new nr0(jdb.a, mr0.c, false), 1);
    }

    public final boolean handleBack() {
        s0();
        return true;
    }

    public final void m0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(o0());
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(xya.E);
        constraintLayout.addView(n0(), -1, -2);
        constraintLayout.addView(q0());
        constraintLayout.addView(p0());
        pj3 h = ct.h(constraintLayout);
        int id = o0().getId();
        h.e(id, 3, 0, 3);
        h.e(id, 6, 0, 6);
        h.e(id, 7, 0, 7);
        int id2 = n0().getId();
        h.e(id2, 3, 0, 3);
        h.e(id2, 7, 0, 7);
        float f = (float) 8;
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 7, id2, 4));
        h.e(id2, 6, 0, 6);
        new ila(h, 6, id2, 4).e(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f));
        int id3 = p0().getId();
        h.e(id3, 3, n0().getId(), 4);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 3, id3, 4));
        h.e(id3, 6, 0, 6);
        int id4 = q0().getId();
        h.e(id4, 3, n0().getId(), 4);
        tr1.u((float) 20, vo4.c().getDisplayMetrics().density, new ila(h, 3, id4, 4));
        h.e(id4, 7, 0, 7);
        h.e(id4, 6, 0, 6);
        h.e(id4, 4, 0, 4);
        h.j(id4).d.m0 = true;
        h.j(id4).d.x = c44.DEFAULT_ASPECT_RATIO;
        h.a(constraintLayout);
        frameLayout.addView(constraintLayout, -1, -1);
    }

    public final FrameLayout n0() {
        KProperty kProperty = z0[6];
        return (FrameLayout) this.x0.getValue();
    }

    public final FrameLayout o0() {
        KProperty kProperty = z0[2];
        return (FrameLayout) this.Y.getValue();
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        q0().setAdapter((tyc) null);
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        q0().setAdapter((m0f) this.X.getValue());
        bs0.K(new ps5(r0().D0, new x0f(this, (Continuation) null), 5), getViewLifecycleScope());
        b0h.H(view, new qrb((Object) this, (Continuation) null, 15));
    }

    public final AppCompatTextView p0() {
        KProperty kProperty = z0[7];
        return (AppCompatTextView) this.y0.getValue();
    }

    public final EndlessRecyclerView q0() {
        KProperty kProperty = z0[3];
        return (EndlessRecyclerView) this.Z.getValue();
    }

    public final v0f r0() {
        return (v0f) this.y.getValue();
    }

    public final void s0() {
        Object value;
        xme xme = r0().I0;
        do {
            value = xme.getValue();
            o0f o0f = (o0f) value;
        } while (!xme.b(value, (Object) null));
        i0(true);
    }

    public SuggestionsWidget(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID)));
    }
}
