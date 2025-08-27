package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: kk2  reason: default package */
public final class kk2 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ lk2 b;
    public final /* synthetic */ List c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kk2(lk2 lk2, List list, Continuation continuation) {
        super(2, continuation);
        this.b = lk2;
        this.c = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new kk2(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kk2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            lk2 lk2 = this.b;
            a32 j = lk2.j();
            if (j == null) {
                return Unit.INSTANCE;
            }
            long j2 = j.b.a;
            boolean z = lk2.Y.get();
            this.a = 1;
            if (((tl4) lk2.x.getValue()).a(lk2.b, j2, this.c, z) == coroutine_suspended) {
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
