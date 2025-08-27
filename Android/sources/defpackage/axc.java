package defpackage;

import android.os.Bundle;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: axc  reason: default package */
public final class axc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ RecordControlsWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public axc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.b = recordControlsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        axc axc = new axc(continuation, this.b);
        axc.a = obj;
        return axc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((axc) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        cwc cwc = (cwc) this.a;
        boolean areEqual = Intrinsics.areEqual((Object) cwc, (Object) awc.a);
        RecordControlsWidget recordControlsWidget = this.b;
        if (areEqual) {
            KProperty[] kPropertyArr = RecordControlsWidget.g1;
            String[] strArr = edb.h;
            boolean b2 = ((edb) recordControlsWidget.o.getValue()).b(strArr);
            Lazy lazy = recordControlsWidget.o;
            if (!b2) {
                edb edb = (edb) lazy.getValue();
                eng eng = new eng(recordControlsWidget, 1);
                int i = aza.b;
                edb.getClass();
                int i2 = bmc.permissions_audio_title;
                int i3 = aza.e;
                if (edb.i(eng, strArr)) {
                    eng.c(strArr, 160, i2, i, i3);
                } else {
                    edb.f(eng, strArr, 160);
                }
            }
            if (!((edb) lazy.getValue()).b(edb.l)) {
                ((edb) lazy.getValue()).h(new eng(recordControlsWidget, 1));
            }
        } else if (Intrinsics.areEqual((Object) cwc, (Object) bwc.a)) {
            KProperty[] kPropertyArr2 = RecordControlsWidget.g1;
            recordControlsWidget.getClass();
            KProperty[] kPropertyArr3 = BottomSheetWidget.v0;
            e9d e9d = null;
            ng3 a2 = b0h.a(new igf(yya.d), (Bundle) null, 6);
            a2.f(new igf(yya.c));
            a2.a(new pg3(1, new igf(yya.a), og3.c));
            a2.a(new pg3(2, new igf(yya.b), og3.b));
            ConfirmationBottomSheet e = a2.e();
            e.setTargetController(recordControlsWidget);
            zx3 zx3 = recordControlsWidget;
            while (zx3.getParentController() != null) {
                zx3 = zx3.getParentController();
            }
            l9d l9d = zx3 instanceof l9d ? (l9d) zx3 : null;
            if (l9d != null) {
                e9d = l9d.K();
            }
            e.p0(recordControlsWidget);
            if (e9d != null) {
                i9d i9d = new i9d(e, (String) null, (ey3) null, (ey3) null, false, -1);
                a81.t(false, i9d, true, "BottomSheetWidget");
                e9d.G(i9d);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
