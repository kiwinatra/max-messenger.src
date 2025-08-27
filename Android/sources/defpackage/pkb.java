package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* renamed from: pkb  reason: default package */
public final class pkb extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ skb c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pkb(skb skb, Continuation continuation) {
        super(2, continuation);
        this.c = skb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        pkb pkb = new pkb(this.c, continuation);
        pkb.b = obj;
        return pkb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pkb) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.b;
            KProperty[] kPropertyArr = skb.y;
            skb skb = this.c;
            if (skb.k()) {
                list = skb.j(skb, list);
            }
            this.a = 1;
            skb.w.setValue(list);
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
