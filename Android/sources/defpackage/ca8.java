package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ca8  reason: default package */
public final class ca8 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ oa8 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ca8(oa8 oa8, Continuation continuation) {
        super(2, continuation);
        this.b = oa8;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ca8(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ca8) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            oa8 oa8 = this.b;
            i21 i21 = new i21(new ArrayList(), new eu5((bs5) oa8.o.getValue(), 2), new y98(3, (Continuation) null, 0));
            aa8 aa8 = new aa8(oa8, 0);
            this.a = 1;
            Object e = i21.e(new tu5(aa8, 25), this);
            if (e != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                e = Unit.INSTANCE;
            }
            if (e == coroutine_suspended) {
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
