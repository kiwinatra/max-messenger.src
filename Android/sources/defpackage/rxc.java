package defpackage;

import android.widget.TextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: rxc  reason: default package */
public final class rxc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ RecordExitBottomSheet b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rxc(Continuation continuation, RecordExitBottomSheet recordExitBottomSheet) {
        super(2, continuation);
        this.b = recordExitBottomSheet;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        rxc rxc = new rxc(continuation, this.b);
        rxc.a = obj;
        return rxc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rxc) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        txc txc = (txc) this.a;
        KProperty[] kPropertyArr = RecordExitBottomSheet.F0;
        RecordExitBottomSheet recordExitBottomSheet = this.b;
        recordExitBottomSheet.w0().setText(txc.a.a(recordExitBottomSheet.getContext()));
        TextView v0 = recordExitBottomSheet.v0();
        ngf ngf = txc.b;
        v0.setText(ngf != null ? ngf.a(recordExitBottomSheet.getContext()) : null);
        int i = 0;
        recordExitBottomSheet.v0().setVisibility(ngf != null ? 0 : 8);
        recordExitBottomSheet.u0().setTitle(txc.e);
        bz2 q0 = recordExitBottomSheet.q0();
        if (!txc.f) {
            i = 8;
        }
        q0.setVisibility(i);
        OneMeButton r0 = recordExitBottomSheet.r0();
        sxc sxc = txc.c;
        r0.setMode(sxc.c);
        r0.setText(sxc.b.a(r0.getContext()));
        ct.G(r0, 300, new cr(4, recordExitBottomSheet, txc));
        OneMeButton s0 = recordExitBottomSheet.s0();
        sxc sxc2 = txc.d;
        s0.setMode(sxc2.c);
        s0.setText(sxc2.b.a(s0.getContext()));
        ct.G(s0, 300, new wld(13, recordExitBottomSheet));
        return Unit.INSTANCE;
    }
}
