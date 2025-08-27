package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: m42  reason: default package */
public final class m42 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ h52 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m42(h52 h52, Continuation continuation) {
        super(2, continuation);
        this.c = h52;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        m42 m42 = new m42(this.c, continuation);
        m42.b = obj;
        return m42;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m42) create((a32) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            a32 a32 = (a32) this.b;
            if (a32.L() && !a32.B()) {
                n6e n6e = this.c.e;
                p33 p33 = p33.b;
                this.a = 1;
                if (n6e.a(p33, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
