package one.me.calls.ui.ui.call.panels;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallTopPanelWidget;", "Lone/me/sdk/arch/Widget;", "Lcx3;", "Lxl1;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallTopPanelWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallTopPanelWidget.kt\none/me/calls/ui/ui/call/panels/CallTopPanelWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,132:1\n419#2:133\n255#2,9:134\n235#2,10:143\n410#2,8:153\n256#3,2:161\n254#3:163\n*S KotlinDebug\n*F\n+ 1 CallTopPanelWidget.kt\none/me/calls/ui/ui/call/panels/CallTopPanelWidget\n*L\n29#1:133\n31#1:134,9\n32#1:143,10\n79#1:153,8\n84#1:161,2\n85#1:163\n*E\n"})
@SuppressLint({"ValidController"})
public final class CallTopPanelWidget extends Widget implements cx3, xl1 {
    public static final /* synthetic */ KProperty[] o;
    public final Lazy a;
    public final Lazy b;
    public final sn0 c;

    static {
        Class<CallTopPanelWidget> cls = CallTopPanelWidget.class;
        o = new KProperty[]{wj6.p(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), wj6.p(cls, "callTopPanel", "getCallTopPanel()Lone/me/calls/ui/view/controls/CallTopControlViewWrapper;", 0)};
    }

    public CallTopPanelWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        is isVar = new is(egd.class, new egd("default"), Widget.ARG_SCOPE_ID);
        KProperty kProperty = o[0];
        this.a = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, jj1.class, (Function0) null);
        this.b = createViewModelLazy(am1.class, new s(16, new bm1(this, 0)));
        this.c = binding(new bm1(this, 1));
    }

    public final vl1 c0() {
        KProperty kProperty = o[1];
        return (vl1) this.c.getValue();
    }

    public final am1 d0() {
        return (am1) this.b.getValue();
    }

    public final void onAttach(View view) {
        bs0.K(new ps5(ct.k(d0().o, getViewLifecycleOwner().getLifecycle(), iu7.o), new dm1((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return c0();
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        c0().a();
    }

    public final void onViewCreated(View view) {
        c0().setClickListener(new wie(7, (Object) this));
    }

    public final void r(jl1 jl1) {
        if (((jj1) ((ph1) this.a.getValue())).n()) {
            il1 il1 = jl1 != null ? jl1.a : null;
            int i = il1 == null ? -1 : cm1.$EnumSwitchMapping$0[il1.ordinal()];
            if (i == -1) {
                return;
            }
            if (i == 1) {
                c0().setTitle(jl1.b);
                c0().setStatus(jl1.c);
            } else if (i == 2) {
                c0().setTitle((CharSequence) null);
                c0().setStatus((CharSequence) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void s(int i, Bundle bundle) {
        if (i == qqa.s) {
            xag.h(((jj1) d0().b).K0, vh1.b);
        } else if (i == qqa.f) {
            xag.h(((jj1) d0().b).K0, wh1.b);
        }
    }

    public CallTopPanelWidget(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID)));
    }
}
