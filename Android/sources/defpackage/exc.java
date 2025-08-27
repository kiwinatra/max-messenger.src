package defpackage;

import android.animation.AnimatorSet;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: exc  reason: default package */
public final class exc extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ RecordControlsWidget c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public exc(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.c = recordControlsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        exc exc = new exc(continuation, this.c);
        exc.b = obj;
        return exc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((exc) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        d14 d14;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            d14 = (d14) this.b;
        } else if (i == 1) {
            d14 = (d14) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (e14.f(d14)) {
            KProperty[] kPropertyArr = RecordControlsWidget.g1;
            RecordControlsWidget recordControlsWidget = this.c;
            int a2 = recordControlsWidget.D0().o().a();
            recordControlsWidget.i0().clearAnimation();
            float f = 1.45f;
            float f2 = ((((float) a2) * 1.45f) / ((float) 32768)) + ((float) 1);
            if (f2 <= 1.45f) {
                f = f2;
            }
            List Q = i8b.Q(recordControlsWidget.i0(), recordControlsWidget.W0, f, 100, 0);
            AnimatorSet animatorSet = new AnimatorSet();
            recordControlsWidget.a1 = animatorSet;
            animatorSet.setInterpolator((gh5) recordControlsWidget.R0.getValue());
            AnimatorSet animatorSet2 = recordControlsWidget.a1;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(Q);
            }
            AnimatorSet animatorSet3 = recordControlsWidget.a1;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
            recordControlsWidget.W0 = f;
            this.b = d14;
            this.a = 1;
            if (xk4.b(100, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
