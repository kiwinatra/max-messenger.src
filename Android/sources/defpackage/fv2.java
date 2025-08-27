package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fv2  reason: default package */
public final class fv2 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ov2 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fv2(ov2 ov2, Continuation continuation) {
        super(2, continuation);
        this.c = ov2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fv2 fv2 = new fv2(this.c, continuation);
        fv2.b = obj;
        return fv2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fv2) create((z77) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            xme xme = this.c.C0;
            vu2 vu2 = new vu2(uu2.c, "", (z77) this.b, CollectionsKt.emptyList(), false);
            this.a = 1;
            xme.getClass();
            xme.m((Object) null, vu2);
            if (Unit.INSTANCE == coroutine_suspended) {
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
