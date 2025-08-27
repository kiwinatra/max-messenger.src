package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: zwc  reason: default package */
public final class zwc extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ RecordControlsWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zwc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.b = recordControlsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zwc zwc = new zwc(continuation, this.b);
        zwc.a = obj;
        return zwc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zwc) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xz7 xz7 = (xz7) this.a;
        KProperty[] kPropertyArr = RecordControlsWidget.g1;
        RecordControlsWidget recordControlsWidget = this.b;
        recordControlsWidget.getClass();
        boolean z = xz7.b;
        Long l = (Long) recordControlsWidget.D0().x0.a.getValue();
        if (z) {
            recordControlsWidget.x0().setImageDrawable((Drawable) recordControlsWidget.J0.getValue());
        } else {
            recordControlsWidget.x0().setImageDrawable((Drawable) recordControlsWidget.I0.getValue());
        }
        Float f = xz7.a;
        if (f == null) {
            c80 F0 = recordControlsWidget.F0();
            if (!F0.B0) {
                F0.w = (long) (c44.DEFAULT_ASPECT_RATIO * ((float) F0.A0));
                F0.y = false;
                F0.postInvalidate();
            }
        } else {
            c80 F02 = recordControlsWidget.F0();
            float floatValue = f.floatValue();
            if (!F02.B0) {
                F02.w = (long) (floatValue * ((float) F02.A0));
                F02.y = true;
                F02.postInvalidate();
            }
        }
        if (!recordControlsWidget.F0().B0) {
            if (f == null || l == null) {
                str = null;
            } else {
                str = b0h.d((long) (f.floatValue() * ((float) l.longValue())));
            }
            if (f == null && l != null) {
                str = b0h.d(l.longValue());
            }
            recordControlsWidget.r0().setText(str);
        }
        return Unit.INSTANCE;
    }
}
