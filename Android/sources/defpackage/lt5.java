package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* renamed from: lt5  reason: default package */
public final class lt5 extends SuspendLambda implements Function1 {
    public int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ Ref.ObjectRef c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lt5(ds5 ds5, Continuation continuation, Ref.ObjectRef objectRef) {
        super(1, continuation);
        this.b = ds5;
        this.c = objectRef;
    }

    public final Continuation create(Continuation continuation) {
        return new lt5(this.b, continuation, this.c);
    }

    public final Object invoke(Object obj) {
        return ((lt5) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        Ref.ObjectRef objectRef = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            T t = q8.e;
            T t2 = objectRef.element;
            if (t2 == t) {
                t2 = null;
            }
            this.a = 1;
            if (this.b.a(t2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef.element = null;
        return Unit.INSTANCE;
    }
}
