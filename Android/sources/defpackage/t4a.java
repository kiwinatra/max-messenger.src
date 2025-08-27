package defpackage;

import com.my.tracker.MyTracker;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: t4a  reason: default package */
public final class t4a extends SuspendLambda implements Function2 {
    public final /* synthetic */ long a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t4a(long j, Continuation continuation) {
        super(2, continuation);
        this.a = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new t4a(this.a, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t4a) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MyTracker.trackRegistrationEvent(String.valueOf(this.a), (String) null);
        return Unit.INSTANCE;
    }
}
