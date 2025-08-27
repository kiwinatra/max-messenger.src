package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ard  reason: default package */
public final class ard extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ drd b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ard(drd drd, Continuation continuation) {
        super(2, continuation);
        this.b = drd;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ard ard = new ard(this.b, continuation);
        ard.a = obj;
        return ard;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ard) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        drd drd = this.b;
        drd.c.clear();
        for (yqd yqd : (List) this.a) {
            drd.c.put(Boxing.boxLong(yqd.a), yqd);
        }
        return Unit.INSTANCE;
    }
}
