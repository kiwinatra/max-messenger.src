package defpackage;

import java.util.Collection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: mx  reason: default package */
public final class mx extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ nx b;
    public final /* synthetic */ Collection c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mx(nx nxVar, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.b = nxVar;
        this.c = collection;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new mx(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mx) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            nx nxVar = this.b;
            this.a = 1;
            z6d z6d = ((to9) nxVar.k.getValue()).a;
            Object I = ev0.I(((osa) z6d.c()).b(), new s6d(z6d, nxVar.a, this.c, (Continuation) null), this);
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                I = Unit.INSTANCE;
            }
            if (I == coroutine_suspended) {
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
