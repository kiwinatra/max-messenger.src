package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: p9b  reason: default package */
public final class p9b extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ v9b b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p9b(v9b v9b, Continuation continuation) {
        super(2, continuation);
        this.b = v9b;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new p9b(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p9b) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        v9b v9b = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            um1 um1 = v9b.b;
            this.a = 1;
            ym1 ym1 = (ym1) um1;
            obj = ev0.I(((osa) ((gaf) ym1.c.getValue())).b(), new wm1(ym1, (Continuation) null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y8b y8b = new y8b(f9b.a(), (jm1) obj);
        i9b i9b = (i9b) v9b.x.get();
        if (i9b == null) {
            v9b.e(new i9b(y8b));
        } else {
            v9b.e(new i9b(y8b, i9b.b, i9b.c, i9b.d, i9b.e, i9b.f, i9b.g));
        }
        v9b.d();
        return Unit.INSTANCE;
    }
}
