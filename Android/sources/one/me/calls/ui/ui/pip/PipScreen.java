package one.me.calls.ui.ui.pip;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/ui/pip/PipScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPipScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PipScreen.kt\none/me/calls/ui/ui/pip/PipScreen\n+ 2 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n*L\n1#1,73:1\n8#2:74\n*S KotlinDebug\n*F\n+ 1 PipScreen.kt\none/me/calls/ui/ui/pip/PipScreen\n*L\n33#1:74\n*E\n"})
public final class PipScreen extends Widget {
    public static final /* synthetic */ KProperty[] c = {wj6.p(PipScreen.class, "fakePipView", "getFakePipView()Lone/me/calls/ui/view/pip/CallPipView;", 0)};
    public final sn0 a = binding(new fnb(this, 0));
    public final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.NONE, new fnb(this, 1));

    public PipScreen() {
        super((Bundle) null, 0, 3, (DefaultConstructorMarker) null);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(qqa.c0);
        KProperty kProperty = c[0];
        frameLayout.addView((rf1) this.a.getValue());
        frameLayout.setBackgroundColor(0);
        return frameLayout;
    }

    public final void onDestroy() {
        super.onDestroy();
        wmb wmb = (wmb) this.b.getValue();
        wmb.a.a().remove(wmb);
        wmb.o = null;
        ((p6g) wmb.x.getValue()).b();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Lazy lazy = this.b;
        KProperty kProperty = c[0];
        ((wmb) lazy.getValue()).o = (rf1) this.a.getValue();
        bs0.K(new ps5(((wmb) lazy.getValue()).w, new gnb(this, (Continuation) null), 5), getViewLifecycleScope());
    }
}
