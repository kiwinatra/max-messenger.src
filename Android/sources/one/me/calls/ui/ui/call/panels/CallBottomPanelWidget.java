package one.me.calls.ui.ui.call.panels;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallBottomPanelWidget;", "Lone/me/sdk/arch/Widget;", "Lcx3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Legd;", "scopeId", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallBottomPanelWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallBottomPanelWidget.kt\none/me/calls/ui/ui/call/panels/CallBottomPanelWidget\n+ 2 Widget.kt\none/me/sdk/arch/Widget\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,185:1\n419#2:186\n255#2,9:187\n235#2,10:196\n410#2,8:206\n410#2,8:214\n410#2,8:222\n254#3:230\n*S KotlinDebug\n*F\n+ 1 CallBottomPanelWidget.kt\none/me/calls/ui/ui/call/panels/CallBottomPanelWidget\n*L\n35#1:186\n40#1:187,9\n41#1:196,10\n106#1:206,8\n113#1:214,8\n114#1:222,8\n155#1:230\n*E\n"})
@SuppressLint({"ValidController"})
public final class CallBottomPanelWidget extends Widget implements cx3 {
    public static final /* synthetic */ KProperty[] y;
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy o;
    public final wie v;
    public mw3 w;
    public final ReadOnlyProperty x;

    static {
        Class<CallBottomPanelWidget> cls = CallBottomPanelWidget.class;
        y = new KProperty[]{wj6.p(cls, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), rae.s(cls, "audioLevelJob", "getAudioLevelJob()Lkotlinx/coroutines/Job;", 0), wj6.p(cls, "callBottomPanel", "getCallBottomPanel()Lone/me/calls/ui/view/controls/CallBottomControlViewWrapper;", 0)};
    }

    public CallBottomPanelWidget(Bundle bundle) {
        super(bundle, 0, 2, (DefaultConstructorMarker) null);
        is isVar = new is(egd.class, new egd("default"), Widget.ARG_SCOPE_ID);
        m21 m21 = m21.a;
        this.a = m21.getAccessor().h(edb.class);
        this.b = m21.getAccessor().h(nj1.class);
        KProperty kProperty = y[0];
        this.c = m1571getSharedViewModelcp94BC8(((egd) isVar.a(this)).a, jj1.class, (Function0) null);
        this.o = createViewModelLazy(i11.class, new s(5, new j6(16, this)));
        this.v = o5a.U();
        this.x = viewBinding(kgc.call_bottom_control);
    }

    public final b11 c0() {
        return (b11) this.x.getValue(this, y[2]);
    }

    public final ph1 d0() {
        return (ph1) this.c.getValue();
    }

    public final i11 e0() {
        return (i11) this.o.getValue();
    }

    public final void onAttach(View view) {
        super.onAttach(view);
        i21 i21 = e0().x;
        iu7 iu7 = iu7.o;
        bs0.K(new ps5(ct.k(i21, getViewLifecycleOwner().getLifecycle(), iu7), new k11((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(e0().y, getViewLifecycleOwner().getLifecycle(), iu7), new l11((Continuation) null, this), 5), getViewLifecycleScope());
        bs0.K(new ps5(ct.k(e0().z, getViewLifecycleOwner().getLifecycle(), iu7), new m11((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        b11 b11 = new b11(getContext());
        b11.setId(kgc.call_bottom_control);
        if (((jj1) d0()).n()) {
            b11.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        } else {
            b11.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        return b11;
    }

    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.v.setValue(this, y[1], (Object) null);
        c0().a();
        mw3 mw3 = this.w;
        if (mw3 != null) {
            mw3.dismiss();
        }
        this.w = null;
    }

    public final void onDismiss() {
        this.w = null;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        Lazy lazy = this.a;
        boolean z = false;
        boolean z2 = i == 159 && ((edb) lazy.getValue()).b(edb.l);
        if (i == 160 && ((edb) lazy.getValue()).b(edb.h)) {
            z = true;
        }
        if (z2) {
            e0().n(aj8.c);
        } else if (z) {
            e0().l(aj8.c);
        }
        if (z2 || z) {
            hn requireActivity = requireActivity();
            ((nj1) this.b.getValue()).getClass();
            nj1.d(requireActivity);
        }
    }

    public final void onViewCreated(View view) {
        c0().setClickListener(new grg(5, this));
    }

    public final void s(int i, Bundle bundle) {
        Object obj;
        CallsAudioDeviceInfo b2;
        i11 e0 = e0();
        Iterator it = e0.j().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((u41) obj).getId() == i) {
                break;
            }
        }
        u41 u41 = (u41) obj;
        if (u41 != null && (b2 = u41.b()) != null) {
            e0.k().h(b2);
        }
    }

    public CallBottomPanelWidget(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(o54.f(i2a.l(str, Widget.ARG_SCOPE_ID)));
    }
}
