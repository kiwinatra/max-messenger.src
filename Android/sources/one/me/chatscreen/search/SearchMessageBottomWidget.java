package one.me.chatscreen.search;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/chatscreen/search/SearchMessageBottomWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "chat-screen_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSearchMessageBottomWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchMessageBottomWidget.kt\none/me/chatscreen/search/SearchMessageBottomWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 4 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetExtKt\n+ 5 ConstraintSetExt.kt\none/me/sdk/uikit/common/ConstraintSetBuilder\n+ 6 View.kt\nandroidx/core/view/ViewKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Ripple.kt\none/me/sdk/uikit/common/RippleKt\n*L\n1#1,225:1\n420#2:226\n255#2,9:227\n24#3:236\n24#3:237\n24#3:240\n24#3:243\n24#3:246\n24#3:251\n24#3:252\n24#3:257\n24#3:258\n24#3:262\n20#4:238\n21#4:250\n186#5:239\n187#5:241\n186#5:242\n187#5:244\n186#5:245\n187#5:247\n186#5,2:248\n172#6,2:253\n172#6,2:259\n1#7:255\n23#8:256\n23#8:261\n*S KotlinDebug\n*F\n+ 1 SearchMessageBottomWidget.kt\none/me/chatscreen/search/SearchMessageBottomWidget\n*L\n42#1:226\n46#1:227,9\n122#1:236\n123#1:237\n145#1:240\n153#1:243\n159#1:246\n66#1:251\n70#1:252\n87#1:257\n91#1:258\n108#1:262\n141#1:238\n141#1:250\n142#1:239\n142#1:241\n151#1:242\n151#1:244\n157#1:245\n157#1:247\n163#1:248,2\n70#1:253,2\n91#1:259,2\n76#1:256\n97#1:261\n*E\n"})
public final class SearchMessageBottomWidget extends Widget {
    public static final /* synthetic */ KProperty[] y;
    public final Lazy a;
    public final sn0 b;
    public final sn0 c;
    public final sn0 o;
    public final sn0 v;
    public boolean w;
    public boolean x;

    static {
        Class<SearchMessageBottomWidget> cls = SearchMessageBottomWidget.class;
        y = new KProperty[]{rae.s(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "searchResultTextView", "getSearchResultTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0), wj6.p(cls, "upButton", "getUpButton()Landroidx/appcompat/widget/AppCompatImageView;", 0), wj6.p(cls, "downButton", "getDownButton()Landroidx/appcompat/widget/AppCompatImageView;", 0), wj6.p(cls, "separatorView", "getSeparatorView()Landroid/view/View;", 0)};
    }

    public SearchMessageBottomWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        is isVar = new is(egd.class, Widget.ARG_SCOPE_ID);
        KProperty kProperty = y[0];
        this.a = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, wkd.class, (Function0) null);
        this.b = binding(new kkd(this, 0));
        this.c = binding(new kkd(this, 1));
        this.o = binding(new kkd(this, 2));
        this.v = binding(new kkd(this, 3));
    }

    public final AppCompatImageView c0() {
        KProperty kProperty = y[3];
        return (AppCompatImageView) this.o.getValue();
    }

    public final AppCompatTextView d0() {
        KProperty kProperty = y[1];
        return (AppCompatTextView) this.b.getValue();
    }

    public final View e0() {
        KProperty kProperty = y[4];
        return (View) this.v.getValue();
    }

    public final AppCompatImageView f0() {
        KProperty kProperty = y[2];
        return (AppCompatImageView) this.c.getValue();
    }

    public final wkd g0() {
        return (wkd) this.a.getValue();
    }

    public final void h0(AppCompatImageView appCompatImageView, boolean z) {
        appCompatImageView.setImageTintList(ColorStateList.valueOf(z ? i0().b.a : i0().b.b));
    }

    public final zqg i0() {
        return fu4.k.e(getContext()).f().a().f();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(getContext());
        float f = (float) 12;
        float f2 = (float) 4;
        constraintLayout.setPadding(MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f2), MathKt.roundToInt(vo4.c().getDisplayMetrics().density * f), MathKt.roundToInt(f2 * vo4.c().getDisplayMetrics().density));
        constraintLayout.setMinHeight(MathKt.roundToInt(((float) 44) * vo4.c().getDisplayMetrics().density));
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        constraintLayout.addView(d0());
        constraintLayout.addView(f0());
        constraintLayout.addView(e0());
        constraintLayout.addView(c0());
        b0h.H(constraintLayout, new qrb((Object) this, (Continuation) null, 8));
        pj3 h = ct.h(constraintLayout);
        int id = d0().getId();
        h.e(id, 6, 0, 6);
        h.e(id, 3, 0, 3);
        h.e(id, 7, f0().getId(), 6);
        tr1.u(f, vo4.c().getDisplayMetrics().density, new ila(h, 7, id, 4));
        h.e(id, 4, 0, 4);
        h.j(id).d.l0 = true;
        h.j(id).d.w = c44.DEFAULT_ASPECT_RATIO;
        int id2 = f0().getId();
        h.e(id2, 3, 0, 3);
        h.e(id2, 7, e0().getId(), 6);
        float f3 = (float) 10;
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 7, id2, 4));
        h.e(id2, 4, 0, 4);
        int id3 = e0().getId();
        h.e(id3, 3, 0, 3);
        h.e(id3, 7, c0().getId(), 6);
        tr1.u(f3, vo4.c().getDisplayMetrics().density, new ila(h, 7, id3, 4));
        h.e(id3, 4, 0, 4);
        int id4 = c0().getId();
        h.e(id4, 3, 0, 3);
        h.e(id4, 7, 0, 7);
        h.e(id4, 4, 0, 4);
        h.a(constraintLayout);
        return constraintLayout;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        g0().j();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        fma h = getRouter().h();
        if (h != null) {
            h.b(g0().v);
        }
        bs0.K(new ps5(g0().w, new mkd(view, this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(new on2(ct.k(g0().y, this.lifecycleOwner.getLifecycle(), iu7.o), 28), new nkd(this, (Continuation) null), 5), getViewLifecycleScope());
    }

    public SearchMessageBottomWidget(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID)));
    }
}
