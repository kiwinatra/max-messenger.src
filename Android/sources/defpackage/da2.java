package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: da2  reason: default package */
public final class da2 extends SuspendLambda implements Function2 {
    public ia2 a;
    public int b;
    public final /* synthetic */ ia2 c;
    public final /* synthetic */ long o;
    public final /* synthetic */ a32 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public da2(ia2 ia2, long j, a32 a32, Continuation continuation) {
        super(2, continuation);
        this.c = ia2;
        this.o = j;
        this.v = a32;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new da2(this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((da2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ia2 ia2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ia2 ia22 = this.c;
            if (ia22.D0.get()) {
                ConcurrentHashMap concurrentHashMap = ia22.E0;
                long j = this.o;
                concurrentHashMap.put(Boxing.boxLong(j), new ca2((Object) ia22, j, (Object) this.v, 0));
                return Unit.INSTANCE;
            }
            c6d g = ia22.g();
            this.a = ia22;
            this.b = 1;
            obj = g.e(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ia2 = ia22;
        } else if (i == 1) {
            ia2 = this.a;
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.a = null;
        this.b = 2;
        if (ia2.n(ia2, (List) obj, false, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
