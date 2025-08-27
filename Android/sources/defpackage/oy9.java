package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: oy9  reason: default package */
public final class oy9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ xy9 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oy9(xy9 xy9, Continuation continuation) {
        super(2, continuation);
        this.a = xy9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new oy9(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((oy9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        qo8 qo8;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xy9 xy9 = this.a;
        qo8 qo82 = xy9.o;
        if ((qo82 == null || qo82.getPlaybackState() != 3) && (qo8 = xy9.o) != null) {
            qo8.prepare();
        }
        qo8 qo83 = xy9.o;
        if (qo83 != null) {
            qo83.play();
        }
        return Unit.INSTANCE;
    }
}
