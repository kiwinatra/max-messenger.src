package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: k5f  reason: default package */
public final class k5f extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ l5f c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k5f(l5f l5f, Continuation continuation) {
        super(2, continuation);
        this.c = l5f;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        k5f k5f = new k5f(this.c, continuation);
        k5f.b = obj;
        return k5f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k5f) create((bxf) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        bxf bxf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            bxf bxf2 = (bxf) this.b;
            if (!bxf2.a.c.b() || !bxf2.a()) {
                return new fs5(3, new tf9(bxf2, (boe) null));
            }
            dx5 a2 = ((ooe) this.c.c.getValue()).a(bxf2.h.a);
            this.b = bxf2;
            this.a = 1;
            Object f = bs0.f(a2, this);
            if (f == coroutine_suspended) {
                return coroutine_suspended;
            }
            bxf bxf3 = bxf2;
            obj = f;
            bxf = bxf3;
        } else if (i == 1) {
            bxf = (bxf) this.b;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return new fs5(3, new tf9(bxf, (boe) obj));
    }
}
