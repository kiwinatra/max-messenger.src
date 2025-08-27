package one.me.calls.ui.ui.indicator;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/ui/indicator/CallIndicatorWidget;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallIndicatorWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallIndicatorWidget.kt\none/me/calls/ui/ui/indicator/CallIndicatorWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,148:1\n235#2,10:149\n24#3:159\n24#3:160\n*S KotlinDebug\n*F\n+ 1 CallIndicatorWidget.kt\none/me/calls/ui/ui/indicator/CallIndicatorWidget\n*L\n65#1:149,10\n43#1:159\n60#1:160\n*E\n"})
public final class CallIndicatorWidget extends Widget {
    public static final /* synthetic */ KProperty[] v;
    public final Lazy a = oh1.a.c();
    public final sn0 b = binding(new w81(this, 0));
    public final sn0 c = binding(new w81(this, 1));
    public final Lazy o = createViewModelLazy(t81.class, new s(9, new w81(this, 2)));

    static {
        Class<CallIndicatorWidget> cls = CallIndicatorWidget.class;
        v = new KProperty[]{wj6.p(cls, "indicatorView", "getIndicatorView()Lone/me/calls/ui/view/indicator/CallIndicatorView;", 0), wj6.p(cls, "fakeIndicatorView", "getFakeIndicatorView()Landroid/view/View;", 0)};
    }

    public CallIndicatorWidget() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public static final r81 c0(CallIndicatorWidget callIndicatorWidget) {
        callIndicatorWidget.getClass();
        KProperty kProperty = v[0];
        return (r81) callIndicatorWidget.b.getValue();
    }

    public static final void d0(CallIndicatorWidget callIndicatorWidget, boolean z) {
        int i;
        if (z) {
            callIndicatorWidget.getClass();
            i = l2b.d.i;
        } else {
            i = 0;
        }
        callIndicatorWidget.getClass();
        KProperty kProperty = v[1];
        Drawable background = ((View) callIndicatorWidget.c.getValue()).getBackground();
        ColorDrawable colorDrawable = null;
        ColorDrawable colorDrawable2 = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable2 != null) {
            if (colorDrawable2.getColor() != i) {
                colorDrawable = colorDrawable2;
            }
            if (colorDrawable != null) {
                colorDrawable.setColor(i);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new y81(this, getContext());
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Lazy lazy = this.o;
        bs0.K(new ps5(((t81) lazy.getValue()).w, new z81(this, (Continuation) null), 5), getViewLifecycleScope());
        bs0.K(new ps5(((t81) lazy.getValue()).y, new a91(this, (Continuation) null), 5), getViewLifecycleScope());
    }
}
