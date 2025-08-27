package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* renamed from: r12  reason: default package */
public final class r12 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ s12 c;
    public final /* synthetic */ ds5 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r12(s12 s12, ds5 ds5, Continuation continuation) {
        super(2, continuation);
        this.c = s12;
        this.o = ds5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        r12 r12 = new r12(this.c, this.o, continuation);
        r12.b = obj;
        return r12;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r12) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            s12 s12 = this.c;
            bs5 bs5 = s12.o;
            q12 q12 = new q12(objectRef, (d14) this.b, s12, this.o);
            this.a = 1;
            if (bs5.e(q12, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
