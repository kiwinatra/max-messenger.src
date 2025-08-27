package one.me.calls.ui.ui.incoming;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lone/me/calls/ui/ui/incoming/CallIncomingScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "u9a", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallIncomingScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallIncomingScreen.kt\none/me/calls/ui/ui/incoming/CallIncomingScreen\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 LazyExt.kt\nru/ok/tamtam/shared/utils/LazyExtKt\n*L\n1#1,191:1\n235#2,10:192\n8#3:202\n8#3:203\n*S KotlinDebug\n*F\n+ 1 CallIncomingScreen.kt\none/me/calls/ui/ui/incoming/CallIncomingScreen\n*L\n35#1:192,10\n51#1:202\n53#1:203\n*E\n"})
public final class CallIncomingScreen extends Widget {
    public static final u9a x = new u9a(8);
    public static final /* synthetic */ KProperty[] y = {wj6.p(CallIncomingScreen.class, "avatarView", "getAvatarView()Lone/me/calls/ui/view/CallUserLargeView;", 0)};
    public final dp1 a = m21.a.c();
    public final Lazy b;
    public final ReadOnlyProperty c;
    public final Lazy o;
    public final Lazy v;
    public final Lazy w;

    public CallIncomingScreen(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        this.b = createViewModelLazy(h81.class, new s(8, new s2(bundle, (Widget) this, 7)));
        this.c = viewBinding(kgc.call_incoming_avatar);
        v11 v11 = new v11(8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.o = LazyKt.lazy(lazyThreadSafetyMode, v11);
        this.v = oh1.a.getAccessor().h(tq1.class);
        this.w = LazyKt.lazy(lazyThreadSafetyMode, new j6(21, this));
    }

    public final h81 c0() {
        return (h81) this.b.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return new b81(this, getContext());
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 160) {
            String[] strArr2 = edb.h;
            int i2 = sqa.b;
            int i3 = sqa.a;
            ((edb) this.o.getValue()).getClass();
            if (edb.k((eng) this.w.getValue(), strArr, iArr, strArr2, i2, i3)) {
                c0().j();
            }
        }
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        kne.B(requireActivity(), true);
        fma h = getRouter().h();
        if (h != null) {
            h.a(getViewLifecycleOwner(), new wx3((Widget) this, 1));
        }
        bs0.K(new ps5(c0().X, new c81(this, (Continuation) null), 5), getViewLifecycleScope());
    }
}
