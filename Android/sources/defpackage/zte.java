package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zte  reason: default package */
public final class zte extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ due c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zte(due due, Continuation continuation) {
        super(2, continuation);
        this.c = due;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zte zte = new zte(this.c, continuation);
        zte.b = obj;
        return zte;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zte) create((mmd) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        mmd mmd;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            mmd mmd2 = (mmd) this.b;
            String name = this.c.getClass().getName();
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.o, name, i2a.i("Sets loader. Section with sets exist:", mmd2 != null), (Throwable) null);
            }
            if ((mmd2 instanceof fre) && ((List) this.c.d.getValue()).isEmpty()) {
                wbe c2 = ((vqe) this.c.a.getValue()).c(((fre) mmd2).o);
                this.b = mmd2;
                this.a = 1;
                Object f = bs0.f(c2, this);
                if (f == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mmd = mmd2;
                obj = f;
            }
            return Unit.INSTANCE;
        } else if (i == 1) {
            mmd = (mmd) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.c.f.updateAndGet(new n01(8, mmd));
        this.c.d.setValue((List) obj);
        return Unit.INSTANCE;
    }
}
