package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wjb  reason: default package */
public final class wjb extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ akb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wjb(akb akb, Continuation continuation) {
        super(2, continuation);
        this.c = akb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wjb wjb = new wjb(this.c, continuation);
        wjb.b = obj;
        return wjb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wjb) create((po3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            akb akb = this.c;
            xme xme = akb.o;
            List j = akb.j(akb, (po3) this.b);
            this.a = 1;
            xme.setValue(j);
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
