package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bue  reason: default package */
public final class bue extends SuspendLambda implements Function2 {
    public xse a;
    public int b;
    public final /* synthetic */ due c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bue(due due, Continuation continuation) {
        super(2, continuation);
        this.c = due;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bue(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bue) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xse xse;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        due due = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long longValue = ((Long) due.f.get()).longValue();
            this.b = 1;
            obj = bte.d((bte) due.b.getValue(), (String) null, longValue, this, 5);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            xse = this.a;
            ResultKt.throwOnFailure(obj);
            due.f.updateAndGet(new aue(xse, 0));
            xme xme = due.d;
            xme.setValue(CollectionsKt.plus((Collection) xme.getValue(), (List) obj));
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xse xse2 = (xse) obj;
        wbe c2 = ((vqe) due.a.getValue()).c(xse2.a);
        this.a = xse2;
        this.b = 2;
        Object f = bs0.f(c2, this);
        if (f == coroutine_suspended) {
            return coroutine_suspended;
        }
        xse xse3 = xse2;
        obj = f;
        xse = xse3;
        due.f.updateAndGet(new aue(xse, 0));
        xme xme2 = due.d;
        xme2.setValue(CollectionsKt.plus((Collection) xme2.getValue(), (List) obj));
        return Unit.INSTANCE;
    }
}
