package ru.ok.tamtam.calls;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import ru.ok.TamBottomSheetDialogFragment;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lru/ok/tamtam/calls/CallDialogFragment;", "Lru/ok/TamBottomSheetDialogFragment;", "<init>", "()V", "e41", "d41", "call-dialog_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCallDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallDialogFragment.kt\nru/ok/tamtam/calls/CallDialogFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 LiveDataExt.kt\nru/ok/tamtam/shared/lifecycle/LiveDataExtKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 7 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,296:1\n106#2,15:297\n131#3,10:312\n131#3,10:328\n49#4:322\n51#4:326\n49#4:338\n51#4:342\n46#5:323\n51#5:325\n46#5:339\n51#5:341\n105#6:324\n105#6:340\n24#7:327\n28#7:343\n28#7:344\n24#7:345\n*S KotlinDebug\n*F\n+ 1 CallDialogFragment.kt\nru/ok/tamtam/calls/CallDialogFragment\n*L\n46#1:297,15\n127#1:312,10\n178#1:328,10\n127#1:322\n127#1:326\n178#1:338\n178#1:342\n127#1:323\n127#1:325\n178#1:339\n178#1:341\n127#1:324\n178#1:340\n169#1:327\n186#1:343\n195#1:344\n203#1:345\n*E\n"})
public final class CallDialogFragment extends TamBottomSheetDialogFragment {
    public final bbg D1;
    public final Lazy E1 = LazyKt.lazy(new v11(5));

    public CallDialogFragment() {
        super(hjc.call_dialog_fragment);
        v11 v11 = new v11(4);
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, new uc(1, new tc(2, this)));
        this.D1 = new bbg(Reflection.getOrCreateKotlinClass(CallDialogViewModel.class), (Function0) new vc(2, lazy), (Function0) v11, (Function0) new vc(3, lazy));
    }

    public final void A2(View view, Bundle bundle) {
        c3().a(view, X1());
        super.A2(view, bundle);
        c3().e();
        if (E2().getApplication() == null) {
            throw null;
        }
        throw new ClassCastException();
    }

    public final void L0(scf scf) {
        scf scf2 = scf;
        e41 c3 = c3();
        c3.getClass();
        KProperty[] kPropertyArr = e41.Y;
        KProperty kProperty = kPropertyArr[1];
        Integer valueOf = Integer.valueOf(j4b.l0(0.7f, scf2.x));
        float f = vo4.c().getDisplayMetrics().density * 3.0f;
        ((View) c3.c.getValue(c3, kProperty)).setBackground(i8b.P(valueOf, (Integer) null, (Integer) null, new float[]{f, f, f, f, f, f, f, f}));
        ((AppCompatTextView) c3.o.getValue(c3, kPropertyArr[2])).setTextColor(scf2.G);
        c3.f().setTextColor(scf2.N);
        View g = c3.g();
        int i = scf2.I;
        Integer valueOf2 = Integer.valueOf(i);
        float f2 = vo4.c().getDisplayMetrics().density * 22.0f;
        g.setBackground(i8b.P(valueOf2, (Integer) null, (Integer) null, new float[]{f2, f2, f2, f2, f2, f2, f2, f2}));
        ((View) c3.y.getValue(c3, kPropertyArr[6])).setBackgroundColor(i);
        ((View) c3.z.getValue(c3, kPropertyArr[8])).setBackgroundColor(i);
        Button d = c3.d();
        iq.f(scf, d, MathKt.roundToInt(((float) 100) * vo4.c().getDisplayMetrics().density), 0, 0, 60);
        d.setTextColor(scf2.m);
        tyc adapter = c3.e().getAdapter();
        if (adapter != null) {
            int j = adapter.j();
            for (int i2 = 0; i2 < j; i2++) {
                pzc M = c3.e().M(i2);
                wcf wcf = M instanceof wcf ? (wcf) M : null;
                if (wcf != null) {
                    wcf.L0(scf2);
                }
            }
        }
    }

    public final int U2() {
        return lnc.CallDialog_BottomSheetDialog;
    }

    public final void b3(xr0 xr0) {
        xr0.h().w(new vr0(2, this));
    }

    public final e41 c3() {
        return (e41) this.E1.getValue();
    }

    public final void d3(d41 d41) {
        z68.c("CallDialogFragment", "set fragment result " + d41, new Object[0]);
        Q1().f0("CallDialogFragment:result:request", o54.f(TuplesKt.to("CallDialogFragment:result:key", d41)));
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        d3(y31.a);
    }

    public final void v2(int i, String[] strArr, int[] iArr) {
        d3(new b41(i, strArr, iArr));
    }
}
