package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* renamed from: ty9  reason: default package */
public final class ty9 extends SuspendLambda implements Function2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ xy9 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ty9(long j, xy9 xy9, Continuation continuation) {
        super(2, continuation);
        this.a = j;
        this.b = xy9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ty9(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ty9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = xy9.N;
        long j = this.a;
        z68.c("xy9", "seekToPosition, posMs %d", Boxing.boxLong(j));
        xy9 xy9 = this.b;
        xy9.f();
        qo8 qo8 = xy9.o;
        if (qo8 != null) {
            qo8.seekTo(j);
        }
        xy9.u.setValue(Boxing.boxLong(j));
        xy9.J.setValue(Boxing.boxFloat(RangesKt.coerceIn((float) (((double) j) / ((double) xy9.G)), (float) c44.DEFAULT_ASPECT_RATIO, 1.0f)));
        return Unit.INSTANCE;
    }
}
