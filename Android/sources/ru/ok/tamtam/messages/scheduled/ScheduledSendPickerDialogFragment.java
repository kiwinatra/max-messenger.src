package ru.ok.tamtam.messages.scheduled;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.fragment.app.c;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import ru.ok.TamBottomSheetDialogFragment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lru/ok/tamtam/messages/scheduled/ScheduledSendPickerDialogFragment;", "Lru/ok/TamBottomSheetDialogFragment;", "<init>", "()V", "zed", "xed", "yed", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nScheduledSendPickerDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduledSendPickerDialogFragment.kt\nru/ok/tamtam/messages/scheduled/ScheduledSendPickerDialogFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,327:1\n106#2,15:328\n256#3,2:343\n*S KotlinDebug\n*F\n+ 1 ScheduledSendPickerDialogFragment.kt\nru/ok/tamtam/messages/scheduled/ScheduledSendPickerDialogFragment\n*L\n62#1:328,15\n149#1:343,2\n*E\n"})
public final class ScheduledSendPickerDialogFragment extends TamBottomSheetDialogFragment {
    public final Lazy D1;
    public final Lazy E1;
    public final Lazy F1;
    public final bbg G1;
    public final Lazy H1;

    public ScheduledSendPickerDialogFragment() {
        super(jjc.scheduled_send_picker_fragment);
        qed qed = new qed(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.D1 = LazyKt.lazy(lazyThreadSafetyMode, qed);
        this.E1 = LazyKt.lazy(lazyThreadSafetyMode, new qed(this, 1));
        this.F1 = LazyKt.lazy(lazyThreadSafetyMode, new qed(this, 2));
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new uc(10, new tc(21, this)));
        this.G1 = new bbg(Reflection.getOrCreateKotlinClass(ScheduledSendPickerViewModel.class), (Function0) new vc(18, lazy), (Function0) new aob(2, this, lazy), (Function0) new vc(19, lazy));
        this.H1 = LazyKt.lazy(lazyThreadSafetyMode, new red(this));
    }

    public static final void f3(c cVar, String str) {
        ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment = new ScheduledSendPickerDialogFragment();
        scheduledSendPickerDialogFragment.L2(o54.f(TuplesKt.to("ScheduledSendPickerDialogFragment:who", str), TuplesKt.to("ScheduledSendPickerDialogFragment:send_with_notification", Boolean.TRUE), TuplesKt.to("ScheduledSendPickerDialogFragment:arg_input", null), TuplesKt.to("ScheduledSendPickerViewModel:delayed_attrs", null)));
        scheduledSendPickerDialogFragment.Y2(cVar, "ScheduledSendPickerDialogFragment");
    }

    public final void A2(View view, Bundle bundle) {
        c3().a(view, X1());
        super.A2(view, bundle);
        bs0.K(new ps5(new on2(d3().e, 28), new afd(this, (Continuation) null), 5), fqc.p(X1()));
        bs0.K(new ps5(d3().m, new bfd(view, this, (Continuation) null), 5), fqc.p(X1()));
        bs0.K(new ps5(new k26(new on2(d3().o, 28), 20), new cfd(this, (Continuation) null), 5), fqc.p(X1()));
        c3().d().setListener$scheduled_send_picker_dialog_release(d3());
        ct.G(c3().e(), 300, new ted(this, 0));
        zed c3 = c3();
        c3.getClass();
        KProperty[] kPropertyArr = zed.z;
        int i = 0;
        MaterialToolbar materialToolbar = (MaterialToolbar) c3.c.getValue(c3, kPropertyArr[0]);
        materialToolbar.setBackground((Drawable) null);
        materialToolbar.setNavigationOnClickListener(new t84((View.OnClickListener) new ted(this, 1), 0));
        zed c32 = c3();
        c32.getClass();
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) c32.w.getValue(c32, kPropertyArr[3]);
        if (!((Boolean) this.D1.getValue()).booleanValue()) {
            i = 8;
        }
        appCompatCheckBox.setVisibility(i);
        appCompatCheckBox.setOnCheckedChangeListener(new zy2(4, this));
        bs0.K(new ps5(new on2(d3().g, 28), new dfd(this, (Continuation) null), 5), fqc.p(X1()));
    }

    public final void L0(scf scf) {
        c3().L0(scf);
    }

    public final Dialog V2(Bundle bundle) {
        xr0 xr0 = new xr0(G2(), cnc.UiUtils_LightBottomSheetDialog);
        xr0.X = true;
        xr0.h().K(3);
        xr0.h().I(true);
        xr0.h().J = true;
        b3(xr0);
        return xr0;
    }

    public final void b3(xr0 xr0) {
        BottomSheetBehavior h = xr0.h();
        h.K = false;
        h.H(true);
        xr0.setOnKeyListener(new sed(this));
    }

    public final zed c3() {
        return (zed) this.H1.getValue();
    }

    public final ScheduledSendPickerViewModel d3() {
        return (ScheduledSendPickerViewModel) this.G1.getValue();
    }

    public final void e3(xed xed) {
        Lazy lazy = this.E1;
        String k = wj6.k("ScheduledSendPickerDialogFragment:", (String) lazy.getValue(), ":result");
        Q1().f0(k, o54.f(TuplesKt.to("ScheduledSendPickerDialogFragment:" + ((String) lazy.getValue()) + ":result", xed)));
    }

    public final void i2(Bundle bundle) {
        super.i2(bundle);
        hd8.B(E2());
    }
}
