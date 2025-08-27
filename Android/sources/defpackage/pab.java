package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pab  reason: default package */
public final class pab extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ju7 c;
    public final /* synthetic */ iu7 o;
    public final /* synthetic */ Function2 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pab(ju7 ju7, iu7 iu7, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.c = ju7;
        this.o = iu7;
        this.v = function2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        pab pab = new pab(this.c, this.o, this.v, continuation);
        pab.b = obj;
        return pab;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pab) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ou7 ou7;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            pm7 pm7 = (pm7) ((d14) this.b).U().get(om7.a);
            if (pm7 != null) {
                oab oab = new oab();
                ou7 ou72 = new ou7(this.c, this.o, oab.b, pm7);
                try {
                    Function2 function2 = this.v;
                    this.b = ou72;
                    this.a = 1;
                    obj = ev0.I(oab, function2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ou7 = ou72;
                } catch (Throwable th) {
                    th = th;
                    ou7 = ou72;
                    ou7.a();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        } else if (i == 1) {
            ou7 = (ou7) this.b;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ou7.a();
        return obj;
    }
}
