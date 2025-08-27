package defpackage;

import android.graphics.Path;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: fxc  reason: default package */
public final class fxc extends SuspendLambda implements Function2 {
    public final /* synthetic */ RecordControlsWidget a;
    public final /* synthetic */ byte[] b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fxc(Continuation continuation, RecordControlsWidget recordControlsWidget, byte[] bArr) {
        super(2, continuation);
        this.a = recordControlsWidget;
        this.b = bArr;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fxc(continuation, this.a, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fxc) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        KProperty[] kPropertyArr = RecordControlsWidget.g1;
        c80 F0 = this.a.F0();
        F0.x = true;
        Path path = F0.x0;
        if (!path.isEmpty()) {
            path.reset();
        }
        byte[] bArr = this.b;
        if (bArr != null) {
            float measuredHeight = ((float) F0.getMeasuredHeight()) / 2.0f;
            path.reset();
            if (true ^ (bArr.length == 0)) {
                float f = F0.o;
                float width = ((float) F0.getWidth()) - (f / 2.0f);
                int length = bArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        float measuredHeight2 = (((float) F0.getMeasuredHeight()) / 127.0f) * ((float) bArr[length]);
                        float f2 = F0.b;
                        if (measuredHeight2 < f2) {
                            measuredHeight2 = f2;
                        }
                        float f3 = measuredHeight2 / 2.0f;
                        path.moveTo(width, measuredHeight - f3);
                        path.lineTo(width, f3 + measuredHeight);
                        width = (width - f) - F0.c;
                        if (i < 0) {
                            break;
                        }
                        length = i;
                    }
                }
            }
            F0.invalidate();
        }
        return Unit.INSTANCE;
    }
}
