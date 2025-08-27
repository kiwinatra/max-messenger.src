package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: g5f  reason: default package */
public final class g5f extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h5f c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g5f(h5f h5f, Continuation continuation) {
        super(2, continuation);
        this.c = h5f;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        g5f g5f = new g5f(this.c, continuation);
        g5f.b = obj;
        return g5f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g5f) create((bxf) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            bxf bxf = (bxf) this.b;
            if (bxf.a()) {
                kxf kxf = bxf.a;
                xyf xyf = kxf.c;
                xyf.getClass();
                boolean z = xyf == xyf.AUDIO;
                h5f h5f = this.c;
                if (z || xyf.a()) {
                    this.a = 1;
                    if (h5f.h(kxf, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.a = 2;
                    if (h5f.f(bxf, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else if (i == 1 || i == 2) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
