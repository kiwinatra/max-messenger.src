package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gv5  reason: default package */
public final class gv5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bs5 c;
    public final /* synthetic */ sz9 o;
    public final /* synthetic */ Object v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gv5(bs5 bs5, xme xme, Object obj, Continuation continuation) {
        super(2, continuation);
        this.c = bs5;
        this.o = xme;
        this.v = obj;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gv5 gv5 = new gv5(this.c, (xme) this.o, this.v, continuation);
        gv5.b = obj;
        return gv5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gv5) create((y6e) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            int ordinal = ((y6e) this.b).ordinal();
            sz9 sz9 = this.o;
            if (ordinal == 0) {
                this.a = 1;
                if (this.c.e(sz9, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    bpa bpa = m5a.c;
                    Object obj2 = this.v;
                    if (obj2 == bpa) {
                        sz9.c();
                    } else {
                        Boxing.boxBoolean(sz9.d(obj2));
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
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
