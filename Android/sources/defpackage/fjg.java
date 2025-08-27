package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fjg  reason: default package */
public final class fjg extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ hjg b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fjg(hjg hjg, Continuation continuation) {
        super(2, continuation);
        this.b = hjg;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        fjg fjg = new fjg(this.b, continuation);
        fjg.a = obj;
        return fjg;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fjg) create((xgg) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xgg xgg = (xgg) this.a;
        hjg hjg = this.b;
        lo7 lo7 = (lo7) hjg.K0.get(Boxing.boxLong(xgg.a()));
        if (lo7 == null) {
            return Unit.INSTANCE;
        }
        boolean z = xgg instanceof vgg;
        ConcurrentHashMap concurrentHashMap = hjg.K0;
        if (z) {
            lo7.a(agg.SUCCESS);
            concurrentHashMap.remove(Boxing.boxLong(((vgg) xgg).a));
        } else if (xgg instanceof ugg) {
            lo7.a(agg.CANCELLED);
            concurrentHashMap.remove(Boxing.boxLong(((ugg) xgg).a));
        } else if (xgg instanceof wgg) {
            lo7.b(new Throwable());
            concurrentHashMap.remove(Boxing.boxLong(((wgg) xgg).a));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
